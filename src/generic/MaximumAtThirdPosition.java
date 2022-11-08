package generic;

public class MaximumAtThirdPosition {
    public class Maximum<T extends Comparable<T>> {
        T x, y, z;

        public Maximum(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T maximum() {
            return generic.Maximum.maximum(x, y, z);
        }

        //determine max number out of three
        public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
            T max = x;  // assume x is max at initially
            if (y.compareTo(max) > 0) {
                max = y;   //y is max so far
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            System.out.println(max);
            return max;
        }

        public static void main(String[] args) {
            System.out.println("...............Second Position.............");
            System.out.println("Maximum Number out Of Three Integer:");
            Integer x = 5, y = 2, z = 10;
            new generic.Maximum(x, y, z).maximum();
        }
    }
}


