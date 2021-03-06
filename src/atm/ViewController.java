/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.InputMismatchException;

/**
 *
 * @author noahkiefer
 */
public class ViewController extends javax.swing.JFrame {

    Model model;

    /**
     * Creates new form ViewController
     */
    public ViewController(Model model) {
        initComponents();
        
        this.model = model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textField1 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblPin = new javax.swing.JLabel();
        txtCard1 = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPin = new javax.swing.JPasswordField();
        txtCard2 = new javax.swing.JTextField();
        txtCard3 = new javax.swing.JTextField();
        txtCard4 = new javax.swing.JTextField();
        lblReturn = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNumber.setText("Card Number:");

        lblPin.setText("Card Pin:");

        txtCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCard1ActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinActionPerformed(evt);
            }
        });

        txtCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCard2ActionPerformed(evt);
            }
        });

        txtCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCard3ActionPerformed(evt);
            }
        });

        txtCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCard4ActionPerformed(evt);
            }
        });

        lblReturn.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumber)
                                    .addComponent(lblPin)
                                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCard1, txtCard2, txtCard3, txtCard4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(lblNumber)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(lblPin)
                .addGap(18, 18, 18)
                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCard1ActionPerformed

    private void txtCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCard2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCard2ActionPerformed

    private void txtCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCard3ActionPerformed

    private void txtCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCard4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCard4ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String Number = txtCard1.getText();
        int number = Number.length();
        DlgSetPassword dlgs = new DlgSetPassword(this, true);

        try {
            Integer.parseInt(txtCard1.getText());
            Integer.parseInt(txtCard2.getText());
            Integer.parseInt(txtCard3.getText());
            Integer.parseInt(txtCard4.getText());

            if (txtCard1.getText().length() == 4 && txtCard2.getText().length() == 4 && txtCard3.getText().length() == 4 && txtCard4.getText().length() == 4) {
                lblReturn.setText("");
                if (new String(txtPin.getPassword()).equals("0000")) {
                    String CardNumber = txtCard1.getText() + txtCard2.getText() + txtCard3.getText() + txtCard4.getText();
                    
                    DlgSetPassword dlg = new DlgSetPassword(this, true);
                    dlg.setVisible(true);
                                        
                    // get the values (new pin) back from the dlg
                    String values = dlg.getFieldValues();
                                        
                    model.add(CardNumber, values);
                }
            } else if (txtCard1.getText().length() == 4 && txtCard2.getText().length() == 4 && txtCard3.getText().length() == 4 && txtCard4.getText().length() == 4) {       // The login checking processing  (only if password is not equal to "0000")
                // Check if the number field is correct (4 for each field)
                String CardNumber = txtCard1.getText() + txtCard2.getText() + txtCard3.getText() + txtCard4.getText();
                // Check the inputted number against the saved numbers
                for (int i = 0; i<10/*credit counter*/; i++) {
                    
                }
                // if there is one - take the inputted password, hash it and then check the hash against the saved password for that card number 
                System.out.println("correct card number");

            } else if (txtCard1.getText().length() != 4 || txtCard2.getText().length() != 4 || txtCard3.getText().length() != 4 || txtCard4.getText().length() != 4) {
                // checking whether the number inputted is valid
                // can only be 4 numbers per field
                // has to be all numbers

                lblReturn.setText("Enter each field with 4 numbers only");

            } else {
                lblReturn.setText("Something went wrong");
            }

        } catch (NumberFormatException exception) {
            lblReturn.setText("Pin can be numbers only");
        }// catch (Throwable e) {
        //    System.out.println("there is something wrong");
        


    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPinActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblReturn;
    private java.awt.TextField textField1;
    private javax.swing.JTextField txtCard1;
    private javax.swing.JTextField txtCard2;
    private javax.swing.JTextField txtCard3;
    private javax.swing.JTextField txtCard4;
    private javax.swing.JPasswordField txtPin;
    // End of variables declaration//GEN-END:variables
}
