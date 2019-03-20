package xin.liujiajun.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author liujiajun
 * @description
 * @create 2019-03-20 09:57
 **/
public class LambdaDemo {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> integerComparator = ( o1, o2) -> o1.compareTo(o2);

        new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
        List<Integer> integers = Arrays.asList(0,1, 2, 3, 4);
        List<Integer> filter = filter(integers, i -> i > 0);
        System.out.println(filter);
    }

    public static <T> List<T> filter(List<T> list,Predicate<T> p) {
        ArrayList<T> objects = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)){
                objects.add(s);
            }
        }
        return objects;
    }
}
