package xin.liujiajun;

import java.util.Arrays;
import java.util.List;

/**
 * @author liujiajun
 * @description
 * @create 2019-03-18 17:06
 **/
public class TestBinHaveManyOne {

    public static void main(String[] args) {
        List<Long> integers = Arrays.asList(1L, 2L, 3L, 10214L);
        System.out.println(testBinHaveManyOne(integers));
    }
    public static int testBinHaveManyOne(List<Long> longs) {
        int count = 0;
        for (int i = 0; i < longs.size(); i++) {
            long x = longs.get(i);
            while (x>0){
                count++;
                x = x & (x-1);
            }
        }
        return count;
    }
}
