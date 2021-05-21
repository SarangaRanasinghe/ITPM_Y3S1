package itpm.assi.yashodha;

import itpm.assi.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class NATlecs extends javax.swing.JFrame {

 Connection conn = null;        //create the connection object con
 PreparedStatement pst; // create the PreparedStatement object pst
 ResultSet rs;          // create the ResultSet object rs
 Statement stmt;        // create the Statement object stmt
 
// public String workingDaysAndHours = "select * from nat_lecturers";
    public NATlecs() {
        initComponents();
        loadlecturers();
        DisplayTable();
        
    }
     private void DisplayTable(){
        try{
            
            conn = connection.getConnection();
            
            String sql = "select * from nat_lecturers"; 
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
                 
            jTablenatl.setModel(DbUtils.resultSetToTableModel(rs));
           
            conn.close();
      
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, e); 
        
        }         
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selLec = new javax.swing.JComboBox();
        selday = new javax.swing.JComboBox();
        ftime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablenatl = new javax.swing.JTable();
        savenatl = new javax.swing.JButton();
        clenatlec = new javax.swing.JButton();
        delnatlec = new javax.swing.JButton();
        updatenatl = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Not Available Time Allocation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel2.setText("Lecturer");

        jLabel3.setText("Date");

        jLabel4.setText("Time");

        selLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selLecActionPerformed(evt);
            }
        });

        selday.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        selday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seldayActionPerformed(evt);
            }
        });

        ftime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftimeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
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

        jButton3.setText("Groups");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sub groups");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTablenatl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer", "Date", "Time"
            }
        ));
        jTablenatl.setFocusable(false);
        jTablenatl.setRowHeight(25);
        jTablenatl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablenatlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablenatl);

        savenatl.setBackground(new java.awt.Color(204, 204, 255));
        savenatl.setText("SAVE");
        savenatl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savenatlActionPerformed(evt);
            }
        });

        clenatlec.setBackground(new java.awt.Color(255, 255, 153));
        clenatlec.setText("CLEAR ALL");
        clenatlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clenatlecActionPerformed(evt);
            }
        });

        delnatlec.setBackground(new java.awt.Color(204, 255, 204));
        delnatlec.setText("DELETE");
        delnatlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delnatlecActionPerformed(evt);
            }
        });

        updatenatl.setBackground(new java.awt.Color(255, 204, 204));
        updatenatl.setText("UPDATE");
        updatenatl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenatlActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasho\\OneDrive\\Desktop\\ITPM-mem3\\ITPM\\icons\\back_to_26px.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\yasho\\OneDrive\\Desktop\\ITPM-mem3\\ITPM\\icons\\home_24px.png")); // NOI18N
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(savenatl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatenatl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delnatlec, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clenatlec, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(selday, javax.swing.GroupLayout.Alignment.LEADING, 0, 227, Short.MAX_VALUE)
                                            .addComponent(selLec, javax.swing.GroupLayout.Alignment.LEADING, 0, 227, Short.MAX_VALUE)
                                            .addComponent(ftime, javax.swing.GroupLayout.Alignment.LEADING))))))
                        .addGap(0, 249, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selLec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(selday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savenatl)
                    .addComponent(updatenatl)
                    .addComponent(delnatlec)
                    .addComponent(clenatlec))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selLecActionPerformed

    private void seldayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seldayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seldayActionPerformed

    private void ftimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        new NATlecs().setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablenatlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablenatlMouseClicked
        // TODO add your handling code here:     
        selLec.setSelectedItem(jTablenatl.getValueAt(jTablenatl.getSelectedRow(), 1).toString());
        selday.setSelectedItem(jTablenatl.getValueAt(jTablenatl.getSelectedRow(), 2).toString());
        ftime.setText(jTablenatl.getValueAt(jTablenatl.getSelectedRow(), 3).toString());
       
    }//GEN-LAST:event_jTablenatlMouseClicked

    private void savenatlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savenatlActionPerformed
        // TODO add your handling code here:
         try{
            conn = connection.getConnection();
            
            pst = conn.prepareStatement("insert into nat_lecturers(Lecturer,date,time)values(?,?,?)");
            
            String Lecturer;
            Lecturer = selLec.getSelectedItem().toString();
            pst.setString(1, Lecturer); 
            
            String date;
            date = selday.getSelectedItem().toString();
            pst.setString(2, date);
           
            pst.setString(3, ftime.getText());
         
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "inserted successfully");
           conn.close();
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
          }
        DisplayTable();
    }//GEN-LAST:event_savenatlActionPerformed

    private void clenatlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clenatlecActionPerformed
        // TODO add your handling code here:
        selLec.setSelectedItem(null);
        selday.setSelectedItem(null);
        ftime.setText("");
    }//GEN-LAST:event_clenatlecActionPerformed

    private void delnatlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delnatlecActionPerformed
        // TODO add your handling code here:
         try{
          conn = connection.getConnection();
          
           int row = jTablenatl.getSelectedRow();
           String value = (jTablenatl.getModel().getValueAt(row, 0).toString());
           String sql = "DELETE FROM nat_lecturers WHERE id="+value;
           pst = conn.prepareStatement(sql);
           pst.executeUpdate();
           DefaultTableModel tblModel = (DefaultTableModel)jTablenatl.getModel(); 
           tblModel.setRowCount(0); 
           
           JOptionPane.showMessageDialog(null, "Deleted"); 
        
        conn.close();
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e); 
            
        }
        DisplayTable();
    }//GEN-LAST:event_delnatlecActionPerformed

    private void updatenatlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenatlActionPerformed
        // TODO add your handling code here:
         try{
            conn = connection.getConnection();
            
             int row = jTablenatl.getSelectedRow();
             String value = (jTablenatl.getModel().getValueAt(row, 0).toString());
             String sql = "UPDATE nat_lecturers SET Lecturer=?, date=?, time=? WHERE id ="+value;
             pst = conn.prepareStatement(sql);
                        
            String Lecturer;
            Lecturer = selLec.getSelectedItem().toString();
            pst.setString(1, Lecturer);
            
            String date;
            date = selday.getSelectedItem().toString();
            pst.setString(2, date);
           
            pst.setString(3, ftime.getText());
                    
             pst.executeUpdate();
             DefaultTableModel tblModel = (DefaultTableModel)jTablenatl.getModel(); 
             tblModel.setRowCount(0); 
             JOptionPane.showMessageDialog(null, "Updated successfully");
             conn.close();
          
        }catch(Exception e){
            
             JOptionPane.showMessageDialog(null, e); 
        }
        
        DisplayTable();                      
    }//GEN-LAST:event_updatenatlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new NATsession().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new NATgroup().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(NATlecs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NATlecs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NATlecs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NATlecs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NATlecs().setVisible(true);
            }
        });
    }
     public void loadlecturers(){
         try{
             conn = connection.getConnection();
             
             String sql = "Select LectureName from add_lecturer";
             pst = conn.prepareStatement(sql);
             
             rs = pst.executeQuery();
             
             while (rs.next()){
                 String name = rs.getString("LectureName");
                 selLec.addItem(name);
                }
             conn.close();
             
        }catch(Exception e){
            
          JOptionPane.showMessageDialog(null, e);
        }   
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clenatlec;
    private javax.swing.JButton delnatlec;
    private javax.swing.JTextField ftime;
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
    private javax.swing.JTable jTablenatl;
    private javax.swing.JButton savenatl;
    private javax.swing.JComboBox selLec;
    private javax.swing.JComboBox selday;
    private javax.swing.JButton updatenatl;
    // End of variables declaration//GEN-END:variables
}
