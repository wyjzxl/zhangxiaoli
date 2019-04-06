package Demo3;

public class Test {
    public static void main(String[] args) {
        System.out.println("普卡消费详情:");
        Common common=new Common(19);
        common.say(50);
        common.send(100);

        System.out.println("蚂蚁消费详情:");
        MaYi maYi=new MaYi(19);
        common.say(50);
        common.send(100);
    }
}
