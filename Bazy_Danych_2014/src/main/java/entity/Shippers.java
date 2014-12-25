package entity;

import lombok.Data;

@Data
public class Shippers  implements java.io.Serializable {
     private Integer shipperId;
     private String companyName;
     private String phone;
}


