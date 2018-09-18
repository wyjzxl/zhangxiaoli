package AllC;

public class NewGame {
    public static void main(String[] args) {
    Hero dema=new Hero();
    dema.name="德玛西亚之力";
    dema.Hp=1000;
    dema.ShowInfor();

    Monster zuzai=new Monster();
    zuzai.name="大龙主宰";
    zuzai.Hp=1000000;
    zuzai.type="最强Boss";
    zuzai.shoInfor();

    Wuqi baojian=new Wuqi();
    baojian.name="金蛇剑";
    baojian.gjl=1000;
    baojian.showInfor();
    }
}
