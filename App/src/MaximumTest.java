import java.util.Arrays;

public class MaximumTest {

    public static <T extends Comparable<T>> T testMaximum(T... values) {

        Arrays.sort(values);

        return values[values.length - 1];
    }

    public static void main(String[] args) {

        System.out.println(testMaximum(10, 20, 30, 40, 50));

        System.out.println(testMaximum(10.5f, 80.5f, 20.5f, 90.5f));

        System.out.println(testMaximum(
                "Apple",
                "Peach",
                "Banana",
                "Orange"));
    }
}