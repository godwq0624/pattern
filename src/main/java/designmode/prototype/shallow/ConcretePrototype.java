package designmode.prototype.shallow;

import lombok.Data;
import java.util.List;

/**
 * @Author God
 * @Date 2020/3/3 11:02
 * @description:
 */
@Data
public class ConcretePrototype implements Cloneable {

    private String name;
    private Integer age;
    private List<String> hobbies;


    @Override
    public ConcretePrototype clone(){
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
