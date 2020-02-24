package openclose;

/**
 * @Author God
 * @Date 2020/2/23 16:35
 * @description:
 *  问题：
 *      如果现在 我要优惠怎么办。
 *      开闭原则
 *      在不修改原来的基础上，进行优惠。
 *      新增加一个关于java的优惠类即可
 */
public class JavaCourse implements ICourse{

    private String id;
    private String name;
    private Double price;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return 11880.0;
    }
}
