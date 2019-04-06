package cn.itrip.beans.pojo;

import lombok.Data;

import java.util.Date;
/*checkInDate: "2019-03-10T00:00:00.000Z"
        checkOutDate: "2019-03-11T00:00:00.000Z"
        count: 1
        hotelId: "1"
        roomId: "3"*/
@Data
public class HotelOrder {
    private Date checkInDate;
    private Date checkOutDate;
    private int count;
    private int hotelId;
    private int roomId;
}
