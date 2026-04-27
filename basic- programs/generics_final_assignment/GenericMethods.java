class GenericMethods {

    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) max = y;
        if(z.compareTo(max) > 0) max = z;
        return max;
    }

    public static void main(String[] args){
        System.out.println(isEqual(10,10));
        System.out.println(maximum(3,7,5));
    }
}
