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

    public List <Products> getProductsReport1(String categoryName, String supplierName) {
//        String hqlQueryString = "select p.productName, p.quantityPerUnit, p.unitsInStock, p.discontinued, p.category.categoryName, " +
//                "p.supplier.supplierId from Products p";

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

        System.out.println(sampleProduct.getCategory().getCategoryName());

        Criteria criteria = getSession().createCriteria(Products.class);
        criteria.add( Example.create(sampleProduct) );
        List result = criteria.list();

//        Criteria criteriak = session.createCriteria(Car.class);
//        criteria.add( Expression.like("brand", "Łada") );
//        List result = criteria.list();

//        List projectionCriteria = getSession().createCriteria(ProductShort.class)
//                .setProjection(Projections.distinct(Projections.projectionList()
//                .add(Projections.property("productName"), "productName")
//                .add(Projections.property("supplier"), "supplier")))
//                .setResultTransformer(Transformers.aliasToBean(ProductShort.class)).list();

//        List result = getSession().createQuery(hqlQueryString).list();

        endTransaction();

        return result;
    }

    public List <Products> getProductsReport2(String categoryName, String supplierName) {
        String hqlQueryString = "select p.productName from Products p";

        beginTransaction();

        List result = getSession().createQuery(hqlQueryString).list();

        endTransaction();

        return result;
    }

}