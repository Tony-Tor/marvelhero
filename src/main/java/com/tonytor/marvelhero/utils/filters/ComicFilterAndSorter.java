package com.tonytor.marvelhero.utils.filters;

import com.tonytor.marvelhero.utils.Util;
import com.tonytor.marvelhero.model.Comic;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComicFilterAndSorter {

    static public List<Comic> filterAndSort(Map<String, String> params, List<Comic> list) {
        return sort(params, filter(params, list));
    }

    static public List<Comic> filter(Map<String, String> params, List<Comic> list) {
        return list.stream()
                .filter(c -> filterName(c, params.get("name")))
                .filter(c -> filterNameStartWith(c, params.get("nameStartWith")))
                .filter(c -> filterPublished(c, params.get("after"), params.get("before")))
                .filter(c -> filterDescription(c, params.get("description")))
                .filter(c -> filterPageOf(c, params.get("startCountPage"), params.get("endCountPage")))
                .filter(c -> filterPrise(c, params.get("startPrise"), params.get("endPrise")))
                .limit(Util.limit(params.get("limit")))
                .collect(Collectors.toList());
    }

    static private boolean filterName(Comic c, String name) {
        if (name != null){
            return c.getName().contains(name);
        }
        return true;
    }

    static private boolean filterNameStartWith(Comic c, String name) {
        if (name != null)
            return c.getName().startsWith(name);
        return true;
    }

    static private boolean filterPublished(Comic c, String after, String before) {
        LocalDate created = c.getPublished();
        return Util.betweenLocalData(created, after, before);
    }

    static private boolean filterDescription(Comic c, String description) {
        if (description != null)
            return c.getDescription().contains(description);
        return true;
    }

    static private boolean filterPageOf(Comic c, String startCountPage, String endCountPage) {
        Integer integer = c.getPageOfCount();
        return Util.betweenInteger(integer, startCountPage, endCountPage);
    }

    static private boolean filterPrise(Comic c, String startPrise, String endPrise) {
        Integer integer = c.getPrise();
        return Util.betweenInteger(integer, startPrise, endPrise);
    }

    static public List<Comic> sort(Map<String, String> params, List<Comic> list) {
        return list.stream()
                .sorted(((o1, o2) -> compare(o1, o2, params.get("sortBy"))))
                .collect(Collectors.toList());
    }

    static private int compare(Comic c1, Comic c2, String sortBy) {
        if (sortBy == null) sortBy = "name";
        switch (sortBy) {
            case "-name":
                return compareByName(c2, c1);

            case "published":
                return compareByCreated(c1, c2);

            case "-published":
                return compareByCreated(c2, c1);

            case "pageOf":
                return compareByPageOf(c1, c2);

            case "-pageOf":
                return compareByPageOf(c2, c1);

            case "prise":
                return compareByPrise(c1, c2);

            case "-prise":
                return compareByPrise(c2, c1);

            case "name":
            default:
                return compareByName(c1, c2);
        }
    }

    static private int compareByName(Comic c1, Comic c2) {
        return c1.getName().compareTo(c2.getName());
    }

    static private int compareByCreated(Comic c1, Comic c2) {
        return c1.getPublished().compareTo(c2.getPublished());
    }

    static private int compareByPageOf(Comic c1, Comic c2) {
        return c1.getPageOfCount().compareTo(c2.getPageOfCount());
    }

    static private int compareByPrise(Comic c1, Comic c2) {
        return c1.getPrise().compareTo(c2.getPrise());
    }
}
