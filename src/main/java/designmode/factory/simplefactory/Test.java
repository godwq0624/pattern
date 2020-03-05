package designmode.factory.simplefactory;

/**
 * @Author God
 * @Date 2020/2/25 21:30
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ICourse course = CourseFactory.create(JavaCourse.class);
        course.record();
    }
}
