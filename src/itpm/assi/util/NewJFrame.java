/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm.assi.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Msi 9RDS
 */
public class NewJFrame extends javax.swing.JFrame {
        Connection conn = null;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();       
        insertRoomDropdown();
        insertSubjectDropdown();
        insertSessionDropdown();
        
        //resets
        resetFormARS();
        DisplayTableARS();
        
        resetFormART();
        DisplayTableART();
        
        resetFormARSess();
        DisplayTableARSess();
        
    }

    //dropdown roomfor all
    public void insertRoomDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select roomName from addlocation ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("roomName");
        roomARS.addItem(name);
        roomART.addItem(name);
        roomARSess.addItem(name);
        roomARLec.addItem(name);
        }
        conn.close();
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    //dropdown subject
    public void insertSubjectDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select Subjectname from add_subject ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("Subjectname");
        subjectARS.addItem(name);
        }
        conn.close();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
   

    
    public void insertSessionDropdown(){
    
        try{
        conn = connection.getConnection();
        
        String sql = "select sessionName from add_session ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
        String name = rs.getString("sessionName");
        SessionARSess.addItem(name);
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subjectARS = new javax.swing.JComboBox<>();
        roomARS = new javax.swing.JComboBox<>();
        saveARS = new javax.swing.JButton();
        cancelARS = new javax.swing.JButton();
        deleteARS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableARS = new javax.swing.JTable();
        idLabelARS = new javax.swing.JLabel();
        idARS = new javax.swing.JLabel();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        idLabelARSess = new javax.swing.JLabel();
        idARSess = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SessionARSess = new javax.swing.JComboBox<>();
        roomARSess = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        saveARSess = new javax.swing.JButton();
        deleteARSess = new javax.swing.JButton();
        cancelARSess = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableARSess = new javax.swing.JTable();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        idLabelARLec = new javax.swing.JLabel();
        idARLec = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableARLec = new javax.swing.JTable();
        SessionARLec = new javax.swing.JComboBox<>();
        roomARLec = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveARLec = new javax.swing.JButton();
        deleteARLec = new javax.swing.JButton();
        cancelARLec = new javax.swing.JButton();
        jInternalFrame7 = new javax.swing.JInternalFrame();
        jInternalFrame9 = new javax.swing.JInternalFrame();
        jInternalFrame10 = new javax.swing.JInternalFrame();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tagART = new javax.swing.JComboBox<>();
        roomART = new javax.swing.JComboBox<>();
        saveART = new javax.swing.JButton();
        cancelART = new javax.swing.JButton();
        deleteART = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableART = new javax.swing.JTable();
        idLabelART = new javax.swing.JLabel();
        idART = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame3.setVisible(true);

        jLabel1.setText("Select Subject");

        jLabel2.setText("Select Room");

        subjectARS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        roomARS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        roomARS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomARSActionPerformed(evt);
            }
        });

        saveARS.setText("Add");
        saveARS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveARSActionPerformed(evt);
            }
        });

        cancelARS.setText("Cancel");
        cancelARS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelARSActionPerformed(evt);
            }
        });

        deleteARS.setText("Delete");
        deleteARS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteARSActionPerformed(evt);
            }
        });

        jTableARS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Subject", "Room"
            }
        ));
        jTableARS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableARSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableARS);

        idLabelARS.setText("Selected ID");

        idARS.setEnabled(false);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabelARS, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subjectARS, 0, 246, Short.MAX_VALUE)
                            .addComponent(roomARS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(idARS, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelARS)
                    .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saveARS)
                        .addComponent(deleteARS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idARS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabelARS))
                .addGap(59, 59, 59)
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame3Layout.createSequentialGroup()
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(subjectARS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(roomARS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(saveARS)))
                .addGap(18, 18, 18)
                .addComponent(deleteARS)
                .addGap(27, 27, 27)
                .addComponent(cancelARS)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Room for Subject", jInternalFrame3);

        jInternalFrame5.setVisible(true);

        idLabelARSess.setText("Selected ID");

        idARSess.setEnabled(false);

        jLabel5.setText("Select Session");

        SessionARSess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        roomARSess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel6.setText("Select Room");

        saveARSess.setText("Add");
        saveARSess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveARSessActionPerformed(evt);
            }
        });

        deleteARSess.setText("Delete");
        deleteARSess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteARSessActionPerformed(evt);
            }
        });

        cancelARSess.setText("Cancel");
        cancelARSess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelARSessActionPerformed(evt);
            }
        });

        jTableARSess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Sessions", "Room"
            }
        ));
        jTableARSess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableARSessMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableARSess);

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabelARSess, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SessionARSess, 0, 246, Short.MAX_VALUE)
                            .addComponent(roomARSess, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(idARSess, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelARSess)
                    .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saveARSess)
                        .addComponent(deleteARSess)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idARSess, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabelARSess))
                .addGap(59, 59, 59)
                .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame5Layout.createSequentialGroup()
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(SessionARSess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(roomARSess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(saveARSess)))
                .addGap(18, 18, 18)
                .addComponent(deleteARSess)
                .addGap(27, 27, 27)
                .addComponent(cancelARSess)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Room for Sessions", jInternalFrame5);

        jInternalFrame6.setVisible(true);

        idLabelARLec.setText("Selected ID");

        idARLec.setEnabled(false);

        jTableARLec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Sessions", "Room"
            }
        ));
        jTableARLec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableARLecMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableARLec);

        SessionARLec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        SessionARLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionARLecActionPerformed(evt);
            }
        });

        roomARLec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel7.setText("Select Lecturer");

        jLabel8.setText("Select Room");

        saveARLec.setText("Add");
        saveARLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveARLecActionPerformed(evt);
            }
        });

        deleteARLec.setText("Delete");
        deleteARLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteARLecActionPerformed(evt);
            }
        });

        cancelARLec.setText("Cancel");
        cancelARLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelARLecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabelARLec, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SessionARLec, 0, 246, Short.MAX_VALUE)
                            .addComponent(roomARLec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jInternalFrame6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(idARLec, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelARLec)
                    .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saveARLec)
                        .addComponent(deleteARLec)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idARLec, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabelARLec))
                .addGap(59, 59, 59)
                .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame6Layout.createSequentialGroup()
                        .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SessionARLec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(roomARLec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(saveARLec)))
                .addGap(18, 18, 18)
                .addComponent(deleteARLec)
                .addGap(27, 27, 27)
                .addComponent(cancelARLec)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Room for a Lecturer", jInternalFrame6);

        jInternalFrame7.setVisible(true);

        javax.swing.GroupLayout jInternalFrame7Layout = new javax.swing.GroupLayout(jInternalFrame7.getContentPane());
        jInternalFrame7.getContentPane().setLayout(jInternalFrame7Layout);
        jInternalFrame7Layout.setHorizontalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame7Layout.setVerticalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab5", jInternalFrame7);

        jInternalFrame9.setVisible(true);

        javax.swing.GroupLayout jInternalFrame9Layout = new javax.swing.GroupLayout(jInternalFrame9.getContentPane());
        jInternalFrame9.getContentPane().setLayout(jInternalFrame9Layout);
        jInternalFrame9Layout.setHorizontalGroup(
            jInternalFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame9Layout.setVerticalGroup(
            jInternalFrame9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab7", jInternalFrame9);

        jInternalFrame10.setVisible(true);

        javax.swing.GroupLayout jInternalFrame10Layout = new javax.swing.GroupLayout(jInternalFrame10.getContentPane());
        jInternalFrame10.getContentPane().setLayout(jInternalFrame10Layout);
        jInternalFrame10Layout.setHorizontalGroup(
            jInternalFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame10Layout.setVerticalGroup(
            jInternalFrame10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab8", jInternalFrame10);

        jInternalFrame4.setVisible(true);

        jLabel3.setText("Select Tag");

        jLabel4.setText("Select Room");

        tagART.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        tagART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagARTActionPerformed(evt);
            }
        });

        roomART.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        saveART.setText("Add");
        saveART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveARTActionPerformed(evt);
            }
        });

        cancelART.setText("Cancel");
        cancelART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelARTActionPerformed(evt);
            }
        });

        deleteART.setText("Delete");
        deleteART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteARTActionPerformed(evt);
            }
        });

        jTableART.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tag", "Room"
            }
        ));
        jTableART.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableARTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableART);

        idLabelART.setText("Selected ID");

        idART.setEnabled(false);

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveART)
                        .addGap(57, 57, 57)
                        .addComponent(deleteART)
                        .addGap(48, 48, 48)
                        .addComponent(cancelART))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(idLabelART)))
                        .addGap(84, 84, 84)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tagART, 0, 158, Short.MAX_VALUE)
                                .addComponent(roomART, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(idART, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabelART)
                    .addComponent(idART, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tagART, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(roomART, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveART)
                            .addComponent(deleteART)
                            .addComponent(cancelART))))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Room for Tags", jInternalFrame4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableARTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableARTMouseClicked

        //show buttons
        cancelART.setVisible(true);
        deleteART.setVisible(true);
        saveART.setText("Update");
        idLabelART.setVisible(true);
        idART.setVisible(true);

        idART.setText(jTableART.getValueAt(jTableART.getSelectedRow(), 0).toString());

        tagART.setSelectedItem(jTableART.getValueAt(jTableART.getSelectedRow(), 1).toString());
        roomART.setSelectedItem( jTableART.getValueAt(jTableART.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_jTableARTMouseClicked

    private void deleteARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteARTActionPerformed

        // delete
        //reset form
        resetFormART();

    }//GEN-LAST:event_deleteARTActionPerformed

    private void cancelARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelARTActionPerformed
        resetFormART();
    }//GEN-LAST:event_cancelARTActionPerformed

    private void saveARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveARTActionPerformed

        try{
            if(saveART.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into addRoomTags" + "(tag,room)"+ "VALUES (?,?)" ;
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1,tagART.getSelectedItem().toString());
                pstmt.setString(2,roomART.getSelectedItem().toString());

                // pstmt.setString(3,jComboBox1);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added Successfully !!");

                DisplayTableART();
                conn.close();

            } else {
                //update
                

                //hide buttons
                resetFormARS();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_saveARTActionPerformed

    private void tagARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tagARTActionPerformed

    private void jTableARSessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableARSessMouseClicked

        // show buttons
        cancelARSess.setVisible(true);
        deleteARSess.setVisible(true);
        saveARSess.setText("Update");
        idLabelARSess.setVisible(true);
        idARSess.setVisible(true);

        idARSess.setText(jTableARSess.getValueAt(jTableARSess.getSelectedRow(), 0).toString());

        SessionARSess.setSelectedItem(jTableARSess.getValueAt(jTableARSess.getSelectedRow(), 1).toString());
        roomARSess.setSelectedItem(jTableARSess.getValueAt(jTableARSess.getSelectedRow(), 2).toString());

    }//GEN-LAST:event_jTableARSessMouseClicked

    private void cancelARSessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelARSessActionPerformed
        resetFormARSess();
    }//GEN-LAST:event_cancelARSessActionPerformed

    private void deleteARSessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteARSessActionPerformed

        try {

            conn = connection.getConnection();

            String sql = "delete from addRoomSessions where ID = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(idARSess.getText()));

            int result = pstmt.executeUpdate();
            if (result > 0) {

                JOptionPane.showMessageDialog(null, "Record Deleted Successfully!!!");
                resetFormARSess();
                DisplayTableARSess();
            } else {
                JOptionPane.showMessageDialog(null, "Record Could Not Be Found");
            }

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_deleteARSessActionPerformed

    private void saveARSessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveARSessActionPerformed

        try {
            if (saveARSess.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into addRoomSessions" + "(room,session)" + "VALUES (?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(2, SessionARSess.getSelectedItem().toString());
                pstmt.setString(1, roomARSess.getSelectedItem().toString());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Location Added Successfully !!");

                DisplayTableARSess();
                conn.close();

            } else {
                // update

                conn = connection.getConnection();

                String sql = "update addRoomSessions set  room = ?,session = ? where ID = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(2, SessionARSess.getSelectedItem().toString());
                pstmt.setString(1, roomARSess.getSelectedItem().toString());
                pstmt.setString(3, idARSess.getText());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");

                DisplayTableARSess();
                conn.close();

                // hide buttons
                resetFormARSess();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_saveARSessActionPerformed

    private void jTableARSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableARSMouseClicked

        //show buttons
        cancelARS.setVisible(true);
        deleteARS.setVisible(true);
        saveARS.setText("Update");
        idLabelARS.setVisible(true);
        idARS.setVisible(true);

        idARS.setText(jTableARS.getValueAt(jTableARS.getSelectedRow(), 0).toString());

        subjectARS.setSelectedItem(jTableARS.getValueAt(jTableARS.getSelectedRow(), 1).toString());
        roomARS.setSelectedItem( jTableARS.getValueAt(jTableARS.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTableARSMouseClicked

    private void deleteARSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteARSActionPerformed
        // delete
        try{

            conn = connection.getConnection();

            String sql = "delete from addRoomSubject where ID = ? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(idARS.getText()));

            int result = pstmt.executeUpdate();
            if( result > 0 ){

                JOptionPane.showMessageDialog(null, "Record Deleted Successfully!!!");
                resetFormARS();
                DisplayTableARS();
            }
            else{
                JOptionPane.showMessageDialog(null, "Record Could Not Be Found");
            }

            conn.close();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_deleteARSActionPerformed

    private void cancelARSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelARSActionPerformed
        resetFormARS();
    }//GEN-LAST:event_cancelARSActionPerformed

    private void saveARSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveARSActionPerformed

        try{
            if(saveARS.getText().equalsIgnoreCase("Add")) {

                conn = connection.getConnection();

                String sql = "insert into addRoomSubject" + "(room,subject)"+ "VALUES (?,?)" ;
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(2,subjectARS.getSelectedItem().toString());
                pstmt.setString(1,roomARS.getSelectedItem().toString());

                // pstmt.setString(3,jComboBox1);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Location Added Successfully !!");

                DisplayTableARS();
                conn.close();

            } else {
                //update

                conn = connection.getConnection();

                String sql = "update addRoomSubject set  room = ?,subject = ? where ID = ?" ;
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(2,subjectARS.getSelectedItem().toString());
                pstmt.setString(1,roomARS.getSelectedItem().toString());
                pstmt.setString(3,idARS.getText());

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully !!");

                DisplayTableARS();
                conn.close();

                //hide buttons
                resetFormARS();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveARSActionPerformed

    private void roomARSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomARSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomARSActionPerformed

    private void jTableARLecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableARLecMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableARLecMouseClicked

    private void saveARLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveARLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveARLecActionPerformed

    private void deleteARLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteARLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteARLecActionPerformed

    private void cancelARLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelARLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelARLecActionPerformed

    private void SessionARLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionARLecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SessionARLecActionPerformed

    private void resetFormARS(){
       cancelARS.setVisible(false);
        deleteARS.setVisible(false);
        saveARS.setText("Add");
        idLabelARS.setVisible(false);
         idARS.setVisible(false);
    
    }
    
    private void resetFormART(){
       cancelART.setVisible(false);
        deleteART.setVisible(false);
        saveART.setText("Add");
        idLabelART.setVisible(false);
         idART.setVisible(false);
    
    }
    
    
     private void DisplayTableARS()
    {
        try{
        
        conn = connection.getConnection();
         
         String sql = "select * from addRoomSubject";
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         jTableARS.setModel(DbUtils.resultSetToTableModel(rs));
         
         conn.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
       private void DisplayTableART()
    {
        try{
        
        conn = connection.getConnection();
         
         String sql = "select * from addRoomTags";
         
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         
         jTableART.setModel(DbUtils.resultSetToTableModel(rs));
         
         conn.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     private void DisplayTableARSess() {
        try {

            conn = connection.getConnection();

            String sql = "select * from addRoomSessions";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            jTableARSess.setModel(DbUtils.resultSetToTableModel(rs));

            conn.close();
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     
      private void resetFormARSess() {
        cancelARSess.setVisible(false);
        deleteARSess.setVisible(false);
        saveARSess.setText("Add");
        idLabelARSess.setVisible(false);
        idARSess.setVisible(false);

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SessionARLec;
    private javax.swing.JComboBox<String> SessionARSess;
    private javax.swing.JButton cancelARLec;
    private javax.swing.JButton cancelARS;
    private javax.swing.JButton cancelARSess;
    private javax.swing.JButton cancelART;
    private javax.swing.JButton deleteARLec;
    private javax.swing.JButton deleteARS;
    private javax.swing.JButton deleteARSess;
    private javax.swing.JButton deleteART;
    private javax.swing.JLabel idARLec;
    private javax.swing.JLabel idARS;
    private javax.swing.JLabel idARSess;
    private javax.swing.JLabel idART;
    private javax.swing.JLabel idLabelARLec;
    private javax.swing.JLabel idLabelARS;
    private javax.swing.JLabel idLabelARSess;
    private javax.swing.JLabel idLabelART;
    private javax.swing.JInternalFrame jInternalFrame10;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JInternalFrame jInternalFrame7;
    private javax.swing.JInternalFrame jInternalFrame9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableARLec;
    private javax.swing.JTable jTableARS;
    private javax.swing.JTable jTableARSess;
    private javax.swing.JTable jTableART;
    private javax.swing.JComboBox<String> roomARLec;
    private javax.swing.JComboBox<String> roomARS;
    private javax.swing.JComboBox<String> roomARSess;
    private javax.swing.JComboBox<String> roomART;
    private javax.swing.JButton saveARLec;
    private javax.swing.JButton saveARS;
    private javax.swing.JButton saveARSess;
    private javax.swing.JButton saveART;
    private javax.swing.JComboBox<String> subjectARS;
    private javax.swing.JComboBox<String> tagART;
    // End of variables declaration//GEN-END:variables
}
