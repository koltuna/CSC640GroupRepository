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
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
　
/**
 *
 * @author Alex
 */
public class CalculateWeeklyFeeGUI extends javax.swing.JFrame {
private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";
　
    /**
     * Creates new form CalculateWeeklyFeeGUI
     */
    public CalculateWeeklyFeeGUI() {
        initComponents();
        setUpProviderMenu();
    }
    //Set up the provider menu
     private void setUpProviderMenu(){
        //Search the Provider table and populate
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
　
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
　
        MainPanel = new javax.swing.JPanel();
        ProviderIDChoice = new java.awt.Choice();
        ProviderLabel = new javax.swing.JLabel();
        CalculateButton = new javax.swing.JButton();
        FeeCalculationDisplay = new javax.swing.JTextField();
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        ProviderLabel.setText("Select Provider");
　
        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });
　
        FeeCalculationDisplay.setEditable(false);
        FeeCalculationDisplay.setBackground(new java.awt.Color(5, 183, 250));
　
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FeeCalculationDisplay)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(ProviderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProviderIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(CalculateButton)))
                .addGap(23, 23, 23))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalculateButton)
                    .addComponent(ProviderLabel)
                    .addComponent(ProviderIDChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(FeeCalculationDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
　
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
//Activated when Calculate button is pressed
    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        // TODO add your handling code here:
        try {
            //Connect
        Connection con = DriverManager.getConnection(connectionUrl);
        //Generate report and set up prepared statement
       String sql = "EXECUTE GetProviderServiceDetails_Report ?,?,?";
       PreparedStatement prest = con.prepareStatement(sql);
       prest.setString(1,ProviderIDChoice.getSelectedItem());
       //Setup start date (being the beginning of the week) and the end date (end of the week)
       Calendar endDate = GregorianCalendar.getInstance();
       Calendar startDate = (Calendar) endDate.clone();
        startDate.add(Calendar.DAY_OF_YEAR,-6);
       String endDateString = endDate.get(Calendar.YEAR)+"-"+(endDate.get(Calendar.MONTH)+1)+"-"+(endDate.get(Calendar.DAY_OF_MONTH));
       String startDateString = startDate.get(Calendar.YEAR)+"-"+(startDate.get(Calendar.MONTH)+1)+"-"+(startDate.get(Calendar.DAY_OF_MONTH));
       prest.setString(2, startDateString);
       prest.setString(3, endDateString);
       ResultSet resultSet = prest.executeQuery();
       //Gather total cost
       double total=0;
	while(resultSet.next()){
           total+= resultSet.getDouble("Cost");
	 }
        //Display total of fees
        FeeCalculationDisplay.setText("The weekly sum of fees is $"+new DecimalFormat("0.00").format(total));
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_CalculateButtonActionPerformed
　
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
            java.util.logging.Logger.getLogger(CalculateWeeklyFeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateWeeklyFeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateWeeklyFeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateWeeklyFeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
　
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateWeeklyFeeGUI().setVisible(true);
            }
        });
    }
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateButton;
    private javax.swing.JTextField FeeCalculationDisplay;
    private javax.swing.JPanel MainPanel;
    private java.awt.Choice ProviderIDChoice;
    private javax.swing.JLabel ProviderLabel;
    // End of variables declaration//GEN-END:variables
}
　
