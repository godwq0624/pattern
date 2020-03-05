package designmode.builder.standard;

/**
 * @Author God
 * @Date 2020/3/5 10:08
 * @description:调用者
 */
public class Director {
    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        // todo 根据业务进行构建操作
    }
}
