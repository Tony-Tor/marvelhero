package com.tonytor.marvelhero.config.utils;

import java.time.LocalDate;

public class Util {
    static public boolean betweenLocalData(LocalDate date, String before, String after){
        boolean result = true;

        if(before != null)
        {
            LocalDate beforeLD = LocalDate.parse(before);
            if(date.isBefore(beforeLD)) result = false;
        }

        if(after != null)
        {
            LocalDate afterLD = LocalDate.parse(after);
            if(date.isAfter(afterLD)) result = false;
        }

        return result;
    }

    static public boolean betweenInteger(Integer integer, String before, String after){
        boolean result = true;

        if(before != null)
        {
            Integer beforeI = Integer.parseInt(before);
            if(integer.compareTo(beforeI) < 0) result = false;
        }

        if(after != null)
        {
            Integer afterI = Integer.parseInt(after);
            if(integer.compareTo(afterI) > 0) result = false;
        }

        return result;
    }
}
