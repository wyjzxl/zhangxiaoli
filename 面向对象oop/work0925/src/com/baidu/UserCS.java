package com.baidu;

public class UserCS extends User
{
        public UserCS()
        {
        }

    public UserCS(String username, int password) {
        super(username, password);
    }

    public  User[] users=new User[3];
    public void showInfor()
    {
        users[0]=new UserCS("员工用户",123);
        users[1]=new UserCS("高级用户",456);
        users[2]=new UserCS("管理用户",123456);
    }
}
