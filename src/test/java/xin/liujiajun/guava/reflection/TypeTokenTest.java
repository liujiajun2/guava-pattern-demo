package xin.liujiajun.guava.reflection;

import com.google.common.reflect.TypeToken;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author liujiajun
 * @description
 * @create 2019-03-20 11:39
 **/
public class TypeTokenTest {


    @Test
    public void test() throws NoSuchMethodException {
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println(list.getClass().getTypeName());

        TypeToken<? extends List> token = TypeToken.of(list.getClass());

        System.out.println(token.getType());

        TypeToken<List<String>> typeToken = new TypeToken<List<String>>() {};

        System.out.println(typeToken.getType());

        System.out.println(typeToken.getRawType());

        TypeToken<List<String>>.TypeSet types = typeToken.getTypes();

        System.out.println(types);


        TypeToken<Map<String, Integer>> typeToken1 = new TypeToken<Map<String, Integer>>() {
        };
        TypeToken<?> entrySet = typeToken1.resolveType(Map.class.getMethod("entrySet").getGenericReturnType());

        System.out.println(entrySet);
    }
}
