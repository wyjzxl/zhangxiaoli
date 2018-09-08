import java.util.Scanner;

public class fanzhuanshuchu {
    public static void main(String[] args) {
        int number1=0;
        Scanner wyj=new Scanner(System.in);
        number1=wyj.nextInt();
        while (number1>0)
        {
            String s;
            s=String.valueOf(number1);
            s=new StringBuffer(s).reverse().toString();
            System.out.println(s);
            break;

        }
    }
}
