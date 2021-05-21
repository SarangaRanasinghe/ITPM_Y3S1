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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Praveen Pemasinghe
 */
public class Managesessiondes extends javax.swing.JFrame {
    
    
    Connection conn = null;
    PreparedStatement Insertps = null;

    /**
     * Creates new form Managesessiondes
     */
    public Managesessiondes() {
        initComponents();
        ManagesessionName();
        
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

            String sql = "select subgroup_id from student";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
            String name = rs.getString("subgroup_id");
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
    
    
       public ArrayList<Managesession> managesessionList() {

        ArrayList<Managesession> managesessionList = new ArrayList<>();

        try {
           conn = connection.getConnection();
//            conn = DriverManager.getConnection(DB_URL, username, password);
            String query1 = "SELECT * FROM session ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Managesession managesession;

            while (rs.next()) {

                managesession = new Managesession(rs.getInt("ses_id"), rs.getString("lecturer"), rs.getString("lecturer_2"), rs.getString("subject_code"), rs.getString("subject_name"), rs.getString("group_id"), rs.getString("tag"), rs.getString("no_of_students"), rs.getString("duration"));
                managesessionList.add(managesession);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Managesessiondes.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return managesessionList;
    }

    public void ManagesessionName() {

        ArrayList<Managesession> list = managesessionList();
        DefaultTableModel model = (DefaultTableModel) managesessiontable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[9];
        
        for (int i = 0; i < list.size(); i++) {
            row[0] = i + 1;
//            row[1] = list.get(i).getSes_id();
            row[1] = list.get(i).getLecturer();
            row[2] = list.get(i).getLecturer_2();
            row[3] = list.get(i).getSubject_code();
            row[4] = list.get(i).getSubject_name();
            row[5] = list.get(i).getGroup_id();
            row[6] = list.get(i).getTag();
            row[7] = list.get(i).getNo_of_students();
            row[8] = list.get(i).getDuration();
            
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sessionid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        managesessiontable = new javax.swing.JTable();
        managesessionupdatebutton = new javax.swing.JButton();
        managesessiondeletebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selectlec1 = new javax.swing.JComboBox<>();
        selectlec2 = new javax.swing.JComboBox<>();
        selectgroup = new javax.swing.JComboBox<>();
        selectcode = new javax.swing.JComboBox<>();
        selecttag = new javax.swing.JComboBox<>();
        numohstuden = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        selectsubject = new javax.swing.JComboBox<>();
        mangesesaddbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 970));

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Session");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Home");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Add Session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sessionid.setText(" ");
        sessionid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        managesessiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Lecture 1", "Lecture 2", "Subject Code", "Subject name", "Group Id", "Tag", "NumberOfStudent", "Duration"
            }
        ));
        managesessiontable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managesessiontableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(managesessiontable);

        managesessionupdatebutton.setText("Update");
        managesessionupdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managesessionupdatebuttonActionPerformed(evt);
            }
        });

        managesessiondeletebutton.setBackground(new java.awt.Color(255, 0, 0));
        managesessiondeletebutton.setForeground(new java.awt.Color(25, 0, 0));
        managesessiondeletebutton.setText("Delete");
        managesessiondeletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managesessiondeletebuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search");

        jTextField1.setText(" ");

        jLabel3.setText("Select Lecture 1");

        jLabel4.setText("Select Lecture 2");

        jLabel5.setText("Select Tag");

        jLabel6.setText("Select Group");

        jLabel7.setText("Select Subjec Code");

        jLabel8.setText("Select Subject");

        jLabel9.setText("Number Of Student");

        jLabel10.setText("Duration");

        selectlec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selectlec2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selectgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selectcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        selecttag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        numohstuden.setText(" ");

        duration.setText(" ");
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });

        selectsubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        mangesesaddbtn.setBackground(new java.awt.Color(0, 100, 0));
        mangesesaddbtn.setText("Add");
        mangesesaddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangesesaddbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectgroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectlec1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectlec2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectsubject, 0, 124, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(duration)
                    .addComponent(numohstuden)
                    .addComponent(selecttag, 0, 163, Short.MAX_VALUE))
                .addGap(427, 427, 427))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(725, 725, 725)
                        .addComponent(mangesesaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(managesessionupdatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(managesessiondeletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(selectlec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(numohstuden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectlec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(selecttag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(selectcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(selectsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managesessionupdatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managesessiondeletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mangesesaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managesessiondeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managesessiondeletebuttonActionPerformed
        // TODO add your handling code here:
              try {
            int selectedRow = managesessiontable.getSelectedRow();
            if (selectedRow != 1) {
                String sql = "delete from session where ses_id='" + sessionid.getText()+ "'";
               
                int result = conn.prepareStatement(sql).executeUpdate();
                if (result == 1) {
                    //masg
                    JOptionPane.showMessageDialog(null, "Delete Successfully !!", "success", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    //msg eorr
                    JOptionPane.showMessageDialog(null, "Inserted Not Successfully !!", "error", JOptionPane.ERROR_MESSAGE);
                }
                ManagesessionName();
            }else{
                JOptionPane.showMessageDialog(null, "Select a row !!", "error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_managesessiondeletebuttonActionPerformed

    private void sessionidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionidActionPerformed

    
    
     
        
        
    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void mangesesaddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangesesaddbtnActionPerformed
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

                                    JOptionPane.showMessageDialog(null, " Please Enter ", "selectlecture1 ", JOptionPane.ERROR_MESSAGE);

                                }
//                                JOptionPane.showMessageDialog(null, " Please Enter", "selectlecture2", JOptionPane.ERROR_MESSAGE);

                            } else {

                                JOptionPane.showMessageDialog(null, " Please Enter ", "selcode", JOptionPane.ERROR_MESSAGE);

                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "Please Enter ", "selsubject", JOptionPane.ERROR_MESSAGE);

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter ", "selgrup", JOptionPane.ERROR_MESSAGE);

                    }

                } else {
//                  msg
                    JOptionPane.showMessageDialog(null, " Please Enter", "seltag", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(null, " Please Enter ", "numstuden", JOptionPane.ERROR_MESSAGE);

            }

        } 
        
        
         
        

    }//GEN-LAST:event_mangesesaddbtnActionPerformed

    private void managesessiontableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managesessiontableMouseClicked
        // TODO add your handling code here:
        
              try {
            DefaultTableModel dtm = (DefaultTableModel) managesessiontable.getModel();
            int selectedRow = managesessiontable.getSelectedRow();
            selectlec1.setSelectedItem(dtm.getValueAt(selectedRow, 1).toString());
            selectlec2.setSelectedItem(dtm.getValueAt(selectedRow, 2).toString());
            selectcode.setSelectedItem(dtm.getValueAt(selectedRow, 3).toString());
            selectsubject.setSelectedItem(dtm.getValueAt(selectedRow, 4).toString());
            selectgroup.setSelectedItem(dtm.getValueAt(selectedRow, 5).toString());
            selecttag.setSelectedItem(dtm.getValueAt(selectedRow, 6).toString());
            numohstuden.setText(dtm.getValueAt(selectedRow, 7).toString());
            duration.setText(dtm.getValueAt(selectedRow, 8).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_managesessiontableMouseClicked

    private void managesessionupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managesessionupdatebuttonActionPerformed
        // TODO add your handling code here:
        
              try {
            int selectedRow = managesessiontable.getSelectedRow();
            if (selectedRow != 1) {
                 String sql = "update session set  subject_name = ?,subject_code = ?,lecturer = ?,lecturer_2 = ?,group_id = ?,tag = ?,no_of_students = ?,duration = ? where ses_id = ?";
                int result = conn.prepareStatement(sql).executeUpdate();
                
               
                
                
                if (result == 1) {
                    //masg
                    JOptionPane.showMessageDialog(null, "Updated Successfully !!", "success", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    //msg eorr
                    JOptionPane.showMessageDialog(null, "Inserted Not Successfully !!", "error", JOptionPane.ERROR_MESSAGE);
                }
                ManagesessionName();
            }else{
                JOptionPane.showMessageDialog(null, "Select a row !!", "error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_managesessionupdatebuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new addses().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Managesessiondes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managesessiondes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managesessiondes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managesessiondes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managesessiondes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton managesessiondeletebutton;
    private javax.swing.JTable managesessiontable;
    private javax.swing.JButton managesessionupdatebutton;
    private javax.swing.JButton mangesesaddbtn;
    private javax.swing.JTextField numohstuden;
    private javax.swing.JComboBox<String> selectcode;
    private javax.swing.JComboBox<String> selectgroup;
    private javax.swing.JComboBox<String> selectlec1;
    private javax.swing.JComboBox<String> selectlec2;
    private javax.swing.JComboBox<String> selectsubject;
    private javax.swing.JComboBox<String> selecttag;
    private javax.swing.JTextField sessionid;
    // End of variables declaration//GEN-END:variables
}
