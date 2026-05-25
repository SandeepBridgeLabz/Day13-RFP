public class MaximumTest<T extends Comparable<T>> {

    T x, y, z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum() {
        return testMaximum(x, y, z);
    }

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

        MaximumTest<Integer> intTest =
                new MaximumTest<>(10, 20, 30);

        System.out.println(intTest.testMaximum());

        MaximumTest<Float> floatTest =
                new MaximumTest<>(10.5f, 40.5f, 20.5f);

        System.out.println(floatTest.testMaximum());

        MaximumTest<String> stringTest =
                new MaximumTest<>("Apple", "Peach", "Banana");

        System.out.println(stringTest.testMaximum());
    }
}