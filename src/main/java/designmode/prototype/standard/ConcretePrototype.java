package designmode.prototype.standard;

import lombok.Data;

/**
 * @Author God
 * @Date 2020/3/3 11:02
 * @description:具体的原型对象
 */
@Data
public class ConcretePrototype implements IPrototype<ConcretePrototype> {

    private String name;
    private Integer age;


    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
