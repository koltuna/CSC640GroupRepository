/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package csc640project;

=======
package chocanproject;
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
/**
 *
 * @author Alex
 */
public class InsertProviderGUI extends javax.swing.JFrame {
<<<<<<< HEAD
private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";

=======
private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
    /**
     * Creates new form InsertProviderGUI
     */
    public InsertProviderGUI() {
        initComponents();
    }
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
<<<<<<< HEAD
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

=======
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        MainPanel = new javax.swing.JPanel();
        FirstNameLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        StreetLabel = new javax.swing.JLabel();
        StreetField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        StateField = new javax.swing.JTextField();
        StateLabel = new javax.swing.JLabel();
        ZipCodeLabel = new javax.swing.JLabel();
        ZipCodeField = new javax.swing.JTextField();
        SpecializationLabel = new javax.swing.JLabel();
        SpecializationField = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
<<<<<<< HEAD

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(166, 83, 0));

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        StreetLabel.setText("Street");

        CityLabel.setText("City");

=======
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        FirstNameLabel.setText("First Name");
　
        LastNameLabel.setText("Last Name");
　
        StreetLabel.setText("Street");
　
        CityLabel.setText("City");
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        StateLabel.setText("State");

        ZipCodeLabel.setText("Zip Code");

        SpecializationLabel.setText("Specialization");

=======
　
        StateLabel.setText("State");
　
        ZipCodeLabel.setText("Zip Code");
　
        SpecializationLabel.setText("Specialization");
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(EnterButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(SpecializationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpecializationField))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(StreetLabel)
                            .addComponent(CityLabel)
                            .addComponent(StateLabel)
                            .addComponent(ZipCodeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(StreetField)
                            .addComponent(FirstNameTextField)
                            .addComponent(CityField)
                            .addComponent(StateField)
                            .addComponent(ZipCodeField))))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StreetLabel)
                    .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityLabel)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZipCodeLabel)
                    .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecializationLabel)
                    .addComponent(SpecializationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(EnterButton)
                .addContainerGap(26, Short.MAX_VALUE))
        );
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
<<<<<<< HEAD

        pack();
    }// </editor-fold>                        
     //Return whether the given id exists
     private boolean idExists(int id){
        //Search the Provider table for the given id
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
=======
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
     private boolean idExists(int id){
        
        try {
        
        Connection con = DriverManager.getConnection(connectionUrl);
        
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Provider";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	int rowID = resultSet.getInt("ProviderID");
<<<<<<< HEAD
        //Return true when the id is found
=======
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        if(rowID==id)
            return true;
	 }
	con.close();
<<<<<<< HEAD
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
     //Return false when the id is not found
   return false;
    }
    
     //Counts number of provider records
      private int getProviderCount(){
        //Initialize count
        int count=0;   
        //Search the Provider table
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
=======
			
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
   return false;
    }
    
      private int getProviderCount(){
        int count=-1;   
        try {
        count=0;
        Connection con = DriverManager.getConnection(connectionUrl);
        
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Provider";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	count++;
	 }
	con.close();
			
    } catch (SQLException ex) {
<<<<<<< HEAD
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
   return count;
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
     
    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
    //Does length validation for all the fields
    private boolean lengthValidation(){
        if(FirstNameTextField.getText().length()+LastNameTextField.getText().length()>25||FirstNameTextField.getText().length()+LastNameTextField.getText().length()<=4){
            JOptionPane.showMessageDialog(null, "Member name is too long");
            return false;
        }
        if(StreetField.getText().length()>25||StreetField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Street name is too long");
            return false;
        }
        if(CityField.getText().length()>14||CityField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "City name is too long");
            return false;
        }
        if(StateField.getText().length()>2||StateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "State Abbreviation is too long");
            return false;
        }
        if(ZipCodeField.getText().length()>5||ZipCodeField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Zip Code is too long");
            return false;
        }
        
        if(!isNumeric(ZipCodeField.getText())){
            JOptionPane.showMessageDialog(null,"Zip Code needs to be numeric");
            return false;
        }
            
        return true;
    }
    
    
    
    //Activated when enter button is clicked
    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        //If any fields are empty, alert the user
        if(anyFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "Need to complete all fields");
            return;
        }
        //Conduct length validation of fields
        if(!lengthValidation())
            return;
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "INSERT INTO Provider(ProviderID,ProviderFirstName,ProviderLastName,ProviderStreet,ProviderCity,ProviderState,ProviderZipCode,Specialization,StatusID,CreateDate,ModifiedDate) " +   "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       PreparedStatement prest = con.prepareStatement(sql);
       //Create a new id
       int newID = 900000000+getProviderCount();
       int count = 0;
       //Look for a new id if it conflicts with another id
