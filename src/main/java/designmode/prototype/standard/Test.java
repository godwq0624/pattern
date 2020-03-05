package designmode.prototype.standard;

/**
 * @Author God
 * @Date 2020/3/3 11:26
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(25);
        prototype.setName("Zero");
        System.out.println(prototype);
        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println(cloneType);
    }
}
