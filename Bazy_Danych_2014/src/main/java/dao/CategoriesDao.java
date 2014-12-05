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
        ArrayList<Categories> categories = (ArrayList) getSession().createCriteria(Categories.class)
                    .add(Restrictions.eq("categoryName", name)).list();
        for(Categories c : categories){
            getSession().delete(c);
        }
        endTransaction();
    }
//==============================================================================        
    public void updatetCategory(Categories category) {
        beginTransaction();
        getSession().update(category);
        endTransaction();
    }
//==============================================================================
}
