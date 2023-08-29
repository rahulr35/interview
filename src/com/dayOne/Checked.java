package com.dayOne;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Checked {

    public static void main (String args []) {
        Map<String, String> itinerariesMap = new HashMap<>();
        itinerariesMap.put("02bf2a81-0be9-4c48-8611-d7266526c7ca", "2021-05-03T18:00:00Z");
        itinerariesMap.put("16be7523-0e3b-4be4-a617-751c45635ccc", "2021-05-03T18:00:00Z");
        itinerariesMap.put("2b3f0c09-3ea5-4ee5-8ef3-d7c3b63b9bf4", "2021-05-04T18:00:00Z");
        itinerariesMap.put("391dfacb-11d3-4c09-9dfc-3770a3195e48", "2021-05-04T18:00:00Z");
        itinerariesMap.put("3bcf73e5-493e-41ab-9630-ad0f43c88037", "2021-04-29T13:30:00Z");
        itinerariesMap.put("75f64906-8629-4d93-a4c4-97a9cb3f3168", "2021-04-30T18:00:00Z");
        itinerariesMap.put("9cd0afc0-0943-47dc-9806-0ec6ce3e2cbf", "2021-04-30T18:00:00Z");
        itinerariesMap.put("b663b568-8da0-4679-a660-41b3630c34c6", "2021-04-29T18:00:00Z");
        itinerariesMap.put("d479fc80-9181-4d70-b289-ff9ede147944", "2021-04-29T18:00:00Z");
        itinerariesMap.put("e53ddc82-b207-4632-ab14-f2b691fa2e8b", "2021-05-03T13:30:00Z");
        itinerariesMap.put("e657b8c8-8659-48e1-9583-996d6f90f430", "2021-04-30T13:30:00Z");
        itinerariesMap.put("f216395c-0fb3-47ec-8471-bbd5bb6e7256", "2021-05-04T13:30:00Z");
        String a = "13:30:00";
        itinerariesMap = itinerariesMap.entrySet()
                                    .stream()
                                    .filter(map -> map.getValue().contains(a))
                                    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
        String b = itinerariesMap.entrySet().stream().sorted(comparingByValue()).findFirst().get().getKey();
        System.out.println(itinerariesMap);
        System.out.println(b);
    }
}
