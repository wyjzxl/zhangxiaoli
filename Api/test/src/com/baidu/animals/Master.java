package com.baidu.animals;

public class Master {
    public void cure(Pet pet)
    {
        if(pet.getHealth()<60)
        {
            pet.go();
        }
    }
    public void eat(Pet pet){
        while (true)
        {
            if(pet.getHungry()<100)
            {
                pet.eata();
            }
            else
            {
                pet.zhuangtai();
                pet.setHungry(100);
                break;
            }
        }

    }
}
