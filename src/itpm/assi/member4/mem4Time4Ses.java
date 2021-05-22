/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member4;

import itpm.assi.member4.Session;
import itpm.assi.util.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Msi 9RDS
 */
public class mem4Time4Ses extends javax.swing.JFrame {
            Connection conn = null;
             List<Session> sessions = new ArrayList<Session>();
    /**
     * Creates new form mem4Time4Ses
     */
    public mem4Time4Ses() {
        initComponents();
        insertSessionIDDropdown();
        
        resetForm();
        DisplayTablemst();
    }

 
      private void resetForm(){
        mstCancel.setVisible(false);
        mstDelete.setVisible(false);
        mstSaveBtn.setText("Add");
        mstLabel.setVisible(false);
        mstid.setVisible(false);
        mstSess.setEnabled(true);
        mstSess.setSelectedIndex(0);
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mstSess = new javax.swing.JComboBox<>();
        mstDay = new javax.swing.JComboBox<>();
        mstStart = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mstDetails = new javax.swing.JTextArea();
        mstSaveBtn = new javax.swing.JButton();
        mstDelete = new javax.swing.JButton();
        mstCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mstTable = new javax.swing.JTable();
        mstLabel = new javax.swing.JLabel();
        mstid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Manage Session Times");

        mstSess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        mstSess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstSessActionPerformed(evt);
            }
        });

        mstDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday" }));

        mstStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:30", "9:30", "10:30", "11:30","12:30","13:30","14:30","15:30","16:30" }));

        jLabel2.setText("Day");

        jLabel3.setText("Session");

        jLabel4.setText("Start Time");

        mstDetails.setBackground(new java.awt.Color(204, 204, 204));
        mstDetails.setColumns(20);
        mstDetails.setRows(5);
        jScrollPane2.setViewportView(mstDetails);

        mstSaveBtn.setText("Save Record");
        mstSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstSaveBtnActionPerformed(evt);
            }
        });

        mstDelete.setText("Delete Record");
        mstDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstDeleteActionPerformed(evt);
            }
        });

        mstCancel.setText("Cancel");
        mstCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstCancelActionPerformed(evt);
            }
        });

        mstTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mstTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mstTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mstTable);

        mstLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mstLabel.setText("Selected ID");

        mstid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mstid.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mstDay, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mstStart, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mstSess, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(127, 127, 127)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mstDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mstSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mstCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mstLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(mstid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mstid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mstLabel))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mstSess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(mstCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mstSaveBtn)
                                .addGap(42, 42, 42)
                                .addComponent(mstDelete))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mstDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mstStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mstCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstCancelActionPerformed
        resetForm();
    }//GEN-LAST:event_mstCancelActionPerformed

    private void mstDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstDeleteActionPerformed
        // delete
        try {

            conn = connection.getConnection();

            String sql = "delete from timetable where tid = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(mstid.getText()));

            int result = pstmt.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(null, "Time Slot Removed !!!");
                resetForm();
               DisplayTablemst();
            } else {
                JOptionPane.showMessageDialog(null, "Time Slot cannot be Removed !!!");
            }

            conn.close();
            insertSessionIDDropdown();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_mstDeleteActionPerformed

    
    public void insertSessionIDDropdown(){
    
        try{
        
        sessions.clear();
        if(mstSess.getItemCount() > 0){
            mstSess.removeAllItems();
        }
            
        conn = connection.getConnection();
        
        String sql = "select * from session where room is not null";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
      
        while(rs.next()){
            
            int ses_id = rs.getInt("ses_id");
            String lecturer = rs.getString("lecturer");
            String lecturer_2 = rs.getString("lecturer_2");
            String subject_code = rs.getString("subject_code");
            String subject_name = rs.getString("subject_name");
            String group_id = rs.getString("group_id");
            String tag = rs.getString("tag");
            String no_of_students = rs.getString("no_of_students");
            String duration = rs.getString("duration");

            Session session = new Session(ses_id, lecturer, lecturer_2, subject_code, subject_name, group_id, tag, no_of_students, duration);
            sessions.add(session);
    
             
            mstSess.addItem(String.valueOf(ses_id));
       
        }
        
        
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        if(mstSess.getItemCount() > 0 ) {
            mstSess.setSelectedIndex(0);
        }
    }  
    
    
    
    private void mstSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstSaveBtnActionPerformed

        try{
            if(mstSaveBtn.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into timetable (ses_id,day,start,end ) values (?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, mstSess.getSelectedItem().toString());
                
                pstmt.setString(2, mstDay.getSelectedItem().toString());
                 pstmt.setString(3, mstStart.getSelectedItem().toString());
                 
                 //calculating end-time
                 String selected_sesid = mstSess.getSelectedItem().toString();
                 int duration = 0;
                 for(Session s : sessions){
                    if(s.getSes_id() == Integer.parseInt(selected_sesid)){
                        duration = Integer.parseInt(s.getDuration());
                    }
                 }
                 
                 int end_time = Integer.parseInt(mstStart.getSelectedItem().toString().split(":")[0]) + duration;
                 
                   pstmt.setString(4, String.valueOf(end_time)+":"+mstStart.getSelectedItem().toString().split(":")[1]);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added Successfully !!");

                DisplayTablemst();
                insertSessionIDDropdown();

                conn.close();

            } else {
                //update
                conn = connection.getConnection();

                 String sql = "update timetable set ses_id = ? ,day =?,start =?,end =?  where tid=? ";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, mstSess.getSelectedItem().toString());
                
                pstmt.setString(2, mstDay.getSelectedItem().toString());
                pstmt.setString(3, mstStart.getSelectedItem().toString());
                  //calculating end-time
                 String selected_sesid = mstSess.getSelectedItem().toString();
                 int duration = 0;
                 for(Session s : sessions){
                    if(s.getSes_id() == Integer.parseInt(selected_sesid)){
                        duration = Integer.parseInt(s.getDuration());
                    }
                 }
                 
                 int end_time = Integer.parseInt(mstStart.getSelectedItem().toString().split(":")[0]) + duration;
                 
                   pstmt.setString(4, String.valueOf(end_time)+":"+mstStart.getSelectedItem().toString().split(":")[1]);
                     pstmt.setString(5, mstid.getText());


                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");

                DisplayTablemst();
                conn.close();

                //hide buttons
                resetForm();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_mstSaveBtnActionPerformed

    private void mstSessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstSessActionPerformed
      String ses_id = mstSess.getSelectedItem()==null? "-1":mstSess.getSelectedItem().toString();
        
        if(ses_id.equalsIgnoreCase("-1") || ses_id != null) {
            int int_ses_id = Integer.parseInt(ses_id);
        
            for (Session ses : sessions) 
            { 
                int list_ses_id = ses.getSes_id();
                if(int_ses_id == list_ses_id) {
                    mstDetails.setText(""
                            + "Lecturer 1: " + ses.getLecturer()
                            + "\nLecturer_2: " + ses.getLecturer_2()
                            + "\nSubject Code: " + ses.getSubject_code()
                            + "\nSubject Name: " + ses.getSubject_name()
                            + "\nGroup ID: " + ses.getGroup_id()
                            + "\nTag: " + ses.getTag()
                            + "\nNo_of_students: " + ses.getNo_of_students()
                            + "\nDuration: "+ses.getDuration());
                }
            }   
        }
    }//GEN-LAST:event_mstSessActionPerformed

    private void mstTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mstTableMouseClicked
         mstCancel.setVisible(true);
        mstDelete.setVisible(true);
        mstSaveBtn.setText("Update");
        mstLabel.setVisible(true);
        mstid.setVisible(true);
        mstSess.setEnabled(false);
        
       

        int selected_id = Integer.parseInt(mstTable.getValueAt(mstTable.getSelectedRow(), 0).toString());
        
        mstid.setText(String.valueOf(selected_id));

        mstSess.setSelectedItem(mstTable.getValueAt(mstTable.getSelectedRow(), 0).toString());
        mstDay.setSelectedItem(mstTable.getValueAt(mstTable.getSelectedRow(), 9).toString());
         mstStart.setSelectedItem(mstTable.getValueAt(mstTable.getSelectedRow(), 9).toString());
       
        
         mstDetails.setText(""
                            + "Lecturer 1: " + mstTable.getValueAt(mstTable.getSelectedRow(), 1).toString()
                            + "\nLecturer_2: " + mstTable.getValueAt(mstTable.getSelectedRow(),2).toString()
                            + "\nSubject Code: " + mstTable.getValueAt(mstTable.getSelectedRow(), 3).toString()
                            + "\nSubject Name: " + mstTable.getValueAt(mstTable.getSelectedRow(), 4).toString()
                            + "\nGroup ID: " + mstTable.getValueAt(mstTable.getSelectedRow(), 5).toString()
                            + "\nTag: " + mstTable.getValueAt(mstTable.getSelectedRow(), 6).toString()
                            + "\nNo_of_students: " + mstTable.getValueAt(mstTable.getSelectedRow(), 7).toString()
                            + "\nDuration: "+mstTable.getValueAt(mstTable.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_mstTableMouseClicked

    
    private void DisplayTablemst() {
        try {

            conn = connection.getConnection();

            String sql = "select t.tid,s.*,t.day,t.start,t.end from timetable t,session s where t.ses_id=s.ses_id and s.room is not null";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            mstTable.setModel(DbUtils.resultSetToTableModel(rs));

            conn.close();
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(mem4Time4Ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mem4Time4Ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mem4Time4Ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mem4Time4Ses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mem4Time4Ses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mstCancel;
    private javax.swing.JComboBox<String> mstDay;
    private javax.swing.JButton mstDelete;
    private javax.swing.JTextArea mstDetails;
    private javax.swing.JLabel mstLabel;
    private javax.swing.JButton mstSaveBtn;
    private javax.swing.JComboBox<String> mstSess;
    private javax.swing.JComboBox<String> mstStart;
    private javax.swing.JTable mstTable;
    private javax.swing.JLabel mstid;
    // End of variables declaration//GEN-END:variables
}
