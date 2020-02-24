package openclose;

/**
 * @Author God
 * @Date 2020/2/23 16:32
 * @description:
 */
public interface ICourse {
    /**
     * 获得课程id
     * @return
     */
    String getId();

    /**
     * 获得课程名字
     * @return
     */
    String getName();

    /**
     * 获得课程价格
     * @return
     */
    Double getPrice();


}
