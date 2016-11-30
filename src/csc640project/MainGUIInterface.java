/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc640project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Font;
import javax.swing.JFrame;
public class MainGUIInterface extends javax.swing.JFrame {

    
//URL for connecting to database
private final String connectionUrl = "jdbc:sqlserver://cscsql2.carrollu.edu;" +  
					   "databaseName=csc550_fall2015_akoltun;user=csc550_fall2015_akoltun;password=480772;";
//Flag to indicate Interactive Record Mode has been entered
private boolean interactiveRecordMode=false;

    /**
     * Creates new form MainGUIInterface
     */
    public MainGUIInterface() {
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
        CommandDisplayArea = new javax.swing.JTextField();
        TerminalScrollPane = new javax.swing.JScrollPane();
        DataEntryArea = new javax.swing.JTextArea();
        EnterButton = new javax.swing.JButton();
        Enter_New_Service_Button = new javax.swing.JButton();
        Look_Up_Service_Code = new javax.swing.JButton();
        Calculate_Weekly_Fees_Button = new javax.swing.JButton();
        Check_In_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();
        Interactive_Record_Mode_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 83, 0));

        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setToolTipText("");

        CommandDisplayArea.setEditable(false);
        CommandDisplayArea.setBackground(new java.awt.Color(5, 183, 250));
        CommandDisplayArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DataEntryArea.setBackground(new java.awt.Color(5, 183, 250));
        DataEntryArea.setColumns(20);
        DataEntryArea.setRows(5);
        DataEntryArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DataEntryArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DataEntryAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DataEntryAreaKeyTyped(evt);
            }
        });
        TerminalScrollPane.setViewportView(DataEntryArea);

        EnterButton.setText("Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        Enter_New_Service_Button.setText("Enter New Service");

        Look_Up_Service_Code.setText("Look Up Service Code");
        Look_Up_Service_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Look_Up_Service_CodeActionPerformed(evt);
            }
        });

        Calculate_Weekly_Fees_Button.setText("Calculate Weekly Fees");

        Check_In_Button.setText("Check-In");

        Login_Button.setText("Login ");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Interactive_Record_Mode_Button.setText("Interactive Record Mode");
        Interactive_Record_Mode_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Interactive_Record_Mode_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CommandDisplayArea)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterButton)
                            .addComponent(TerminalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Login_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Calculate_Weekly_Fees_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Look_Up_Service_Code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Enter_New_Service_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Check_In_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Interactive_Record_Mode_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(79, 79, 79))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CommandDisplayArea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Login_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Check_In_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Interactive_Record_Mode_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enter_New_Service_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Look_Up_Service_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calculate_Weekly_Fees_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TerminalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EnterButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
    
        //If interactive record mode has been entered     
        if(interactiveRecordMode){
           
            String input = DataEntryArea.getText();
            if(!isValidModeSymbol(input))
                return;
            CommandDisplayArea.setFont(new Font(null,Font.PLAIN,12));
             if(input.equalsIgnoreCase("mi"))
          CommandDisplayArea.setText("Inserting member record");
      else if (input.equalsIgnoreCase("mu"))
          CommandDisplayArea.setText("Updating member record");
      else if (input.equalsIgnoreCase("md"))
          CommandDisplayArea.setText("Deleting member record");
      else if (input.equalsIgnoreCase("pi"))
          CommandDisplayArea.setText("Inserting provider record");
      else if (input.equalsIgnoreCase("pu"))
          CommandDisplayArea.setText("Updating provider record");
      else if (input.equalsIgnoreCase("pd"))
          CommandDisplayArea.setText("Deleting provider record");
      else 
          CommandDisplayArea.setText("");
            interactiveRecordMode = false;
        }
            
        
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
    //This text will be replaced, but I wanted to test out SQL Connection
        try {
        
        Connection con = DriverManager.getConnection(connectionUrl);
        DataEntryArea.setText(DataEntryArea.getText()+"\nSuccess");
        Statement statement = con.createStatement();
       String query = "SELECT * FROM Task";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	DataEntryArea.setText(DataEntryArea.getText()+"\n"+resultSet.getString("Status"));
	 }
	con.close();
			
    } catch (SQLException ex) {
        Logger.getLogger(MainGUIInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Look_Up_Service_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Look_Up_Service_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Look_Up_Service_CodeActionPerformed

    private void Interactive_Record_Mode_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Interactive_Record_Mode_ButtonActionPerformed
        // TODO add your handling code here:
        //String asking for which option they want to select and is displayed on the top text area
       
       //Found default code at https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html#setDefaultCloseOperation-int-
      InteractiveRecordMode InteractiveGUI = new InteractiveRecordMode();
      InteractiveGUI.setVisible(true);
      InteractiveGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       
    }//GEN-LAST:event_Interactive_Record_Mode_ButtonActionPerformed

    private void DataEntryAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataEntryAreaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataEntryAreaKeyPressed

    private void DataEntryAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataEntryAreaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DataEntryAreaKeyTyped

    private boolean isValidModeSymbol(String symbol){
        String str = symbol.trim();
        return str.equalsIgnoreCase("mi")||str.equalsIgnoreCase("mu")||str.equalsIgnoreCase("md")||str.equalsIgnoreCase("pi")||str.equalsIgnoreCase("pu")||str.equalsIgnoreCase("pd");
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
            java.util.logging.Logger.getLogger(MainGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUIInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               MainGUIInterface main_gui = new MainGUIInterface();
               main_gui.setVisible(true);
               main_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_Weekly_Fees_Button;
    private javax.swing.JButton Check_In_Button;
    private javax.swing.JTextField CommandDisplayArea;
    private javax.swing.JTextArea DataEntryArea;
    private javax.swing.JButton EnterButton;
    private javax.swing.JButton Enter_New_Service_Button;
    private javax.swing.JButton Interactive_Record_Mode_Button;
    private javax.swing.JButton Login_Button;
    private javax.swing.JButton Look_Up_Service_Code;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane TerminalScrollPane;
    // End of variables declaration//GEN-END:variables
}
