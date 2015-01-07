/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categories;
import entity.Products;
import entity.Suppliers;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Krystian
 */
public class SupplierDao extends GenericQuery{
    
       
//==============================================================================    
    public void addSupplier(Suppliers supplier) {
        beginTransaction();
        getSession().save(supplier);
        endTransaction();
    }
//==============================================================================    

}
