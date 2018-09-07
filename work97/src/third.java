import java.util.Scanner;
public class third {
    public static void main(String[] args) {

                String week=null;
                int te=1;
                Scanner wyj =new Scanner(System.in);
                while(true)
                {
                    System.out.print("请输入数字1-7(输入0时结束):");
                    te=wyj.nextInt();
                    if(te>=1 && te<=7)
                    {
                        switch (te)
                        {
                            case 1:
                                week="星期一";
                                break;
                            case 2:
                                week="星期二";
                                break;
                            case 3:
                                week="星期三";
                                break;
                            case 4:
                                week="星期四";
                                break;
                            case 5:
                                week="星期五";
                                break;
                            case 6:
                                week="星期六";
                                break;
                            case 7:
                                week="星期天";
                                break;
                            default:
                                break;
                        }
                        System.out.println("今天是:"+week);
                    }
                    else if (te==0)
                    {
                        System.out.println("程序结束!");
                        break;
                    }
                    else
                    {
                        System.out.println("您输入的数字不合格,只能输入1-7范围的数字!");
                    }

                }

            }
}
