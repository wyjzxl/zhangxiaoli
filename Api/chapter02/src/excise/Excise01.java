package excise;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/10/10.
 */
public class Excise01 {
    public  boolean  check(String name,String pwd1,String pwd2){
        boolean flag=false;
        if(name.length()<3 ||pwd1.length()<6){
            System.out.println("用户名长度不小于3,密码长度不小于6");
        }else if(!pwd1.equals(pwd2)){
            System.out.println("两次密码不同");
        }else{
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Excise01 excise01=new Excise01();
        boolean flag=false;
        do {
            System.out.println("请输入用户名:");
            String name = input.next();
            System.out.println("请输入密码:");
            String pwd1 = input.next();
            System.out.println("请再次输入密码:");
            String pwd2 = input.next();
            flag=excise01.check(name, pwd1, pwd2);
        }while(!flag);

    }

}
