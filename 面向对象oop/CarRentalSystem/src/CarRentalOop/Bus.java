package CarRentalOop;
//客车
public class Bus extends MotoVehicle  {
    private int seatCount;

    public Bus() {
    }

    public Bus(String vehicleId, String brand, int perRent, int seatCount) {
        super(vehicleId, brand, perRent);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public float calcRent(int days)
    {
        float price=this.getPerRent()*days;
        if(days>=3 && days<7)
        {
            price*=0.9f;
        }
        else if(days>=7 && days<30)
        {
            price*=0.8f;
        }
        else if(days>=30 &&days<150)
        {
            price*=0.7f;
        }
        else if(days>=150)
        {
            price*=0.6f;
        }
        return price;
    }


}
