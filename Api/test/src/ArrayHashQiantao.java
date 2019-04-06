import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class ArrayHashQiantao {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        HashMap<String,ArrayList<String>> hashMap=new HashMap();
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("郭靖");
        arrayList1.add("黄蓉");
        arrayList1.add("杨过");
        hashMap.put("三年级一班",arrayList1);
        ArrayList arrayList2=new ArrayList();
        arrayList2.add("吕布");
        arrayList2.add("张飞");
        arrayList2.add("貂蝉");
        hashMap.put("三年级二班",arrayList2);
        System.out.println("请输入班级名称:");
        String name=abc.next();
        Set<String> keys=hashMap.keySet();
        for (String s:keys)
        {
            if(name.equals(s))
            {
                System.out.println(s);
                ArrayList<String> a= hashMap.get(s);
                for (String k:a) {
                    System.out.println(k);
                }
            }
        }

    }
}
