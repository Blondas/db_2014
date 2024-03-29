/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import nw_old.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Krystian
 */
public abstract class GenericQuery {
    private Transaction transaction = null;
    private Session session; 
    
//==============================================================================
    public final void beginTransaction(){
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
        }catch (RuntimeException e) {
            rollback(e);
        }
    }
//==============================================================================
    public final void endTransaction(){
        try {
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            rollback(e);
        } finally {
            session.flush();
            session.close();
            transaction=null;
            session=null;
        }
        
    }
//==============================================================================
    private void rollback(RuntimeException e){
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
//==============================================================================
    public Session getSession(){ return session;}
//==============================================================================
    
}
