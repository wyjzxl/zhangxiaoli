import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2018/10/8.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        //迭代器遍历
        Iterator<String>it=hashSet.iterator();
        while(it.hasNext()){
            String o= it.next();
//            System.out.println(o);
            if(o.equals("张三")){
                it.remove();
            }
        }
        for(String o:hashSet){
            System.out.println(o);
        }
    }
}
