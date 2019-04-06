package CarRentalOop;
import CarRentalOop.Car;
import CarRentalOop.MotoVehicle;
/**
 * 初始化汽车数组
 * */
public class MotoOperation {
    public MotoVehicle[] motos=new MotoVehicle[8];
    //初始化汽车信息
    public void init()
    {
        motos[0]=new Car("京N78654","宝马",800,"X6");
        motos[1]=new Car("京CNY3284","宝马",600,"550i");
        motos[2]=new Car("京NT37465","别克",300,"林荫大道");
        motos[3]=new Car("京NT96968","别克",600,"GL8");
        motos[4]=new Bus("京6566754","金杯",800,16);
        motos[5]=new Bus("京8696997","金杯",800,34);
        motos[6]=new Bus("京9696996","金龙",1500,16);
        motos[7]=new Bus("京8696998","金龙",1500,34);
    }

    //租车
    public MotoVehicle motoLeaseOut(String brand,String type,int seat )
    {
        MotoVehicle moto=null;
        for(MotoVehicle mymoto : motos)
        {
                if(mymoto instanceof Car)
                {
                    Car car=(Car)mymoto;
                    if(car.getBrand().equals(brand) && car.getType().equals(type))
                    {
                        moto=car;
                        break;
                    }
                }
                else
                {
                    Bus bus=(Bus)mymoto;
                    if(bus.getBrand().equals(brand) && bus.getSeatCount()==seat){
                        moto=bus;
                        break;
                    }
                }
        }
        return moto ;
    }
}
