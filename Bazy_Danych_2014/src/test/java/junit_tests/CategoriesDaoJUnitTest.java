package junit_tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.CategoriesDao;
import entity.Categories;
import java.util.ArrayList;
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
public class CategoriesDaoJUnitTest {
    
    public CategoriesDaoJUnitTest() {
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
    
//==============================================================================    
    @Test()
    public void testCategories(){
        testSelect();
//        testAdd();
//        testSelect();
        testUpdate();
//        testSelect();
//        testDelete();
//        testSelect();
    }
//==============================================================================    
    public void testSelectFromDual(){
        CategoriesDao categoriesDao = new CategoriesDao();
        
    }
//==============================================================================    
    public void testSelect(){
        CategoriesDao categoriesDao = new CategoriesDao();
        ArrayList<Categories> categories = categoriesDao.selectCategories();
        System.out.println("------------------------------TESTING SELECT------------------------------");
        
        for(Categories c : categories){
            System.out.println(c);
        }
    }
//==============================================================================    
    public void testAdd(){
        System.out.println("------------------------------TESTING ADD------------------------------");
        
        Categories c = new Categories();
        c.setCategoryName("Category Test");
        c.setDescription("Description Test");
        c.setPicture("Picture Test");
        
        CategoriesDao categoriesDao = new CategoriesDao();
        categoriesDao.addCategory(c);
        
        Categories retrieved = categoriesDao.selectCategoryByName("Category Test");
        assertEquals("Checking retrieved and actual object",c.getCategoryName(), retrieved.getCategoryName());
        
    }
//==============================================================================    
    public void testDelete(){
        System.out.println("------------------------------TESTING DELETE------------------------------");

        CategoriesDao categoriesDao = new CategoriesDao();
        categoriesDao.deleteCategoriesByName("Category Test");
        
    }
//==============================================================================    
    public void testUpdate(){
        System.out.println("------------------------------TESTING UPDATE------------------------------");
        Categories category = new Categories();
//        category.setCategoryName("CATEGORY UPDATED");
        category.setDescription("Descrip UPDATED");
//        category.setPicture("Picture UPDATED");
        category.setCategoryId(12);
        
        CategoriesDao categoriesDao = new CategoriesDao();
        categoriesDao.updatetCategory(category);
    }
//==============================================================================   
}
