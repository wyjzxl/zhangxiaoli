/**
 * Created by Administrator on 2018/10/9.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        System.out.println(str1==str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1==str3);  //false
        System.out.println(str1.equals(str3)); //true
        str1=str1+"world";
        String str5="helloworld";
        System.out.println(str1==str5); //false
        String str6="love"+new String("you");
        //获取字符串长度,下标从0开始
        System.out.println(str1.length());
        //转换为大写
        System.out.println(str1.toUpperCase());
        //转换为小写
        System.out.println(str1.toLowerCase());
        //忽略大小写比较
        System.out.println(str2.equalsIgnoreCase("HEllo"));
        //字符串连接
        str2.concat("world");
        System.out.println(str2); //hello
        String str7= str2.concat("world");
        System.out.println(str7); //helloworld
        //获取某个字符第一次出现的下标
        System.out.println(str7.indexOf("lo")); //3
        System.out.println(str7.lastIndexOf("o")); //6
        //适用于模糊查询
        System.out.println(str7.indexOf("a")); //-1
        //字符串截取
        System.out.println(str7.substring(2,5)); //llo
        System.out.println(str7.substring(5)); //world
        //去空格
        String str8=" 123456";
        System.out.println(str8.trim());
        //根据下标取字符
        System.out.println(str7.charAt(4));
        //拆分
        String str9="长亭外,古道边,芳草碧连天";
        String[]strs=str9.split(",");
        System.out.println(strs[1]);

    }
}
