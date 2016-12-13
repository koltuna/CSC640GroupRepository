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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
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
public class SummaryReports extends javax.swing.JFrame {
    private final String connectionUrl = "jdbc:sqlserver://PRADEEP-PC\\PRADEEP-PC\\PJ:60665;databaseName=ChocAn;user=ChocAnUser;password=pass1234;";
    DefaultTableModel dm = new DefaultTableModel();
    

    /**
     * Creates new form SummaryReports
     */
    public SummaryReports() {
        initComponents();
        jTable1.setVisible(false);        
        StartDateField.setText("");
        EndDateField.setText("");   
    }
    private boolean anyFieldsEmpty(){
       boolean startDateEmpty = StartDateField.getText().trim().equals("");
       boolean endDateEmpty = EndDateField.getText().trim().equals("");
       return startDateEmpty|endDateEmpty;
    }
    private boolean lengthValidation(){
        if(StartDateField.getText().length()>10||StartDateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Invalid Date entry");
            return false;
        }
        if(EndDateField.getText().length()>10||EndDateField.getText().length()<0){
            JOptionPane.showMessageDialog(null, "Invalid Date entry");
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
        dm.addColumn("ProviderId");
        dm.addColumn("TotalConsultations");
        dm.addColumn("TotalFee");
        
        try {
        Connection con = DriverManager.getConnection(connectionUrl);
       //Generate report and set up prepared statement
       String sql = "EXECUTE GetManagerSummaryReportbyWeek ?,?";
       PreparedStatement prest = con.prepareStatement(sql);   
       prest.setString(1, StartDateField.getText());
       prest.setString(2, EndDateField.getText());
       ResultSet resultSet = prest.executeQuery();
      //Loop thru
       while(resultSet.next())
       {
           String pid = resultSet.getString(1);
          String tcs = resultSet.getString(2);
          String tfee= resultSet.getString(3);
          
          //add to dm rows collection
          String[] rowdata={pid,tcs,tfee};
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
    data.put("-1", new Object[]{dm.getColumnName(0),dm.getColumnName(1),dm.getColumnName(2)});
    //Add rows and cells
    for(int i=0;i<dm.getRowCount();i++)
        {
        data.put(Integer.toString(i),new Object[]{getCellValue(i,0),getCellValue(i,1),getCellValue(i,2)});
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
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");
            Date date = new Date();
            String Cdate;            
            Cdate = (dateFormat.format(date));
            FileOutputStream fos= new FileOutputStream(new File("D:/Excel/SummaryReport-ToBePaid"+ Cdate+".xlsx"));
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
        jLabel2 = new javax.swing.JLabel();
        StartDateField = new javax.swing.JTextField();
        EndDateField = new javax.swing.JTextField();
        PTBPaidButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Start Date");

        jLabel2.setText("End Date");

        StartDateField.setText("StartDate");

        EndDateField.setText("EndDate");

        PTBPaidButton.setText("View Providers To Be Paid(Week)");
        PTBPaidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTBPaidButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EndDateField)
                    .addComponent(StartDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTBPaidButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTBPaidButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PTBPaidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTBPaidButtonActionPerformed
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
    }//GEN-LAST:event_PTBPaidButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SummaryReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaryReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EndDateField;
    private javax.swing.JButton PTBPaidButton;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
