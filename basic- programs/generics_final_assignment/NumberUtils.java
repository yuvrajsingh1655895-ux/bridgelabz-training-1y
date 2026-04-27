import java.util.*;

class NumberUtils {

    public static double sumNumbers(List<? extends Number> list){
        double sum=0;
        for(Number n: list) sum += n.doubleValue();
        return sum;
    }

    public static void copyList(List<? super Number> dest, List<? extends Number> src){
        for(Number n: src) dest.add(n);
    }
}
