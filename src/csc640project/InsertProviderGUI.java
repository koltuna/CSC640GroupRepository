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
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
　
/**
 *
 * @author Alex
 */
public class InsertProviderGUI extends javax.swing.JFrame {
private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
    /**
     * Creates new form InsertProviderGUI
     */
    public InsertProviderGUI() {
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
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        FirstNameLabel.setText("First Name");
　
        LastNameLabel.setText("Last Name");
　
        StreetLabel.setText("Street");
　
        CityLabel.setText("City");
　
        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });
　
        StateLabel.setText("State");
　
        ZipCodeLabel.setText("Zip Code");
　
        SpecializationLabel.setText("Specialization");
　
        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
　
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
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
     private boolean idExists(int id){
        
        try {
        
        Connection con = DriverManager.getConnection(connectionUrl);
        
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Provider";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	int rowID = resultSet.getInt("ProviderID");
        if(rowID==id)
            return true;
	 }
	con.close();
			
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
        
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Provider";
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
       while(idExists(newID)){
           count++;
           newID = 900000000+getProviderCount()+count;
       }
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
       JOptionPane.showMessageDialog(null, "Provider# "+newID+": "+FirstNameTextField.getText()+" "+LastNameTextField.getText());
	this.setVisible(false);	
        con.close();
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
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProviderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
　
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertProviderGUI().setVisible(true);
            }
        });
    }
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
　
