package designmode.builder.standard;

/**
 * @Author God
 * @Date 2020/3/5 9:35
 * @description:构建者抽象：规定和规范各个部分组成的构建，一般由具体子类实现具体的构建过程
 */
public interface IBuilder {
    /**
     * 构建产品对象
     * @return
     */
    Product build();
}
