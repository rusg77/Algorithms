import sorts.MergeSort;

public class Main {

    public static void main(String[] args) {
        int[] x = {3, 8, 5, 7, 1, 8, 0, 15, 3, 19};
        System.out.println(x);
        MergeSort.sort(x, 0, 9);
        System.out.println(x);
    }
}
