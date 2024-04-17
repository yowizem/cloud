
import javax.swing.JOptionPane;

public class prelimMangayao extends javax.swing.JFrame {

    int p, m, f;
    String P, M, F, A;
    double a;

    public prelimMangayao() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPrelim = new javax.swing.JLabel();
        txtPrelim = new javax.swing.JTextField();
        lblMidterm = new javax.swing.JLabel();
        txtMidterm = new javax.swing.JTextField();
        lblFinals = new javax.swing.JLabel();
        txtFinals = new javax.swing.JTextField();
        lblAve = new javax.swing.JLabel();
        txtAve = new javax.swing.JTextField();
        lblSystem = new javax.swing.JLabel();
        txtSystem = new javax.swing.JTextField();
        lblRemarks = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnCompute = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grade Calculator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblPrelim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrelim.setForeground(new java.awt.Color(255, 255, 255));
        lblPrelim.setText("Prelim Grade:");

        txtPrelim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrelim.setText("0");
        txtPrelim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrelimMouseClicked(evt);
            }
        });
        txtPrelim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrelimKeyTyped(evt);
            }
        });

        lblMidterm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblMidterm.setForeground(new java.awt.Color(255, 255, 255));
        lblMidterm.setText("Midterm Grade:");

        txtMidterm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMidterm.setText("0");
        txtMidterm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMidtermMouseClicked(evt);
            }
        });
        txtMidterm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMidtermKeyTyped(evt);
            }
        });

        lblFinals.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFinals.setForeground(new java.awt.Color(255, 255, 255));
        lblFinals.setText("Finals Grade:");

        txtFinals.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFinals.setText("0");
        txtFinals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFinalsMouseClicked(evt);
            }
        });
        txtFinals.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFinalsKeyTyped(evt);
            }
        });

        lblAve.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAve.setForeground(new java.awt.Color(255, 255, 255));
        lblAve.setText("Average:");

        txtAve.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAve.setText("0");
        txtAve.setFocusable(false);

        lblSystem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSystem.setForeground(new java.awt.Color(255, 255, 255));
        lblSystem.setText("System Grade:");

        txtSystem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSystem.setText("0");
        txtSystem.setFocusable(false);

        lblRemarks.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRemarks.setForeground(new java.awt.Color(255, 255, 255));
        lblRemarks.setText("Remarks:");

        txtRemarks.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtRemarks.setText("0");
        txtRemarks.setFocusable(false);

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCompute.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCompute.setText("Compute");
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Developed by: Mangayao, Kierby Ybrahim P.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFinals)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrelim)
                                    .addComponent(lblMidterm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSystem)
                                    .addComponent(lblAve)
                                    .addComponent(lblRemarks))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(txtSystem)
                            .addComponent(txtAve)
                            .addComponent(txtFinals)
                            .addComponent(txtMidterm)
                            .addComponent(txtPrelim)))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrelim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMidterm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFinals, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAve, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnCompute, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrelimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrelimMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrelimMouseClicked

    private void txtMidtermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMidtermMouseClicked
        P = txtPrelim.getText();
        M = txtMidterm.getText();
        F = txtFinals.getText();

        p = Integer.parseInt(P);
        m = Integer.parseInt(M);
        f = Integer.parseInt(F);
        if (p > 100) {
            txtPrelim.setText("0");
            JOptionPane.showMessageDialog(this, "Invalid Prelim Grade!", "Invalid Grade", JOptionPane.WARNING_MESSAGE);
            txtPrelim.requestFocus();
        } else if (p <= 60) {
            txtPrelim.setText("0");
            JOptionPane.showMessageDialog(this, "Invalid Prelim Grade!", "Invalid Grade", JOptionPane.WARNING_MESSAGE);
            txtPrelim.requestFocus();
        }

    }//GEN-LAST:event_txtMidtermMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAve.setText("0");
        txtFinals.setText("0");
        txtMidterm.setText("0");
        txtPrelim.setText("0");
        txtRemarks.setText("0");
        txtSystem.setText("0");
        txtPrelim.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed

        P = txtPrelim.getText();
        M = txtMidterm.getText();
        F = txtFinals.getText();

        p = Integer.parseInt(P);
        m = Integer.parseInt(M);
        f = Integer.parseInt(F);

        a = p * .30 + m * .30 + f * .40;

        txtAve.setText(a + "");

        if (a >= 98) {
            txtSystem.setText("1.00");
        } else if (a >= 95) {
            txtSystem.setText("1.25");
        } else if (a >= 92) {
            txtSystem.setText("1.50");
        } else if (a >= 88) {
            txtSystem.setText("1.75");
        } else if (a >= 85) {
            txtSystem.setText("2.00");
        } else if (a >= 82) {
            txtSystem.setText("2.25");
        } else if (a >= 79) {
            txtSystem.setText("2.50");
        } else if (a >= 76) {
            txtSystem.setText("2.75");
        } else if (a == 75) {
            txtSystem.setText("3.00");
        } else if (a <= 74.99) {
            txtSystem.setText("5.00");
        }

        if (a >= 75) {
            txtRemarks.setText("Passed");
        } else if (a <= 75) {
            txtRemarks.setText("Failed");
        }
        if (m == 0) {
            txtAve.setText("0");
            txtFinals.setText("0");
            txtMidterm.setText("0");
            txtPrelim.setText("0");
            txtRemarks.setText("0");
            txtSystem.setText("0");
            txtPrelim.requestFocus();
            JOptionPane.showMessageDialog(this, "Invalid Prelim Grade!", "Invalid Grade", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnComputeActionPerformed

    private void txtFinalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFinalsMouseClicked
        P = txtPrelim.getText();
        M = txtMidterm.getText();
        F = txtFinals.getText();

        p = Integer.parseInt(P);
        m = Integer.parseInt(M);
        f = Integer.parseInt(F);
        if (m > 100) {
            txtMidterm.setText("0");
            JOptionPane.showMessageDialog(this, "Invalid Midterm!", "Invalid Grade", JOptionPane.WARNING_MESSAGE);
            txtMidterm.requestFocus();
        } else if (m <= 60) {
            txtMidterm.setText("0");
            JOptionPane.showMessageDialog(this, "Invalid Midterm Grade!", "Invalid Grade", JOptionPane.WARNING_MESSAGE);
            txtMidterm.requestFocus();
        }

    }//GEN-LAST:event_txtFinalsMouseClicked

    private void txtPrelimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrelimKeyTyped
        if (txtPrelim.getText().equals("0")) {
            txtPrelim.setText("");
        } else if (txtPrelim.getText().equals("")) {
            txtPrelim.setText("0");
        }

    }//GEN-LAST:event_txtPrelimKeyTyped

    private void txtMidtermKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMidtermKeyTyped
        if (txtMidterm.getText().equals("0")) {
            txtMidterm.setText("");
        } else if (txtMidterm.getText().equals("")) {
            txtMidterm.setText("0");
        }
    }//GEN-LAST:event_txtMidtermKeyTyped

    private void txtFinalsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalsKeyTyped
        if (txtFinals.getText().equals("0")) {
            txtFinals.setText("");
        } else if (txtFinals.getText().equals("")) {
            txtFinals.setText("0");
        }
    }//GEN-LAST:event_txtFinalsKeyTyped

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
            java.util.logging.Logger.getLogger(prelimMangayao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prelimMangayao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prelimMangayao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prelimMangayao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prelimMangayao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCompute;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAve;
    private javax.swing.JLabel lblFinals;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMidterm;
    private javax.swing.JLabel lblPrelim;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblSystem;
    private javax.swing.JTextField txtAve;
    private javax.swing.JTextField txtFinals;
    private javax.swing.JTextField txtMidterm;
    private javax.swing.JTextField txtPrelim;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtSystem;
    // End of variables declaration//GEN-END:variables
}
