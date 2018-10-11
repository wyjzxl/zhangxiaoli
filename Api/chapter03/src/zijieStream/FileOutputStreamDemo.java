package zijieStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/11.
 * 字节输出流
 */
public class FileOutputStreamDemo {
    public static void main(String[]gs) {
        FileOutputStream fos=null;
        try {
            //true,不覆盖，向文件追加内容
           fos=new FileOutputStream("D:\\mydoc\\doc.txt",true);
            String str="afasfsfgsd";
//            fos.write(str.getBytes());
            fos.write(str.getBytes(),2,3);
            fos.flush();//刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
