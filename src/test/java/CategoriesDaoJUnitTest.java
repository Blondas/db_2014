/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.CategoriesDao;
import entity.Categories;
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
    
    
    @Test
    public void testAdd(){
        Categories c = new Categories();
        c.setCategoryName("Lol2");
        c.setDescription("pij mleko");
        c.setPicture("o.o");
        
        CategoriesDao categoriesDao = new CategoriesDao();
        categoriesDao.addCategory(c);
        
        Categories retrieved = categoriesDao.selectCategoriesByName("Lol2");
        assertEquals("Checking retrieved and actual object",c.getCategoryName(), retrieved.getCategoryName());
        
    }
    
    @Test
    public void testDelete(){
        
    }
    
    @Test
    public void testUpdate(){
        
    }
    
    @Test
    public void testSelect(){
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
