package Demo3;

public class TengXun extends Card implements Time,Network,Message  {
    public TengXun(double fee)
    {
        super(fee);
    }

    @Override
    public void send(int count) {
        System.out.println("短信费用:"+count);
    }

    @Override
    public void net(int kb) {
        System.out.println("上网流量费用:"+kb);
    }

    @Override
    public void say(int minutes) {
        System.out.println("通话费:"+minutes);
    }
}
