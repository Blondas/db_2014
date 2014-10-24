/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categories;
import java.util.ArrayList;
import org.hibernate.Query;
/**
 *
 * @author Krystian
 */
public class CategoriesDao extends Zapytanie{

    
//==============================================================================    
    public void addCategory(Categories category) {
        beginTransaction();
        getSession().save(category);
        endTransaction();
    }
//==============================================================================    
    public ArrayList<Categories> selectCategories() {
        ArrayList<Categories> categories = null;
        beginTransaction();
        categories = (ArrayList<Categories>) getSession().createQuery("from Categories").list();
        endTransaction();
        return categories;
    }
//==============================================================================    
    public Categories selectCategoriesByName(String name) {
        Categories categories = null;
        beginTransaction();
        String queryString = "from Categories where categoryName = :name";
        Query query = getSession().createQuery(queryString);
        query.setString("name", name);
        categories = (Categories) query.uniqueResult();
        endTransaction();
        return categories;
    }
//==============================================================================    
    public void deleteCategories(int id) {
        beginTransaction();
        Categories user = (Categories) getSession().load(Categories.class, new Integer(id));
        getSession().delete(user);
        endTransaction();
    }
//==============================================================================        
    public void updateCategories(Categories categories) {
        beginTransaction();
        session.update(categories);
        endTransaction();
    }
//==============================================================================            
    public static void main(String[] args){
        CategoriesDao c = new CategoriesDao();
//        c.test();
//        c.deleteCategories(9);
//        c.addCategory(null);
//        c.updateCategories(null);
        ArrayList<Categories> lista = c.selectCategories();
        c.initTest(lista);
    }

    
    public void initTest(ArrayList<Categories> lista){
        for(Categories c : lista){
            System.out.println(c);
        }
        
    }

  
    
    
}
