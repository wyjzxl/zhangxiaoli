import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administrator on 2018/10/8.
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap();
        //增加，键key值value不能重复
        map.put("中国","CN");
        map.put("美国","USN");
        map.put("日本","JP");
        map.put("英国","UK");
        //获取
        System.out.println(map.get("中国"));
        //删除
        map.remove("日本");
        System.out.println(map.get("日本"));
        //长度
        System.out.println(map.size());
        //返回键的集合
        Set keys=map.keySet();
        for(Object o:keys){
            System.out.println("key:"+o+",value:"+map.get(o));
        }
        //返回值得集合
        Collection values=map.values();
        for(Object c:values){
            System.out.println(c);
        }
        System.out.println(map.containsKey("中国")); //true
        System.out.println(map.containsValue("UK")); //true
    }
}
