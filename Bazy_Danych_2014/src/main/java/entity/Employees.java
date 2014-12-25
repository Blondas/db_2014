package entity;

import lombok.Data;
import java.util.Date;

@Data
public class Employees  implements java.io.Serializable {
     private Integer employeeId;
     private String lastName;
     private String firstName;
     private String title;
     private String titleOfCourtesy;
     private Date birthDate;
     private Date hireDate;
     private String address;
     private String city;
     private String region;
     private String postalCode;
     private String country;
     private String homePhone;
     private String extension;
     private String photo;
     private String notes;
     private Employees reportsTo;
}


