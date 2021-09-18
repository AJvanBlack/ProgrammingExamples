
package com.mycompany.radiobutton;

import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbButton1 = new javax.swing.JRadioButton();
        rbButton2 = new javax.swing.JRadioButton();
        btnInput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbButton1.setText("Button1");
        rbButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbButton1ActionPerformed(evt);
            }
        });

        rbButton2.setText("Button2");
        rbButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbButton2ActionPerformed(evt);
            }
        });

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInput)
                    .addComponent(rbButton2)
                    .addComponent(rbButton1))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(rbButton1)
                .addGap(18, 18, 18)
                .addComponent(rbButton2)
                .addGap(18, 18, 18)
                .addComponent(btnInput)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbButton1ActionPerformed
        if (rbButton1.isSelected()) {
          rbButton2.setSelected(false);
        } else if (rbButton2.isSelected()) {
          rbButton1.setSelected(false);
        } 
    }//GEN-LAST:event_rbButton1ActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        String strInput;
        
        if (rbButton1.isSelected()) {
            strInput = "Button 1 has been selected";
            rbButton2.setSelected(false);
            JOptionPane.showMessageDialog(null, strInput);
        } else if(rbButton2.isSelected()) {
            strInput = "Button 2 has been selected";
            rbButton1.setSelected(false);
            JOptionPane.showMessageDialog(null, strInput);
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void rbButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbButton2ActionPerformed
        if (rbButton2.isSelected()) {
            rbButton1.setSelected(false);
        } else if (rbButton1.isSelected()) {
            rbButton2.setSelected(false);
        }
    }//GEN-LAST:event_rbButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInput;
    private javax.swing.JRadioButton rbButton1;
    private javax.swing.JRadioButton rbButton2;
    // End of variables declaration//GEN-END:variables
}
