/**
 * Created by Administrator on 2018/10/7.
 */
public class StudentGneritic<T,V> {  //泛型类
    private T name;
    private V age;
    public StudentGneritic(T name,V age) {
        this.name = name;
        this.age=age;
    }
    public T getName() {   //泛型方法
        return name;
    }
    public V  getAge() {   //泛型方法
        return age;
    }
    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StudentGneritic<Double,Integer> stu=new StudentGneritic(1.12,20);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
    }
}
