import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        String name=null;
        int tx=0;

        System.out.print("请输入学生姓名:");
        Scanner wyj=new Scanner(System.in);
        name=wyj.next();
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            System.out.print("请输入第"+(i+1)+"门的成绩:");
            tx=wyj.nextInt();
            while(tx<0)
            {
                System.out.println("抱歉,分数录入错误,请重新进行录入!");
                i=i-1;
                tx=0;
                break;
            }

            sum=sum+tx;
        }
        System.out.println("学生姓名:"+name+",五科平均分:"+(sum/5));
    }
}
