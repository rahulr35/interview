package value;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ReduceOperationCost {

    static int sum = 0;

    @Test
    public void minimiseOperationCost(){
        List<Integer> l = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println(reduceOperations(l));
    }
    public static int reduceOperations(List<Integer> l){
        List<Integer> latestList = l;
        while (latestList.size() != 1) {
            latestList = getOperationCost(latestList);
        }
        return sum;
    }

    public static List<Integer> getOperationCost(List<Integer> l){
        l.sort(Comparator.naturalOrder());
        int small = l.get(0);
        int smallest = l.get(1);
        int newElement = small + smallest;

        l.remove(l.indexOf(small));
        l.remove(l.indexOf(smallest));
        l.add(newElement);

        sum += newElement;
        return l;
    }

}
