package check;

import java.util.*;

public class SuspicousActivityLogs {

    public static void main(String[] args) {
        List<List<Integer>> logs = new LinkedList<>();

       /* int sizeOfLog = 4;
        int threshold = 2;
        logs.add(Arrays.asList(1, 2, 50));
        logs.add(Arrays.asList(1, 7, 70));
        logs.add(Arrays.asList(1, 3, 20));
        logs.add(Arrays.asList(2, 2, 17));*/

        /*int sizeOfLog = 4;
        int threshold = 3;
        logs.add(Arrays.asList(9, 7, 50));
        logs.add(Arrays.asList(22, 7, 70));
        logs.add(Arrays.asList(33, 7, 20));
        logs.add(Arrays.asList(22, 7, 17));*/

        int sizeOfLog = 7;
        int threshold = 3;
        logs.add(Arrays.asList(345366, 89921, 45));
        logs.add(Arrays.asList(29323, 38239, 23));
        logs.add(Arrays.asList(38239, 345366, 15));
        logs.add(Arrays.asList(29323, 38239, 77));
        logs.add(Arrays.asList(345366, 38239, 23));
        logs.add(Arrays.asList(29323, 345366, 13));
        logs.add(Arrays.asList(38239, 38239, 23));

        System.out.println(getSuspiciousActivityFromLogs(sizeOfLog, logs, threshold));
    }

    public static List<Integer> getSuspiciousActivityFromLogs(int sizeOfLog, List<List<Integer>> logs, int threshold){
        List<Integer> resultList = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(List<Integer> lists : logs){
            for(int i = 0; i < lists.size()-1; i++){
                if(map.containsKey(lists.get(i))){
                    map.put(lists.get(i), map.get(lists.get(i))+1);
                } else {
                    map.put(lists.get(i), 1);
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>=threshold){
                resultList.add(entry.getKey());
            }
        }
        resultList.sort(Comparator.naturalOrder());
        return resultList;
    }


}
