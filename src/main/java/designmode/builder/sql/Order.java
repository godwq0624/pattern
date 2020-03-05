package designmode.builder.sql;


import lombok.Data;

/**
 * sql排序组件
 *
 * @author Tom
 */
@Data
public class Order {
    /*
        升序还是降序
     */
    private boolean ascending;
    /*
    哪个字段升序，哪个字段降序
    */
    private String propertyName;

    /**
     * Constructor for Order.
     */
    protected Order(String propertyName, boolean ascending) {
        this.propertyName = propertyName;
        this.ascending = ascending;
    }

    /**
     * Ascending order
     *
     * @param propertyName
     * @return Order
     */
    public static Order asc(String propertyName) {
        return new Order(propertyName, true);
    }

    /**
     * Descending order
     *
     * @param propertyName
     * @return Order
     */
    public static Order desc(String propertyName) {
        return new Order(propertyName, false);
    }

}