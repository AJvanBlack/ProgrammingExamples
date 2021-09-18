package com.mycompany.fa1_project;

import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblYearOfBirth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtNameInput = new javax.swing.JTextField();
        txtSurnameInput = new javax.swing.JTextField();
        txtYearOfBirthInput = new javax.swing.JTextField();
        cboGenderSelection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblHeading.setText("Register ME!");

        lblName.setText("Name:");

        lblSurname.setText("Surname:");

        lblYearOfBirth.setText("Year of Birth:");

        lblGender.setText("Gender:");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtNameInput.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        txtNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameInputActionPerformed(evt);
            }
        });

        txtSurnameInput.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N

        txtYearOfBirthInput.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        txtYearOfBirthInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearOfBirthInputActionPerformed(evt);
            }
        });

        cboGenderSelection.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        cboGenderSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cboGenderSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSurname)
                    .addComponent(lblName)
                    .addComponent(lblYearOfBirth)
                    .addComponent(lblGender))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeading)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboGenderSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearOfBirthInput)
                    .addComponent(txtSurnameInput)
                    .addComponent(txtNameInput))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearOfBirth)
                    .addComponent(txtYearOfBirthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cboGenderSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        String strInputName;
        String strInputSurname;
        String strYearOfBirth;
        String strGenderSelection;
        String strGenderInput;
        String strOutput;
        int intYearOfBirth;
        
        intYearOfBirth = Integer.parseInt(txtYearOfBirthInput.getText());
        strGenderSelection = cboGenderSelection.getSelectedItem().toString();
        
        if (cboGenderSelection.getSelectedItem() == "M") {
            strGenderSelection = "M" + "ALE";
        } else if (cboGenderSelection.getSelectedItem() == "F") {
            strGenderSelection = "F" + "EMALE";
        }
        
        strInputName = "Name: " + txtNameInput.getText() + "\n";
        strInputSurname = "Surname: " + txtSurnameInput.getText() + "\n";
        strYearOfBirth = "Year of Birth: " + txtYearOfBirthInput.getText() + "\n";
        strGenderInput = "Gender: " + strGenderSelection;
        strOutput = "Registered!\n" 
                    + "------------------------------\n" + 
                    strInputName + strInputSurname + strYearOfBirth + strGenderInput + 
                    "\n------------------------------\n";
        
        JOptionPane.showMessageDialog(null, strOutput);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameInputActionPerformed

    }//GEN-LAST:event_txtNameInputActionPerformed

    private void txtYearOfBirthInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearOfBirthInputActionPerformed

    }//GEN-LAST:event_txtYearOfBirthInputActionPerformed

    private void cboGenderSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderSelectionActionPerformed

    }//GEN-LAST:event_cboGenderSelectionActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNameInput.setText("");
        txtSurnameInput.setText("");
        txtYearOfBirthInput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cboGenderSelection;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblYearOfBirth;
    private javax.swing.JTextField txtNameInput;
    private javax.swing.JTextField txtSurnameInput;
    private javax.swing.JTextField txtYearOfBirthInput;
    // End of variables declaration//GEN-END:variables
}
