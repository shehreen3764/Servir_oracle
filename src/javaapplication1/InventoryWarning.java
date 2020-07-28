/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shehr
 */
public class InventoryWarning extends javax.swing.JFrame {

    /**
     * Creates new form InventoryWarning
     */
    CallableStatement callstate;
    public InventoryWarning() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        fillTable();
    }
    
    public Connection OracleConnection() {
        Connection conn;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shehreen", "oliveoil1000");
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:morcl", "shehreen", "oliveoil1000");
            //JOptionPane.showMessageDialog(null,"Database Connection Successful...");
            return conn;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "oracle Connection Failed...");
            return null;
        }
    }
    
    public ArrayList<InventoryWarningBean> retrieveData() {
        ArrayList<InventoryWarningBean> al = new ArrayList<>();

        try {
            Connection conn = OracleConnection();
            String qry = "select * from inventoryWarning";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);

            while (rs.next()) {
                InventoryWarningBean orderList = new InventoryWarningBean(rs.getInt(1), rs.getString("name"), rs.getInt(3), rs.getInt(4));
                al.add(orderList);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return al;
    }
    
    public void fillTable() {
        ArrayList<InventoryWarningBean> al = null;
        al = retrieveData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (InventoryWarningBean orderList : al) {
            Object row[] = {orderList.getId(), orderList.getName(), orderList.getAmount(), orderList.getPrice()};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textfield_amount = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Done_Button = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        textfield_id = new javax.swing.JTextField();
        textfield_name = new javax.swing.JTextField();
        textfield_price = new javax.swing.JTextField();
        textfield_Tprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2055, 1138));

        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(2055, 1138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Order Form");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The following raw materials need to be ordered");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        textfield_amount.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        textfield_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_amountActionPerformed(evt);
            }
        });
        jPanel1.add(textfield_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 258, -1));

        update.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 230, -1, -1));

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Amount", "Unit Price (BDT)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 883, 553));

        Done_Button.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Done_Button.setText("Done");
        Done_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Done_ButtonMouseClicked(evt);
            }
        });
        Done_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Done_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 790, 397, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new bg.jpg"))); // NOI18N
        bg.setText("jLabel1");
        bg.setMaximumSize(new java.awt.Dimension(2055, 1138));
        bg.setMinimumSize(new java.awt.Dimension(2055, 1138));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(2055, 1138));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textfield_id.setBackground(new java.awt.Color(204, 255, 204));
        textfield_id.setBorder(null);
        jPanel1.add(textfield_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 352, 221, 175));

        textfield_name.setText("jTextField2");
        jPanel1.add(textfield_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, -1, -1));

        textfield_price.setText("jTextField2");
        jPanel1.add(textfield_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 420, -1, -1));

        textfield_Tprice.setText("jTextField2");
        jPanel1.add(textfield_Tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_amountActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if ((textfield_id.getText() != null && textfield_name != null) && textfield_amount != null) {
            Connection conn = OracleConnection();
            try {
                callstate = conn.prepareCall("{call updateManagerInventory(?,?,?)}");
                callstate.registerOutParameter(3, Types.VARCHAR);

                int newAmount = Integer.parseInt(textfield_amount.getText());
                int newId = Integer.parseInt(textfield_id.getText());

                callstate.setInt(1,newId);
                callstate.setInt(2,newAmount);

                callstate.execute();
                fillTable();

                String finalResult= callstate.getString(3).toString();
                JOptionPane.showMessageDialog(null, finalResult);

                //fillTable();
            } 
            catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
                
            textfield_id.setText("");
            textfield_name.setText("");
            textfield_amount.setText("");
            textfield_price.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select an item to update");
        }
            
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int ind = jTable1.getSelectedRow();
        showItemToFields(ind);
    }//GEN-LAST:event_jTable1MouseClicked

    private void Done_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Done_ButtonMouseClicked
        dispose();
        new Manager_interface().setVisible(true);
    }//GEN-LAST:event_Done_ButtonMouseClicked

    private void Done_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_ButtonActionPerformed

    }//GEN-LAST:event_Done_ButtonActionPerformed

    public void showItemToFields(int index) {
        //textfield_amount.setText(Integer.toString(retrieveData().get(index).getAmount()));
        textfield_price.setText(Integer.toString(retrieveData().get(index).getPrice()));
        textfield_name.setText(retrieveData().get(index).getName());
        textfield_id.setText(Integer.toString(retrieveData().get(index).getId()));
        //int price = retrieveData().get(index).getPrice();
        //int amount = retrieveData().get(index).getAmount();
        //price = price / amount;
        //String pri = Integer.toString(price);
        //textfield_price.setText(pri);
    }
    
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
            java.util.logging.Logger.getLogger(InventoryWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryWarning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Done_Button;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textfield_Tprice;
    private javax.swing.JTextField textfield_amount;
    private javax.swing.JTextField textfield_id;
    private javax.swing.JTextField textfield_name;
    private javax.swing.JTextField textfield_price;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
