import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2018/10/9.
 */
public class MathDemo {
    public static void main(String[] args) {
            Math.abs(-3.5);  //3.5
            Math.max(2.5,90.5);  //90.5
        //生成0-10之间随机数两种方式
        Random r=new Random();
        r.nextInt(10);
        int s=(int)(Math.random()*10);
    }
}
