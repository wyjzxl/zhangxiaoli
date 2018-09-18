import java.util.Scanner;

public class bestOOS {
    public static void main(String[] args) {
        //定义数组存放
        String names[]=new String[128];
        String suoxuancaipin[]=new String[128];
        int songcanshijian[]=new int[128];
        String addresses[]=new String[128];
        int states[]=new int[128];
        double dingdanjine[]=new double[128];

        int dianzanshu[]=new int[]{0,0,0,0};
        String caiming[]=new String[]{"红烧带鱼","鱼香肉丝","香干肉丝","时令蔬菜"};
        Double caidanjia[]=new Double[]{38.0,20.0,40.0,10.0};

        //初始化2个订单信息
        names[0]="张晴";
        suoxuancaipin[0]="红烧带鱼 2份";
        songcanshijian[0]=11;
        addresses[0]="天成路207号";
        states[0]=1;
        dingdanjine[0]=76.0;
        names[1]="张晴";
        suoxuancaipin[1]="鱼香肉丝 2份";
        songcanshijian[1]=12;
        addresses[1]="天成路207号";
        states[1]=0;
        dingdanjine[1]=20.0;

        //开关
        int flag;
        boolean isExit=false;
        int k;

        //小变量
        String name=null;
        do
        {
            System.out.println("\t\t\t\t\t欢迎使用“吃货联盟订餐系统”");
            System.out.println("*********************************************************************\n");
            System.out.println("\t\t\t\t\t\t1、我要订餐");
            System.out.println();
            System.out.println("\t\t\t\t\t\t2、查看餐袋");
            System.out.println();
            System.out.println("\t\t\t\t\t\t3、签收订单");
            System.out.println();
            System.out.println("\t\t\t\t\t\t4、删除订单");
            System.out.println();
            System.out.println("\t\t\t\t\t\t5、我要点赞");
            System.out.println();
            System.out.println("\t\t\t\t\t\t6、退出系统");
            System.out.println();
            System.out.println("*********************************************************************");
            System.out.print("请选择:");
            Scanner wyj=new Scanner(System.in);
            k=wyj.nextInt();
            switch (k)
            {
                case 1://我要订餐
                    System.out.println("****************************我要订餐*********************************");
                    boolean isAdd=false;
                    for (int i = 0; i <names.length ; i++)
                    {
                        int caipingbianhao=0;
                        int cainum=0;
                        int songcanshijiand=0;
                        String songcandizhi=null;
                        if(names[i]==null)
                        {
                            isAdd=true;
                            System.out.println("请输入订餐人姓名:");
                            name=wyj.next();
                            System.out.println("序号\t\t\t\t\t\t菜名\t\t\t\t\t单价\t\t\t\t\t点赞数");
                            for(int j=0;j<caiming.length;j++)
                            {
                                System.out.println((j+1)+"\t\t\t\t\t\t\t"+caiming[j]+"\t\t\t\t"+caidanjia[j]+"元"+"\t\t\t\t\t"+((dianzanshu[j]>0)?dianzanshu[j]+"个赞":0));
                            }
                            System.out.println("请选择您要点的菜品编号:");
                            caipingbianhao=wyj.nextInt();
                            System.out.println("请选择您需要的份数:");
                            cainum=wyj.nextInt();
                            System.out.println("请输入送餐时间:(送餐时间是10点到20点间整点送餐):");
                            songcanshijiand=wyj.nextInt();
                            while(songcanshijiand<=10 ||songcanshijiand>20)
                            {
                                System.out.println("您输入有误,请输入10-20之间的整数!");
                                songcanshijiand=wyj.nextInt();
                            }
                            double canfei=0.0;
                            System.out.println("请输入送餐地址:");
                            songcandizhi=wyj.next();
                            System.out.println("订餐成功");
                            System.out.println("您定的是:"+cainum+"份"+caiming[caipingbianhao-1]);
                            System.out.println("送餐时间:"+songcanshijiand+"点");
                            double songcanfei=(cainum*caidanjia[caipingbianhao-1]>50)?0.0:5.0;
                            canfei=(cainum*caidanjia[caipingbianhao-1])+songcanfei;
                            System.out.println("餐费:"+canfei+"元,"+"送餐费:"+songcanfei+"元,"+"总计:"+canfei+"元");
                            System.out.println("送餐地址:"+songcandizhi);
                            //数组数据输入
                            names[i]=name;
                            suoxuancaipin[i]=caiming[caipingbianhao-1]+cainum+"份";
                            songcanshijian[i]=songcanshijiand;
                            addresses[i]=songcandizhi;
                            states[i]=0;
                            dingdanjine[i]=canfei;
                            break;
                        }
                    }
                    if(!isAdd)
                    {
                        System.out.println("对不起,您的餐袋已满!");
                    }

                    System.out.println("*********************************************************************");
                    break;
                case 2://查看餐袋
                    System.out.println("****************************查看餐袋*********************************");
                    System.out.println("序号 订餐人\t餐品信息\t\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
                    for(int i=0;i<names.length;i++)
                    {
                        if(names[i]!=null)
                        {
                            String zhuantai=(states[i]==0)?"已预定":"已完成";
                            System.out.println((i+1)+"\t "+names[i]+"\t"+suoxuancaipin[i]+"\t\t"+songcanshijian[i]+"点"+"\t\t"+addresses[i]+"\t\t"+dingdanjine[i]+"\t"+zhuantai);
                        }
                    }
                    System.out.println("*********************************************************************");
                    break;
                case 3://签收订单
                    boolean kaiguan=false;
                    System.out.println("****************************签收订单*********************************");
                    System.out.print("请选择要签收的订单序号:");
                    int dingdanhao=wyj.nextInt();
                    for(int i=0;i<names.length;i++)
                    {
                        if(names[i]!=null &&states[i]==0 &&dingdanhao==i+1)
                        {
                            states[i]=1;
                            System.out.println("签收成功!");
                            kaiguan=true;
                        }
                        else if(names[i]!=null && states[i]==1 && dingdanhao==i+1)
                        {
                            System.out.println("您选择的订单已完成签收,不能再次签收!");
                            kaiguan=true;
                        }
                    }
                    if(!kaiguan)
                    {
                        System.out.println("您选择的订单不存在!");
                    }
                    System.out.println("*********************************************************************");
                    break;
                case 4://删除订单
                    System.out.println("****************************删除订单*********************************");
                    boolean kaiguan1=false;
                    System.out.println("请输入要删除的订单序号:");
                    int dingdanxuliehao=wyj.nextInt();
                    for(int i=0;i<names.length;i++)
                    {
                        if(names!=null && states[i]==1 && dingdanxuliehao==i+1)
                        {
                            kaiguan1=true;
                            for(int j=dingdanxuliehao-1;j<names.length-1;j++)
                            {
                                names[j]=names[j+1];
                                suoxuancaipin[j]=suoxuancaipin[j+1];
                                songcanshijian[j]=songcanshijian[1+j];
                                addresses[j]=addresses[j+1];
                                dingdanjine[j]=dingdanjine[j+1];
                                states[j]=states[j+1];
                            }
                            names[names.length-1]=null;
                            suoxuancaipin[names.length-1]=null;
                            songcanshijian[names.length-1]=0;
                            addresses[names.length-1]=null;
                            dingdanjine[names.length-1]=0.0;
                            states[names.length-1]=0;
                            System.out.println("删除订单成功!");
                            break;
                        }
                        else if(names[i]!=null && states[i]==0 && dingdanxuliehao==i+1)
                        {
                            System.out.println("您选择的订单未签收,不能删除!");
                            kaiguan1=true;
                            break;
                        }
                    }
                    if(!kaiguan1)
                    {
                        System.out.println("你要删除的订单不存在!");
                    }
                    System.out.println("*********************************************************************");
                    break;
                case 5://我要点赞
                    System.out.println("****************************删除订单*********************************");
                    System.out.println("序号"+"\t"+"菜名"+"\t\t"+"单价");
                    int dianzanxuliehao=0;
                    for(int i=0;i<caiming.length-1;i++)
                    {
                        System.out.println((i+1)+"\t"+caiming[i]+"\t\t"+caidanjia[i]+"\t\t"+(dianzanshu[i]>0?dianzanshu[i]+"个赞":"0"+"个赞"));
                    }
                    System.out.println("请选择您要点赞的菜品序号:");
                    dianzanxuliehao=wyj.nextInt();
                    dianzanshu[dianzanxuliehao-1]++;
                    System.out.println("点赞成功!");
                    System.out.println("*********************************************************************");
                    break;
                case 6://退出系统
                    isExit=true;
                    break;
                default:

                    isExit=true;
                    break;
            }
            if(!isExit)
            {
                System.out.println("输入0时返回");
                flag=wyj.nextInt();
                for(int i=0;i<=4;i++)
                {
                    System.out.println();
                }
            }
            else
            {
                break;
            }
        }while(flag==0);
        System.out.println("\t\t\t\t\t谢谢使用,欢迎下次光临!");
    }
}
