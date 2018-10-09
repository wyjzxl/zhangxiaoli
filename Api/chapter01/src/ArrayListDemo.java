import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        //添加
        arrayList.add("张三");//0
        arrayList.add("李四"); //2
        arrayList.add("王五"); //3
        //在指定的索引位置添加
        arrayList.add(1,"赵六"); //1
        arrayList.add("王五");
        //返回列表元素个数size()
        System.out.println(arrayList.size());
        //返回指定索引位置下的元素
        System.out.println(arrayList.get(2));
        //删除
//        arrayList.remove(2);
        arrayList.remove("李四");
        System.out.println(arrayList.get(2));
        //判断某个元素是否存在contains()
        boolean flag=arrayList.contains("王五");
        System.out.println(flag);
        //清空clear()
//        arrayList.clear();
        System.out.println(arrayList.size());//0
        System.out.println(arrayList.isEmpty()); //true
       //转换为数组
        Object[] names=arrayList.toArray();
        System.out.println(names[2]);
    }
}
