package designmode.prototype.standard;

/**
 * @Author God
 * @Date 2020/3/3 9:19
 * @description:克隆接口，在jdk中的克隆接口为cloneAble
 */
public interface IPrototype<T> {
    /**
     * 克隆方法
     * @return
     */
    T clone();
}
