public class MaximumTest {

    public static Float testMaximum(Float x, Float y, Float z) {

        Float max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(testMaximum(30.5f, 20.2f, 10.1f));

        System.out.println(testMaximum(10.1f, 40.8f, 20.4f));

        System.out.println(testMaximum(10.1f, 20.2f, 50.9f));
    }
}