/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categories;
import entity.Products;
import entity.Suppliers;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krystian
 */
public class ReportsDao extends GenericQuery{

    public List getProductsReport1(String categoryName, String supplierName) {
        String hqlQueryString = "select p.productName, p.quantityPerUnit, p.unitsInStock, p.discontinued, p.category.categoryName, " +
                "p.supplier.supplierId from Products p";

        Products sampleProduct = new Products();

        if (!categoryName.isEmpty()) {
            Categories sampleCategory = new Categories();
            sampleCategory.setCategoryName(categoryName);
            sampleProduct.setCategory(sampleCategory);
        }

        if (!supplierName.isEmpty()) {
            Suppliers sampleSupplier = new Suppliers();
            sampleSupplier.setCompanyName(supplierName);
            sampleProduct.setSupplier(sampleSupplier);
        }

        beginTransaction();

        Criteria criteria = getSession().createCriteria(Products.class);
        criteria.add( Example.create(sampleProduct) );
        List result = criteria.list();

        List results =  getSession().createQuery(hqlQueryString).list();

        endTransaction();

        return results;
    }
}

