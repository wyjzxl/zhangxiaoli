package meiju;

public class Test2 {
    public enum Level{
        L1,L2,L3
    }
    public void show(Level level)
    {
        switch (level)
        {
            case L1:
                System.out.println("L1:等级1");
                break;
            case L2:
                System.out.println("L2:等级2");
                break;
            case L3:
                System.out.println("L3:等级3");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Test2 test2=new Test2();
        test2.show(Level.L1);
        test2.show(Level.L2);
        test2.show(Level.L3);
        /*Level ll1=Level.L1;
        test2.show(ll1);*/
    }
}
