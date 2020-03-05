package designmode.singleton.lazy;

/**
 * @Author God
 * @Date 2020/2/29 13:31
 * @description:双重检测锁
 */
public class LazyDoubleCheck {
    private static  LazyDoubleCheck instance = null;
    private LazyDoubleCheck(){};
    //双重检测锁
    public static  LazyDoubleCheck getInstance(){
        if(instance == null){
            synchronized (LazyDoubleCheck.class){
                if(instance == null){
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
