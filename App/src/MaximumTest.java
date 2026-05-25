public class MaximumTest {

    public static String testMaximum(String x, String y, String z) {

        String max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(testMaximum("Peach", "Apple", "Banana"));

        System.out.println(testMaximum("Apple", "Peach", "Banana"));

        System.out.println(testMaximum("Apple", "Banana", "Peach"));
    }
}