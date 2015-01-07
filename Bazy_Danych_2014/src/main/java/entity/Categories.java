package entity;
import java.util.List;
import java.util.Set;

public class Categories  implements java.io.Serializable {
    private Set<Products> products;
    
     private Integer categoryId;
     private String categoryName;
     private String description;
     private String picture;
     

     public Categories() {
     }

     public Categories(Integer categoryId, String categoryName, String description, String picture, Set<Products> products) {
          this.categoryId = categoryId;
          this.categoryName = categoryName;
          this.description = description;
          this.picture = picture;
          this.products = products;
     }

     public Integer getCategoryId() {
          return categoryId;
     }

     public void setCategoryId(Integer categoryId) {
          this.categoryId = categoryId;
     }

     public String getCategoryName() {
          return categoryName;
     }

     public void setCategoryName(String categoryName) {
          this.categoryName = categoryName;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getPicture() {
          return picture;
     }

     public void setPicture(String picture) {
          this.picture = picture;
     }

     public Set<Products> getProducts() {
          return products;
     }

     public void setProducts(Set<Products> products) {
          this.products = products;
     }

    @Override
    public String toString() {
        return "Categories{" + "products=" + products + ", categoryId=" + categoryId + ", categoryName=" + categoryName + ", description=" + description + ", picture=" + picture + '}';
    }
     
     
}


