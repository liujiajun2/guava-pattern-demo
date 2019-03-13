package xin.liujiajun.guava.reflection;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;

import java.io.IOException;

/**
 * @author liujiajun
 * @description ClassPath demo
 * @create 2019-03-13 18:03
 **/
public class ClassPathDemo {

    public static void main(String[] args) throws IOException {
        Dog dog = new Dog();
        ClassPath from = ClassPath.from(dog.getClass().getClassLoader());
        ImmutableSet<ClassPath.ClassInfo> classInfos = from.getTopLevelClasses("xin.liujiajun.guava.reflection");
        for (ClassPath.ClassInfo c: classInfos) {
            System.out.println(c.getName());
            System.out.println(c.getPackageName());
            System.out.println(c.getSimpleName());

        }
    }
}
