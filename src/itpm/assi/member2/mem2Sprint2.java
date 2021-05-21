/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member2;

import itpm.assi.common.homePg;
import itpm.assi.util.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Msi 9RDS
 */
public class mem2Sprint2 extends javax.swing.JFrame {
       Connection conn = null;
    /**
     * Creates new form sprint2NewView
     */
    public mem2Sprint2() {
        initComponents();
        insertTagDropdown();
        insertGroupIDDropdown();
        insertSubNameDropdown();
        insertLectureName1Dropdown();
        insertLectureName2Dropdown();
        insertSubCodeDropdown();
        
        resetFormmsr();
        DisplayTablemsr();
    }

  
    
    
     public void insertTagDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select tag_name from tag ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("tag_name");
        msrTag.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    
     public void insertGroupIDDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select subgroup_id from student ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("subgroup_id");
        msrGroupID.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
     
     
      public void insertLectureName1Dropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select LectureName from add_lecturer ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("LectureName");
        msrLectureName1.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
      
      
       public void insertLectureName2Dropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select LectureName from add_lecturer ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("LectureName");
        msrLectureName2.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
     
       
        public void insertSubCodeDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select Subjectcode from add_subject ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("Subjectcode");
        msrStudentCode.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    } 
        
     public void insertSubNameDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select Subjectname from add_subject ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("Subjectname");
        msrStudentName.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        msrLectureName2 = new javax.swing.JComboBox<>();
        msrStudentName = new javax.swing.JComboBox<>();
        msrStudentCode = new javax.swing.JComboBox<>();
        msrLectureName1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        msrGroupID = new javax.swing.JComboBox<>();
        msrTag = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        msrSaveBtn = new javax.swing.JButton();
        deletemsr = new javax.swing.JButton();
        cancelmsr = new javax.swing.JButton();
        idLabelmsr = new javax.swing.JLabel();
        idmsr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        noOfStudent = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        msrTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Session");

        jLabel2.setText("Subject Name");

        jLabel3.setText("Subject Code");

        jLabel4.setText("Lecture Name 1");

        jLabel5.setText("Lecture Name 2");

        msrLectureName2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrLectureName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrLectureName2ActionPerformed(evt);
            }
        });

        msrStudentName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrStudentNameActionPerformed(evt);
            }
        });

        msrStudentCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrStudentCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrStudentCodeActionPerformed(evt);
            }
        });

        msrLectureName1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrLectureName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrLectureName1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Group ID");

        msrGroupID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" "  }));
        msrGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrGroupIDActionPerformed(evt);
            }
        });

        msrTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrTagActionPerformed(evt);
            }
        });

        jLabel7.setText("Tag");

        msrSaveBtn.setText("Save Record");
        msrSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrSaveBtnActionPerformed(evt);
            }
        });

        deletemsr.setText("Delete Record");
        deletemsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemsrActionPerformed(evt);
            }
        });

        cancelmsr.setText("Cancel");
        cancelmsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelmsrActionPerformed(evt);
            }
        });

        idLabelmsr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabelmsr.setText("Selected ID");

        idmsr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idmsr.setEnabled(false);

        jLabel8.setText("Students");

        jLabel9.setText("Duration");

        noOfStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfStudentActionPerformed(evt);
            }
        });

        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        msrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Subject Name", "Subject Code", "Lecture 1", "Lecture 2", "Group ID", "Tag"
            }
        ));
        msrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(msrTable);

        jButton1.setBackground(new java.awt.Color(106, 116, 145));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(idLabelmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(idmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(msrStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(msrGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(msrStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msrLectureName1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msrLectureName2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(msrTag, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 340, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deletemsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(msrSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelmsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabelmsr))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msrSaveBtn)
                            .addComponent(msrGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletemsr)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(msrTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(msrLectureName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(msrStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cancelmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(msrStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(msrLectureName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msrLectureName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrLectureName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrLectureName2ActionPerformed

    private void msrStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrStudentNameActionPerformed

    private void msrStudentCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrStudentCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrStudentCodeActionPerformed

    private void msrLectureName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrLectureName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrLectureName1ActionPerformed

    private void msrGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrGroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrGroupIDActionPerformed

    private void msrTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrTagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrTagActionPerformed

    private void msrSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrSaveBtnActionPerformed
              
         try{
            if(msrSaveBtn.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into session" + "(subject_name,subject_code,lecturer,lecturer_2,group_id,tag,no_of_students,duration)"+ "VALUES (?,?,?,?,?,?,?, ?)" ;
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1,msrStudentName.getSelectedItem().toString());
                pstmt.setString(2,msrStudentCode.getSelectedItem().toString());
                pstmt.setString(3,msrLectureName1.getSelectedItem().toString());
                pstmt.setString(4,msrLectureName2.getSelectedItem().toString());
                pstmt.setString(5,msrGroupID.getSelectedItem().toString());
                pstmt.setString(6,msrTag.getSelectedItem().toString());
                pstmt.setString(7, noOfStudent.getText());
                pstmt.setString(8, duration.getText());
               

                // pstmt.setString(3,jComboBox1);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added Successfully !!");

                DisplayTablemsr();
                conn.close();

            } else {
                //update
                 conn = connection.getConnection();

                String sql = "update session set  subject_name = ?,subject_code = ?,lecturer = ?,lecturer_2 = ?,group_id = ?,tag = ?,no_of_students = ?,duration = ? where ses_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, msrStudentName.getSelectedItem().toString());
                pstmt.setString(2, msrStudentCode.getSelectedItem().toString());
                pstmt.setString(3, msrLectureName1.getSelectedItem().toString());
                pstmt.setString(4, msrLectureName2.getSelectedItem().toString());
                pstmt.setString(5, msrGroupID.getSelectedItem().toString());
                pstmt.setString(6, msrTag.getSelectedItem().toString());
                pstmt.setString(7, noOfStudent.getText());
                pstmt.setString(8, duration.getText());
              
                pstmt.setString(9, idmsr.getText());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");

                DisplayTablemsr();
                conn.close();

                //hide buttons
                resetFormmsr();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_msrSaveBtnActionPerformed

    private void cancelmsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelmsrActionPerformed
        resetFormmsr();
    }//GEN-LAST:event_cancelmsrActionPerformed

    private void deletemsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemsrActionPerformed
       // delete
        try {

            conn = connection.getConnection();

            String sql = "delete from session where ses_id = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(idmsr.getText()));

            int result = pstmt.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(null, "Record Deleted Successfully!!!");
                resetFormmsr();
                DisplayTablemsr();
            } else {
                JOptionPane.showMessageDialog(null, "Record Could Not Be Found");
            }

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    
    }//GEN-LAST:event_deletemsrActionPerformed

    private void msrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msrTableMouseClicked
         // show buttons
        cancelmsr.setVisible(true);
        deletemsr.setVisible(true);
        msrSaveBtn.setText("Update");
        idLabelmsr.setVisible(true);
        idmsr.setVisible(true);

        idmsr.setText(msrTable.getValueAt(msrTable.getSelectedRow(), 0).toString());

        msrStudentName.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 1).toString());
        msrStudentCode.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 2).toString());
        msrLectureName1.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 3).toString());
        msrLectureName2.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 4).toString());
        msrGroupID.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 5).toString());
        msrTag.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 6).toString());
      

    
    }//GEN-LAST:event_msrTableMouseClicked

    private void noOfStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfStudentActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new homePg().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void DisplayTablemsr() {
        try {

            conn = connection.getConnection();

            String sql = "select * from session";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            msrTable.setModel(DbUtils.resultSetToTableModel(rs));
            msrTable.removeColumn(msrTable.getColumn("room"));

            conn.close();
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
       private void resetFormmsr(){
        cancelmsr.setVisible(false);
        deletemsr.setVisible(false);
        msrSaveBtn.setText("Add");
        idLabelmsr.setVisible(false);
        idmsr.setVisible(false);
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
            java.util.logging.Logger.getLogger(mem2Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mem2Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mem2Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mem2Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mem2Sprint2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelmsr;
    private javax.swing.JButton deletemsr;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel idLabelmsr;
    private javax.swing.JLabel idmsr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> msrGroupID;
    private javax.swing.JComboBox<String> msrLectureName1;
    private javax.swing.JComboBox<String> msrLectureName2;
    private javax.swing.JButton msrSaveBtn;
    private javax.swing.JComboBox<String> msrStudentCode;
    private javax.swing.JComboBox<String> msrStudentName;
    private javax.swing.JTable msrTable;
    private javax.swing.JComboBox<String> msrTag;
    private javax.swing.JTextField noOfStudent;
    // End of variables declaration//GEN-END:variables
}
