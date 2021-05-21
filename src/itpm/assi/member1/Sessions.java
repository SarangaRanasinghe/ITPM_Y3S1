/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.member1;
import itpm.assi.util.connection;
import itpm.assi.common.homePg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vinuka Wathsara
 */
public class Sessions extends javax.swing.JFrame {
    Connection conn = null;

    /**
     * Creates new form Sessions
     */
    public Sessions() {
        initComponents();
        setsessionTableData();
        setsessionTable2Data();
        setsessionTable3Data();
        setsessionTable4Data();
        setsessionTable5Data();
        setsessionTable6Data();
        
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
    }
    
    //consecutive session table retrieve
        public void setsessionTableData(){
           try{  
          conn = connection.getConnection();
                String select = "select * from session";
                PreparedStatement pst = conn.prepareStatement(select);

                DefaultTableModel model = (DefaultTableModel) sessionOne.getModel();
                model.setRowCount(0);

               

                ResultSet rs = pst.executeQuery();
                while (rs.next()) {

                    //Data will be added until finish
                    String se_id = String.valueOf(rs.getInt("ses_id"));
                     String lec1 = rs.getString("lecturer");
                    String lec2 = rs.getString("lecturer_2");
                    String scode = rs.getString("subject_code");
                    String ssubject = rs.getString("subject_name");
                    String sgroup = rs.getString("group_id");
                    String tag = rs.getString("tag");
                    String nostu = rs.getString("no_of_students");
                    String dura = rs.getString("duration");
                    
                    
               

                    //string array for store data into jtable
                    String tbData[] = {null, se_id, lec1, lec2,scode,ssubject,sgroup,tag,nostu,dura};
                    DefaultTableModel tblModel = (DefaultTableModel) sessionOne.getModel();

                    tblModel.addRow(tbData);
                    
                    

                }
                conn.close();
           }catch(SQLException e){
           
               System.out.println(e);
           }
            
    }
        
        
        //parallel session table retrieve
               public void setsessionTable3Data(){
           try{  
          conn = connection.getConnection();
                String select = "select * from session";
                PreparedStatement pst = conn.prepareStatement(select);

                DefaultTableModel model = (DefaultTableModel) sessionThree.getModel();
                model.setRowCount(0);

               

                ResultSet rs = pst.executeQuery();
                while (rs.next()) {

                    //Data will be added until finish
                    String se_id = String.valueOf(rs.getInt("ses_id"));
                     String lec1 = rs.getString("lecturer");
                    String lec2 = rs.getString("lecturer_2");
                    String scode = rs.getString("subject_code");
                    String ssubject = rs.getString("subject_name");
                    String sgroup = rs.getString("group_id");
                    String tag = rs.getString("tag");
                    String nostu = rs.getString("no_of_students");
                    String dura = rs.getString("duration");
                    
                    
               

                    //string array for store data into jtable
                    String tbData[] = {null, se_id, lec1, lec2,scode,ssubject,sgroup,tag,nostu,dura};
                    DefaultTableModel tblModel = (DefaultTableModel) sessionThree.getModel();

                    tblModel.addRow(tbData);
                    
                    

                }
                conn.close();
           }catch(SQLException e){
           
               System.out.println(e);
           }
            
    }
               
        //non overlapping session table retrieve
                public void setsessionTable5Data(){
           try{  
          conn = connection.getConnection();
                String select = "select * from session";
                PreparedStatement pst = conn.prepareStatement(select);

                DefaultTableModel model = (DefaultTableModel) sessionFive.getModel();
                model.setRowCount(0);

               

                ResultSet rs = pst.executeQuery();
                while (rs.next()) {

                    //Data will be added until finish
                    String se_id = String.valueOf(rs.getInt("ses_id"));
                     String lec1 = rs.getString("lecturer");
                    String lec2 = rs.getString("lecturer_2");
                    String scode = rs.getString("subject_code");
                    String ssubject = rs.getString("subject_name");
                    String sgroup = rs.getString("group_id");
                    String tag = rs.getString("tag");
                    String nostu = rs.getString("no_of_students");
                    String dura = rs.getString("duration");
                    
                    
               

                    //string array for store data into jtable
                    String tbData[] = {null, se_id, lec1, lec2,scode,ssubject,sgroup,tag,nostu,dura};
                    DefaultTableModel tblModel = (DefaultTableModel) sessionFive.getModel();

                    tblModel.addRow(tbData);
                    
                    

                }
                conn.close();
           }catch(SQLException e){
           
               System.out.println(e);
           }
            
    }      
        
               
               
