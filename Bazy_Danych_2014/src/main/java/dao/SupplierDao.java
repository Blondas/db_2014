/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Suppliers;
import java.util.ArrayList;

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
    public ArrayList<Suppliers> selectSuppliers() {
        ArrayList<Suppliers> suppliers = null;
        beginTransaction();
        suppliers = (ArrayList<Suppliers>) getSession().createQuery("from Suppliers").list();
        endTransaction();
        return suppliers;
    }
//==============================================================================    

}
