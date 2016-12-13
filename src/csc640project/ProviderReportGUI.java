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
import java.io.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Pradeep
 */
public class ProviderReportGUI extends javax.swing.JFrame {
    private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
    DefaultTableModel dp = new DefaultTableModel();
    XSSFWorkbook workbook = new XSSFWorkbook();
    String pfn;

    /**
     * Creates new form ProviderReportGUI
     */
    public ProviderReportGUI() {
        initComponents();
        jTable1.setVisible(false);
        ProviderNumberField.setText("");
        StartDateField.setText("");
        EndDateField.setText(""); 
    }
    
    private boolean anyFieldsEmpty(){
       boolean providerNumberEmpty = ProviderNumberField.getText().trim().equals("");
       boolean startDateEmpty = StartDateField.getText().trim().equals("");
       boolean endDateEmpty = EndDateField.getText().trim().equals("");
       return providerNumberEmpty|startDateEmpty|endDateEmpty;
    }
    private boolean lengthValidation(){
        if(ProviderNumberField.getText().length()>9||ProviderNumberField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Provider number should be 9 didgits");
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
        
         if(!isNumeric(ProviderNumberField.getText())){
            JOptionPane.showMessageDialog(null,"Provider number needs to be numeric");
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
        dp.addColumn("ProviderFirstName");
        dp.addColumn("ProviderLastName");
        dp.addColumn("ProviderId");
        dp.addColumn("ProviderStreet");
        dp.addColumn("ProviderCity");
        dp.addColumn("ProviderState");
        dp.addColumn("ProviderZipCode");
        dp.addColumn("ServiceDate");
        dp.addColumn("CurrentDateTime");
        dp.addColumn("MemberFirstName");
        dp.addColumn("MemberLastName");
        dp.addColumn("MemberId");
        dp.addColumn("ServiceId");
        dp.addColumn("Cost");
        
        try {
    
        Connection con = DriverManager.getConnection(connectionUrl);
        //Generate report and set up prepared statement
       String sql = "EXECUTE GetProviderServiceDetails_Report ?,?,?";
       PreparedStatement prest = con.prepareStatement(sql);
       
       int pn = Integer.parseInt(ProviderNumberField.getText());
       prest.setInt(1,pn);
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
           pfn = resultSet.getString(1);
          String pln = resultSet.getString(2);
          String pid= resultSet.getString(3);
          String pstr= resultSet.getString(4);
          String pcty= resultSet.getString(5);
          String pst= resultSet.getString(6);
          String pzip= resultSet.getString(7);
          String sd= resultSet.getString(8);
          String cdt= resultSet.getString(9);
          String mfn= resultSet.getString(10);
          String mln= resultSet.getString(11);
          String mid= resultSet.getString(12);
          String sid= resultSet.getString(13);
          String co= resultSet.getString(14);
          
          //add to dm rows collection
          String[] rowdata={pfn,pln,pid,pstr,pcty,pst,pzip,sd,cdt,mfn,mln,mid,sid,co};
          dp.addRow(rowdata);
       }
       return dp;
          
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
        return null;
}
    
private String getCellValue(int x, int y)
{
    return dp.getValueAt(x,y).toString();
}

private void writeToExcel() 
{
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet ws = wb.createSheet();
    //Load data to Treemap
    TreeMap<String,Object[]> data= new TreeMap<>();
    //Add column headers
    data.put("-1", new Object[]{dp.getColumnName(0),dp.getColumnName(1),dp.getColumnName(2),dp.getColumnName(3),dp.getColumnName(4),dp.getColumnName(5),dp.getColumnName(6),dp.getColumnName(7),dp.getColumnName(8),dp.getColumnName(9),dp.getColumnName(10),dp.getColumnName(11),dp.getColumnName(12),dp.getColumnName(13)});
    //Add rows and cells
    for(int i=0;i<dp.getRowCount();i++)
        {
        data.put(Integer.toString(i),new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2),getCellValue(i,3),getCellValue(i,4),getCellValue(i,5),getCellValue(i,6),getCellValue(i,7),getCellValue(i,8),getCellValue(i,9),getCellValue(i,10),getCellValue(i,11),getCellValue(i,12),getCellValue(i,13)});
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
            String fName;
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");
            Date date = new Date();
            String Cdate;            
            Cdate = (dateFormat.format(date));
            fName = pfn+ "_" +Cdate;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProviderNumberField = new javax.swing.JTextField();
        StartDateField = new javax.swing.JTextField();
        EndDateField = new javax.swing.JTextField();
        ViewReportButton = new javax.swing.JButton();
        GenerateReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Provider Number");

        jLabel2.setText("Start Date");

        jLabel3.setText("End Date");

        ProviderNumberField.setText("jTextField1");

        StartDateField.setText("jTextField2");

        EndDateField.setText("jTextField3");

        ViewReportButton.setText("View Report");
        ViewReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReportButtonActionPerformed(evt);
            }
        });

        GenerateReportButton.setText("Generate Report");
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProviderNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EndDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewReportButton)
                    .addComponent(GenerateReportButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ProviderNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewReportButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateReportButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReportButtonActionPerformed
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
    }//GEN-LAST:event_ViewReportButtonActionPerformed

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportButtonActionPerformed
        // TODO add your handling code here:
        if(anyFieldsEmpty()){
            JOptionPane.showMessageDialog(null, "Need to complete all fields");
            return;
        }
        //Check length of fields
        if(!lengthValidation())
            return;
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
            java.util.logging.Logger.getLogger(ProviderReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProviderReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProviderReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProviderReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProviderReportGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EndDateField;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JTextField ProviderNumberField;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JButton ViewReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