=======
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
   return count;
    }
      
    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFieldActionPerformed
　
    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
        try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
        java.util.Calendar date = java.util.GregorianCalendar.getInstance();
        long time = date.getTimeInMillis();
       String sql = "INSERT INTO Provider(ProviderID,ProviderFirstName,ProviderLastName,ProviderStreet,ProviderCity,ProviderState,ProviderZipCode,Specialization,StatusID,CreateDate,ModifiedDate) " +   "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
       System.out.println(sql);
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       System.out.println(formatter.format(Calendar.getInstance().getTime()));
       PreparedStatement prest = con.prepareStatement(sql);
       int newID = 900000000+getProviderCount();
       int count = 0;
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
       while(idExists(newID)){
           count++;
           newID = 900000000+getProviderCount()+count;
       }
<<<<<<< HEAD
       //Enter other fields
=======
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
       prest.setInt(1, newID);
       prest.setString(2, FirstNameTextField.getText());
       prest.setString(3,LastNameTextField.getText());
       prest.setString(4,StreetField.getText());
       prest.setString(5,CityField.getText());
       prest.setString(6,StateField.getText());
       prest.setString(7,ZipCodeField.getText());
       prest.setString(8,SpecializationField.getText());
       prest.setInt(9,1);
       prest.setDate(10, java.sql.Date.valueOf(formatter.format(Calendar.getInstance().getTime())));
       prest.setDate(11, java.sql.Date.valueOf(formatter.format(Calendar.getInstance().getTime())));
       prest.executeUpdate();
        //Got code from http://stackoverflow.com/questions/9119481/how-to-present-a-simple-alert-message-in-java
<<<<<<< HEAD
        //Alert the user a new provider record has been entered
        JOptionPane.showMessageDialog(null, "Provider# "+newID+": "+FirstNameTextField.getText()+" "+LastNameTextField.getText());
	//Close and hide the window
        this.setVisible(false);	
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }                                           

    //Returns when any other fields are empty
    private boolean anyFieldsEmpty(){
        boolean firstNameEmpty = FirstNameTextField.getText().trim().equals("");
       boolean lastNameEmpty = LastNameTextField.getText().trim().equals("");
       boolean streetEmpty = StreetField.getText().trim().equals("");
       boolean cityEmpty = CityField.getText().trim().equals("");
       boolean stateEmpty = StateField.getText().trim().equals("");
       boolean zipCodeEmpty = ZipCodeField.getText().trim().equals("");
       boolean specializationEmpty = SpecializationField.getText().trim().equals("");
       return firstNameEmpty||lastNameEmpty||streetEmpty||cityEmpty||stateEmpty||zipCodeEmpty||specializationEmpty;
    }
=======
       JOptionPane.showMessageDialog(null, "Provider# "+newID+": "+FirstNameTextField.getText()+" "+LastNameTextField.getText());
	this.setVisible(false);	
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_EnterButtonActionPerformed
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
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
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
<<<<<<< HEAD

=======
        //</editor-fold>
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertProviderGUI().setVisible(true);
            }
        });
    }
<<<<<<< HEAD

    // Variables declaration - do not modify                     
=======
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField SpecializationField;
    private javax.swing.JLabel SpecializationLabel;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JLabel ZipCodeLabel;
<<<<<<< HEAD
    // End of variables declaration                   
}
=======
    // End of variables declaration//GEN-END:variables
}
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
