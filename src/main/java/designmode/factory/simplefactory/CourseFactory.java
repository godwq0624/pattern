package designmode.factory.simplefactory;

/**
 * @Author God
 * @Date 2020/2/25 21:28
 * @description:
 */
public class CourseFactory {
    /**
        可以做成静态方法，配合单例一起使用
     */
    public static ICourse create(Class<? extends ICourse> clazz){
        try {
            if(clazz != null){
               return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
