/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CategoriesDao;
import dao.ProductsDao;
import dao.SupplierDao;
import entity.Categories;
import entity.Products;
import entity.Suppliers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Krystian
 */
public class ProductsFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductsFrame
     */
    ArrayList<Categories> categoriesList = new ArrayList();
    ArrayList<Suppliers> suppliersList = new ArrayList();
    
    public ProductsFrame() {
        initComponents();
        initGui();
    }
    private void initGui(){
        setVisible(true);
        initComboBoxCategories();
        initComboBoxSuppliers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSupplier = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldUnitPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUnitsInOrder = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUnitsInStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldReorderLevel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxIsDiscounted = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dodaj produkt"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Kategoria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jComboBoxCategory, gridBagConstraints);

        jLabel2.setText("Dostawca:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jComboBoxSupplier, gridBagConstraints);

        jLabel3.setText("Nazwa produktu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel3, gridBagConstraints);

        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jTextFieldProductName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jTextFieldUnitPrice, gridBagConstraints);

        jLabel4.setText("Cena za sztukę:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jTextFieldUnitsInOrder, gridBagConstraints);

        jLabel5.setText("Ilosć zamówionych:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Ilość dostępnych:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jTextFieldUnitsInStock, gridBagConstraints);

        jLabel9.setText("Min ilość:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jTextFieldReorderLevel, gridBagConstraints);

        jLabel10.setText("Przeceniony:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 7, 10);
        jPanel1.add(jLabel10, gridBagConstraints);

        jComboBoxIsDiscounted.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tak", "Nie" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 7, 15);
        jPanel1.add(jComboBoxIsDiscounted, gridBagConstraints);

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addProduct();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxCategory;
    private javax.swing.JComboBox jComboBoxIsDiscounted;
    private javax.swing.JComboBox jComboBoxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldReorderLevel;
    private javax.swing.JTextField jTextFieldUnitPrice;
    private javax.swing.JTextField jTextFieldUnitsInOrder;
    private javax.swing.JTextField jTextFieldUnitsInStock;
    // End of variables declaration//GEN-END:variables

    private void initComboBoxSuppliers() {
        SupplierDao suppliersDao = new SupplierDao();
        ArrayList<Suppliers> list = suppliersDao.selectSuppliers();
        
        for(Suppliers suppliers : list){
            String name = suppliers.getCompanyName();
            
            jComboBoxSupplier.addItem(name);
            suppliersList.add(suppliers);
        }
    }

    private void initComboBoxCategories() {
        CategoriesDao categoriesDao = new CategoriesDao();
        ArrayList<Categories> list = categoriesDao.selectCategories();
        for(Categories category : list){
            String name = category.getCategoryName();
            
            jComboBoxCategory.addItem(name);
            categoriesList.add(category);
        }
    }

    private void addProduct() {
        Products product = new Products();
        
        
        if(!validateCombos()) return;
        
        String categoryName = (String) jComboBoxCategory.getSelectedItem();
        
        for(Categories category : categoriesList){
            if(category.getCategoryName().equals(categoryName)){
                product.setCategory(category);
                break;
            }
        }
        
        String supplierName = (String) jComboBoxSupplier.getSelectedItem();
        
        for(Suppliers supplier : suppliersList){
            if(supplier.getCompanyName().equals(supplierName)){
                product.setSupplier(supplier);
                break;
            }
        }
        
        
 
        product.setProductName(jTextFieldProductName.getText());
        product.setUnitPrice(new Float(jTextFieldUnitPrice.getText()));
        product.setUnitsInStock(new Short(jTextFieldUnitsInStock.getText()));
        product.setUnitsOnOrder(new Short(jTextFieldUnitsInOrder.getText()));
        product.setReorderLevel(new Short(jTextFieldReorderLevel.getText()));
        
        if(jComboBoxIsDiscounted.getSelectedItem().equals("Tak")){ product.setDiscontinued(true); }
        else{ product.setDiscontinued(false); }
              
        
        ProductsDao productsDao = new ProductsDao();
        productsDao.addProduct(product);
        
        
    }
    
    
    private boolean validateCombos(){
        if(jComboBoxCategory.getSelectedIndex() == -1 || jComboBoxSupplier.getSelectedIndex() == -1 || jComboBoxIsDiscounted.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(null, "Uzupełnij kategorię, dostawcę oraz przeceniony");
            return false;
        } 
        return true;
    }
    

}
