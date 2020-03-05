package designmode.singleton.hungry;

/**
 * @Author God
 * @Date 2020/2/29 13:13
 * @description:恶汉式
 */
public class HungrySingleton {

    private static final HungrySingleton h = new HungrySingleton();

    //另一种写法
    //private static final HungrySingleton h1;
    //
    //static {
    //    h1 = new HungrySingleton();
    //}
    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return h;
    }
}
