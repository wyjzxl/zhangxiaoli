/**
 * Created by Administrator on 2018/10/10.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        s.append("hello");
        s.append("world");
        System.out.println(s);  //helloworld
        String str=s.toString();
        System.out.println(str.length());//10
        //插入
        s.insert(1,"love");
        System.out.println(s);
    }
}
