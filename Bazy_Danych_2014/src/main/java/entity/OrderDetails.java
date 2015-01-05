package entity;

import java.io.Serializable;

public class OrderDetails  implements Serializable {
     private Integer odId;
     private Products product;
     private Float unitPrice;
     private Short quantity;
     private Float discount;
     private Integer orderId;

     public OrderDetails() {
     }

     public OrderDetails(Integer odId, Products product, Float unitPrice, Short quantity, Float discount, Integer orderId) {
          this.odId = odId;
          this.product = product;
          this.unitPrice = unitPrice;
          this.quantity = quantity;
          this.discount = discount;
          this.orderId = orderId;
     }

     public Integer getOdId() {
          return odId;
     }

     public void setOdId(Integer odId) {
          this.odId = odId;
     }

     public Products getProduct() {
          return product;
     }

     public void setProduct(Products product) {
          this.product = product;
     }

     public Float getUnitPrice() {
          return unitPrice;
     }

     public void setUnitPrice(Float unitPrice) {
          this.unitPrice = unitPrice;
     }

     public Short getQuantity() {
          return quantity;
     }

     public void setQuantity(Short quantity) {
          this.quantity = quantity;
     }

     public Float getDiscount() {
          return discount;
     }

     public void setDiscount(Float discount) {
          this.discount = discount;
     }

     public Integer getOrderId() {
          return orderId;
     }

     public void setOrderId(Integer orderId) {
          this.orderId = orderId;
     }
}


