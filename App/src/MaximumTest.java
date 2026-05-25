public class MaximumTest {

    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(testMaximum(30, 20, 10));

        System.out.println(testMaximum(10.5f, 40.5f, 20.5f));

        System.out.println(testMaximum("Apple", "Peach", "Banana"));
    }
}