public class Student {
    public String name;
    public int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }
    @Override
    public  boolean equals(Object o)
    {
        if(this==o)
        {
            return true;
        }
        if(! (o instanceof Student))
        {
            return false;
        }
        Student stu=(Student) o;
        if(this.num == stu.num && this.name==stu.name)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Student zhangsan=new Student("张三",1);
        Student zs=new Student("张三",1);
        boolean flag=zhangsan.equals(zs);
        System.out.println(flag);
    }
}
