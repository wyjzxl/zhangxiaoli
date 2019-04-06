package cn.itrip.beans.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "itrip_product_store")

public class ProductStore {
    @Id
    private Long id;

    private Integer productType;

    private Long productId;

    private Integer store;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedby;
}