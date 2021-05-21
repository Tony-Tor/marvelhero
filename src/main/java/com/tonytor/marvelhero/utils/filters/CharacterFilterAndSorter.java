package com.tonytor.marvelhero.utils.filters;

import com.tonytor.marvelhero.utils.Util;
import com.tonytor.marvelhero.model.Character;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFilterAndSorter {

    static public List<Character> filterAndSort(Map<String, String> params, List<Character> list) {
        return sort(params, filter(params, list));
    }

    static public List<Character> filter(Map<String, String> params, List<Character> list) {
        return list.stream()
                .filter(c -> filterName(c, params.get("name")))
                .filter(c -> filterNameStartWith(c, params.get("nameStartWith")))
                .filter(c -> filterCreated(c, params.get("before"), params.get("after")))
                .filter(c -> filterDescription(c, params.get("description")))
                .filter(c -> filterStatus(c, params.get("status")))
                .limit(Integer.parseInt(params.get("limit")))
                .collect(Collectors.toList());
    }

    static private boolean filterName(Character c, String name) {
        if (name != null)
            return c.getName().contains(name);
        return true;
    }

    static private boolean filterNameStartWith(Character c, String name) {
        if (name != null)
            return c.getName().startsWith(name);
        return true;
    }

    static private boolean filterCreated(Character c, String before, String after) {
        LocalDate created = c.getCreated();
        return Util.betweenLocalData(created, before, after);
    }

    static private boolean filterDescription(Character c, String description) {
        if (description != null)
            return c.getName().contains(description);
        return true;
    }

    static private boolean filterStatus(Character c, String status) {
        if (status != null)
            return c.getName().contains(status);
        return true;
    }

    static public List<Character> sort(Map<String, String> params, List<Character> list) {
        return list.stream()
                .sorted(((o1, o2) -> compare(o1, o2, params.get("sortBy"))))
                .collect(Collectors.toList());
    }

    static private int compare(Character c1, Character c2, String sortBy) {
        switch (sortBy) {

            case "-name":
                return compareByName(c2, c1);

            case "created":
                return compareByCreated(c1, c2);

            case "-created":
                return compareByCreated(c2, c1);

            case "name":
            default:
                return compareByName(c1, c2);
        }
    }

    static private int compareByName(Character c1, Character c2) {
        return c1.getName().compareTo(c2.getName());
    }

    static private int compareByCreated(Character c1, Character c2) {
        return c1.getCreated().compareTo(c2.getCreated());
    }
}
