/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_tests;

import dao.CategoriesDao;
import dao.ProductsDao;
import dao.ReportsDao;
import dao.ReportsDao;
import dao.SupplierDao;
import entity.Categories;
import entity.Products;
import entity.Suppliers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krystian
 */
public class OtherTests {
    
    public OtherTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//    @Test
//    public void test(){
//
//
//        Suppliers supplier = new Suppliers();
//        supplier.setAddress("dsadsadas");
//        supplier.setCity("krak");
//        supplier.setCompanyName("company");
//        supplier.setContactName("contac");
//        supplier.setContactTitle("cont tit");
//        supplier.setCountry("county");
//        supplier.setFax("fax");
//        supplier.setHomePage("home page");
//        supplier.setPhone("phone");
//        supplier.setPostalCode("postal");
//        supplier.setRegion("reg");
//
//        SupplierDao supplierDao = new SupplierDao();
//        supplierDao.addSupplier(supplier);
//
//
//        Categories c = new Categories();
//        c.setCategoryName("Category Test");
//        c.setDescription("Description Test");
//        c.setPicture("Picture Test");
//
//        new CategoriesDao().addCategory(c);
//
//
//        Products product = new Products();
//
//        product.setDiscontinued(Boolean.TRUE);
//        product.setProductName("alaaaa");
//        product.setQuantityPerUnit("1");
//        product.setReorderLevel(Short.MIN_VALUE);
//        product.setUnitPrice(Float.MIN_VALUE);
//        product.setUnitsInStock(Short.MIN_VALUE);
//        product.setUnitsOnOrder(Short.MIN_VALUE);
//
//        product.setSupplier(supplier);
//        product.setCategory(c);
//
//        ProductsDao productsDao = new ProductsDao();
//        productsDao.addProduct(product);
//
//    }
    
    @Test
    public void testSelectCategory() {
        CategoriesDao cDao = new CategoriesDao();
        Categories category = cDao.selectCategoryByid(10);

        System.out.println(category);
    }

    @Test
    public void testRaport1() {
        ReportsDao r = new ReportsDao();
        List report = r.getProductsReport1("Beverages", "Exotic Liquids");
        System.out.println(report);
    }
    
}
