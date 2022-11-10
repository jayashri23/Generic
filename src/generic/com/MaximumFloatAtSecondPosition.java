package generic.com;

public class MaximumFloatAtSecondPosition {

    public static void main(String [] args){
        System.out.println("...............Max At Second Position.............");
        System.out.println("Maximum Float out Of Three Float:");
        float x = 2.2f, y = 7.4f, z = 3.3f;
        new generic.com.Maximum(x, y, z).maximum();
    }
    public class Maximum<T extends Comparable<T>> {
        T x, y, z;

        public Maximum(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T maximum() {
            return generic.com.Maximum.maximum(x, y, z);
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
    }
}
