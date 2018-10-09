package Demo1;

public abstract class Pet {
    public String name;
    public int XQ;
    public int JKZ;
    public  String ZL;
    public Pet()
    {

    }
    public Pet(String name, int XQ, int JKZ, String ZL) {
        this.name = name;
        this.XQ = XQ;
        this.JKZ = JKZ;
        this.ZL = ZL;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXQ() {
        return XQ;
    }

    public void setXQ(int XQ) {
        this.XQ = XQ;
    }

    public int getJKZ() {
        return JKZ;
    }

    public void setJKZ(int JKZ) {
        this.JKZ = JKZ;
    }

    public String getZL() {
        return ZL;
    }

    public void setZL(String ZL) {
        this.ZL = ZL;
    }
    protected abstract void print();
}
