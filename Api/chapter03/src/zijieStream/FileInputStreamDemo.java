package zijieStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/11.
 * //字节输入流
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            //创建流对象
             fis=new FileInputStream("D:\\hehe\\test.txt");
            //读内容,读到末尾返回-1
            //  int data=fis.read();
//            while(data!=-1){
//                System.out.println((char)data);
//                data=fis.read()
//            }
            System.out.println("字节数目："+fis.available());
            byte[]b=new byte[30];
//            fis.read(b);
             fis.read(b,0,5);
            for (int i = 0; i <b.length ; i++) {
                System.out.println((char)b[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
