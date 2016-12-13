/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanproject;
　
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
　
/**
 *
 * @author Pradeep
 */
public class BillChocAnGUI extends javax.swing.JFrame {
private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
　
    /**
     * Creates new form BillChocAnGUI
     */
    public BillChocAnGUI() {
        initComponents();
        MemberNumberField.setText("");
        ProviderNumberField.setText("");
        ServiceDateField.setText("");
        ServiceCodeField.setText("");
        CommentsField.setText("");
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
        MemberNumber = new javax.swing.JLabel();
        ServiceDate = new javax.swing.JLabel();
        ServiceCode = new javax.swing.JLabel();
        Comts = new javax.swing.JLabel();
        CheckStatusButton = new javax.swing.JButton();
        LookUpServiceCodeButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MemberNumberField = new javax.swing.JTextField();
        ProviderNumberField = new javax.swing.JTextField();
        ServiceDateField = new javax.swing.JTextField();
        ServiceCodeField = new javax.swing.JTextField();
        CommentsField = new javax.swing.JTextField();
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        jLabel1.setText("Bill ChocAn for Service");
　
        MemberNumber.setText("Member Number");
　
        ServiceDate.setText("Service Date(mm-dd-yyyy)");
　
        ServiceCode.setText("Service Code");
　
        Comts.setText("Comments");
　
        CheckStatusButton.setText("Check Status");
        CheckStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusButtonActionPerformed(evt);
            }
        });
　
        LookUpServiceCodeButton.setText("Look up for Service Code");
        LookUpServiceCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LookUpServiceCodeButtonActionPerformed(evt);
            }
        });
　
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
　
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
　
        jLabel2.setText("Provider Number");
　
        MemberNumberField.setText("jTextField1");
　
        ProviderNumberField.setText("jTextField2");
　
        ServiceDateField.setText("jTextField3");
　
        ServiceCodeField.setText("jTextField4");
　
        CommentsField.setText("jTextField5");
　
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Comts)
                            .addComponent(jLabel2)
                            .addComponent(ServiceDate)
                            .addComponent(ServiceCode)
                            .addComponent(MemberNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CommentsField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ServiceCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ServiceDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProviderNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CheckStatusButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(LookUpServiceCodeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MemberNumber)
                            .addComponent(MemberNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ServiceDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServiceCode)
                            .addComponent(ServiceCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LookUpServiceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckStatusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProviderNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommentsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(CancelButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
    //Check if any fields are empty
    private boolean anyFieldsEmpty(){
       boolean memberNumberEmpty = MemberNumberField.getText().trim().equals("");
       boolean providerNumberEmpty = ProviderNumberField.getText().trim().equals("");
       boolean serviceDateEmpty = ServiceDateField.getText().trim().equals("");
       boolean serviceCodeEmpty = ServiceCodeField.getText().trim().equals("");
       boolean commentsEmpty = CommentsField.getText().trim().equals("");
       
       return memberNumberEmpty||providerNumberEmpty||serviceDateEmpty||serviceCodeEmpty||commentsEmpty;
    }
    //Check to see whether data entered in textfields exists or not
    private boolean idExists(int id){
        //Check Member table
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Member";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	int rowID = resultSet.getInt("MemberID");
        //Return true when you find the appropriate id
        if(rowID==id)
            return true;
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(BillChocAnGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
    //Return false if the given id was found
   return false;
    }
    //Does length validation for all the fields
    private boolean lengthValidation(){
        if(MemberNumberField.getText().length()>9||MemberNumberField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Member number should be 9 didgits");
            return false;
        }
        if(ProviderNumberField.getText().length()>9||ProviderNumberField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Provider number should be 9 didgits");
            return false;
        }
        if(ServiceDateField.getText().length()>10||ServiceDateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Invalid Date entry");
            return false;
        }
        if(ServiceCodeField.getText().length()>6||ServiceCodeField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Service Code should be 6 digits");
            return false;
        }
        if(CommentsField.getText().length()>100||CommentsField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Comments should not exceed more than 100 characters");
            return false;
        }        
         if(!isNumeric(MemberNumberField.getText())){
            JOptionPane.showMessageDialog(null,"Member number needs to be numeric");
            return false;
        }
         if(!isNumeric(ProviderNumberField.getText())){
            JOptionPane.showMessageDialog(null,"Provider number Code needs to be numeric");
            return false;
        }
         if(!isNumeric(ServiceCodeField.getText())){
            JOptionPane.showMessageDialog(null,"Service Code needs to be numeric");
            return false;
        }
         if(!validateDate(ServiceDateField.getText())){
             JOptionPane.showMessageDialog(null,"Service date needs to be a date in (mm-dd-yyyy) format");
            return false;
         }         
        return true;
    }
    
    //Found code at https://coderanch.com/t/405258/java/String-IsNumeric
      private boolean isNumeric(String s){
          try{
              Integer.parseInt(s);
          }
          catch(NumberFormatException e){
              return false;
          }
          
          return true;
      }
      //To check the date is valid or not
    public boolean validateDate(String date) {
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    try {
        sdf.parse(date);
        return true;
    }
    catch(ParseException ex) {
        return false;
    }
}
    
    private void LookUpServiceCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LookUpServiceCodeButtonActionPerformed
        // TODO add your handling code here:
       LookUpServiceGUI lookupService = new LookUpServiceGUI();
       lookupService.setVisible(true);
       lookupService.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   
    }//GEN-LAST:event_LookUpServiceCodeButtonActionPerformed
　
    private void CheckStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusButtonActionPerformed
// TODO add your handling code here:
 
        //Check length of fields
        if(!lengthValidation())
            return;
 try {
    
    Connection con = DriverManager.getConnection(connectionUrl);
        //Generate report and set up prepared statement
       String sql = "EXECUTE ValidateMember_Select ?";
       PreparedStatement prest = con.prepareStatement(sql);
       int mn = Integer.parseInt(MemberNumberField.getText());
       prest.setInt(1,mn);
       ResultSet resultSet = prest.executeQuery();
       resultSet.next();
       JOptionPane.showMessageDialog(null, "This Member is " +resultSet.getString(1));
       con.close();
    }
　
    catch (SQLException ex) {
       Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    
    }  
    }//GEN-LAST:event_CheckStatusButtonActionPerformed
　
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        if(anyFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "Need to complete all the fields");
            return;
        }
        if(!lengthValidation())
            return;
         try {        
        Connection con = DriverManager.getConnection(connectionUrl);
       java.util.Calendar date = java.util.GregorianCalendar.getInstance();       
        //Generate report and set up prepared statement
       String sql = "EXECUTE ServiceDetails_Insert ?,?,?,?,?";       
       PreparedStatement prest = con.prepareStatement(sql); 
       int mn = Integer.parseInt(MemberNumberField.getText());
       int pn = Integer.parseInt(ProviderNumberField.getText());
       int sc = Integer.parseInt(ServiceCodeField.getText());       
       String sd = ServiceDateField.getText();
       prest.setInt(1, mn);
       prest.setInt(2, pn);       
       prest.setInt(3, sc);
       prest.setString(4, ServiceDateField.getText());
       prest.setString(5, CommentsField.getText());
       prest.executeUpdate();
       String sql1 = "EXECUTE ServiceCost_Select ?";
       PreparedStatement prest1 = con.prepareStatement(sql1);
       prest1.setInt(1, sc);
       ResultSet resultSet1 = prest1.executeQuery();
       resultSet1.next();
       JOptionPane.showMessageDialog(null, "Service details saved successfully. Fee for the service provided is $ " +resultSet1.getString(1));              
       con.close();	
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
                
    }//GEN-LAST:event_SubmitButtonActionPerformed
　
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
       BillChocAnGUI billChocAnGUI = new BillChocAnGUI();
       billChocAnGUI.setVisible(true);
       billChocAnGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_CancelButtonActionPerformed
　
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
            java.util.logging.Logger.getLogger(BillChocAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillChocAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillChocAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillChocAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
　
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillChocAnGUI().setVisible(true);
            }
        });
    }
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CheckStatusButton;
    private javax.swing.JTextField CommentsField;
    private javax.swing.JLabel Comts;
    private javax.swing.JButton LookUpServiceCodeButton;
    private javax.swing.JLabel MemberNumber;
    private javax.swing.JTextField MemberNumberField;
    private javax.swing.JTextField ProviderNumberField;
    private javax.swing.JLabel ServiceCode;
    private javax.swing.JTextField ServiceCodeField;
    private javax.swing.JLabel ServiceDate;
    private javax.swing.JTextField ServiceDateField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
　