package designmode.factory.simplefactory;

/**
 * @Author God
 * @Date 2020/2/25 21:27
 * @description:
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
