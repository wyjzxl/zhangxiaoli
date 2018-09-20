package com.baidu;

public class Opera {
    Student[] stus=new Student[20];
    //添加信息
    public void add(Student stu)
    {
        for (int i = 0; i <stus.length ; i++)
        {
            if(stus[i]==null)
            {
                stus[i]=stu;
                System.out.println("添加成功!");
                break;
            }
            else
            {
                System.out.println("添加失败!");
            }
        }
    }
    //修改信息
    public  void chang(String num,String oldnum,String newnum)
    {
        switch (num)
        {
            case "学号":
                for (int i = 0; i <stus.length ; i++)
                {
                    if(stus[i]!=null)
                    {
                        if(oldnum.equals(String.valueOf(stus[i].getStuNu())) && !newnum.equals(String.valueOf(stus[i].getStuNu())))
                        {
                            stus[i].setStuNu(Integer.parseInt(newnum));
                            System.out.println("修改学号成功!");
                            break;
                        }
                        else
                        {
                            System.out.println("修改学号失败!");
                            break;
                        }
                    }
                }
                break;
            case "姓名":
                for (int i = 0; i <stus.length ; i++)
                {
                    if(stus[i]!=null)
                    {
                        if(oldnum.equals(stus[i].getName()) && !newnum.equals(stus[i].getName()))
                        {
                            stus[i].setName(newnum);
                            System.out.println("修改姓名成功!!");
                            break;
                        }
                        else
                        {
                            System.out.println("修改姓名失败!");
                            break;
                        }
                    }
                }
                break;
            case "年龄":
                for (int i = 0; i <stus.length ; i++)
                {
                    if(stus[i]!=null)
                    {
                        if(oldnum.equals(String.valueOf(stus[i].getAge())) && !newnum.equals(String.valueOf(stus[i].getAge())))
                        {
                            stus[i].setAge(Integer.parseInt(newnum));
                            System.out.println("修改年龄成功!");
                            break;
                        }
                        else
                        {
                            System.out.println("修改年龄失败!");
                            break;
                        }
                    }
                }
                break;
            case "成绩":
                for (int i = 0; i <stus.length ; i++)
                {
                    if(stus[i]!=null)
                    {
                        if(oldnum.equals(String.valueOf(stus[i].getSource())) && !newnum.equals(String.valueOf(stus[i].getSource())))
                        {
                            stus[i].setSource(Integer.parseInt(newnum));
                            System.out.println("修改成绩成功!");
                            break;
                        }
                        else
                        {
                            System.out.println("修改成绩失败!");
                            break;
                        }
                    }
                }
                break;
        }
    }

    //删除信息
    public void delete(String name)
    {
        boolean flag=false;
        for (int i = 0; i <stus.length; i++)
        {
            if(stus[i]!=null)
            {
                if(name.equals(stus[i].getName()))
                {
                    stus[i]=null;
                    flag=true;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("删除成功!");
        }
        else
        {
            System.out.println("删除失败!");
        }

    }
    //查找信息
    public void look(String name)
    {
        for (int i = 0; i <stus.length ; i++)
        {
            if(stus[i]!=null)
            {
                if(name.equals(stus[i].getName()))
                {
                    System.out.println("学号:"+stus[i].getStuNu()+"姓名:"+stus[i].getName()+"年龄:"+stus[i].getAge()+"成绩:"+stus[i].getSource());
                    break;
                }
                else
                {
                    System.out.println("查询失败!");
                }
            }
        }
    }
    //显示信息
    public void showInfor()
    {
        for (int i = 0; i <stus.length ; i++)
        {
            if(stus[i]!=null)
            {
                System.out.println("学号:"+stus[i].getStuNu()+"姓名:"+stus[i].getName()+"年龄:"+stus[i].getAge()+"成绩:"+stus[i].getSource());
            }

        }
    }
}
