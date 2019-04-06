import java.util.Scanner;
class work1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("请输入您出行的月份：");
        int month = input.nextInt();
        System.out.println("请问您选择头等舱还是经济舱？头等舱输入 1，经济舱输入 2");
        int type = input.nextInt();
        double price = 5000.0;
        if (month==1 || month==2 || month==3 || month==11 || month==12) {
            if (type==1) {
                price*=0.5;
            }else if (type==2) {
                price*=0.4;
            }
        } else {
            if (type==1) {
                price*=0.9;
            } else if (type==2) {
                price*=0.6;
            }
        }
        System.out.println("您的机票价格为："+price);


    }
}