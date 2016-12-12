/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc640project;

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
 * @author Alex
 */
public class UpdateProviderGUI extends javax.swing.JFrame {
    private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";
     private boolean statusChanged = false;

    /**
     * Creates new form UpdateProviderGUI
     */
    public UpdateProviderGUI() {
        initComponents();
        setUpProviderMenu();
        setUpStatusMenu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ProviderIDChoice = new java.awt.Choice();
        ProviderIDLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        StreetField = new javax.swing.JTextField();
        StreetLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        ZipCodeLabel = new javax.swing.JLabel();
        StateLabel = new javax.swing.JLabel();
        StateField = new javax.swing.JTextField();
        ZipCodeField = new javax.swing.JTextField();
        SpecializationLabel = new javax.swing.JLabel();
        SpecializationField = new javax.swing.JTextField();
        StatusLabel = new javax.swing.JLabel();
        StatusChoice = new java.awt.Choice();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(166, 83, 0));

        ProviderIDLabel.setText("ProviderID");

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        StreetLabel.setText("Street");

        CityLabel.setText("City");

        ZipCodeLabel.setText("Zip Code");

        StateLabel.setText("State");

        SpecializationLabel.setText("Specialization");

        StatusLabel.setText("Status");

        StatusChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusChoiceItemStateChanged(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(UpdateButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(ProviderIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(ProviderIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                                .addComponent(FirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameLabel)
                                    .addComponent(StreetLabel)
                                    .addComponent(CityLabel)
                                    .addComponent(StateLabel)
                                    .addComponent(ZipCodeLabel)
                                    .addComponent(SpecializationLabel)
                                    .addComponent(StatusLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StreetField)
                                    .addComponent(LastNameTextField)
                                    .addComponent(CityField)
                                    .addComponent(StateField)
                                    .addComponent(ZipCodeField)
                                    .addComponent(SpecializationField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(StatusChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProviderIDLabel)
                    .addComponent(ProviderIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StreetLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityLabel)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StateLabel)
                    .addComponent(StateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ZipCodeLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecializationLabel)
                    .addComponent(SpecializationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusLabel))
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    //Update the first name
     private void UpdateFirstName() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderFirstName = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, FirstNameTextField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     //Update the last name
     private void UpdateLastName() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderLastName = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, LastNameTextField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     
     //Update the street in the system 
     private void UpdateStreet() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderStreet = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, StreetField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     //Update the city
     private void UpdateCity() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderCity = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, CityField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     
     //Update the state
     private void UpdateState() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderState = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, StateField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     
     //Update the zip code
     private void UpdateZipCode() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set ProviderZipCode = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, ZipCodeField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     
     //Update the specialization
     private void UpdateSpecialization() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set Specialization = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setString(1, SpecializationField.getText());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     
     //Update the status
     private void UpdateStatus() {                                             
        // TODO add your handling code here:
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Provider Set StatusID = ? Where ProviderID = ?";
       PreparedStatement prest = con.prepareStatement(sql);  
       prest.setInt(1, getStatusID());
       prest.setInt(2,Integer.parseInt(ProviderIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
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
    
     
    //Does length validation for all the fields
    private boolean lengthValidation(){
        if(FirstNameTextField.getText().length()+LastNameTextField.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Member name is too long");
            return false;
        }
        if(StreetField.getText().length()>14){
            JOptionPane.showMessageDialog(null, "Street name is too long");
            return false;
        }
        if(CityField.getText().length()>14){
            JOptionPane.showMessageDialog(null, "City name is too long");
            return false;
        }
        if(StateField.getText().length()>2){
            JOptionPane.showMessageDialog(null, "State Abbreviation is too long");
            return false;
        }
        if(ZipCodeField.getText().length()>5){
            JOptionPane.showMessageDialog(null, "Zip Code is too long");
            return false;
        }
        
         if(!isNumeric(ZipCodeField.getText())&&!ZipCodeField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Zip Code needs to be numeric");
            return false;
        }
        return true;
    }
     //Execution of update button
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
       //Length validation 
          if(!lengthValidation())
              return;
        //Update where fields are filled
         if(!FirstNameTextField.getText().trim().equals(""))
       UpdateFirstName();
       if(!LastNameTextField.getText().trim().equals(""))
       UpdateLastName();
       if(!StreetField.getText().trim().equals(""))
       UpdateStreet();
       if(!CityField.getText().trim().equals(""))
       UpdateCity();
       if(!StateField.getText().trim().equals(""))
       UpdateState();
       if(!ZipCodeField.getText().trim().equals(""))
       UpdateZipCode();
      if(!SpecializationField.getText().trim().equals(""))
       UpdateSpecialization();
      if(statusChanged)
        UpdateStatus();
      //Close and hide the window
	this.setVisible(false);
    
    }                                            
          //Indicated the status button has changed
    private void StatusChoiceItemStateChanged(java.awt.event.ItemEvent evt) {                                              
        // TODO add your handling code here:
        statusChanged = true;
    }                                             

    //Locate the corresponding status id
    private int getStatusID(){
        //Search the Status table
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String query = "SELECT * FROM Status Where StatusDesc = ?";
       PreparedStatement prest = con.prepareStatement(query);
       prest.setString(1,StatusChoice.getSelectedItem());
       ResultSet resultSet = prest.executeQuery();
	while(resultSet.next()){
	return resultSet.getInt("StatusID");
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
      //If id cannot be found, return -1
      return -1;
    }
    //Setup the provider menu
     private void setUpProviderMenu(){
        //Get the list of Provider IDs and list them
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Provider";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	ProviderIDChoice.add(resultSet.getString("ProviderID"));
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }
     //Add the different status states to the menu
      private void setUpStatusMenu(){
        StatusChoice.add("Active");
        StatusChoice.add("Suspended");
        StatusChoice.add("In Active");
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
            java.util.logging.Logger.getLogger(UpdateProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProviderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JPanel MainPanel;
    private java.awt.Choice ProviderIDChoice;
    private javax.swing.JLabel ProviderIDLabel;
    private javax.swing.JTextField SpecializationField;
    private javax.swing.JLabel SpecializationLabel;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateLabel;
    private java.awt.Choice StatusChoice;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JLabel ZipCodeLabel;
    // End of variables declaration                   
}
