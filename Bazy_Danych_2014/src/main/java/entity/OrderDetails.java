package entity;

import lombok.Data;

@Data
public class OrderDetails  implements java.io.Serializable {
     private Integer odId;
     private Products product;
     private Float unitPrice;
     private Short quantity;
     private Float discount;
}


