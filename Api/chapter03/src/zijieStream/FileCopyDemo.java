package zijieStream;

import java.io.*;

/**
 * Created by Administrator on 2018/10/11.
 * 文件内容复制
 */
public class FileCopyDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建流对象
            fis=new FileInputStream("D:\\hehe\\test.txt");
            fos=new FileOutputStream("D:\\hehe\\doc.txt",true);
            //读内容,读到末尾返回-1
              int data=fis.read();
            while(data!=-1){
               fos.write(data);
                data=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
