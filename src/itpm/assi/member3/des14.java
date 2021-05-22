package itpm.assi.member3;

import itpm.assi.util.connection;
import itpm.assi.*;
import itpm.assi.common.homePg;
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
public class des14 extends javax.swing.JFrame {
    
 Connection conn = null;         //create the connection object con
 PreparedStatement pst; // create the PreparedStatement object pst
 ResultSet rs;          // create the ResultSet object rs
 Statement stmt;        // create the Statement object stmt


    
    public des14() {
        initComponents();
        DisplayTable();
    }
        
         private void DisplayTable(){
        try{
            
            conn = connection.getConnection();
            
            String sql = "select * from time_slot"; 
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
               
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            conn.close();
      
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, e); 
        
        }
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tslotupdatebtn = new javax.swing.JButton();
        tslotdelbtn = new javax.swing.JButton();
        timeslotsave2 = new javax.swing.JButton();
        dayselectbtn2 = new javax.swing.JComboBox<>();
        hrbtn2 = new javax.swing.JRadioButton();
        minbtn2 = new javax.swing.JRadioButton();
        sday2 = new javax.swing.JLabel();
        stime2 = new javax.swing.JLabel();
        sts2 = new javax.swing.JLabel();
        stime3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Time Slots");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345)
                .addComponent(jLabel6)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Day", "Time slot", "Starting time"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tslotupdatebtn.setBackground(new java.awt.Color(255, 204, 204));
        tslotupdatebtn.setText("UPDATE");
        tslotupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tslotupdatebtnActionPerformed(evt);
            }
        });

        tslotdelbtn.setBackground(new java.awt.Color(204, 255, 204));
        tslotdelbtn.setText("DELETE");
        tslotdelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tslotdelbtnActionPerformed(evt);
            }
        });

        timeslotsave2.setBackground(new java.awt.Color(255, 255, 153));
        timeslotsave2.setText("CLEAR ALL");
        timeslotsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeslotsave2ActionPerformed(evt);
            }
        });

        dayselectbtn2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        dayselectbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayselectbtn2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(hrbtn2);
        hrbtn2.setText("hour");
        hrbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrbtn2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(minbtn2);
        minbtn2.setText("min");
        minbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minbtn2ActionPerformed(evt);
            }
        });

        sday2.setText("Select day :");

        stime2.setText("Starting time :");

        sts2.setText("Select time slot :");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Msi 9RDS\\Desktop\\ITPM-master\\icons\\back_to_26px.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Msi 9RDS\\Desktop\\ITPM-master\\icons\\home_24px.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tslotupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeslotsave2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tslotdelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stime2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stime3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sday2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dayselectbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sts2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                                .addComponent(hrbtn2)
                                .addGap(89, 89, 89)
                                .addComponent(minbtn2)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sday2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayselectbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sts2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrbtn2)
                            .addComponent(minbtn2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tslotupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tslotdelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeslotsave2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stime2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stime3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tslotupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tslotupdatebtnActionPerformed
        // TODO add your handling code here:
 
        try{
             conn = connection.getConnection(); 
             int row = jTable1.getSelectedRow();
             String value = (jTable1.getModel().getValueAt(row, 0).toString());
             String sql = "UPDATE time_slot SET selected_day=?, time_slot=?, starting_time=? WHERE id ="+value;
             pst = conn.prepareStatement(sql);
            
            
            String selected_day;
            selected_day = dayselectbtn2.getSelectedItem().toString();
            pst.setString(1, selected_day);
            
            String time_slot = "";
            if(hrbtn2.isSelected()) 
            {
                 time_slot = hrbtn2.getText();
            }
            if(minbtn2.isSelected())
                    {
                       time_slot = minbtn2.getText(); 
                    }  
            pst.setString(2, time_slot);
            
//           String starting_time;
//           String htime = stimehour2.getValue().toString();
//           String mtime = stimemin2.getValue().toString();
//           String noon = noonselectbtn2.getSelectedItem().toString();
//      
//            starting_time = htime + ":" + mtime + "" + noon;
            pst.setString(3, stime3.getText());
             
           
             pst.executeUpdate();
             DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel(); 
             tblModel.setRowCount(0); 
             JOptionPane.showMessageDialog(null, "Updated successfully");
             conn.close();
            
        }catch(Exception e){
            
             JOptionPane.showMessageDialog(null, e); 
        }
        
        DisplayTable();
    }//GEN-LAST:event_tslotupdatebtnActionPerformed

    private void tslotdelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tslotdelbtnActionPerformed
        // TODO add your handling code here:
        try{
           conn = connection.getConnection(); 
           int row = jTable1.getSelectedRow();
           String value = (jTable1.getModel().getValueAt(row, 0).toString());
           String sql = "DELETE FROM time_slot WHERE id="+value;
           pst = conn.prepareStatement(sql);
           pst.executeUpdate();
           DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel(); 
           tblModel.setRowCount(0); 
           
           JOptionPane.showMessageDialog(null, "Deleted"); 
        
        conn.close();
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e); 
            
        }
        DisplayTable();
    }//GEN-LAST:event_tslotdelbtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         // TODO add your handling code here:       
        dayselectbtn2.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        
        String time_slot = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
           if(time_slot.equals("hour")){
             hrbtn2.setSelected(true);
             minbtn2.setSelected(false);
           }
           if(time_slot.equals("min")){
              minbtn2.setSelected(true);
              hrbtn2.setSelected(false);
           }
         
         stime3.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void timeslotsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeslotsave2ActionPerformed
        // TODO add your handling code here:
        
        dayselectbtn2.setSelectedItem("Monday");
        buttonGroup1.clearSelection();
        stime3.setText("");

    }//GEN-LAST:event_timeslotsave2ActionPerformed

    private void dayselectbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayselectbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayselectbtn2ActionPerformed

    private void hrbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrbtn2ActionPerformed

    private void minbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minbtn2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new Des13().setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new homePg().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(des14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(des14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(des14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(des14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new des14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> dayselectbtn2;
    private javax.swing.JRadioButton hrbtn2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton minbtn2;
    private javax.swing.JLabel sday2;
    private javax.swing.JLabel stime2;
    private javax.swing.JTextField stime3;
    private javax.swing.JLabel sts2;
    private javax.swing.JButton timeslotsave2;
    private javax.swing.JButton tslotdelbtn;
    private javax.swing.JButton tslotupdatebtn;
    // End of variables declaration//GEN-END:variables

}