        //consecutive table retrieve
      private void setsessionTable2Data()
      {
           
        try{
            conn = connection.getConnection();
            

            String sql = "select * from consecutive";
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();

       
            sessionTwo.setModel(DbUtils.resultSetToTableModel(rs));
            
     
        conn.close();
        
    }catch(Exception e){
       
        JOptionPane.showMessageDialog(null, e);
    }
 
}  
      
      //parallel table retrieve
            private void setsessionTable4Data()
      {
           
        try{
            conn = connection.getConnection();
            

            String sql = "select * from parallel";
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();

       
            sessionFour.setModel(DbUtils.resultSetToTableModel(rs));
            
     
        conn.close();
        
    }catch(Exception e){
       
        JOptionPane.showMessageDialog(null, e);
    }
 
}  
            
            
      //non overlapping table retrieve
      private void setsessionTable6Data()
      {
           
        try{
            conn = connection.getConnection();
            

            String sql = "select * from nonoverlapping";
            PreparedStatement smt = conn.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();

       
            sessionSix.setModel(DbUtils.resultSetToTableModel(rs));
            
     
        conn.close();
        
    }catch(Exception e){
       
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        sessionOne = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        sessionTwo = new javax.swing.JTable();
        AddConsecutive = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        sessionThree = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        sessionFour = new javax.swing.JTable();
        AddParallel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        sessionFive = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        sessionSix = new javax.swing.JTable();
        AddNonOverLap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        sessionOne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Select", "ID", "Lecture One", "Lecture Two", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sessionOne.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sessionOneAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(sessionOne);

        sessionTwo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CID", "ID", "Lecturer One", "Lecturer Two", "Subject Code", "Subject name", "Group ID", "Tag", "No Of Students", "Duration"
            }
        ));
        sessionTwo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sessionTwoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(sessionTwo);

        AddConsecutive.setBackground(new java.awt.Color(106, 116, 145));
        AddConsecutive.setForeground(new java.awt.Color(255, 255, 255));
        AddConsecutive.setText("ADD CONSECUTIVE SESSION");
        AddConsecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddConsecutiveActionPerformed(evt);
            }
        });

        jLabel2.setText("Loading..........");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(301, 301, 301))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(AddConsecutive)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(AddConsecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consecutive", jInternalFrame1);

        jInternalFrame2.setVisible(true);

        sessionThree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Select", "ID", "Lecturer One", "Lecturer Two", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sessionThree);

        sessionFour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PID", "ID", "Lecturer One", "Lecturer Two", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Lecturer Two"
            }
        ));
        jScrollPane2.setViewportView(sessionFour);

        AddParallel.setBackground(new java.awt.Color(106, 116, 145));
        AddParallel.setForeground(new java.awt.Color(255, 255, 255));
        AddParallel.setText("ADD PARALLEL SESSION");
        AddParallel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddParallelActionPerformed(evt);
            }
        });

        jLabel1.setText("Loading......");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(AddParallel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(AddParallel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Parallel", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        sessionFive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Select", "ID", "Lecturer One", "Lecturer Two", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(sessionFive);

        sessionSix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOID", "ID", "Lecturer One", "Lecturer Two", "Subject Code", "Subject Name", "Group ID", "Tag", "No Of Students", "Duration"
            }
        ));
        jScrollPane5.setViewportView(sessionSix);

        AddNonOverLap.setBackground(new java.awt.Color(106, 116, 145));
        AddNonOverLap.setForeground(new java.awt.Color(255, 255, 255));
        AddNonOverLap.setText("ADD NON-OVERLAPPING SESSION");
        AddNonOverLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNonOverLapActionPerformed(evt);
            }
        });

        jLabel3.setText("Loading......");

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(AddNonOverLap)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(AddNonOverLap, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Non Overlapping", jInternalFrame3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 18, 50));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Session Allocations");

        jButton1.setBackground(new java.awt.Color(106, 116, 145));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(371, 371, 371)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(8, 8, 8))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void sessionOneAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sessionOneAncestorAdded
        // TODO add your handling code here:
         //setsessionTableData();
    }//GEN-LAST:event_sessionOneAncestorAdded

    private void AddConsecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddConsecutiveActionPerformed
        DefaultTableModel model = (DefaultTableModel) sessionOne.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean checked=(Boolean) model.getValueAt(i, 0);
            //System.out.println(i+"th row: is selected? "+checked);
            
            try {
                if (checked!=null && checked == true) {
                    try {
              conn = connection.getConnection();

                        String value = model.getValueAt(i, 1).toString();

                        String update = "INSERT INTO consecutive(ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration) SELECT ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration FROM session  where ses_id=" + value;
                        
                        
                        PreparedStatement smt = conn.prepareStatement(update);

                        
                        smt.execute();
                        
                        setsessionTable2Data();

            conn.close();

                    } catch (SQLException e) {
    

                                JOptionPane.showMessageDialog(this, e);
                   
                    }

                }
            } finally {
                System.out.println("success");
            }

        }
        JOptionPane.showMessageDialog(this, "Added Sucsessfully");

     
    }//GEN-LAST:event_AddConsecutiveActionPerformed

    private void sessionTwoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sessionTwoAncestorAdded
        // TODO add your handling code here:
        //setsessionTable2Data();
    }//GEN-LAST:event_sessionTwoAncestorAdded

    private void AddParallelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddParallelActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) sessionThree.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean checked=(Boolean) model.getValueAt(i, 0);
            //System.out.println(i+"th row: is selected? "+checked);
            
            try {
                if (checked!=null && checked == true) {
                    try {
              conn = connection.getConnection();

                        String value = model.getValueAt(i, 1).toString();

                        String update = "INSERT INTO parallel(ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration) SELECT ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration FROM session  where ses_id=" + value;
                        
                        
                        PreparedStatement smt = conn.prepareStatement(update);

                        
                        smt.execute();
                        
                        setsessionTable4Data();

            conn.close();

                    } catch (SQLException e) {
    
                                JOptionPane.showMessageDialog(this, e);
                   
                    }

                }
            } finally {
                System.out.println("success");
            }

        }
        JOptionPane.showMessageDialog(this, "Added Sucsessfully");

    
    }//GEN-LAST:event_AddParallelActionPerformed

    private void AddNonOverLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNonOverLapActionPerformed
        DefaultTableModel model = (DefaultTableModel) sessionFive.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean checked=(Boolean) model.getValueAt(i, 0);
            //System.out.println(i+"th row: is selected? "+checked);
            
            try {
                if (checked!=null && checked == true) {
                    try {
              conn = connection.getConnection();

                        String value = model.getValueAt(i, 1).toString();

                        String update = "INSERT INTO nonoverlapping(ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration) SELECT ses_id,lecturer,lecturer_2,subject_code,subject_name,group_id,tag,no_of_students,duration FROM session  where ses_id=" + value;
                        
                        
                        PreparedStatement smt = conn.prepareStatement(update);

                        
                        smt.execute();
                        
                        setsessionTable6Data();

            conn.close();

                    } catch (SQLException e) {
    

                                JOptionPane.showMessageDialog(this, e);
                   
                    }

                }
            } finally {
                System.out.println("success");
            }

        }
        JOptionPane.showMessageDialog(this, "Added Sucsessfully");

        
    }//GEN-LAST:event_AddNonOverLapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new homePg().setVisible(true);
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
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddConsecutive;
    private javax.swing.JButton AddNonOverLap;
    private javax.swing.JButton AddParallel;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable sessionFive;
    private javax.swing.JTable sessionFour;
    private javax.swing.JTable sessionOne;
    private javax.swing.JTable sessionSix;
    private javax.swing.JTable sessionThree;
    private javax.swing.JTable sessionTwo;
    // End of variables declaration//GEN-END:variables
}
