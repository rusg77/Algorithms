package sorts;

import java.util.ArrayList;

public class BinaryHeapSort {

    private static int getParentIndex(int i) {
        return i % 2;
    }

    private static int getLeftIndex(int i) {
        return i * 2;
    }

    private static int getRightIndex(int i) {
        return i * 2 + 1;
    }

    public static void putElementOnRightPosition(ArrayList<Integer> binaryHeap, int index) {
        int left_element_index = getLeftIndex(index);
        int right_element_index = getRightIndex(index);
        int size = binaryHeap.size()-1;
        int largest;

        if (left_element_index <= size && binaryHeap.get(index) < binaryHeap.get(left_element_index)) {
             largest = left_element_index;
        } else largest = index;

        if (right_element_index <= size && binaryHeap.get(largest) < binaryHeap.get(right_element_index)) {
            largest = right_element_index;
        }

        if (largest != index) {
            int temp;
            temp = binaryHeap.get(index);
            binaryHeap.set(index, binaryHeap.get(largest));
            binaryHeap.set(largest, temp);
            putElementOnRightPosition(binaryHeap, largest);
        }
    }

    public static void build_tree(ArrayList<Integer> list) {
        for (int i=(list.size()) / 2; i>0; i--) {
            putElementOnRightPosition(list, i);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        build_tree(list);
        for (int i=list.size()-1; i>0; i--) {
            System.out.println(list.get(1));
            list.set(1, list.get(i));
            list.remove(i);
            putElementOnRightPosition(list, 1);
        }
    }
}