package huanchongqu;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        try {
            fis=new FileInputStream("D:\\hehe\\test.txt");
            isr=new InputStreamReader(fis,"UTF-8");
            br=new BufferedReader(isr);
            String data=br.readLine();
            while (data!=null)
            {
                System.out.println(data);
                data=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
