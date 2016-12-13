/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocanproject;
　
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
　
/**
 *
 * @author Alex
 */
public class InteractiveRecordMode extends javax.swing.JFrame {
private boolean enterButtonClicked,insertMemberMode;
    /**
     * Creates new form InteractiveRecordMode
     */
    public InteractiveRecordMode() {
        enterButtonClicked = false;
        insertMemberMode=false;
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
　
        jTextField1 = new javax.swing.JTextField();
        MainPanel = new javax.swing.JPanel();
        InsertMemberButton = new javax.swing.JButton();
        InsertProviderButton = new javax.swing.JButton();
        UpdateMemberButton = new javax.swing.JButton();
        UpdateProviderButton = new javax.swing.JButton();
        DeleteMemberButton = new javax.swing.JButton();
        DeleteProviderButton = new javax.swing.JButton();
　
        jTextField1.setText("jTextField1");
　
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
　
        MainPanel.setBackground(new java.awt.Color(166, 83, 0));
　
        InsertMemberButton.setText("Insert Member");
        InsertMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertMemberButtonActionPerformed(evt);
            }
        });
　
        InsertProviderButton.setText("Insert Provider");
        InsertProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertProviderButtonActionPerformed(evt);
            }
        });
　
        UpdateMemberButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UpdateMemberButton.setText("Update Member");
        UpdateMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMemberButtonActionPerformed(evt);
            }
        });
　
        UpdateProviderButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        UpdateProviderButton.setText("Update Provider");
        UpdateProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProviderButtonActionPerformed(evt);
            }
        });
　
        DeleteMemberButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DeleteMemberButton.setText("Delete Member");
        DeleteMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMemberButtonActionPerformed(evt);
            }
        });
　
        DeleteProviderButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        DeleteProviderButton.setText("Delete Provider");
        DeleteProviderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProviderButtonActionPerformed(evt);
            }
        });
　
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(DeleteMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(InsertMemberButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InsertProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(UpdateMemberButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdateProviderButton)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertMemberButton)
                    .addComponent(InsertProviderButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteProviderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
　
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
　
        pack();
    }// </editor-fold>//GEN-END:initComponents
　
    private void InsertMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertMemberButtonActionPerformed
        // TODO add your handling code here:
       InsertMemberGUI insertMemberGUI = new InsertMemberGUI();
       insertMemberGUI.setVisible(true);
       insertMemberGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_InsertMemberButtonActionPerformed
　
    private void InsertProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertProviderButtonActionPerformed
        // TODO add your handling code here:
        InsertProviderGUI insertProviderGUI = new InsertProviderGUI();
       insertProviderGUI.setVisible(true);
       insertProviderGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_InsertProviderButtonActionPerformed
　
    private void DeleteMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMemberButtonActionPerformed
        // TODO add your handling code here:
         DeleteMemberGUI deleteMemberGUI = new DeleteMemberGUI();
       deleteMemberGUI.setVisible(true);
       deleteMemberGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_DeleteMemberButtonActionPerformed
　
    private void DeleteProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProviderButtonActionPerformed
        // TODO add your handling code here:
           DeleteProviderGUI deleteProviderGUI = new DeleteProviderGUI();
       deleteProviderGUI.setVisible(true);
       deleteProviderGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_DeleteProviderButtonActionPerformed
　
    private void UpdateMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMemberButtonActionPerformed
        // TODO add your handling code here:
        UpdateMemberGUI updateMemberGUI = new UpdateMemberGUI();
       updateMemberGUI.setVisible(true);
       updateMemberGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_UpdateMemberButtonActionPerformed
　
    private void UpdateProviderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProviderButtonActionPerformed
        // TODO add your handling code here:
         UpdateProviderGUI updateProviderGUI = new UpdateProviderGUI();
       updateProviderGUI.setVisible(true);
       updateProviderGUI.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_UpdateProviderButtonActionPerformed
　
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
            java.util.logging.Logger.getLogger(InteractiveRecordMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteractiveRecordMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteractiveRecordMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteractiveRecordMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
　
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteractiveRecordMode().setVisible(true);
            }
        });
    }
　
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteMemberButton;
    private javax.swing.JButton DeleteProviderButton;
    private javax.swing.JButton InsertMemberButton;
    private javax.swing.JButton InsertProviderButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton UpdateMemberButton;
    private javax.swing.JButton UpdateProviderButton;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
　
