/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.UIManager;
import java.sql.*;
import javax.swing.JFrame;
/**
 *
 * @author shehr
 */
public class CustomerInterface extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInterface
     */
   
    public CustomerInterface() {
        initComponents();
        fillTable();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public Connection OracleConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shehreen", "oliveoil1000");
//            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:morcl", "shehreen", "oliveoil1000");
            return conn;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "oracle Connection Failed...");
            return null;
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

        textfield_amount1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cart_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        textfield_amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        label_bg = new javax.swing.JLabel();
        textfield_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textfield_name = new javax.swing.JTextField();
        textfield_price = new javax.swing.JTextField();

        textfield_amount1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Amount ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(getMaximumSize());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(2055, 1138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select items, choose amount and add items to cart  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 854, 59));

        Cart_Button.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Cart_Button.setText("Go to Cart");
        Cart_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cart_ButtonMouseClicked(evt);
            }
        });
        jPanel1.add(Cart_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 750, 349, -1));

        Add_Button.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Add_Button.setText("Add to Cart");
        Add_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_ButtonMouseClicked(evt);
            }
        });
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 190, 349, 54));

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price (BDT)", "Available Servings"
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
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 925, 580));

        back.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        back.setText("Back to Start");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 820, 349, -1));

        textfield_amount.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jPanel1.add(textfield_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 300, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        label_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new bg.jpg"))); // NOI18N
        label_bg.setPreferredSize(new java.awt.Dimension(2055, 1138));
        jPanel1.add(label_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textfield_id.setBackground(new java.awt.Color(204, 255, 204));
        textfield_id.setFont(new java.awt.Font("Arial", 0, 1)); // NOI18N
        textfield_id.setForeground(new java.awt.Color(204, 255, 204));
        textfield_id.setBorder(null);
        jPanel1.add(textfield_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 488, 64, 73));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        textfield_name.setText("jTextField1");
        jPanel1.add(textfield_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 330, -1, -1));

        textfield_price.setText("jTextField2");
        jPanel1.add(textfield_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<MenuBean> retrieveData() {
        ArrayList<MenuBean> al = new ArrayList<>();

        try {
            Connection conn = OracleConnection();
            String qry = "select * from menu";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);

            while (rs.next()) {
                MenuBean menu = new MenuBean(rs.getInt(1), rs.getString("name"), rs.getInt(3), rs.getInt(4));
                al.add(menu);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return al;
    }

    public ArrayList<CartBean> retrieveDatacart() {
        ArrayList<CartBean> al = new ArrayList<>();

        try {
            Connection conn = OracleConnection();
            String qry = "select * from cart";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);
            
            while (rs.next()) {
                CartBean cart = new CartBean(rs.getInt(1), rs.getString("name"), rs.getInt(3), rs.getInt(4));
                al.add(cart);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return al;
    }

    public void fillTable() {
        ArrayList<MenuBean> al = null;
        al = retrieveData();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (MenuBean menu : al) {
            Object row[] = {menu.getId(), menu.getName(), menu.getPrice(), menu.getAmount()};
            model.addRow(row);
        }
    }


    private void Cart_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cart_ButtonMouseClicked
        Customer_Cart cc = new Customer_Cart();
        cc.setVisible(true);
    }//GEN-LAST:event_Cart_ButtonMouseClicked

    private void Add_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_ButtonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Add_ButtonMouseClicked

    public void showItemToFields(int index) {
        textfield_id.setText(Integer.toString(retrieveData().get(index).getId()));
        textfield_name.setText(retrieveData().get(index).getName());
        textfield_price.setText(Integer.toString(retrieveData().get(index).getPrice()));
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ind = jTable1.getSelectedRow();
        showItemToFields(ind);
    }//GEN-LAST:event_jTable1MouseClicked

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed

        if (textfield_id.getText() != null || textfield_amount.getText() != null) {
            String qry;
            PreparedStatement ps;
            Connection conn = OracleConnection();
            int ind = jTable1.getSelectedRow();
            int newamount = retrieveData().get(ind).getAmount();
            if (newamount >= (Integer.parseInt(textfield_amount.getText()))) {
                try {
                    qry = "update menu set Amount=Amount-? where id=?";
                    ps = conn.prepareStatement(qry);

                    ps.setInt(1, Integer.parseInt(textfield_amount.getText()));
                    ps.setInt(2, Integer.parseInt(textfield_id.getText()));

                    int res = ps.executeUpdate();
                    fillTable();

                    if (res >= 1) {
                        //JOptionPane.showMessageDialog(null, "Items"+ " have been added.....");
                    } else {
                        JOptionPane.showMessageDialog(null, "Item adding to cart failed ....");
                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                int price;
                int amount;
                amount = Integer.parseInt(textfield_amount.getText());
                price = Integer.parseInt(textfield_price.getText());
                price = price * amount;
                String pri = Integer.toString(price);

                textfield_price.setText(pri);

                String qry1;
                PreparedStatement ps1;
                try {
                    qry1 = "insert into cart" + "(id,Name,Price,Amount) values (?,?,?,?)";
                    ps1 = conn.prepareStatement(qry1);

                    ps1.setInt(1, Integer.parseInt(textfield_id.getText()));
                    ps1.setString(2, textfield_name.getText());
                    ps1.setInt(3, Integer.parseInt(textfield_price.getText()));
                    ps1.setInt(4, Integer.parseInt(textfield_amount.getText()));

                    //if given amount > available, generate insufficient amount-> message   
                    int res1 = ps1.executeUpdate();

                    if (res1 >= 1) {
                        //JOptionPane.showMessageDialog(null, "Items"+ " have been added.....");
                    } else {
                        JOptionPane.showMessageDialog(null, "Item adding to cart failed ....");
                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } else {
                UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 24));
                UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 24));
                JOptionPane.showMessageDialog(null, "There is insufficient amount");

            }
            textfield_id.setText("");
            textfield_name.setText("");
            textfield_amount.setText("");
            textfield_price.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "All fields are mandatory.......");
        }


    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        dispose();
        
        new User_Selection().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new User_Selection().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Cart_Button;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_bg;
    private javax.swing.JTextField textfield_amount;
    private javax.swing.JTextField textfield_amount1;
    private javax.swing.JTextField textfield_id;
    private javax.swing.JTextField textfield_name;
    private javax.swing.JTextField textfield_price;
    // End of variables declaration//GEN-END:variables
}
