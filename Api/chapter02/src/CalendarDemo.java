import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/10.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //创建实例
        Calendar c=Calendar.getInstance();
        System.out.println("今天是"+c.get(Calendar.YEAR)+"年"
                +(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日,星期"+
                (c.get(Calendar.DAY_OF_WEEK)-1));
        Date date=c.getTime();
        System.out.println(date);
    }
}
