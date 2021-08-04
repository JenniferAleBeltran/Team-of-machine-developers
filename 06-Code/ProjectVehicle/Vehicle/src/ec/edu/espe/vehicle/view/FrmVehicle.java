/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;

/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class FrmVehicle extends javax.swing.JFrame {

    /**
     * Creates new form FrmVehicle
     */
    public FrmVehicle() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Pnlinput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLaVehicle = new javax.swing.JLabel();
        jLaMileAge = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLVehicle = new javax.swing.JLabel();
        TxtCodeVehicle = new javax.swing.JTextField();
        RbtBrand = new javax.swing.JRadioButton();
        RbtBrand1 = new javax.swing.JRadioButton();
        RbtBrand2 = new javax.swing.JRadioButton();
        RbtBrand3 = new javax.swing.JRadioButton();
        RbtType = new javax.swing.JRadioButton();
        RbtType1 = new javax.swing.JRadioButton();
        RbtType2 = new javax.swing.JRadioButton();
        JprPrice = new javax.swing.JTextField();
        jRaRed = new javax.swing.JRadioButton();
        jRaBlue = new javax.swing.JRadioButton();
        jRaGriss = new javax.swing.JRadioButton();
        TextMile = new javax.swing.JTextField();
        TextAmount = new javax.swing.JTextField();
        BtnNew = new javax.swing.JRadioButton();
        BtnUsed = new javax.swing.JRadioButton();
        PnlinputButton = new javax.swing.JPanel();
        jBtAdd = new javax.swing.JButton();
        jBtSave = new javax.swing.JButton();
        jBtDelete = new javax.swing.JButton();
        jBtExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME TO THE CAR DEALERSHIP");

        jLabel2.setText("Code Vehicle: ");

        jLabel3.setText("Brand Vehicle: ");

        jLabel4.setText("Type Vehicle: ");

        jLabel5.setText("Price Vehicle: ");

        jLaVehicle.setText("Color Vehicle");

        jLaMileAge.setText("Mile age Vehicle: ");

        jLabel8.setText("Amount of Sale: ");

        jLVehicle.setText("Vehicle Sold: ");

        RbtBrand.setText("Chevrolet");
        RbtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtBrandActionPerformed(evt);
            }
        });

        RbtBrand1.setText("Toyota");

        RbtBrand2.setText("Kia");
        RbtBrand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtBrand2ActionPerformed(evt);
            }
        });

        RbtBrand3.setText("Hyundai");
        RbtBrand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtBrand3ActionPerformed(evt);
            }
        });

        RbtType.setText("Vehicle");

        RbtType1.setText("Truck");

        RbtType2.setText("Motorcycle");

        jRaRed.setText("Red");

        jRaBlue.setText("Blue");

        jRaGriss.setText("Griss");

        BtnNew.setText("New");

        BtnUsed.setText("Used");

        javax.swing.GroupLayout PnlinputLayout = new javax.swing.GroupLayout(Pnlinput);
        Pnlinput.setLayout(PnlinputLayout);
        PnlinputLayout.setHorizontalGroup(
            PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlinputLayout.createSequentialGroup()
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlinputLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlinputLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RbtBrand3)
                                    .addGroup(PnlinputLayout.createSequentialGroup()
                                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RbtBrand1)
                                            .addComponent(RbtBrand2)
                                            .addGroup(PnlinputLayout.createSequentialGroup()
                                                .addComponent(RbtBrand)
                                                .addGap(141, 141, 141)
                                                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRaGriss)
                                                    .addComponent(jLabel4))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RbtType2)
                                            .addComponent(RbtType1)
                                            .addComponent(RbtType)))))
                            .addGroup(PnlinputLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JprPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlinputLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCodeVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PnlinputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLaVehicle)
                            .addComponent(jLaMileAge))
                        .addGap(18, 18, 18)
                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlinputLayout.createSequentialGroup()
                                .addComponent(jRaRed)
                                .addGap(54, 54, 54)
                                .addComponent(jRaBlue))
                            .addComponent(TextMile, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlinputLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(PnlinputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLVehicle)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNew)
                            .addComponent(BtnUsed))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        PnlinputLayout.setVerticalGroup(
            PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlinputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TxtCodeVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RbtBrand)
                    .addComponent(jLabel4)
                    .addComponent(RbtType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtBrand1)
                    .addComponent(RbtType1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtBrand2)
                    .addComponent(RbtType2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RbtBrand3)
                .addGap(13, 13, 13)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JprPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaVehicle)
                    .addComponent(jRaRed)
                    .addComponent(jRaBlue)
                    .addComponent(jRaGriss))
                .addGap(18, 18, 18)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaMileAge)
                    .addComponent(TextMile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVehicle)
                    .addComponent(BtnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnUsed)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jBtAdd.setText("Add");

        jBtSave.setText("Save");
        jBtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSaveActionPerformed(evt);
            }
        });

        jBtDelete.setText("Delete");

        jBtExit.setText("Exit");
        jBtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlinputButtonLayout = new javax.swing.GroupLayout(PnlinputButton);
        PnlinputButton.setLayout(PnlinputButtonLayout);
        PnlinputButtonLayout.setHorizontalGroup(
            PnlinputButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlinputButtonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBtAdd)
                .addGap(142, 142, 142)
                .addComponent(jBtSave)
                .addGap(112, 112, 112)
                .addComponent(jBtDelete)
                .addGap(129, 129, 129)
                .addComponent(jBtExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlinputButtonLayout.setVerticalGroup(
            PnlinputButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlinputButtonLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(PnlinputButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtAdd)
                    .addComponent(jBtSave)
                    .addComponent(jBtDelete)
                    .addComponent(jBtExit))
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pnlinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlinputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnlinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlinputButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtBrandActionPerformed

    private void RbtBrand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtBrand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtBrand2ActionPerformed

    private void RbtBrand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtBrand3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtBrand3ActionPerformed

    private void jBtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtExitActionPerformed

    private void jBtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnNew;
    private javax.swing.JRadioButton BtnUsed;
    private javax.swing.JTextField JprPrice;
    private javax.swing.JPanel Pnlinput;
    private javax.swing.JPanel PnlinputButton;
    private javax.swing.JRadioButton RbtBrand;
    private javax.swing.JRadioButton RbtBrand1;
    private javax.swing.JRadioButton RbtBrand2;
    private javax.swing.JRadioButton RbtBrand3;
    private javax.swing.JRadioButton RbtType;
    private javax.swing.JRadioButton RbtType1;
    private javax.swing.JRadioButton RbtType2;
    private javax.swing.JTextField TextAmount;
    private javax.swing.JTextField TextMile;
    private javax.swing.JTextField TxtCodeVehicle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtDelete;
    private javax.swing.JButton jBtExit;
    private javax.swing.JButton jBtSave;
    private javax.swing.JLabel jLVehicle;
    private javax.swing.JLabel jLaMileAge;
    private javax.swing.JLabel jLaVehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRaBlue;
    private javax.swing.JRadioButton jRaGriss;
    private javax.swing.JRadioButton jRaRed;
    // End of variables declaration//GEN-END:variables
}