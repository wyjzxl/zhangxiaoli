package AllC.menpiao;

import java.util.Scanner;

public class menpiao {
    String name;
    int nianling;
    public String jsjg()
    {
        String b=null;

        if(nianling>60)
        {
            b=name+ "的年龄为:"+nianling+",门票价格为:10元\n";
        }
        else if(nianling <=60 &&nianling>=10)
        {
            b=name+ "的年龄为:"+nianling+",门票价格为:20元\n";
        }
        else if(nianling<10)
        {
            b=name+ "的年龄为:"+nianling+",门票免费\n";
        }
        return  b;
    }

    public static void main(String[] args)
    {
        menpiao wyj=new menpiao();
        Scanner abc=new Scanner(System.in);
        do {
            System.out.println("请输入姓名:");
            wyj.name=abc.next();
            if(wyj.name.equals("n"))
            {
                break;
            }
            System.out.println("请输入年龄:");
            wyj.nianling=abc.nextInt();
            System.out.println(wyj.jsjg());

        }while(!"n".equals(wyj.name));
        System.out.println("退出程序!");
    }
}
