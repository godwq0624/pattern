package designmode.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author God
 * @Date 2020/3/3 11:43
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype entity = new ConcretePrototype();
        entity.setAge(25);
        entity.setName("Zero");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("唱歌");
        hobbies.add("跳舞");
        entity.setHobbies(hobbies);
        System.out.println(entity);
        //拷贝原型对象
        //ConcretePrototype cloneType = entity.clone();
        //cloneType.getHobbies().add("rap");
        System.out.println("原型对象：" + entity);
        //System.out.println("克隆对象：" + cloneType);
    }

}
