package designmode.singleton.lazy;

/**
 * @Author God
 * @Date 2020/2/29 13:35
 * @description:
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        //防止反射破坏单例
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("禁止创建多个实例");
        }
    };

    /**
     *使用 LazyInnerClassSingleton 的时候，默认会先初始化内部类
     * 如果没使用，则内部类是不加载的
     * 每一个关键字都不是多余的，static 是为了使单例的空间共享，final 保证这个方法不会被重写、重载
     * @return LazyInnerClassSingleton 在返回结果以前，一定会先加载内部类
     */
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    //默认不加载，用到再加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
