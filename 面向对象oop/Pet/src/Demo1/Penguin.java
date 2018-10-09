package Demo1;

public class Penguin extends Pet  {
    public Penguin()
    {
    }
    public Penguin(String name,int XQ,int JKZ,String ZL)
    {
        super(name,XQ,JKZ,ZL);
    }
    @Override
    public void print()
    {
        System.out.print("我叫:"+super.getName());
        System.out.println("我的心情:"+super.getXQ());
        System.out.print("我的健康值:"+super.getJKZ());
        System.out.print("我的种类是:"+super.getZL());
    }

}
