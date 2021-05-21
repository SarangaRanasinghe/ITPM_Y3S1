/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.praveen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Praveen Pemasinghe
 */
public class addses extends javax.swing.JFrame {
    
    Connection conn = null;
 PreparedStatement Insertps = null;
    /**
     * Creates new form addses
     */
    public addses() {
        initComponents();
        insertLectureDropdown1();
        insertLectureDropdown2();
        insertTagDropdown();
        insertGroupDropdown();
        insertsubjectcodeDropdown();
        insertsubjectDropdown();
    }
    
    
        /////////////////////////get lecturer 1 ////////////////////////////
    public void insertLectureDropdown1(){

            try{
            conn = connection.getConnection();

            String sql = "select LectureName from add_lecturer";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("LectureName");
            selectlec1.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }

}
    
            /////////////////////////get lecturer 2 ////////////////////////////
    
    public void insertLectureDropdown2(){

            try{
            conn = connection.getConnection();

            String sql = "select LectureName from add_lecturer";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("LectureName");
            selectlec2.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }

}
    
              /////////////////////////get tag////////////////////////////
    
    public void insertTagDropdown(){

            try{
            conn = connection.getConnection();

            String sql = "select tag_name from tag";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("tag_name");
            selecttag.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }

}
    
    
                  /////////////////////////get tag////////////////////////////
    
    public void insertGroupDropdown(){

            try{
            conn = connection.getConnection();

            String sql = "select group_id from student";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("group_id");
            selectgroup.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }

}
    
                      /////////////////////////get tag////////////////////////////
    
    public void insertsubjectcodeDropdown(){

            try{
            conn = connection.getConnection();

            String sql = "select Subjectcode from add_subject";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("Subjectcode");
            selectcode.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }

}
    
                          /////////////////////////get tag////////////////////////////
    
    public void insertsubjectDropdown(){

            try{
            conn = connection.getConnection();

            String sql = "select Subjectname from add_subject";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("Subjectname");
            selectsubject.addItem(name);

            }
            conn.close();
            }

            catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sessionid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        selectlec1 = new javax.swing.JComboBox<>();
        selectlec2 = new javax.swing.JComboBox<>();
        seletedlecture = new javax.swing.JTextField();
        selectgroup = new javax.swing.JComboBox<>();
        selectcode = new javax.swing.JComboBox<>();
        numohstuden = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        selecttag = new javax.swing.JComboBox<>();
        sessionsavebtn = new javax.swing.JButton();
        clearsessionbtn = new javax.swing.JButton();
        selectsubject = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 943));

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));
        jPanel1.setForeground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Session");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Manage Session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sessionid.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sessionid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sessionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Step 01");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Select Lecture & Tag");

        jLabel4.setText("Select Lecture 1");

        jLabel5.setText("Select Lecture 2");

        jLabel6.setText("Select Lecture(s)");

        jLabel7.setText("Select Tag");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Step 02");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Select Group & Subject");

        jLabel10.setText("Select Group");

        jLabel11.setText("Select Subject Code");

        jLabel12.setText("Select Subject");

        jLabel13.setText("Numberr Of Student");

        jLabel14.setText("Duration");

        selectlec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selectlec2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        selectlec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectlec2ActionPerformed(evt);
            }
        });

        seletedlecture.setText(" ");
        seletedlecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletedlectureActionPerformed(evt);
            }
        });

        selectgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selectcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        numohstuden.setText(" ");

        duration.setText(" ");

        selecttag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        sessionsavebtn.setText("Submit");
        sessionsavebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionsavebtnActionPerformed(evt);
            }
        });

        clearsessionbtn.setText("Clear");
        clearsessionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearsessionbtnActionPerformed(evt);
            }
        });

        selectsubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        jLabel15.setText("Hr");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(115, 115, 115)
                                        .addComponent(selectgroup, 0, 94, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(73, 73, 73)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selectcode, 0, 0, Short.MAX_VALUE)
                                            .addComponent(selectsubject, 0, 0, Short.MAX_VALUE))))
                                .addGap(230, 230, 230)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numohstuden, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)))
                        .addGap(267, 267, 267))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(84, 84, 84)
                                        .addComponent(selectlec1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seletedlecture)
                                            .addComponent(selectlec2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(242, 242, 242)
                                .addComponent(jLabel7)
                                .addGap(47, 47, 47)
                                .addComponent(selecttag, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jLabel8)))
                .addGap(0, 588, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sessionsavebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(clearsessionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(selectlec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecttag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(selectlec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(seletedlecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(selectgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(selectcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(numohstuden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(selectsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionsavebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearsessionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectlec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectlec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectlec2ActionPerformed

    private void clearsessionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearsessionbtnActionPerformed
        // TODO add your handling code here:
        
        sessionid.setText("");
        selectlec1.getSelectedItem().toString();
        selectlec2.getSelectedItem().toString();
//        seletedlecture.setText("");
        selecttag.getSelectedItem().toString();
        selectgroup.getSelectedItem().toString();
        selectcode.getSelectedItem().toString();
        selectsubject.getSelectedItem().toString();
        numohstuden.setText("");
        duration.setText("");
        
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_clearsessionbtnActionPerformed

    private void sessionsavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionsavebtnActionPerformed
        // TODO add your handling code here:
        
        
        
//         String sessid = sessionid.getText();
         String selectlecture1 = selectlec1.getSelectedItem().toString();
         String selectlecture2 =selectlec2.getSelectedItem().toString();
//         String selectedlec = seletedlecture.getText();
         String seltag = selecttag.getSelectedItem().toString();
         String selgrup = selectgroup.getSelectedItem().toString();
         String selcode = selectcode.getSelectedItem().toString();
         String selsubject = selectsubject.getSelectedItem().toString();
         String numstuden = numohstuden.getText();
         String dura = duration.getText();
        
    

        if (!selectlecture1.isEmpty()) {

            if (!selectlecture2.isEmpty()) {

                if (!seltag.isEmpty()) {

                    if (!selgrup.isEmpty()) {

                        if (!selcode.isEmpty()) {

                            if (!selcode.isEmpty()) {
                                if (!selsubject.isEmpty()) {

                                    //tode
                                    int result;

//                                  
//                                   
                                    String sql = "insert into session" + "(lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration)"+ "VALUES (?,?,?,?,?,?,?, ?)" ;
                

                                    try {
                                        conn = connection.getConnection();
                                        Insertps = conn.prepareStatement(sql);
                                       
                                        
                                    } catch (SQLException ex) {
                                        Logger.getLogger(addses.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    try {
//                                        Insertps.setString(1, sessid);
                                        Insertps.setString(1, selectlecture1);
                                        Insertps.setString(2, selectlecture2);
                                        Insertps.setString(3, selcode);
                                        Insertps.setString(4, selsubject);
                                        Insertps.setString(5, selgrup);
                                        Insertps.setString(6, seltag);
                                        Insertps.setString(7, numstuden);
                                         Insertps.setString(8, dura);

                                        result = Insertps.executeUpdate();
                                        if (result == 1) {

                                            //masg
                                            JOptionPane.showMessageDialog(null, "Inserted Successfully !!", "success", JOptionPane.INFORMATION_MESSAGE);
                                        } else {

                                            //msg eorr
                                            JOptionPane.showMessageDialog(null, "Inserted Not Successfully !!", "error", JOptionPane.ERROR_MESSAGE);
                                        }
                                        
//                                         conn.close();

                                    } catch (SQLException ex) {
                                        Logger.getLogger(addses.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                } else {

                                    JOptionPane.showMessageDialog(null, " Please Enter ", "EMP ID", JOptionPane.ERROR_MESSAGE);

                                }
//                                JOptionPane.showMessageDialog(null, " 2Please Enter ", "lec", JOptionPane.ERROR_MESSAGE);

                            } else {

                                JOptionPane.showMessageDialog(null, " Please Enter ", "faclty", JOptionPane.ERROR_MESSAGE);

                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "Please Enter ", "Dipatrment", JOptionPane.ERROR_MESSAGE);

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter", "Center", JOptionPane.ERROR_MESSAGE);

                    }

                } else {
//                  msg
                    JOptionPane.showMessageDialog(null, " Please Enter", "build", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(null, " Please Enter", "level", JOptionPane.ERROR_MESSAGE);

            }

        } else {
//            JOptionPane.showMessageDialog(null, " plz insert rank ", "rank", JOptionPane.ERROR_MESSAGE);

        }
        
        
         
         seletedlecture.setText(selectlec1.getSelectedItem().toString()+"."+selectcode.getSelectedItem().toString()+"."+selectsubject.getSelectedItem().toString()+"."+selectgroup.getSelectedItem().toString()+"."+numohstuden.getText()+"."+duration.getText());

    }//GEN-LAST:event_sessionsavebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Managesessiondes().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void seletedlectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletedlectureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seletedlectureActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Managesessiondes().setVisible(true);
dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearsessionbtn;
    private javax.swing.JTextField duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numohstuden;
    private javax.swing.JComboBox<String> selectcode;
    private javax.swing.JComboBox<String> selectgroup;
    private javax.swing.JComboBox<String> selectlec1;
    private javax.swing.JComboBox<String> selectlec2;
    private javax.swing.JComboBox<String> selectsubject;
    private javax.swing.JComboBox<String> selecttag;
    private javax.swing.JTextField seletedlecture;
    private javax.swing.JTextField sessionid;
    private javax.swing.JButton sessionsavebtn;
    // End of variables declaration//GEN-END:variables
}
