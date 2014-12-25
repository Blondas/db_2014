package entity;

import lombok.Data;

@Data
public class Products  implements java.io.Serializable {
    private Categories category;
    private Suppliers supplier;
    private Integer productId;
    private String productName;
    private String quantityPerUnit;
    private Float unitPrice;
    private Short unitsInStock;
    private Short unitsOnOrder;
    private Short reorderLevel;
    private Boolean discontinued;
}


