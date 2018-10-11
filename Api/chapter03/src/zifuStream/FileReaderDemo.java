package zifuStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/11.
 * 字符输入流
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
             fr=new FileReader("D:\\mydoc\\doc.txt");
            //获取本地编码格式
            System.out.println(System.getProperty("file.encoding"));
//             int data=fr.read();
//            while(data!=-1){
//                System.out.println((char)data);
//                data=fr.read();
//            }
            char[]ch=new char[30];
            fr.read(ch);
            for (int i = 0; i <ch.length ; i++) {
                System.out.println((char)ch[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
