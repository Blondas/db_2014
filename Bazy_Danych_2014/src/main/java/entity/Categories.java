package entity;
import lombok.Data;
import java.util.List;

@Data
public class Categories  implements java.io.Serializable {

     private Integer categoryId;
     private String categoryName;
     private String description;
     private String picture;
     private List<Products> products;
}


