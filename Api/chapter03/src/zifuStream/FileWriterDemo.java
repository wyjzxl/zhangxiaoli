package zifuStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/11.
 * 字符输出流
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("D:\\mydoc\\doc.txt",true);
            String str="北大青鸟德博";
            fw.write(str);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
