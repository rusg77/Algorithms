package qiuz;

public class Quiz {

    // Find one of the numbers which exists in each of three nondecreasing arrays x[p], y[q], z[r].
    // Algorithm complexity should be O(p+q+r).
    public static int findElementInArrays(int[] x, int[] y, int[] z) {

        int x_index = 0;
        int y_index = 0;
        int z_index = 0;

        int x_elem = x[0];
        int y_elem = y[0];
        int z_elem = z[0];

        if (eq(x_elem, y_elem, z_elem)) return x_elem;
        int max = max(x_elem, y_elem, z_elem);

        while (x_index <= x.length-1 && y_index <= y.length-1 && z_index <= z.length-1) {

            while (x_elem < max) {
                x_index += 1;
                x_elem = x[x_index];
            }

            while (y_elem < max) {
                y_index += 1;
                y_elem = y[y_index];
            }

            while (z_elem < max) {
                z_index += 1;
                z_elem = z[z_index];
            }


            if (eq(x_elem, y_elem, z_elem)) return x_elem;
            else max = max(x_elem, y_elem, z_elem);
        }
        return 0;
    }

    private static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    private static int max(int a, int b, int c) {
        return max(max(a,b), c);
    }


    private static boolean eq(int a, int b, int c) {
        return a == b && b == c;
    }

}
