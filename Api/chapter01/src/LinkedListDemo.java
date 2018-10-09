import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2018/10/8.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("范冰冰逃税");
        linkedList.add("李晨赞助2亿");
        linkedList.add("吴秀波事件");
        linkedList.addFirst("马云放弃阿里巴巴控股权");
        linkedList.remove();
        for (int i = 0; i <linkedList.size() ; i++) {
            String news= (String) linkedList.get(i);
            System.out.println(news);
        }
        Iterator it=linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println(linkedList.getFirst());

    }
}
