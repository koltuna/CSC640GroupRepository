/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package csc640project;
<<<<<<< HEAD
　
=======

=======
package chocanproject;
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
<<<<<<< HEAD
　
=======
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
/**
 *
 * @author Alex
 */
<<<<<<< HEAD
public class UpdateMemberGUI extends javax.swing.JFrame {
private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";
private boolean dateChanged = false,statusChanged = false;
=======
public class InsertProviderGUI extends javax.swing.JFrame {
<<<<<<< HEAD
private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";

=======
private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
    /**
     * Creates new form UpdateMemberGUI
     */
    public UpdateMemberGUI() {
        initComponents();
        setUpDateMenu();
        setUpMemberMenu();
        setUpStatusMenu();
    }
<<<<<<< HEAD
　
=======
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
<<<<<<< HEAD
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
　
=======
<<<<<<< HEAD
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

=======
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
        MainPanel = new javax.swing.JPanel();
        MemberIDLabel = new javax.swing.JLabel();
        MemberIDChoice = new java.awt.Choice();
        FirstNameLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        ZipCodeLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        StreetField = new javax.swing.JTextField();
        CityField = new javax.swing.JTextField();
        CountryField = new javax.swing.JTextField();
        ZipCodeField = new javax.swing.JTextField();
<<<<<<< HEAD
        StatusChoice = new java.awt.Choice();
        UpdateButton = new javax.swing.JButton();
        StateLabel = new javax.swing.JLabel();
        StateField = new javax.swing.JTextField();
        YearChoice = new java.awt.Choice();
        MonthChoice = new java.awt.Choice();
        DayChoice = new java.awt.Choice();
        YearLabel = new javax.swing.JLabel();
        MonthLabel = new javax.swing.JLabel();
        DayLabel = new javax.swing.JLabel();
　
=======
        SpecializationLabel = new javax.swing.JLabel();
        SpecializationField = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
<<<<<<< HEAD

>>>>>>> refs/remotes/origin/master
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        MemberIDLabel.setText("MemberID");
　
        FirstNameLabel.setText("First Name");
　
        LastNameLabel.setText("Last Name");
　
        DOBLabel.setText("Date of Birth");
　
        StreetLabel.setText("Street");
　
        CityLabel.setText("City");
<<<<<<< HEAD
　
        CountryLabel.setText("Country");
　
        ZipCodeLabel.setText("Zip Code");
　
        StatusLabel.setText("Status");
　
        ZipCodeField.addActionListener(new java.awt.event.ActionListener() {
=======

=======
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        FirstNameLabel.setText("First Name");
　
        LastNameLabel.setText("Last Name");
　
        StreetLabel.setText("Street");
　
        CityLabel.setText("City");
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
        CityField.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> refs/remotes/origin/master
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipCodeFieldActionPerformed(evt);
            }
        });
<<<<<<< HEAD
　
        StatusChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusChoiceItemStateChanged(evt);
            }
        });
　
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
=======
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
>>>>>>> refs/remotes/origin/master
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD
　
        StateLabel.setText("State");
　
        YearChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                YearChoiceItemStateChanged(evt);
            }
        });
　
        MonthChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MonthChoiceItemStateChanged(evt);
            }
        });
　
        YearLabel.setText("Year");
　
        MonthLabel.setText("Month");
　
        DayLabel.setText("Day");
　
