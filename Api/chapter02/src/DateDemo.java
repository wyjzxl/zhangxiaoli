import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by Administrator on 2018/10/10.
 */
public class DateDemo {
    public static void main(String[] args) {
        //日期格式
        Date date=new Date();
        System.out.println(date);
        //格式化:日期格式-》文本格式
        SimpleDateFormat formater=
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=formater.format(date);
        System.out.println("当前日期为:"+s);
        // 解析:文本格式-》日期格式
        try {
            Date d=formater.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
