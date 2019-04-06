package FileOpera;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/11.
 */
public class FileMethods {
    //创建文件
    public void create(File file){
        try {
            //判断文件是否存在
            if(!file.exists()) {
                //创建文件
                file.createNewFile();
                System.out.println("创建成功");
            }else{
                System.out.println("文件已经存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //删除文件
    public void delete(File file){
        if(file.exists()){
            //删除文件
            file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("文件不存在");
        }
    }
    //查询文件详细信息
    public void show(File file){
        if(file.exists()){
            //判断是否是文件
            if(file.isFile()){
                System.out.println("名称:"+file.getName());
                System.out.println("相对路径:"+file.getPath());
                System.out.println("绝对路径:"+file.getAbsolutePath());
                System.out.println("文件大小:"+file.length());
            }else{
                System.out.println("这不是文件");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
    public static void main(String[] args) {
        FileMethods fm=new FileMethods();
        File file=new File("D:\\mydoc\\test.txt");
        fm.create(file);
        //fm.delete(file);
        fm.show(file);
    }
}
