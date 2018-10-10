package meiju;

/**
 * Created by Administrator on 2018/10/9.
 */
public class Student {
    public String name;
    public Gender sex;
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name=" 张三";
        stu.sex=Gender.Male;
    }
}
