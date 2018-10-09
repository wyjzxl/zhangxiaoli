package Demo3;

public class Common extends Card implements Message,Time {
    public Common(double fee){
        super(fee);
    }

    @Override
    public void send(int count) {
        System.out.println("短信条数:"+count);
    }

    @Override
    public void say(int minutes) {
        System.out.println("通话时长:"+(1.2*minutes));
    }
}
