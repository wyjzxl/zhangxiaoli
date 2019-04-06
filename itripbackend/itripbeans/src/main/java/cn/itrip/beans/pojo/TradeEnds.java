package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "itrip_trade_ends")

public class TradeEnds {
    @Id
    private Long id;

    private String orderNo;

    private Boolean flag;
}