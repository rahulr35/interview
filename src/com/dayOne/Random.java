package com.dayOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.LinkedHashMap;
import java.util.Map;

public class Random {

    public static void main (String args []) {
        Map<String, String> itinerariesMap = new LinkedHashMap<>();
        itinerariesMap.put("5a164b8e-b7d6-420f-8e0e-c8192a075d7f", "2021-04-04T00:00:00Z");
        itinerariesMap.put("68c6f80d-bec6-4e50-8a16-294e92489c30", "2021-04-03T00:00:00Z");
        itinerariesMap.put("281292a8-722f-4558-b50c-ecc953261c31", "2021-04-06T00:00:00Z");
        getEtadate(itinerariesMap);
    }

    public static void getEtadate (Map<String, String> itinerariesMap){


    }

    public static String dateSorter(String dates){
        DateTimeFormatter f = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd").toFormatter();
        LocalDate parsedDate = LocalDate.parse(dates, f);
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String newDate = parsedDate.format(f2);
        System.out.println( "Itinerary Date : " + newDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate now = LocalDate.now();
        System.out.println( "Today Date : " + dtf.format(now));
        return newDate;
    }
}
