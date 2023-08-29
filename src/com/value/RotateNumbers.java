package value;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class RotateNumbers {

    @Test
    public void driverMethod(){
        int a [] = {1,2,3,4,5,6};
        int k = 3;
        List<Integer> list = new LinkedList<>();
        list.add(k);
        List<Integer> finalList = rotateDigits(k, a, list);
        System.out.println(finalList.toString());
    }

    public List<Integer> rotateDigits(int k, int [] a, List<Integer> list){
        boolean flag = false;
        int in[] = new int[k-1];
        int out[] = new int[a.length-k];
        int counter = 0;
        for(int i = 0; i < a.length; i++) {
            if (k == a[i]) {
                flag = true;
                counter = 0;
            } else if (!flag) {
                in[k-1-counter-1]=a[i];
                counter++;
            } else if (flag) {
                out[a.length-k-counter-1] = a[i];
                counter++;
            }
        }

        for (int element: in) {
            list.add(element);
        }

        for (int element: out) {
            list.add(element);
        }
        return list;
    }


}
