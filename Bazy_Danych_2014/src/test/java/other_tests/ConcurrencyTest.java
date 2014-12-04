/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other_tests;

import dao.CategoriesDao;
import entity.Categories;
import java.util.ArrayList;

/**
 *
 * @author Krystian
 */
public class ConcurrencyTest implements Runnable{

    @Override
    public void run() {
        CategoriesDao categoriesDao = new CategoriesDao();
        ArrayList<Categories> categories = categoriesDao.selectCategories();
        for(Categories c : categories){
            System.out.println("Row: "+c);
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new ConcurrencyTest());
        Thread t2 = new Thread(new ConcurrencyTest());
        Thread t3 = new Thread(new ConcurrencyTest());
        
        System.out.println("Testing concurrency start");
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Testing concurrency finished");
        
    }
    
    
    
    
}
