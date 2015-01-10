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
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krystian
 */
public class ReportsDao extends GenericQuery {

    public List<Object[]> getProductsReport1(String categoryName, String supplierName) {
//        String hqlQueryString = "select p.productName, p.quantityPerUnit, p.unitsInStock, p.discontinued, p.category.categoryName, " +
//                "p.supplier.supplierId from Products p";

        System.out.println(categoryName);
        System.out.println(supplierName);
        
        categoryName = categoryName.replaceAll("'", "''");
        supplierName = supplierName.replaceAll("'", "''");
        
        String where ="";
        
        Products sampleProduct = new Products();

        if (!categoryName.equals("")) {
            Categories sampleCategory = new Categories();
            sampleCategory.setCategoryName(categoryName);
            sampleProduct.setCategory(sampleCategory);
            where +="and categoryName = '"+categoryName+"'";
        }

        if (!supplierName.equals("")) {
            Suppliers sampleSupplier = new Suppliers();
            sampleSupplier.setCompanyName(supplierName);
            sampleProduct.setSupplier(sampleSupplier);
            where +="and companyName = '"+supplierName+"'";
        }

        beginTransaction();

//        Criteria criteria = getSession().createCriteria(Products.class);
//        criteria.add( Example.create(sampleProduct) );
//        List result = criteria.list();
        
        String sqlQuery = " select productName "
                        + "       ,QuantityPerUnit"
                        + "       ,UnitsInStock"
                        + "       ,(case when Discontinued=1 then 'yes' else 'no' end) as Discontinued"
                        + "       ,CategoryName"
                        + "       ,CompanyName \n" 
                        + "  from products p\n" 
                        + "  join categories  c on p.categoryId = c.CategoryID \n" 
                        + "  join suppliers   s on p.SupplierID = s.SupplierID \n" 
                        + "  where 1=1 \n" + where;


        Query query = getSession().createSQLQuery(sqlQuery);
        
        List<Object[]> result = query.list();
        
        
        

//        List projectionCriteria = getSession().createCriteria(ProductShort.class)
//                .setProjection(Projections.distinct(Projections.projectionList()
//                .add(Projections.property("productName"), "productName")
//                .add(Projections.property("supplier"), "supplier")))
//                .setResultTransformer(Transformers.aliasToBean(ProductShort.class)).list();

//        List result = getSession().createQuery(hqlQueryString).list();

        endTransaction();

        return result;
    }

}