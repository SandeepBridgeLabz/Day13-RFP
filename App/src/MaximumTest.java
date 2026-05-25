import java.util.Arrays;

public class MaximumTest<T extends Comparable<T>> {

    T x, y, z;

    // Parameterized Constructor
    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Instance Method
    public T testMaximum() {
        return testMaximum(x, y, z);
    }

    // Generic Method for 3 Variables
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        printMax(max);

        return max;
    }

    // Refactor 2 - More than 3 Parameters
    @SafeVarargs
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    // UC5 - Print Maximum
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value is: " + max);
    }

    // Main Method
    public static void main(String[] args) {

        // =========================
        // UC1 - Integer Test Cases
        // =========================

        System.out.println("Integer Test Cases");

        // TC 1.1 Max at 1st Position
        MaximumTest<Integer> intTest1 =
                new MaximumTest<>(30, 20, 10);
        intTest1.testMaximum();

        // TC 1.2 Max at 2nd Position
        MaximumTest<Integer> intTest2 =
                new MaximumTest<>(10, 40, 20);
        intTest2.testMaximum();

        // TC 1.3 Max at 3rd Position
        MaximumTest<Integer> intTest3 =
                new MaximumTest<>(10, 20, 50);
        intTest3.testMaximum();


        // =======================
        // UC2 - Float Test Cases
        // =======================

        System.out.println("\nFloat Test Cases");

        MaximumTest<Float> floatTest1 =
                new MaximumTest<>(30.5f, 20.2f, 10.1f);
        floatTest1.testMaximum();

        MaximumTest<Float> floatTest2 =
                new MaximumTest<>(10.1f, 40.8f, 20.4f);
        floatTest2.testMaximum();

        MaximumTest<Float> floatTest3 =
                new MaximumTest<>(10.1f, 20.2f, 50.9f);
        floatTest3.testMaximum();


        // ========================
        // UC3 - String Test Cases
        // ========================

        System.out.println("\nString Test Cases");

        MaximumTest<String> stringTest1 =
                new MaximumTest<>("Peach", "Apple", "Banana");
        stringTest1.testMaximum();

        MaximumTest<String> stringTest2 =
                new MaximumTest<>("Apple", "Peach", "Banana");
        stringTest2.testMaximum();

        MaximumTest<String> stringTest3 =
                new MaximumTest<>("Apple", "Banana", "Peach");
        stringTest3.testMaximum();


        // ============================
        // Refactor 2 - More Parameters
        // ============================

        System.out.println("\nMore Than 3 Parameters");

        testMaximum(10, 20, 30, 40, 50);

        testMaximum(11.2f, 55.5f, 33.3f, 77.7f);

        testMaximum("Apple", "Banana", "Peach", "Orange");
    }
}