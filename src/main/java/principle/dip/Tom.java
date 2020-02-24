package principle.dip;

/**
 * @Author God
 * @Date 2020/2/24 14:58
 * @description:
 */
public class Tom {

    private ICourse course;
    public void setCourse(ICourse course) {
        this.course = course;
    }
    public void study(){
        course.study();
    }
    // todo 依赖注入方式有构造器方式和setter 如果 Tom 是全局单例，则我们就只能选择setter方式

}
