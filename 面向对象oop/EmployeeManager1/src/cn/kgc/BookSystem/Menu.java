package cn.kgc.BookSystem;
import cn.kgc.BookSystem.Opera.OpreaImpl;

import java.util.Scanner;

/**
 *
 * 菜单类
 */
public class Menu {
    OpreaImpl opera=new OpreaImpl();
    Scanner input=new Scanner(System.in);
    //登录菜单
    public void MainMenu(){
        do {
            System.out.println("1、查寻图书信息");
            System.out.println("2、查看所有信息");
            System.out.println("3、添加图书");
            System.out.println("4、修改图书数量");
            System.out.println("5、删除图书");
            System.out.println("6、退出");
            System.out.println("请选择：");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    showBookInf();
                    break;
                case 2:
                    getBookById();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                   updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入错误请从新选择");
                    break;
            }
        }while(true);
    }
    //增加
    public void addEmployee(){
        System.out.println("请输入图书编号:");
        int id=input.nextInt();
        System.out.println("请输入图书名称:");
        String name=input.next();
        System.out.println("请输入图书数量:");
        int Num=input.nextInt();
        System.out.println("请输入图书单价:");
        double dj=input.nextDouble();
        Book book=new Book(id,name,Num,dj);
        opera.addBook(book);
    }
    //根据图书编号查询指定图书信息
    public void getBookById(){
        System.out.println("请输入图书:");
        int id=input.nextInt();
        opera.getBookById(id);
    }
    //查询所有图书信息
    public void showBookInf(){
        opera.showBookInf();
    }
    //根据编号修改图书数量
    public void updateBook(){
        System.out.println("请输入图书编号:");
        int id=input.nextInt();
        System.out.println("请输入图书数量:");
        int salary=input.nextInt();
        opera.updateBook(id,salary);
    }
    //删除员工
    public void deleteBook(){
        System.out.println("请输入图书编号:");
        int id=input.nextInt();
        opera.deleteBook(id);
    }
}
