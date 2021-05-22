package itpm.assi.member3;

import itpm.assi.util.connection;
import itpm.assi.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yasho
 */
public class NATgroup extends javax.swing.JFrame {
    
    Connection conn = null;        //create the connection object con
    PreparedStatement pst; // create the PreparedStatement object pst
    ResultSet rs;          // create the ResultSet object rs
    Statement stmt;        // create the Statement object stmt

    public NATgroup() {
        initComponents();
        loadgroups();
        DisplayTable();
    }
     private void DisplayTable(){
        try{
            conn = connection.getConnection();
            
            String sql = "select * from nat_group"; 
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            
           jTablenatg.setModel(DbUtils.resultSetToTableModel(rs));
           
           conn.close();
      
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, e); 
        
        }
          
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ftime3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selgrp = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        selday3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablenatg = new javax.swing.JTable();
        clenatg = new javax.swing.JButton();
        delnatg = new javax.swing.JButton();
        updatenatg = new javax.swing.JButton();
        savenatg = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ftime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftime3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Group");

        jLabel3.setText("Date");

        jLabel4.setText("Time");

        jButton1.setText("Lecturers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sessions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 204, 255));
        jButton3.setText("Groups");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Not Available Time Allocation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel1)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        selgrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selgrpActionPerformed(evt);
            }
        });

        jButton4.setText("Sub groups");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        selday3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        selday3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selday3ActionPerformed(evt);
            }
        });

        jTablenatg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group", "Date", "Time"
            }
        ));
        jTablenatg.setFocusable(false);
        jTablenatg.setRowHeight(25);
        jTablenatg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablenatgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablenatg);

        clenatg.setBackground(new java.awt.Color(255, 255, 153));
        clenatg.setText("CLEAR ALL");
        clenatg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clenatgActionPerformed(evt);
            }
        });

        delnatg.setBackground(new java.awt.Color(204, 255, 204));
        delnatg.setText("DELETE");
        delnatg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delnatgActionPerformed(evt);
            }
        });

        updatenatg.setBackground(new java.awt.Color(255, 204, 204));
        updatenatg.setText("UPDATE");
        updatenatg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenatgActionPerformed(evt);
            }
        });

        savenatg.setBackground(new java.awt.Color(204, 204, 255));
        savenatg.setText("SAVE");
        savenatg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savenatgActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Msi 9RDS\\Desktop\\ITPM-master\\icons\\back_to_26px.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Msi 9RDS\\Desktop\\ITPM-master\\icons\\home_24px.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setText("Room");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(savenatg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatenatg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delnatg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clenatg, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(selday3, 0, 227, Short.MAX_VALUE)
                                            .addComponent(selgrp, 0, 227, Short.MAX_VALUE)
                                            .addComponent(ftime3))))))
                        .addGap(0, 328, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(selgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selday3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savenatg)
                    .addComponent(updatenatg)
                    .addComponent(delnatg)
                    .addComponent(clenatg))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftime3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftime3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new NATlecs().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selgrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selgrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selgrpActionPerformed

    private void selday3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selday3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selday3ActionPerformed

    private void jTablenatgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablenatgMouseClicked
        // TODO add your handling code here:
        selgrp.setSelectedItem(jTablenatg.getValueAt(jTablenatg.getSelectedRow(), 1).toString());
        selday3.setSelectedItem(jTablenatg.getValueAt(jTablenatg.getSelectedRow(), 2).toString());
        ftime3.setText(jTablenatg.getValueAt(jTablenatg.getSelectedRow(), 3).toString());
       
    }//GEN-LAST:event_jTablenatgMouseClicked

    private void clenatgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clenatgActionPerformed
        // TODO add your handling code here:
        selgrp.setSelectedItem(null);
        selday3.setSelectedItem(null);
        ftime3.setText("");
    }//GEN-LAST:event_clenatgActionPerformed

    private void delnatgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delnatgActionPerformed
        // TODO add your handling code here:
         try{
           conn = connection.getConnection();
           
           int row = jTablenatg.getSelectedRow();
           String value = (jTablenatg.getModel().getValueAt(row, 0).toString());
           String sql = "DELETE FROM nat_group WHERE id="+value;
           pst = conn.prepareStatement(sql);
           pst.executeUpdate();
           DefaultTableModel tblModel = (DefaultTableModel)jTablenatg.getModel(); 
           tblModel.setRowCount(0); 
           
           JOptionPane.showMessageDialog(null, "Deleted"); 
        
        conn.close();
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e); 
            
        }
        DisplayTable();
    }//GEN-LAST:event_delnatgActionPerformed

    private void updatenatgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenatgActionPerformed
        // TODO add your handling code here:
        try{
             conn = connection.getConnection();
             
             int row = jTablenatg.getSelectedRow();
             String value = (jTablenatg.getModel().getValueAt(row, 0).toString());
             String sql = "UPDATE nat_group SET ngroup=?, date=?, time=? WHERE id ="+value;
             pst = conn.prepareStatement(sql);
            
            
            String group;
            group = selgrp.getSelectedItem().toString();
            pst.setString(1, group); 
            
            String date;
            date = selday3.getSelectedItem().toString();
            pst.setString(2, date);
            
            pst.setString(3, ftime3.getText());
            
           
             pst.executeUpdate();
             DefaultTableModel tblModel = (DefaultTableModel)jTablenatg.getModel(); 
             tblModel.setRowCount(0); 
             JOptionPane.showMessageDialog(null, "Updated successfully");
             conn.close();
           
        }catch(Exception e){
            
             JOptionPane.showMessageDialog(null, e); 
        }
        
        DisplayTable();      
    }//GEN-LAST:event_updatenatgActionPerformed

    private void savenatgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savenatgActionPerformed
        // TODO add your handling code here:
        try{
            conn = connection.getConnection();
            
            pst = conn.prepareStatement("insert into nat_group(ngroup,date,time)values(?,?,?)");
            
            String group;
            group = selgrp.getSelectedItem().toString();
            pst.setString(1, group); 
            
            String date;
            date = selday3.getSelectedItem().toString();
            pst.setString(2, date);
            
            pst.setString(3, ftime3.getText());
         
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "inserted successfully");
           conn.close();
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
          }
         DisplayTable();
    }//GEN-LAST:event_savenatgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new NATsession().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//         new NATgroup().setVisible(true);
//         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new NATsubgroup().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new NATroom().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NATgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NATgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NATgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NATgroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NATgroup().setVisible(true);
            }
        });
    }
     public void loadgroups(){
         try{
             conn = connection.getConnection();
             
             String sql = "Select group_no from student";
             pst = conn.prepareStatement(sql);
             
             rs = pst.executeQuery();
             
             while (rs.next()){
                 String name = rs.getString("group_no");
                 selgrp.addItem(name);
                }
             conn.close();
             
        }catch(Exception e){
            
          JOptionPane.showMessageDialog(null, e);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clenatg;
    private javax.swing.JButton delnatg;
    private javax.swing.JTextField ftime3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablenatg;
    private javax.swing.JButton savenatg;
    private javax.swing.JComboBox selday3;
    private javax.swing.JComboBox selgrp;
    private javax.swing.JButton updatenatg;
    // End of variables declaration//GEN-END:variables
}
