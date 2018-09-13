import java.util.Scanner;

public class fanzhuanshuchu {
    public static void main(String[] args) {
        int number1=0;
        Scanner wyj=new Scanner(System.in);
        number1=wyj.nextInt();
        String s=null;
        while (number1>0)
        {
            s=String.valueOf(number1);
            s=new StringBuffer(s).reverse().toString();
            System.out.println(s);
            break;

        }
    }
}
