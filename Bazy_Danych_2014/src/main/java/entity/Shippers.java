package entity;

public class Shippers  implements java.io.Serializable {
     private Integer shipperId;
     private String companyName;
     private String phone;

     public Shippers() {
     }

     public Shippers(Integer shipperId, String companyName, String phone) {
          this.shipperId = shipperId;
          this.companyName = companyName;
          this.phone = phone;
     }

     public Integer getShipperId() {
          return shipperId;
     }

     public void setShipperId(Integer shipperId) {
          this.shipperId = shipperId;
     }

     public String getCompanyName() {
          return companyName;
     }

     public void setCompanyName(String companyName) {
          this.companyName = companyName;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }
}


