package entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Orders  implements java.io.Serializable {

    private Integer orderId;
    
    private Customers customer;
    private Employees emplyee;
    private Shippers shipper;
    private List<OrderDetails> orderDetails;
    
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Float freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;
}


