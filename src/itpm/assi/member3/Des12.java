package itpm.assi.member3;

import itpm.assi.*;
import itpm.assi.common.homePg;
import itpm.assi.util.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Des12 extends javax.swing.JFrame {
 
 Connection conn = null;        //create the connection object con

 PreparedStatement pst; // create the PreparedStatement object pst

 ResultSet rs;          // create the ResultSet object rs

 Statement stmt;        // create the Statement object stmt
 

 public Des12() {

        initComponents();
        DisplayTable();
    }

      private void DisplayTable(){
        try{            
            conn = connection.getConnection();
            
            String sql = "select * from wdays_and_hours"; 
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
          
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
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mon = new javax.swing.JCheckBox();
        tue = new javax.swing.JCheckBox();
        wed = new javax.swing.JCheckBox();
        thur = new javax.swing.JCheckBox();
        fri = new javax.swing.JCheckBox();
        sat = new javax.swing.JCheckBox();
        sun = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        wdaysave = new javax.swing.JButton();
        wdayup = new javax.swing.JButton();
        wdaydel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        wdaysnum = new javax.swing.JComboBox<>();
        wtimepday = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Working Days and Hours");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260)
                .addComponent(jLabel7)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jLabel2.setText("No. of Working Days");

        jLabel3.setText("Working Days");

        mon.setText("Monday");
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });

        tue.setText("Tuesday");

        wed.setText("Wednesday");

        thur.setText("Thursday");

        fri.setText("Friday");
        fri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friActionPerformed(evt);
            }
        });

        sat.setText("Saturday");

        sun.setText("Sunday");
        sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunActionPerformed(evt);
            }
        });

        jLabel4.setText("Working Time Per Day");

        wdaysave.setBackground(new java.awt.Color(204, 204, 255));
        wdaysave.setText("SAVE");
        wdaysave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdaysaveActionPerformed(evt);
            }
        });

        wdayup.setBackground(new java.awt.Color(255, 204, 204));
        wdayup.setText("UPDATE");
        wdayup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdayupActionPerformed(evt);
            }
        });

        wdaydel.setBackground(new java.awt.Color(204, 255, 204));
        wdaydel.setText("DELETE");
        wdaydel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdaydelActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No.of working days", "Working days", "Working time per day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        wdaysnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        wdaysnum.setToolTipText("");
        wdaysnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wdaysnumActionPerformed(evt);
            }
        });

        wtimepday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtimepdayActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 255, 153));
        clearbtn.setText("CLEAR ALL");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

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
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mon)
                                .addGap(12, 12, 12)
                                .addComponent(tue)
                                .addGap(18, 18, 18)
                                .addComponent(wed)
                                .addGap(18, 18, 18)
                                .addComponent(thur)
                                .addGap(18, 18, 18)
                                .addComponent(fri)
                                .addGap(18, 18, 18)
                                .addComponent(sat)
                                .addGap(18, 18, 18)
                                .addComponent(sun))
                            .addComponent(wdaysnum, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wtimepday, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(wdayup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wdaysave, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wdaydel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(wdaysnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mon)
                    .addComponent(tue)
                    .addComponent(wed)
                    .addComponent(thur)
                    .addComponent(fri)
                    .addComponent(sat)
                    .addComponent(sun))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(wtimepday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wdaysave)
                        .addGap(18, 18, 18)
                        .addComponent(wdayup)
                        .addGap(18, 18, 18)
                        .addComponent(wdaydel)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void wdayupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdayupActionPerformed

        // TODO add your handling code here:
       try{
             conn = connection.getConnection();
             
             int row = jTable2.getSelectedRow();
             String value = (jTable2.getModel().getValueAt(row, 0).toString());
             String sql = "UPDATE wdays_and_hours SET num_wdays=?, wdays=?, wtime_per_day=? WHERE id ="+value;
             pst = conn.prepareStatement(sql);

            String num_wdays;
            num_wdays = wdaysnum.getSelectedItem().toString();
            pst.setString(1, num_wdays);

            String wdays = "";
            if(mon.isSelected()){    
                wdays += mon.getText() +" ";
            }

            if(tue.isSelected()){
                wdays += tue.getText()+" ";
                }

            if(wed.isSelected()){

                wdays += wed.getText()+" ";

                }

            if(thur.isSelected()){

                wdays += thur.getText()+" ";

                }

            if(fri.isSelected()){

                wdays += fri.getText()+" ";

                }

            if(sat.isSelected()){

                wdays += sat.getText()+" ";

            }

            

            if(sun.isSelected()){

                wdays += sun.getText()+" ";     

            }

            pst.setString(2, wdays);
       
           pst.setString(3, wtimepday.getText());

        

             pst.executeUpdate();

             DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel(); 

             tblModel.setRowCount(0);


             JOptionPane.showMessageDialog(null, "Updated successfully");
             
             DisplayTable();


             conn.close();

            

        }catch(Exception e){

            

             JOptionPane.showMessageDialog(null, e); 

        }     

    }//GEN-LAST:event_wdayupActionPerformed



    private void friActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_friActionPerformed



    private void sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_sunActionPerformed



    private void wdaysaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdaysaveActionPerformed

        // TODO add your handling code here:

        try{
            conn = connection.getConnection();
            
            pst = conn.prepareStatement("insert into wdays_and_hours(num_wdays,wdays,wtime_per_day)values(?,?,?)");

            String num_wdays;

            num_wdays = wdaysnum.getSelectedItem().toString();

            pst.setString(1, num_wdays);

            

            String wdays = "";

            if(mon.isSelected()){    

                wdays += mon.getText() + " ";

            }

               

            if(tue.isSelected()){

                wdays += tue.getText()+" ";

                }

            

            if(wed.isSelected()){

                wdays += wed.getText()+" ";

                }

            

            if(thur.isSelected()){

                wdays += thur.getText()+" ";

                }

            

            if(fri.isSelected()){

                wdays += fri.getText()+" ";

                }

            

            if(sat.isSelected()){

                wdays += sat.getText()+" ";

            }

            

            if(sun.isSelected()){

                wdays += sun.getText()+" ";     

            }

            pst.setString(2, wdays);

            


            pst.setString(3, wtimepday.getText());

             

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "inserted successfully");

           

        

        conn.close();

        }catch(Exception e){

            

            JOptionPane.showMessageDialog(null, e);

       

        }

       DisplayTable();

    }//GEN-LAST:event_wdaysaveActionPerformed



    private void wdaydelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdaydelActionPerformed

        // TODO add your handling code here:

        

         try{
           conn = connection.getConnection();
           int row = jTable2.getSelectedRow();

           String value = (jTable2.getModel().getValueAt(row, 0).toString());

           String sql = "DELETE FROM wdays_and_hours WHERE id="+value;

           pst = conn.prepareStatement(sql);

           pst.executeUpdate();

           DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel(); 

           tblModel.setRowCount(0); 

           

           JOptionPane.showMessageDialog(null, "Deleted"); 

        

        
           conn.close();
        }catch(Exception e){

            

            JOptionPane.showMessageDialog(null, e); 

            

        }

        DisplayTable();                     

    }//GEN-LAST:event_wdaydelActionPerformed



    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        // TODO add your handling code here:

         int i = jTable2.getSelectedRow();

         DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel(); 

          String  num_wdays = tblModel.getValueAt(i,1).toString();

            switch(num_wdays){
              case"1":  

                   wdaysnum.setSelectedIndex(0);

                    break;

                    

                 case"2":  

                   wdaysnum.setSelectedIndex(1);

                    break;

                     

                 case"3":  

                   wdaysnum.setSelectedIndex(2);

                    break;

                     

                 case"4":  

                   wdaysnum.setSelectedIndex(3);

                    break;

                     

                 case"5":  

                   wdaysnum.setSelectedIndex(4);

                    break;

                     

                 case"6":  

                   wdaysnum.setSelectedIndex(5);

                    break;

                     

                 case"7":  

                   wdaysnum.setSelectedIndex(6);

                    break;

            }

        

 

        String  wdays = tblModel.getValueAt(i,2).toString();

            switch(wdays){

                

                case"Monday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 
                    
                    break;

                    

                case"Monday Tuesday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 
                    
                    break;

                         

                case"Monday Wednesday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                    break;

                case"Monday Thursday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                      break;

                case"Monday Friday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);     

                   break;

                case"Monday Saturday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);  

                    break;  

                 case"Monday Sunday ":  

                    mon.setSelected(true);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true); 

                     break; 

                case"Tuesday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                     break; 

                case"Tuesday Wednesday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                    break; 

                case"Tuesday Thursday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                     break; 

                case"Tuesday Friday":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                    break;       

                case"Tuesday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false); 

                     break;      

                case"Tuesday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                    break; 

                case"Wednesday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                    break;  

                case"Wednesday Thursday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                    break; 

                case"Wednesday Friday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                     break;

                case"Wednesday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false); 

                     break;

                case"Wednesday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true); 

                     break;

                case"Thursday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                     break;

                case"Thursday Friday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                     break;

                 case"Thursday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false); 

                      break;

                 case"Thursday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true); 

                      break;

                 case"Friday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);      

                    break;  

                case"Friday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(false);  

                    break; 

                case"Friday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(true); 

                     break;

                case"Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);   

                    break; 

                case"Saturday Sunday":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(true); 

                    break; 

                case"Monday Tuesday Wednesday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                    break; 

                case"Monday Tuesday Thursday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                   break;  

                case"Monday Tuesday Friday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                    break; 

                case"Monday Tuesday Saturday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false); 

                     break;

                case"Monday Tuesday Sunday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                 case"Tuesday Wednesday Thursday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                     break; 

                 case"Tuesday Wednesday Friday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                     break; 

                case"Tuesday Wednesday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break;

                 case"Tuesday Wednesday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break; 

                 case"Wednesday Thursday Friday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false); 

                     break; 

                 case"Wednesday Thursday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break; 

                case"Wednesday Thursday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                case"Thursday Friday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break;

                case"Thursday Friday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                case"Friday Saturday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(true); 

                     break;

                case"Monday Tuesday Wednesday Thursday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                     break;

                case"Monday Tuesday Wednesday Friday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                     break;

                case"Monday Tuesday Wednesday Saturday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break;

                case"Monday Tuesday Wednesday Sunday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                case"Tuesday Wednesday Friday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break;

                case"Tuesday Wednesday Friday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(false); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                case"Wednesday Thursday Friday Saturday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                     break;

                case"Wednesday Thursday Friday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                     break;

                case"Thursday Friday Saturday Sunday ":  

                    mon.setSelected(false);

                    tue.setSelected(false); 

                    wed.setSelected(false); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(true);

                    break; 

                case"Monday Tuesday Wednesday Thursday Friday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(false); 

                    sun.setSelected(false);

                    break; 

                case"Monday Tuesday Wednesday Thursday Saturday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(true); 

                    sun.setSelected(false);

                    break; 

                case"Monday Tuesday Wednesday Thursday Sunday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(false); 

                    sat.setSelected(false); 

                    sun.setSelected(true);

                    break; 

                case"Monday Tuesday Wednesday Thursday Friday Saturday Sunday ":  

                    mon.setSelected(true);

                    tue.setSelected(true); 

                    wed.setSelected(true); 

                    thur.setSelected(true); 

                    fri.setSelected(true); 

                    sat.setSelected(true); 

                    sun.setSelected(true); 
                    
                     break;

            } 
            
            wtimepday.setText(tblModel.getValueAt(i,3).toString());
                      

    }//GEN-LAST:event_jTable2MouseClicked



    private void wdaysnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wdaysnumActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_wdaysnumActionPerformed

    private void wtimepdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtimepdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtimepdayActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        wdaysnum.setSelectedIndex(0);
        mon.setSelected(false);
       tue.setSelected(false);
        wed.setSelected(false);
        thur.setSelected(false);
        fri.setSelected(false);
        sat.setSelected(false);
        sun.setSelected(false);
        wtimepday.setText("");
        
        
        
        
    }//GEN-LAST:event_clearbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new homePg().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

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

            java.util.logging.Logger.getLogger(Des12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(Des12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(Des12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(Des12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>

        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Des12().setVisible(true);

            }

        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JCheckBox fri;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JCheckBox mon;
    private javax.swing.JCheckBox sat;
    private javax.swing.JCheckBox sun;
    private javax.swing.JCheckBox thur;
    private javax.swing.JCheckBox tue;
    private javax.swing.JButton wdaydel;
    private javax.swing.JButton wdaysave;
    public javax.swing.JComboBox<String> wdaysnum;
    private javax.swing.JButton wdayup;
    private javax.swing.JCheckBox wed;
    private javax.swing.JTextField wtimepday;
    // End of variables declaration//GEN-END:variables

}