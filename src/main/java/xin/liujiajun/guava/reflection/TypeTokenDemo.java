package xin.liujiajun.guava.reflection;

import com.google.common.collect.Lists;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author liujiajun
 * @description TypeToken demo
 * @create 2019-03-13 15:56
 **/
public class TypeTokenDemo {

    public static void main(String[] args) throws NoSuchMethodException {


//        ArrayList<String> string = Lists.newArrayList();
//        ArrayList<Integer> inte = Lists.newArrayList();
//
//        System.out.println(string.getClass().isAssignableFrom(inte.getClass()));
//
//
//        TypeToken<String> str = TypeToken.of(String.class);
//        boolean array = str.isArray();
//        boolean primitive = str.isPrimitive();
//
//        System.out.println(array);
//
//        System.out.println(primitive);
//
//        TypeToken<List<String>> typeToken = new TypeToken<List<String>>() {};
//        System.out.println(typeToken.getType());
//        System.out.println(typeToken.getRawType());


        TypeToken<Function<Integer, String>> funcToken = new TypeToken<Function<Integer, String>>() {
        };
        TypeToken<?> typeToken1 = funcToken.resolveType(Function.class.getTypeParameters()[1]);
        System.out.println(typeToken1);


        TypeToken<Map<String, Integer>> mapToken = new TypeToken<Map<String, Integer>>() {
        };

        TypeToken<?> entrySet = mapToken.resolveType(Map.class.getMethod("entrySet").getGenericReturnType());
        System.out.println(entrySet);
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        for (Method m: methods) {
            System.out.print(m.getName() + "  JDK judge ");
            System.out.print(Modifier.isPublic(m.getModifiers()) + "Guava judge ");
            System.out.println(Invokable.from(m).isPublic());

            Invokable<?, Object> from = Invokable.from(m);
            //包私有
            from.isPackagePrivate();
            //是否可以被子类覆盖
            from.isOverridable();
            //方法第一个参数是否被定义了注解@Nullable
            from.getParameters().get(0).isAnnotationPresent(Nullable.class);

        }
//        Class<String> stringClass = String.class;
//        Constructor<?>[] constructors = stringClass.getConstructors();
//        for (Constructor c: constructors) {
//            String name = c.getName();
//            int parameterCount = c.getParameterCount();
//            Class[] parameterTypes = c.getParameterTypes();
//            System.out.print(name + "(");
//            for (Class cc: parameterTypes) {
//                System.out.print(cc.getSimpleName() + ",");
//            }
//            System.out.print(")");
//            System.out.println();
//        }
    }
}