=======
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StreetLabel)
                            .addComponent(CityLabel)
                            .addComponent(CountryLabel)
                            .addComponent(ZipCodeLabel)
                            .addComponent(StatusLabel)
                            .addComponent(StateLabel)
                            .addComponent(DOBLabel))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UpdateButton)
                                    .addComponent(CityField)
                                    .addComponent(CountryField)
                                    .addComponent(ZipCodeField)
                                    .addComponent(StatusChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StateField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(StreetField, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(YearLabel)
                                    .addComponent(YearChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MonthChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MonthLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(DayChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel)
                            .addComponent(LastNameLabel)
                            .addComponent(MemberIDLabel))
                        .addGap(38, 38, 38)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MemberIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DayLabel)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(FirstNameTextField))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearLabel)
                    .addComponent(MonthLabel)
                    .addComponent(DayLabel))
                .addGap(1, 1, 1)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBLabel)
                            .addComponent(DayChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearChoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StreetLabel)
                            .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CityLabel)
                            .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StateLabel)
                            .addComponent(StateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CountryLabel)
                            .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZipCodeLabel)
                            .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(StatusChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateButton))
                            .addComponent(StatusLabel)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(MonthChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
<<<<<<< HEAD
　
=======
<<<<<<< HEAD

=======
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
　
=======
<<<<<<< HEAD

>>>>>>> refs/remotes/origin/master
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
    
    
    private void ZipCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipCodeFieldActionPerformed
    //Update the first name
    private void UpdateFirstName(){
     try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
<<<<<<< HEAD
        
        Statement statement = con.createStatement();
       String sql = "Update Member Set MemberFirstName = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, FirstNameTextField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
=======
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
>>>>>>> refs/remotes/origin/master
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the last name
    private void UpdateLastName(){
     try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
       String sql = "Update Member Set MemberLastName = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, LastNameTextField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the date of birth
    private void UpdateDOB(){
     try {
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement statement = con.createStatement();
       String sql = "Update Member Set MemberDOB = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
        String dateString = YearChoice.getSelectedItem()+"-"+MonthChoice.getSelectedItem()+"-"+DayChoice.getSelectedItem();
       prest.setString(1, dateString);
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    //Update the street
    private void UpdateStreet(){
     try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
<<<<<<< HEAD
        
=======
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
>>>>>>> refs/remotes/origin/master
        Statement statement = con.createStatement();
       String sql = "Update Member Set Street = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, StreetField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
<<<<<<< HEAD
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    //Update the last name
    private void UpdateCity(){
     try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Member Set City = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, CityField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the state name
    private void UpdateState(){
     try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Member Set State = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, StateField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the country name
    private void UpdateCountry(){
     try {
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement statement = con.createStatement();
       String sql = "Update Member Set Country = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, CountryField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the zip code
    private void UpdateZipCode(){
     try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Member Set ZipCode = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1, ZipCodeField.getText());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem())) ;
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    //Update the status
    private void UpdateStatus(){
     try {
        Connection con = DriverManager.getConnection(connectionUrl);
       String sql = "Update Member Set StatusID = ? Where MemberID = ?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setInt(1, getStatusID());
       prest.setInt(2,Integer.parseInt(MemberIDChoice.getSelectedItem()));
       prest.executeUpdate();
       con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    //Does length validation for all the fields
    private boolean lengthValidation(){
        if(FirstNameTextField.getText().length()+LastNameTextField.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Member name is too long");
            return false;
        }
        if(StreetField.getText().length()>25){
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
        if(CountryField.getText().length()>3){
          JOptionPane.showMessageDialog(null,"Country name is too long");
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
    
    //What happens when the update button is pressed
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        //Length validation
        if(!lengthValidation())
            return;
        //Update where fields are filled
       if(!FirstNameTextField.getText().trim().equals(""))
       UpdateFirstName();
       if(!LastNameTextField.getText().trim().equals(""))
       UpdateLastName();
       if(dateChanged)
       UpdateDOB();
       if(!StreetField.getText().trim().equals(""))
       UpdateStreet();
       if(!CityField.getText().trim().equals(""))
       UpdateCity();
       if(!StateField.getText().trim().equals(""))
       UpdateState();
       if(!CountryField.getText().trim().equals(""))
       UpdateCountry();
       if(!ZipCodeField.getText().trim().equals(""))
       UpdateZipCode();
       if(statusChanged)
       UpdateStatus();
       //Close and hide the screen
       this.setVisible(false);
			
    }//GEN-LAST:event_UpdateButtonActionPerformed
      //When the month menu is selected
    private void MonthChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MonthChoiceItemStateChanged
        // TODO add your handling code here:
        //Indicate the date has changed
        dateChanged = true;
        //We are resetting
        DayChoice.removeAll();
        //Select the number of days based on the month
        int currentMonth = Integer.parseInt(MonthChoice.getSelectedItem());
        int currentYear = Integer.parseInt(YearChoice.getSelectedItem());
        int maxDay = 0;
        if(currentMonth==2&&currentYear%4==0)
            maxDay=29;
        else if(currentMonth==2&&currentYear%4!=0)
            maxDay=28;
        else if(currentMonth==4||currentMonth==6||currentMonth==9||currentMonth==11)
            maxDay=30;
        else
            maxDay=31;
        
        //Add the days
        for(int day=1;day<=maxDay;day++)
            DayChoice.add(""+day);
    }//GEN-LAST:event_MonthChoiceItemStateChanged
　
    //When the month menu is selected
    private void YearChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_YearChoiceItemStateChanged
        // TODO add your handling code here:
       //Indicate menu has been selected
        dateChanged = true;
        //We are resetting
        DayChoice.removeAll();
        //Select the day based on the month
        int currentMonth = Integer.parseInt(MonthChoice.getSelectedItem());
        int currentYear = Integer.parseInt(YearChoice.getSelectedItem());
        int maxDay = 0;
        if(currentMonth==2&&currentYear%4==0)
            maxDay=29;
        else if(currentMonth==2&&currentYear%4!=0)
            maxDay=28;
        else if(currentMonth==4||currentMonth==6||currentMonth==9||currentMonth==11)
            maxDay=30;
        else
            maxDay=31;
         //Add the days
        for(int day=1;day<=maxDay;day++)
            DayChoice.add(""+day);
    }//GEN-LAST:event_YearChoiceItemStateChanged
     //Indicate the status menu has been selected
    private void StatusChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusChoiceItemStateChanged
        // TODO add your handling code here:
        statusChanged = true;
    }//GEN-LAST:event_StatusChoiceItemStateChanged
//Setup the date menu
    private void setUpDateMenu(){
        //Set up the years
        for(int year=1900;year<=2010;year++){
            YearChoice.add(""+year);
        }
        //Set up the months
        for(int month=1;month<=12;month++){
            MonthChoice.add(""+month);
        }
           //Add the days
        for(int day=1;day<=31;day++)
            DayChoice.add(""+day);
    }
    //Set up the member menu
    private void setUpMemberMenu(){
        //Search the Member table and populate menu with member ids
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
<<<<<<< HEAD
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Member";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	MemberIDChoice.add(resultSet.getString("MemberID"));
	 }
	con.close();
=======
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
>>>>>>> refs/remotes/origin/master
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
<<<<<<< HEAD
    
    //Find the corresponding status id
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
       //Return -1 if the the status is not found
      return -1;
    }
     //Setup the status menu and populate with states
    private void setUpStatusMenu(){
        StatusChoice.add("Active");
        StatusChoice.add("Suspended");
        StatusChoice.add("In Active");
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
    
=======
=======
       JOptionPane.showMessageDialog(null, "Provider# "+newID+": "+FirstNameTextField.getText()+" "+LastNameTextField.getText());
	this.setVisible(false);	
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_EnterButtonActionPerformed
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
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
            java.util.logging.Logger.getLogger(UpdateMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
<<<<<<< HEAD
　
=======
<<<<<<< HEAD

=======
        //</editor-fold>
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMemberGUI().setVisible(true);
            }
        });
    }
<<<<<<< HEAD
　
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
=======
<<<<<<< HEAD

    // Variables declaration - do not modify                     
=======
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CountryField;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JLabel DOBLabel;
    private java.awt.Choice DayChoice;
    private javax.swing.JLabel DayLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JPanel MainPanel;
    private java.awt.Choice MemberIDChoice;
    private javax.swing.JLabel MemberIDLabel;
    private java.awt.Choice MonthChoice;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateLabel;
    private java.awt.Choice StatusChoice;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JButton UpdateButton;
    private java.awt.Choice YearChoice;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JLabel ZipCodeLabel;
<<<<<<< HEAD
    // End of variables declaration//GEN-END:variables
}
　
=======
<<<<<<< HEAD
    // End of variables declaration                   
}
=======
    // End of variables declaration//GEN-END:variables
}
　
>>>>>>> 62e1ffe9d592baa80b0e11b3c8c167534daf691f
>>>>>>> refs/remotes/origin/master
