package com.baidu;

public class Host {
    public Animal  send(String type)
    {
        if(type.equals("Cat"))
        {
            return new Cat();
        }
        else if(type.equals("Duck"))
        {
            return new Duck();
        }
        else
        {
            return new Dog();
        }
    }
}
