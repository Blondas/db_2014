/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categories;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Krystian
 */
public class CategoriesDao extends GenericQuery{

    
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
    public Categories selectCategoryByName(String name) {
//        Categories categories = null;
//        beginTransaction();
//        String queryString = "from Categories where categoryName = :name";
//        Query query = getSession().createQuery(queryString);
//        query.setString("name", name);
//        categories = (Categories) query.uniqueResult();
//        endTransaction();
//        return categories;
        
        Categories categories = null;
        beginTransaction();
        String queryString = "from Categories where categoryName = :name";
        Query query = getSession().createQuery(queryString);
        query.setString("name", name);
        categories = (Categories) query.list().get(0);
        endTransaction();
        return categories;
    }
//==============================================================================    
    public void deleteCategoriesById(int id) {
        beginTransaction();
        Categories category = (Categories) getSession().load(Categories.class, new Integer(id));
        getSession().delete(category);
        endTransaction();
    }
//==============================================================================        
    public void deleteCategoriesByName(String name) {
        beginTransaction();
        ArrayList<Categories> categories = (ArrayList) session.createCriteria(Categories.class)
                    .add(Restrictions.eq("categoryName", name)).list();
        for(Categories c : categories){
            getSession().delete(c);
        }
        endTransaction();
    }
//==============================================================================        
    public void updatetCategory(Categories category, String categoryToUpdate) {
//        beginTransaction();
//        session.update(categories);
//        endTransaction();
        
        beginTransaction();
        
        Query q = session.createQuery("from Categories where categoryName= :categoryToUpdate");
        q.setString("categoryToUpdate", categoryToUpdate);
                
        Categories result = (Categories)q.list().get(0);
        result.setCategoryName(category.getCategoryName());
        result.setDescription(category.getDescription());
        result.setPicture(category.getPicture());
        session.update(result);

        endTransaction();
        
//        ArrayList<Categories> categories = (ArrayList) session.createCriteria(Categories.class)
//                    .add(Restrictions.eq("categoryName", categoryToUpdate)).list();
//        for(Categories c : categories){
//            getSession().update(c);
//        }
        
    }
//==============================================================================            
//    public static void main(String[] args){
//        CategoriesDao c = new CategoriesDao();
////        c.test();
////        c.deleteCategories(9);
////        c.addCategory(null);
////        c.updateCategories(null);
//        ArrayList<Categories> lista = c.selectCategories();
//        c.initTest(lista);
//    }
//
//    
//    public void initTest(ArrayList<Categories> lista){
//        for(Categories c : lista){
//            System.out.println(c);
//        }
//        
//    }

  
    
    
}
