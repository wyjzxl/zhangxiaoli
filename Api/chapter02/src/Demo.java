import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2018/10/9.
 */
public class Demo {
    public static void main(String[] args) {
//        创建包装类实例,character除外
        Integer i1=new Integer(1);
        Integer i2=new Integer("123");
       // Integer i3=new Integer("ABC"); 报错
       // Integer i4=new Integer(null);  报错
        //String类型不能转换为字符的包装类型
        //Character c=new Character("a");
        System.out.println(i1+" "+i2+" ");
        Boolean b1=new Boolean("tRue"); //true
        Boolean b2=new Boolean("false");  //false
        Boolean b3=new Boolean("love");   //false
        Boolean b4=new Boolean(true);   //true
        System.out.println(b1+" "+b2+" "+b3+" "+b4);
        //包装类转换成基本类型
        Integer i3=new Integer(25);
        int intId=i3.intValue();
        Double d1=new Double(25.5);
        double d=d1.doubleValue();
        //toString（） 以字符串形式返回包装对象表示的基本类型
        String sex=Character.toString('男');
        String id=Integer.toString(89);
        String  sex1='男'+"";

        //把字符串转换成相应得基本类型
         boolean flag=Boolean.parseBoolean("true");  //true
         int num=Integer.parseInt("25");
        //装箱:将基本类型转换为包装类型
        Integer n=5;
        //拆箱：将包装类型转换为基本类型
        int s=n;














    }
}
