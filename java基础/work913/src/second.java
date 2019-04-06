import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        String [] nums=new String[]{"8","4","2","1","23","344","12"};
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        String  ask=null;
        String num=null;
        Scanner wyj=new Scanner(System.in);
        while(!flag1)
        {
            System.out.println("请输入数:");
            num=wyj.next();
            for(int i=0;i<nums.length;i++)
            {
                if("1".equals(num)||"8".equals(num)||"4".equals(num)||"2".equals(num)||"23".equals(num)||"344".equals(num)||"12".equals(num))
                {
                    System.out.println("恭喜你猜对了，这个数在这个数列里!");
                    flag2=true;
                    break;
                }
                else if("退出".equals(num))
                {
                    System.out.println("是否要退出:是yes,否no");
                    ask=wyj.next();
                    if("true".equals(ask) )
                    {
                        flag3=true;
                        flag2=true;
                        break;
                    }
                    else if("no".equals(ask))
                    {
                        flag3=false;
                        System.out.println("请输入数:");
                        num=wyj.next();
                        continue;
                    }
                }
                else if(!num.equals(nums[i]))
                {
                    System.out.println("恭喜你错了!");
                    System.out.println("请输入数:");
                    num=wyj.next();
                    continue;
                }

                if(!flag3  )
                {
                    break;
                }
            }
            if(!flag3  )
            {
                break;
            }
        }

        System.out.println("程序结束!");


    }
}
