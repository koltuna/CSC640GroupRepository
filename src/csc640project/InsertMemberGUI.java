/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
　
/**
 *
 * @author Alex
 */
public class InsertMemberGUI extends javax.swing.JFrame {
    //URL for connecting to database
private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
　
    /**
     * Creates new form InsertMemberGUI
     */
    public InsertMemberGUI() {
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
　
        jPanel1 = new javax.swing.JPanel();
        FirstNameTextField = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
        LastNameTextField = new javax.swing.JTextField();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        DOBField = new javax.swing.JTextField();
        DOBLabel = new javax.swing.JLabel();
        StreetField = new javax.swing.JTextField();
        StreetLabel = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        StreetLabel1 = new javax.swing.JLabel();
        StateLabel = new javax.swing.JLabel();
        ZipCodeLabel = new javax.swing.JLabel();
        ZipCodeField = new javax.swing.JTextField();
        CountryLabel = new javax.swing.JLabel();
        StateField = new javax.swing.JTextField();
        CountryField = new javax.swing.JTextField();
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        jPanel1.setBackground(new java.awt.Color(166, 83, 0));
　
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
　
        FirstNameLabel.setText("First Name");
　
        LastNameLabel.setText("Last Name");
　
        DOBLabel.setText("Date of Birth (yyyy-mm-dd)");
　
        StreetLabel.setText("Street");
　
        StreetLabel1.setText("City");
　
        StateLabel.setText("State");
　
        ZipCodeLabel.setText("Zip Code");
　
        CountryLabel.setText("Country");
　
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLabel)
                    .addComponent(LastNameLabel)
                    .addComponent(DOBLabel)
                    .addComponent(StreetLabel)
                    .addComponent(StreetLabel1)
                    .addComponent(ZipCodeLabel)
                    .addComponent(StateLabel)
                    .addComponent(CountryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EnterButton)
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CountryField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CityField)
                            .addComponent(StreetField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBField)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ZipCodeField)
                            .addComponent(StateField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CountryLabel)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameLabel)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StreetLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StreetLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CountryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZipCodeLabel)
                    .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(EnterButton)
                .addGap(19, 19, 19))
        );
　
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
    private boolean idExists(int id){
        
        try {
        
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Member";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	int rowID = resultSet.getInt("MemberID");
        if(rowID==id)
            return true;
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
   return false;
    }
    
    private int getMemberCount(){
        int count=-1;   
        try {
        count=0;
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Member";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	count++;
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
   return count;
    }
    
    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
        try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
        java.util.Calendar date = java.util.GregorianCalendar.getInstance();
        long time = date.getTimeInMillis();
       String sql = "INSERT INTO Member(MemberID,MemberFirstName,MemberLastName,MemberDOB,Street,City,State,Country,ZipCode,StatusID,CreatedDate,ModifiedDate) " +   "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
       System.out.println(sql);
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       System.out.println(formatter.format(Calendar.getInstance().getTime()));
       PreparedStatement prest = con.prepareStatement(sql);
       int newID = 700000000+getMemberCount();
       int count = 0;
       while(idExists(newID)){
           count++;
           newID = 700000000+getMemberCount()+count;
       }
       prest.setInt(1, newID);
       prest.setString(2, FirstNameTextField.getText());
       prest.setString(3,LastNameTextField.getText());
       prest.setString(4, DOBField.getText());
       prest.setString(5,StreetField.getText());
       prest.setString(6,CityField.getText());
       prest.setString(7,StateField.getText());
       prest.setString(8, CountryField.getText());
       prest.setString(9,ZipCodeField.getText());
       prest.setInt(10,1);
       prest.setDate(11, java.sql.Date.valueOf(formatter.format(Calendar.getInstance().getTime())));
       prest.setDate(12, java.sql.Date.valueOf(formatter.format(Calendar.getInstance().getTime())));
       prest.executeUpdate();
       con.close();
       //Got code from http://stackoverflow.com/questions/9119481/how-to-present-a-simple-alert-message-in-java
       JOptionPane.showMessageDialog(null, "Member# "+newID+": "+FirstNameTextField.getText()+" "+LastNameTextField.getText());
       this.setVisible(false);
			
    } catch (SQLException ex) {
        Logger.getLogger(ChocAnOperatorTerminal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_EnterButtonActionPerformed
　
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
            java.util.logging.Logger.getLogger(InsertMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
　
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertMemberGUI gui = new InsertMemberGUI();
                gui.setVisible(true);
                
            }
        });
    }
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityField;
    private javax.swing.JTextField CountryField;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JTextField DOBField;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JLabel StreetLabel1;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JLabel ZipCodeLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
　
