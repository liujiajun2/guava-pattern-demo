package xin.liujiajun.guava.util;

import com.google.common.base.Throwables;

/**
 * @author liujiajun
 * @description Throwables demo
 * @create 2019-03-11 17:49
 **/
public class ThrowablesDemo {

    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }catch (Throwable throwable){
            Throwables.propagateIfPossible(throwable,NullPointerException.class);
           // Throwables.throwIfInstanceOf(throwable,NullPointerException.class);
        }
    }
}
