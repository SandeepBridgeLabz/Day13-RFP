import java.util.Arrays;

public class MaximumTest {

    public static <T extends Comparable<T>> T testMaximum(T... values) {

        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    public static <T> void printMax(T max) {

        System.out.println("Maximum Value is: " + max);
    }

    public static void main(String[] args) {

        testMaximum(10, 20, 30, 40);

        testMaximum(10.5f, 70.5f, 80.5f);

        testMaximum("Apple", "Peach", "Banana");
    }
}