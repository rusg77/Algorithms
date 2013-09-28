package sorts;

import java.util.ArrayList;

public class InsertionSort {

    public static void sort(ArrayList<Integer> list) {
        for (int i=1; i<list.size(); i++) {
            int element = list.get(i);
            int j = i-1;
            while (j>=0 && list.get(j) > element) {
                int temp = list.get(j);
                list.set(j, element);
                list.set(j+1, temp);
                j = j-1;
            }
        }
    }
}
