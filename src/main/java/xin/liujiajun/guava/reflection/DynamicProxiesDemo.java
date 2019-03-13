package xin.liujiajun.guava.reflection;

import com.google.common.reflect.AbstractInvocationHandler;
import com.google.common.reflect.Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Function;

/**
 * @author liujiajun
 * @description DynamicProxies demo
 * @create 2019-03-13 17:43
 **/
public class DynamicProxiesDemo {


    public static void main(String[] args) {

        //JDK 实现动态代理
        Animal dog = (Animal) Proxy.newProxyInstance(Dog.class.getClassLoader(), new Class[]{Animal.class}, new AnimalInvocationHandler(new Dog()) );
        dog.run();


        // Guava 实现动态代理
        Animal animal = Reflection.newProxy(Animal.class, new AnimalInvocationHandler(new Dog()));
        animal.run();

        AbstractInvocationHandler abstractInvocationHandler = new AbstractInvocationHandler() {
            @Override
            protected Object handleInvocation(Object o, Method method, Object[] objects) throws Throwable {
                return null;
            }
        };


    }
}
