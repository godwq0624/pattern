package designmode.singleton.lazy;

/**
 * @Author God
 * @Date 2020/2/29 13:23
 * @description:懒汉式
 */
public class LazySingleton {

    private static  LazySingleton instance = null;

    private LazySingleton(){};

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
