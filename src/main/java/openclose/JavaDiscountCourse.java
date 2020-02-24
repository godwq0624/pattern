package openclose;

/**
 * @Author God
 * @Date 2020/2/23 16:35
 * @description:
 */
public class JavaDiscountCourse implements ICourse{

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
        return 11880.0*0.6;
    }
}
