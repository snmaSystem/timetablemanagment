/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemangement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author VICTUS
 */
public class UpdateandDelete extends javax.swing.JFrame {

     String FacultyName, SubjectName, SubjectCode;
     String FacultyNameMain;
     String uname = "root";
    String pass = "root";
    String query;
    String url = "jdbc:mysql://localhost:3306/timetablemanagement";
 Statement smt;
 public void connect() throws SQLException
    {
       Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected");
    }
    public UpdateandDelete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        facName1jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        facName2jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        subjNamejTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        subjCodejTextField1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        updjButton2 = new javax.swing.JButton();
        deletejButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update and Delete");

        jLabel2.setText("Faculty Name : ");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Faculty Name :");

        jLabel4.setText("Subject Name :");

        jLabel5.setText("Subject Code :");

        updjButton2.setText("UPDATE");
        updjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updjButton2ActionPerformed(evt);
            }
        });

        deletejButton3.setText("DELETE");
        deletejButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(facName1jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(facName2jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(subjNamejTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjCodejTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(updjButton2)
                        .addGap(136, 136, 136)
                        .addComponent(deletejButton3)))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(facName1jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(facName2jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(subjNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(subjCodejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updjButton2)
                    .addComponent(deletejButton3))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String FacultyNameMain = facName1jTextField1.getText();
    Connection con;
    try {
        con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected");
        query = "select * from newfaculty where FacultyName='"+FacultyNameMain+"'";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        if(rs.next())
        {
            facName2jTextField1.setText(rs.getString(1));
            subjNamejTextField1.setText(rs.getString(2));
            subjCodejTextField1.setText(rs.getString(3));
            facName1jTextField1.setEditable(false);
        }
        else
            JOptionPane.showMessageDialog(this, "Faculty Name doesnt exist");
    } catch (SQLException ex) {
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updjButton2ActionPerformed
    getData();
    try {
             update();
         } catch (SQLException ex) {
             Logger.getLogger(UpdateandDelete.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_updjButton2ActionPerformed

    private void deletejButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButton3ActionPerformed
String FacultyNameMain = facName1jTextField1.getText();
        int a = JOptionPane.showConfirmDialog(this, "Do you really want to delete","Select",JOptionPane.YES_NO_CANCEL_OPTION);
if(a==0)
{
    try {
        Connection con = DriverManager.getConnection(url,uname,pass);
        query = "delete from newfaculty where FacultyName='"+FacultyNameMain+"'" ;
        Statement smt = con.createStatement();
        int rs = smt.executeUpdate(query);
        setVisible(false);
        new UpdateandDelete().setVisible(true);
    } catch (SQLException ex) {
    }
}
    }//GEN-LAST:event_deletejButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateandDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateandDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateandDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateandDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateandDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletejButton3;
    private javax.swing.JTextField facName1jTextField1;
    private javax.swing.JTextField facName2jTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField subjCodejTextField1;
    private javax.swing.JTextField subjNamejTextField1;
    private javax.swing.JButton updjButton2;
    // End of variables declaration//GEN-END:variables

    
    private void getData() {
FacultyName = facName2jTextField1.getText();
FacultyNameMain = facName1jTextField1.getText();
facName1jTextField1.setEditable(false);
SubjectName = subjNamejTextField1.getText();
SubjectCode = subjCodejTextField1.getText();
    }
    private void update() throws SQLException {
Connection con = DriverManager.getConnection(url,uname,pass);
       System.out.println("Connected");
         query="update newfaculty set FacultyName='"+FacultyName+"', SubjectName='"+SubjectName+"', SubjectCode='"+SubjectCode+"' where FacultyName='"+FacultyNameMain+"'";
   PreparedStatement ps=con.prepareStatement(query);
ps.executeUpdate();
ps.close();
JOptionPane.showMessageDialog(this, "Update Successfully");
setVisible(false);
    new UpdateandDelete().setVisible(true);
    }

    
}