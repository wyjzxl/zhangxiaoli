package CarRentalOop;
//汽车
public abstract class  MotoVehicle {
    private String vehicleId;//汽车牌照
    private String brand;//汽车品牌
    private int perRent;//日租金

    public MotoVehicle() {
    }

    public MotoVehicle(String vehicleId, String brand, int perRent) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.perRent = perRent;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerRent() {
        return perRent;
    }

    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }

    //计算租金
    public abstract float calcRent(int days);

}
