package xin.liujiajun.guava.base;


import com.google.common.base.Optional;
import org.junit.Test;

import java.util.Set;

public class OptionalTest {

    @Test
    public void testMakeOptional() {
        //创建一个包含给定值得Optional，或者快速失败
        Optional<Integer> of = Optional.of(1);
        System.out.println(of);

        //java.lang.NullPointerException
        //Optional<Object> of1 = Optional.of(null);

        //创建一个值不存在的Optional
        Optional<Object> absent = Optional.absent();
        System.out.println(absent);

        //创建一个可能为null值得Option,如果值为null相当于absent
        Optional<Object> fromNullable = Optional.fromNullable(null);
        System.out.println(fromNullable);
    }

    @Test
    public void testMethod() {

        Optional<Integer> optional = Optional.of(2);
        //判断Optional的值是否不为null
        if (optional.isPresent()) {
            //返回所包含的实例，如果所包含的实例为null，直接抛出异常
            System.out.println(optional.get());
        }

        Optional<Object> nullable = Optional.fromNullable(null);
        Object or = nullable.or(2);
        System.out.println(or);


        Object o = nullable.orNull();
        System.out.println(o);


        Set<Object> objects = nullable.asSet();
        System.out.println(objects);
    }


    @Test
    public void test02() {
        java.util.Optional<Object> empty = java.util.Optional.empty();
        System.out.println(empty.isPresent());



    }



}
