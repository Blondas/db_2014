package entity;
// Generated 2014-10-18 21:27:43 by Hibernate Tools 4.3.1



/**
 * Shippers generated by hbm2java
 */
public class Shippers  implements java.io.Serializable {


     private Integer shipperId;
     private String companyName;
     private String phone;

    public Shippers() {
    }

    public Shippers(String companyName, String phone) {
       this.companyName = companyName;
       this.phone = phone;
    }
   
    public Integer getShipperId() {
        return this.shipperId;
    }
    
    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }




}

