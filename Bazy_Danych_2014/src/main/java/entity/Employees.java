package entity;

import java.util.Date;

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

     public Employees() {
     }

     public Employees(Integer employeeId, String lastName, String firstName, String title, String titleOfCourtesy, Date birthDate, Date hireDate, String address, String city, String region, String postalCode, String country, String homePhone, String extension, String photo, String notes, Employees reportsTo) {
          this.employeeId = employeeId;
          this.lastName = lastName;
          this.firstName = firstName;
          this.title = title;
          this.titleOfCourtesy = titleOfCourtesy;
          this.birthDate = birthDate;
          this.hireDate = hireDate;
          this.address = address;
          this.city = city;
          this.region = region;
          this.postalCode = postalCode;
          this.country = country;
          this.homePhone = homePhone;
          this.extension = extension;
          this.photo = photo;
          this.notes = notes;
          this.reportsTo = reportsTo;
     }

     public Integer getEmployeeId() {
          return employeeId;
     }

     public void setEmployeeId(Integer employeeId) {
          this.employeeId = employeeId;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getTitleOfCourtesy() {
          return titleOfCourtesy;
     }

     public void setTitleOfCourtesy(String titleOfCourtesy) {
          this.titleOfCourtesy = titleOfCourtesy;
     }

     public Date getBirthDate() {
          return birthDate;
     }

     public void setBirthDate(Date birthDate) {
          this.birthDate = birthDate;
     }

     public Date getHireDate() {
          return hireDate;
     }

     public void setHireDate(Date hireDate) {
          this.hireDate = hireDate;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getCity() {
          return city;
     }

     public void setCity(String city) {
          this.city = city;
     }

     public String getRegion() {
          return region;
     }

     public void setRegion(String region) {
          this.region = region;
     }

     public String getPostalCode() {
          return postalCode;
     }

     public void setPostalCode(String postalCode) {
          this.postalCode = postalCode;
     }

     public String getCountry() {
          return country;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public String getHomePhone() {
          return homePhone;
     }

     public void setHomePhone(String homePhone) {
          this.homePhone = homePhone;
     }

     public String getExtension() {
          return extension;
     }

     public void setExtension(String extension) {
          this.extension = extension;
     }

     public String getPhoto() {
          return photo;
     }

     public void setPhoto(String photo) {
          this.photo = photo;
     }

     public String getNotes() {
          return notes;
     }

     public void setNotes(String notes) {
          this.notes = notes;
     }

     public Employees getReportsTo() {
          return reportsTo;
     }

     public void setReportsTo(Employees reportsTo) {
          this.reportsTo = reportsTo;
     }
}


