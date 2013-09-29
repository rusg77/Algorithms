package sorts;

public class MergeSort {

    // слить два отсортированных массива в один массив
    // [index1..index3] - весь массив
    // [index1..index2] - первый отсортированный массив
    // [index2+1..index3] - второй отсортированный массив
    // нужно получить отсортированный массив [index1..index3] из отсортированныз массивов:
    // [index1..index2] и [index2+1..index3]
    public static void merge(int a[], int index1, int index2, int index3) {
        int n1 = index2-index1 + 1;
        int n2 = index3-index2;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i=0; i<=n1-1; i++) {
            left[i] = a[index1 + i];
        }

        for (int i=0; i<=n2-1; i++) {
            right[i] = a[index2 + i + 1];
        }

        int i = 0;
        int j = 0;

        // мой говнокод слияния
        while (i < n1 || j < n2) {
            if (i < n1 && j < n2)
                if (left[i] < right[j]) {
                    a[index1 + i + j] = left[i];
                    i += 1;
                }
                else {
                    a[index1 + i + j] = right[j];
                    j +=1;
                }
            else if (i < n1 && j == n2) {
                a[index1 + i + j] = left[i];
                i += 1;
            } else if (i == n1 && j < n2) {
                a[index1 + i + j] = right[j];
                j += 1;
            }
        }
    }


    // сама сортирововка слияниям, выполняется рекурсивно
    // условие выхода - массив из одного элемента
    public static void sort(int a[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }
}
