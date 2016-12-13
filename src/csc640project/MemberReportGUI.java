/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Pradeep
 */
public class MemberReportGUI extends javax.swing.JFrame {   
    private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
    DefaultTableModel dm = new DefaultTableModel();
    String fn;    
  
    /**
     * Creates new form MemberReportGUI
     */
    public MemberReportGUI() {
        initComponents();
        jTable1.setVisible(false);
        MemberNumberField.setText("");
        StartDateField.setText("");
        EndDateField.setText("");
    }
    private boolean idExists(int id){
        //Check Member table
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement statement = con.createStatement();
        String query = "SELECT * FROM Member";
       ResultSet resultSet = statement.executeQuery(query);
	while(resultSet.next()){
	int rowID = resultSet.getInt("MemberId");
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
    //checks if any fields are empty
    private boolean anyFieldsEmpty(){
       boolean memberNumberEmpty = MemberNumberField.getText().trim().equals("");  
       boolean startDateEmpty = StartDateField.getText().trim().equals("");
       boolean endDateEmpty = EndDateField.getText().trim().equals("");
       return memberNumberEmpty|startDateEmpty|endDateEmpty;
    }
    private boolean lengthValidation(){
        if(MemberNumberField.getText().length()>9||MemberNumberField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Member number should be 9 didgits");
            return false;
        } 
        if(StartDateField.getText().length()>10||StartDateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Invalid Date entry");
            return false;
        }
        if(EndDateField.getText().length()>10||EndDateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Invalid Date entry");
            return false;
        }
        
         if(!isNumeric(MemberNumberField.getText())){
            JOptionPane.showMessageDialog(null,"Member number needs to be numeric");
            return false;
        }
         if(!validateDate(StartDateField.getText())){
             JOptionPane.showMessageDialog(null,"Service date needs to be a date in (mm-dd-yyyy) format");
            return false;
         }    
         if(!validateDate(EndDateField.getText())){
             JOptionPane.showMessageDialog(null,"End date needs to be a date in (mm-dd-yyyy) format");
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
//retrieve from SQL
private DefaultTableModel getdata(){
        //CONSTRUCT COLUMNS
        dm.addColumn("MemberFirstName");
        dm.addColumn("MemberLastName");
        dm.addColumn("MemberId");
        dm.addColumn("Street");
        dm.addColumn("City");
        dm.addColumn("State");
        dm.addColumn("ZipCode");
        dm.addColumn("ServiceDate");
        dm.addColumn("ProviderFirstName");
        dm.addColumn("ProviderLastName");
        dm.addColumn("ServiceDesc");
        
        try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
        //Generate report and set up prepared statement
       String sql = "EXECUTE GetMemberServiceDetails_Report ?,?,?";
       PreparedStatement prest = con.prepareStatement(sql);
       int mn = Integer.parseInt(MemberNumberField.getText());
       prest.setInt(1,mn);
       prest.setString(2, StartDateField.getText());
       prest.setString(3, EndDateField.getText());
       ResultSet resultSet = prest.executeQuery();
       //checks  and prints message if there is no data in the resultSet 
       if (!resultSet.next() ) {
           JOptionPane.showMessageDialog(null,"No data matching your criteria");
       } 
      //Loop thru
       while(resultSet.next())
       {
           
           fn = resultSet.getString(1);
          String ln = resultSet.getString(2);
          String mid= resultSet.getString(3);
          String str= resultSet.getString(4);
          String cty= resultSet.getString(5);
          String st= resultSet.getString(6);
          String zip= resultSet.getString(7);
          String sd= resultSet.getString(8);
          String pfn= resultSet.getString(9);
          String pln= resultSet.getString(10);
          String sdc= resultSet.getString(11);
          
          //add to dm rows collection
          String[] rowdata={fn,ln,mid,str,cty,st,zip,sd,pfn,pln,sdc};
          dm.addRow(rowdata);
       }
       return dm;
          
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
        return null;
}

//Get data from dm
private String getCellValue(int x, int y)
{
    return dm.getValueAt(x,y).toString();
}

//write to Excel File
private void writeToExcel() 
{
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet ws = wb.createSheet();
    //Load data to Treemap
    TreeMap<String,Object[]> data= new TreeMap<>();
    //Add column headers
    data.put("-1", new Object[]{dm.getColumnName(0),dm.getColumnName(1),dm.getColumnName(2),dm.getColumnName(3),dm.getColumnName(4),dm.getColumnName(5),dm.getColumnName(6),dm.getColumnName(7),dm.getColumnName(8),dm.getColumnName(9),dm.getColumnName(10)});
    //Add rows and cells
    for(int i=0;i<dm.getRowCount();i++)
        {
        data.put(Integer.toString(i),new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2),getCellValue(i,3),getCellValue(i,4),getCellValue(i,5),getCellValue(i,6),getCellValue(i,7),getCellValue(i,8),getCellValue(i,9),getCellValue(i,10)});
        }
    //write to excel file
    Set<String> ids = data.keySet();
    XSSFRow row;
    int rowID=0;
    for(String key: ids)
        {
            row=ws.createRow(rowID++);
            //get data as per key
            Object[] values = data.get(key);
            int cellID=0;
            for(Object o: values)
            {
                Cell cell = row.createCell(cellID++);
                cell .setCellValue(o.toString());
            }
        }
    //write to filesystem
    try
        {
            String MName,fName;
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");
            Date date = new Date();
            String Cdate;
            MName = fn.toString();
            Cdate = (dateFormat.format(date));
            fName = MName+ "_" +Cdate;
            FileOutputStream fos= new FileOutputStream(new File("D:/Excel/"+ fName+".xlsx"));
            wb.write(fos);
            fos.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
           // Logger.getLogger(WorkBookNSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
    catch (IOException ex){
        ex.printStackTrace();
        //Logger.getLogger(MemberReportGUI.class.getName()).log(Level.SEVERE, null, ex);
   
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

        jLabel1 = new javax.swing.JLabel();
        MemberNumberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StartDateField = new javax.swing.JTextField();
        EndDateField = new javax.swing.JTextField();
        PrintReportButton = new javax.swing.JButton();
        GenerateReportButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Member Number");

        MemberNumberField.setText("jTextField1");

        jLabel2.setText("Start Date");

        jLabel3.setText("End Date");

        StartDateField.setText("jTextField2");

        EndDateField.setText("jTextField3");

        PrintReportButton.setText("View Report");
        PrintReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintReportButtonActionPerformed(evt);
            }
        });

        GenerateReportButton.setText("Generate Report");
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MemberNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(PrintReportButton)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenerateReportButton)
                        .addGap(58, 58, 58))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MemberNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PrintReportButton)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(GenerateReportButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrintReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintReportButtonActionPerformed
        // TODO add your handling code here:
        if(anyFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "Need to complete all fields");
            return;
        }
        //Check length of fields
        if(!lengthValidation())
            return;
        jTable1.setVisible(true);
        jTable1.setModel(getdata());
        
        
    }//GEN-LAST:event_PrintReportButtonActionPerformed

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportButtonActionPerformed
        // TODO add your handling code here:
        if(anyFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "Need to complete all fields");
            return;
        }
        //Check length of fields
        if(!lengthValidation())
            return;
        //jTable1.setModel(getdata());
        writeToExcel();
        JOptionPane.showMessageDialog(null, "Report has been generated successfully and saved as .xlsx file at local path D:/Excel/" );
    }//GEN-LAST:event_GenerateReportButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MemberReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberReportGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EndDateField;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JTextField MemberNumberField;
    private javax.swing.JButton PrintReportButton;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
