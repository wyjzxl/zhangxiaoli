import java.util.Scanner;

public class OOS
{
    public static void main(String[] args)
    {
        System.out.println();
        boolean isExit=false;
        int num=-1;
        Scanner wyj=new Scanner(System.in);
        //主界面
        System.out.println("欢迎使用“吃货联盟订餐系统”");
        do{
            System.out.println("***********************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐带");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("***********************************");
            System.out.print("请选择:");
            int input=wyj.nextInt();//用户输入相对应的功能编号
            //定义多个一维数组
            String []names=new String [128];
            String []dishMegs=new String[128];
            int []times=new int [128];
            String [] addresses=new String[128];
            int []states=new int[128];
            double[]amount=new double[128];
            String [] dishNames={"红烧带鱼","鱼香肉丝","时令蔬菜"};
            double [] prices=new double[]{38,20,10};
            int []praiseNums=new int[3];
            //初始化订单信息
            names[0]="张晴";
            dishMegs[0]="红烧带鱼2份";
            times[0]=12;
            addresses[0]="天成路207号";
            states[0]=1;
            amount[0]=76.0;

            names[1]="张晴";
            dishMegs[1]="鱼香肉丝2份";
            times[1]=18;
            addresses[1]="天成路207号";
            states[1]=0;
            amount[1]=45.0;
            //功能选择
            switch (input)
            {
                case 1:
                    boolean ia=false;
                    System.out.println("***我要订餐***");
                    for(int j=0;j<names.length;j++)
                    {
                        if(names[j]==null)
                        {
                            ia=true;
                            System.out.println("请输入订餐人的姓名:");
                            String name=wyj.next();
                            System.out.println("序号"+"\t"+"菜名"+"\t\t"+"单价"+"\t"+"点赞数");
                            for(int k=0;k<dishNames.length;k++)
                            {
                                String price=prices[k]+"元";
                                String priaiseNum=(praiseNums[k])>0?praiseNums[k]+"赞":"0";
                                System.out.println((k+1)+"\t\t"+dishNames[k]+"\t"+price+"\t"+priaiseNum);
                            }
                            System.out.print("请选择您要点的菜品编号");
                            int DishNum=wyj.nextInt();
                            System.out.print("请选择您需要的份数");
                            int number=wyj.nextInt();
                            String dishMeg=dishNames[DishNum-1]+" "+number+"份" ;
                            double sumPrice=prices[DishNum-1]*number;

                            double deliCharge=(sumPrice>=50)?0:5;
                            System.out.print("请输入送餐时间(送餐时间是10点到20点间整点送餐)");
                            int time=wyj.nextInt();
                            while(time<10 || time >20)
                            {
                                System.out.print("您的输入有误,请输入10-20间的整点数!");
                                time=wyj.nextInt();
                            }
                            System.out.print("请输入送餐地址:");
                            String address=wyj.next();

                            System.out.println("您订餐成功!");
                            System.out.println("您订的是:"+dishMeg);
                            System.out.println("送餐时间:"+time+"点");
                            System.out.println("餐费:"+sumPrice+"元,送餐费"+deliCharge+"元,总计:"+(sumPrice+deliCharge)+"元.");

                            names[j]=name;
                            dishMegs[j]=dishMeg;
                            times[j]=time;
                            addresses[j]=address;
                            amount[j]=sumPrice+deliCharge;
                            break;
                        }
                    }
                    if(!ia)
                    {
                        System.out.println("对不起，您的餐袋已满!");
                    }
                    break;
                case 2:
                    System.out.println("***查看餐带***");
                    //查看餐带
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
                    for(int i=0;i<names.length;i++)
                    {
                        if(names[i]!=null)
                        {
                            String state=(states[i]==0)?"已预定":"已完成";
                            String date_time=times[i]+"点";
                            String Money=amount[i]+"元";
                            System.out.println((i+1)+"\t\t"+ names[i]+"\t"+dishMegs[i]+"\t\t"+date_time+"\t\t"+addresses[i]+"\t\t"+ Money+"\t"+state);
                        }


                    }
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    boolean isf=false;
                    System.out.print("请选择要签收的订单序号:");
                    int so=wyj.nextInt();
                    for(int i=0;i<names.length;i++)
                    {
                        if(names[i]!=null && states[i]==0 && so==i+1)
                        {
                            states[i]=1;
                            System.out.println("订单签收成功!");
                            isf=true;
                        }
                        else if(names[i]!=null && states[i]==1 && so==i+1)
                        {
                            System.out.println("您选择的订单已经完成签收,不能再次签收!");
                            isf=true;
                        }
                    }
                    if(!isf)
                    {
                        System.out.println("您选择的订单不存在!");
                    }
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    boolean idf=false;
                    System.out.print("请输入要删除的订单序号:");
                    int intded=wyj.nextInt();
                    for(int i=0;i<names.length;i++)
                    {
                        if(names[i]!=null &&states[i]==1 && intded==i+1)
                        {
                            idf=true;
                            for(int j=intded-1;j<names.length-1;j++)
                            {
                                names[j]=names[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                states[j]=states[j+1];
                                amount[j]=amount[j+1];
                            }
                            int endindex=names.length-1;
                            names[endindex]=null;
                            dishMegs[endindex]=null;
                            times[endindex]=0;
                            addresses[endindex]=null;
                            states[endindex]=0;
                            amount[endindex]=0;
                            System.out.println("删除订单成功!");
                            break;
                        }
                        else if(names[i]!=null && states[i]==0 && intded==i+1)
                        {
                            System.out.println("您选择的订单未签收,不能删除!");
                            idf=true;
                            break;
                        }
                    }
                    if(!idf)
                    {
                        System.out.println("您要删除的订单不存在!");
                    }
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号"+"\t"+"菜名"+"\t\t"+"单价");
                    for(int i=0;i<dishNames.length;i++)
                    {
                        String price=prices[i]+"元";
                        String priaiseNum=(praiseNums[i])>0?praiseNums[i]+"赞":"";
                        System.out.println((i+1)+"\t\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
                    }
                    System.out.print("请选择您要点赞的菜品序号:");
                    int hh=wyj.nextInt();
                    praiseNums[hh-1]++;
                    System.out.println("点赞成功!");
                    break;
                case 6:
                    System.out.println("***退出系统***");
                    System.out.println("您真的要退出吗?确定1不确定2");
                    int comfirm=wyj.nextInt();
                    if(comfirm==1)
                    {
                        System.exit(0);
                    }
                    else if(comfirm==2)
                    {
                        break;
                    }

                    break;
                 default:
                     isExit=true;
                     break;
            }
            //界面切换
            if(!isExit)
            {
                System.out.print("输入0返回:");
                num=wyj.nextInt();
            }
            else
            {
                break;
            }
        }while(num==0);
    }
}
