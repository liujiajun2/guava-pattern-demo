package xin.liujiajun.guava.base;

import com.google.common.base.Throwables;

import java.util.List;

/**
 * @author liujiajun
 * @description Throwables demo
 * @create 2019-03-11 17:49
 **/
public class ThrowablesDemo {

    public static void main(String[] args) {
        try{
//            throw new NullPointerException();
            throw new OutOfMemoryError();
        }catch (Throwable throwable){
            //异常的传播
//            Throwables.propagateIfPossible(throwable,NullPointerException.class);
            //抛出异常，当throwabel 为declaredType类型的实例
            Throwables.throwIfInstanceOf(throwable,NullPointerException.class);
//            throw Throwables.propagateIfPossible(throwable,NullPointerException.class);


            //异常原因链
            Throwable rootCause = Throwables.getRootCause(throwable);
            System.out.println(rootCause.getCause());

            List<Throwable> causalChain = Throwables.getCausalChain(throwable);
            System.out.println(causalChain);

            String stackTraceAsString = Throwables.getStackTraceAsString(throwable);

            System.out.println(stackTraceAsString);
        }
    }
}
