package Demo1;

import java.util.Scanner;

public class Unil {
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("1、企鹅");
        System.out.println("2、狗狗");
        int choice=num.nextInt();
        befo hehe=new befo();
        Pet pet=hehe.buy(choice);
        System.out.println(pet.getName());

    }

}
