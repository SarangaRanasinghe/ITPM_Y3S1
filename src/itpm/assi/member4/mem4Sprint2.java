/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member4;

import itpm.assi.util.connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class mem4Sprint2 extends javax.swing.JFrame {
       Connection conn = null;
       List<Session> sessions = new ArrayList<Session>();

    /**
     * Creates new form sprint2NewView
     */
    public mem4Sprint2() {
        initComponents();
        insertRoomDropdown();
        insertSessionIDDropdown();
        
        resetFormmsr();
        DisplayTablemsr();
        resetFormnat();
        DisplayNotAvailable();
        
//        sessionID.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                 JOptionPane.showMessageDialog(null, "selected");
//            }
//        });
    }

    public void insertRoomDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select roomName from addlocation ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("roomName");
        msrRoom.addItem(name);
        natRoom.addItem(name);
       
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }    
    }
    
     
     public void insertSessionIDDropdown(){
    
        try{
        
        sessions.clear();
        if(sessionID.getItemCount() > 0){
            sessionID.removeAllItems();
        }
            
        conn = connection.getConnection();
        
        String sql = "select * from session where room is null";
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
    
             
            sessionID.addItem(String.valueOf(ses_id));
       
        }
        
        
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        if(sessionID.getItemCount() > 0 ) {
            sessionID.setSelectedIndex(0);
        }
    }    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        sessionID = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        msrRoom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        msrTable = new javax.swing.JTable();
        idmsr = new javax.swing.JLabel();
        msrSaveBtn = new javax.swing.JButton();
        deletemsr = new javax.swing.JButton();
        cancelmsr = new javax.swing.JButton();
        idLabelmsr = new javax.swing.JLabel();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        natDay = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        natStart = new javax.swing.JComboBox<>();
        natRoom = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        natEnd = new javax.swing.JComboBox<>();
        saveNat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        natTable = new javax.swing.JTable();
        idLabelnat = new javax.swing.JLabel();
        idnat = new javax.swing.JLabel();
        natDelete = new javax.swing.JButton();
        natCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Session Rooms");

        jInternalFrame2.setVisible(true);

        jLabel2.setText("Session ID");

        sessionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        sessionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionIDActionPerformed(evt);
            }
        });

        jLabel8.setText("Room");

        msrRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        msrRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msrRoomActionPerformed(evt);
            }
        });

        jLabel9.setText("Selected Session");

        details.setBackground(new java.awt.Color(204, 204, 204));
        details.setColumns(20);
        details.setRows(5);
        jScrollPane2.setViewportView(details);

        msrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Subject Name", "Subject Code", "Lecture 1", "Lecture 2", "Group ID", "Tag", "Room"
            }
        ));
        msrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msrTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(msrTable);

        idmsr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idmsr.setEnabled(false);

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

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(sessionID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(msrRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deletemsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(msrSaveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelmsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(idLabelmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(idmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sessionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(msrRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(cancelmsr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(idLabelmsr)
                        .addGap(40, 40, 40)
                        .addComponent(msrSaveBtn)
                        .addGap(42, 42, 42)
                        .addComponent(deletemsr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jTabbedPane2.addTab("Sessions", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        jLabel3.setText("No Consecutive Sessions.");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(985, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(585, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consecutive", jInternalFrame3);

        jInternalFrame4.setVisible(true);

        natDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday" }));

        jLabel4.setText("Day");

        jLabel5.setText("Start Time");

        natStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:30", "9:30", "10:30", "11:30","12:30","13:30","14:30","15:30","16:30" }));

        natRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jLabel6.setText("Room");

        jLabel7.setText("End Time");

        natEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:30", "10:30", "11:30","12:30","13:30","14:30","15:30","16:30","17:30" }));

        saveNat.setText("SAVE");
        saveNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNatActionPerformed(evt);
            }
        });

        natTable.setModel(new javax.swing.table.DefaultTableModel(
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
        natTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                natTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(natTable);

        idLabelnat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabelnat.setText("Selected ID");

        idnat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idnat.setEnabled(false);

        natDelete.setText("Delete");
        natDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natDeleteActionPerformed(evt);
            }
        });

        natCancel.setText("Cancel");
        natCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(natCancel)
                        .addGap(121, 121, 121)
                        .addComponent(saveNat)
                        .addGap(82, 82, 82)
                        .addComponent(natDelete))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(63, 63, 63)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(natDay, 0, 93, Short.MAX_VALUE)
                            .addComponent(natRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(152, 152, 152)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(77, 77, 77)))
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(natEnd, 0, 123, Short.MAX_VALUE)
                            .addComponent(natStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idLabelnat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(idnat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabelnat))
                .addGap(11, 11, 11)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(natDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(natStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(natRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(natEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(64, 64, 64)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNat)
                    .addComponent(natDelete)
                    .addComponent(natCancel))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Not Available Times", jInternalFrame4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sessionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionIDActionPerformed
        String ses_id = sessionID.getSelectedItem()==null? "-1":sessionID.getSelectedItem().toString();
        
        if(ses_id.equalsIgnoreCase("-1") || ses_id != null) {
            int int_ses_id = Integer.parseInt(ses_id);
        
            for (Session ses : sessions) 
            { 
                int list_ses_id = ses.getSes_id();
                if(int_ses_id == list_ses_id) {
                    details.setText(""
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
    }//GEN-LAST:event_sessionIDActionPerformed
    
    private void msrRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msrRoomActionPerformed

    private void msrSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msrSaveBtnActionPerformed
              
         try{
            if(msrSaveBtn.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "update session set room = ? where ses_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(2, sessionID.getSelectedItem().toString());
                pstmt.setString(1, msrRoom.getSelectedItem().toString());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added Successfully !!");

                DisplayTablemsr();
                insertSessionIDDropdown();
                
                conn.close();

            } else {
                //update
                 conn = connection.getConnection();

                String sql = "update session set room = ? where ses_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, msrRoom.getSelectedItem().toString());
                 pstmt.setString(2, idmsr.getText());
               

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

            String sql = "update session set room = null where ses_id = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(idmsr.getText()));

            int result = pstmt.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(null, "Room Removed from session!!!");
                resetFormmsr();
                DisplayTablemsr();
            } else {
                JOptionPane.showMessageDialog(null, "Room cannot be Removed from session");
            }

            conn.close();
            insertSessionIDDropdown();

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
        sessionID.setEnabled(false);

        int selected_id = Integer.parseInt(msrTable.getValueAt(msrTable.getSelectedRow(), 0).toString());
        
        idmsr.setText(String.valueOf(selected_id));

        sessionID.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 0).toString());
        msrRoom.setSelectedItem(msrTable.getValueAt(msrTable.getSelectedRow(), 9).toString());
        
         details.setText(""
                            + "Lecturer 1: " + msrTable.getValueAt(msrTable.getSelectedRow(), 1).toString()
                            + "\nLecturer_2: " + msrTable.getValueAt(msrTable.getSelectedRow(),2).toString()
                            + "\nSubject Code: " + msrTable.getValueAt(msrTable.getSelectedRow(), 3).toString()
                            + "\nSubject Name: " + msrTable.getValueAt(msrTable.getSelectedRow(), 4).toString()
                            + "\nGroup ID: " + msrTable.getValueAt(msrTable.getSelectedRow(), 5).toString()
                            + "\nTag: " + msrTable.getValueAt(msrTable.getSelectedRow(), 6).toString()
                            + "\nNo_of_students: " + msrTable.getValueAt(msrTable.getSelectedRow(), 7).toString()
                            + "\nDuration: "+msrTable.getValueAt(msrTable.getSelectedRow(), 8).toString());

    
    }//GEN-LAST:event_msrTableMouseClicked

    private void saveNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNatActionPerformed
         try{
            if(saveNat.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into notAvailable" + "(room,day,start,end)"+ "VALUES (?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, natRoom.getSelectedItem().toString());
                pstmt.setString(2, natDay.getSelectedItem().toString());
                pstmt.setString(3, natStart.getSelectedItem().toString());
                pstmt.setString(4, natEnd.getSelectedItem().toString());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added Successfully !!");

                DisplayNotAvailable();
               
                
                conn.close();

            } else {
                //update
                 conn = connection.getConnection();
                 
                 String sql = "update notAvailable set room = ?,day =?, start = ?,end = ? where id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, natRoom.getSelectedItem().toString());
                pstmt.setString(2, natDay.getSelectedItem().toString());
                pstmt.setString(3, natStart.getSelectedItem().toString());
                pstmt.setString(4, natEnd.getSelectedItem().toString());
                 pstmt.setString(5, idnat.getText());

               

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");

                DisplayNotAvailable();
                conn.close();

                //hide buttons
                resetFormnat();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveNatActionPerformed

    private void natCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natCancelActionPerformed

         resetFormnat();
    }//GEN-LAST:event_natCancelActionPerformed

    private void natDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natDeleteActionPerformed
        try {

            conn = connection.getConnection();
            
            String sql = "delete from notAvailable where id = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(idnat.getText()));

            int result = pstmt.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(null, "Record Removed !!!");
                resetFormnat();
                DisplayNotAvailable();
            } else {
                JOptionPane.showMessageDialog(null, "Record cannot be Removed");
            }

            conn.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_natDeleteActionPerformed

    private void natTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_natTableMouseClicked
        
         natCancel.setVisible(true);
        natDelete.setVisible(true);
        saveNat.setText("Update");
        idLabelnat.setVisible(true);
        idnat.setVisible(true);
        

        idnat.setText(natTable.getValueAt(natTable.getSelectedRow(), 0).toString());
        natDay.setSelectedItem(natTable.getValueAt(natTable.getSelectedRow(), 2).toString());
        natRoom.setSelectedItem(natTable.getValueAt(natTable.getSelectedRow(), 1).toString());
        natStart.setSelectedItem(natTable.getValueAt(natTable.getSelectedRow(), 3).toString());
        natEnd.setSelectedItem(natTable.getValueAt(natTable.getSelectedRow(), 4).toString());
        
        
        
    }//GEN-LAST:event_natTableMouseClicked

    
    private void DisplayTablemsr() {
        try {

            conn = connection.getConnection();

            String sql = "select * from session where room is not null";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            msrTable.setModel(DbUtils.resultSetToTableModel(rs));

            conn.close();
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void DisplayNotAvailable() {
        try {

            conn = connection.getConnection();

            String sql = "select * from notAvailable";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            natTable.setModel(DbUtils.resultSetToTableModel(rs));

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
        sessionID.setEnabled(true);
        sessionID.setSelectedIndex(0);
        }

       
       private void resetFormnat(){
        natCancel.setVisible(false);
        natDelete.setVisible(false);
        saveNat.setText("Add");
        idLabelnat.setVisible(false);
        idnat.setVisible(false);
     
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
            java.util.logging.Logger.getLogger(mem4Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mem4Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mem4Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mem4Sprint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mem4Sprint2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelmsr;
    private javax.swing.JButton deletemsr;
    private javax.swing.JTextArea details;
    private javax.swing.JLabel idLabelmsr;
    private javax.swing.JLabel idLabelnat;
    private javax.swing.JLabel idmsr;
    private javax.swing.JLabel idnat;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> msrRoom;
    private javax.swing.JButton msrSaveBtn;
    private javax.swing.JTable msrTable;
    private javax.swing.JButton natCancel;
    private javax.swing.JComboBox<String> natDay;
    private javax.swing.JButton natDelete;
    private javax.swing.JComboBox<String> natEnd;
    private javax.swing.JComboBox<String> natRoom;
    private javax.swing.JComboBox<String> natStart;
    private javax.swing.JTable natTable;
    private javax.swing.JButton saveNat;
    private javax.swing.JComboBox<String> sessionID;
    // End of variables declaration//GEN-END:variables
}
