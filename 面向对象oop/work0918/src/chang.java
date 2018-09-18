import java.util.Scanner;

public class chang {
    String [] names=new String[128];
    public void addName(String name)
    {
        for (int i = 0; i <names.length ; i++)
        {
            if(names[i]==null)
            {
                names[i]=name;
                break;
            }
        }
    }
    public void addName2()
    {
        System.out.println("****************************************");
        System.out.println("\t\t 客户姓名列表:");
        System.out.println("****************************************");
        for (String k:names) {
            if (k != null) {
                System.out.print(k + "\t");
            } else {
                break;
            }
        }
    }
    public void adddName3(String num1,String num2)
    {
        boolean flag=false;
        System.out.println();
        for (int i = 0; i <names.length ; i++) {
            if (num1.equals(names[i])) {
                flag = true;
                names[i] = num2;
                System.out.println("*****修改结果*****");
                System.out.println("找到并修改成功!");
                break;
            }

        }
        if (!flag) {
            System.out.println("*****修改结果*****");
            System.out.println("没找到客户!");
        }
    }
    public void addName4(int startnum,int endnum,String searth)
    {
        boolean kaiguan=false;
        if(startnum >endnum)
        {
            System.out.println("对不起输入错误!");
        }
        else
        {
            for (int i = startnum-1; i <endnum ; i++)
            {
                if(names[i].equals(searth))
                {
                    System.out.println("*****查找结果*****");
                    System.out.println(searth+"客户找到!");
                    kaiguan=true;
                    break;
                }

            }
            if(!kaiguan)
            {
                System.out.println("*****查找结果*****");
                System.out.println(searth+"客户没找到!");
            }
        }

    }
    public static void main(String[] args)
    {
        String a;
        chang wyj=new chang();
        Scanner abc=new Scanner(System.in);
        do {
            System.out.print("请输入客户姓名:输入n结束");
            a=abc.next();
            if(!"n".equals(a))
            {
                wyj.addName(a);
            }

        }while(!"n".equals(a));
        wyj.addName2();
        System.out.println();
        System.out.print("请输入要修改的客户姓名:");
        String num1=abc.next();
        System.out.print("请输入新的客户姓名:");
        String num2=abc.next();
        wyj.adddName3(num1,num2);
        wyj.addName2();
        System.out.println();
        System.out.print("请输入要查找区间的开始值:从1开始");
        int startnum=abc.nextInt();
        System.out.print("请输入要查找区间的结束值:");
        int endnum=abc.nextInt();
        System.out.print("请输入要查找的用户!");
        String searth=abc.next();
        wyj.addName4(startnum,endnum,searth);
    }
}
