package designmode.prototype.deep;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @Author God
 * @Date 2020/3/3 11:02
 * @description:
 */
@Data
public class ConcretePrototype implements Serializable {

    private String name;
    private Integer age;
    private List<String> hobbies;

    /**
     * 通过序列化的方式实现深克隆
     * 二进制流
     * @return
     */
    public ConcretePrototype deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ConcretePrototype)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
