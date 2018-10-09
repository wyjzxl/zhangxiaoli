package Demo3;

public class MaYi extends Card implements Network {
    public MaYi(double fee)
    {
        super(fee);
    }

    @Override
    public void net(int kb) {
        System.out.println("上网费用"+kb+"元");
    }
}
