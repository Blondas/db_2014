/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categories;
import entity.Orders;
import entity.Suppliers;

import java.util.ArrayList;

/**
 *
 * @author Krystian
 */
public class OrdersDao extends GenericQuery{


    public ArrayList<Orders> getOrders() {
        ArrayList<Orders> orders = null;

        beginTransaction();
        orders = (ArrayList<Orders>) getSession().createQuery("from Orders").list();
        endTransaction();

        return orders;
    }

    public Long getOrdersNumber() {
        Long orders_num;

        beginTransaction();
        orders_num = (Long) getSession().createQuery("select count(*) from Orders").uniqueResult();
        endTransaction();

        return orders_num;
    }
}
