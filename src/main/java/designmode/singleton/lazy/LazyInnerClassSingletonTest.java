package designmode.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Author God
 * @Date 2020/2/29 13:35
 * @description:
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws Exception {
        Class<LazyInnerClassSingleton> aClass = LazyInnerClassSingleton.class;
        //通过反射获取私有的构造方法
        Constructor c = aClass.getDeclaredConstructor(null);
        c.setAccessible(true);
        //暴力初始化
        Object o1 = c.newInstance();
        Object o2 = c.newInstance();
        //相等吗？
        System.out.println(o1 == o2);
    }
}
