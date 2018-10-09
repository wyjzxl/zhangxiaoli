package Demo1;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.util.Scanner;

public class befo{
    public  Pet buy(int choice){
        Pet pet=null;
        switch(choice)
        {
            case 1:
                pet=new Penguin("豆豆",99,100,"柯基");
                break;
            case 2:
                pet=new Dog("呵呵",45,78,"萨摩耶");
                break;
            default:
                break;
        }
        return pet;
    }

}
