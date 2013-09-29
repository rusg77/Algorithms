import qiuz.Quiz;

public class Main {

    public static void main(String[] args) {
        int[] x = {2, 3, 8, 8, 9, 10, 15};
        int[] y = {0, 1, 4, 8, 11, 16};
        int[] z = {-3, 2, 5, 6, 7, 8};
        System.out.println(Quiz.findElementInArrays(x, y, z));
    }
}
