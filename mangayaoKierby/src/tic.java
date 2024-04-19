
import javax.swing.JOptionPane;


public class tic extends javax.swing.JFrame {
    String cnt;
    int CNT = 0;
    public tic() {
        initComponents();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backColor = new javax.swing.JPanel();
        btnThree = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        lblX = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblOne = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        lblTwo = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnRules = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        jLabel3.setText("Score:");

        jLabel5.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        jLabel5.setText("Score:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        backColor.setBackground(java.awt.SystemColor.info);

        btnThree.setBackground(new java.awt.Color(255, 255, 255));
        btnThree.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(255, 255, 255));
        btnTwo.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(255, 255, 255));
        btnOne.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnFour.setBackground(new java.awt.Color(255, 255, 255));
        btnFour.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(255, 255, 255));
        btnFive.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(255, 255, 255));
        btnSix.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(255, 255, 255));
        btnSeven.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(255, 255, 255));
        btnEight.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(255, 255, 255));
        btnNine.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        lblX.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblX.setText("Player X:");

        lblScore.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblScore.setText("Score:");

        lblOne.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblOne.setText("0");

        lblO.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblO.setText("Player O:");

        lblTwo.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblTwo.setText("0");

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btnInfo.setText("Information");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnRules.setBackground(new java.awt.Color(255, 255, 255));
        btnRules.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        btnRules.setText("Rules");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backColorLayout = new javax.swing.GroupLayout(backColor);
        backColor.setLayout(backColorLayout);
        backColorLayout.setHorizontalGroup(
            backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backColorLayout.createSequentialGroup()
                        .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backColorLayout.createSequentialGroup()
                                .addComponent(lblX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOne))
                            .addGroup(backColorLayout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backColorLayout.createSequentialGroup()
                                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backColorLayout.createSequentialGroup()
                                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backColorLayout.createSequentialGroup()
                                .addComponent(lblO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTwo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backColorLayout.setVerticalGroup(
            backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backColorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOne, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (CNT % 2 == 1){     
            btnThree.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnThree.setText("X");
            CNT++;
        }
        
        btnThree.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
       
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
            lblOne.setText(cnt + 1 +"");
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (CNT % 2 == 1){     
            btnTwo.setText("O");
            CNT++;
        }else if (CNT % 2 == 0){
            btnTwo.setText("X");
            CNT++;
        }
        
        btnTwo.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
       
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
            lblOne.setText(cnt + 1 +"");
            btnOne.setEnabled(true);
            btnTwo.setEnabled(true);
            btnThree.setEnabled(true);
            btnFour.setEnabled(true);
            btnFive.setEnabled(true);
            btnSix.setEnabled(true);
            btnSeven.setEnabled(true);
            btnEight.setEnabled(true);
            btnNine.setEnabled(true);
            btnRules.setEnabled(true);
            btnInfo.setEnabled(true);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        
        if (CNT % 2 == 1){     
            btnOne.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnOne.setText("X");
            CNT++;
        }
        cnt = Integer.toString(CNT);
        btnOne.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        cnt = lblOne.getText();
         if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){  
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
            lblOne.setText(cnt + 1 +"");
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (CNT % 2 == 1){     
            btnFour.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnFour.setText("X");
            CNT++;
        }
        
        btnFour.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (CNT % 2 == 1){     
            btnFive.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnFive.setText("X");
            CNT++;
        }
        
        btnFive.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (CNT % 2 == 1){     
            btnSix.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnSix.setText("X");
            CNT++;
        }
        
        btnSix.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if (CNT % 2 == 1){     
            btnSeven.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnSeven.setText("X");
            CNT++;
        }
        
        btnSeven.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if (CNT % 2 == 1){     
            btnEight.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnEight.setText("X");
            CNT++;
        }
        
        btnEight.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if (CNT % 2 == 1){     
            btnNine.setText("O");
            CNT++;
        }else if (CNT % 2 == 0) {
            btnNine.setText("X");
            CNT++;
        }
        
        btnNine.setEnabled(false);
        btnRules.setEnabled(false);
        btnInfo.setEnabled(false);
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        } else if (btnFour.getText().equals("X")&& btnFive.getText().equals("X") && btnSix.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnEight.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFour.getText().equals("X") && btnSeven.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnTwo.getText().equals("X")&& btnFive.getText().equals("X") && btnEight.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnThree.getText().equals("X")&& btnSix.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnOne.getText().equals("X")&& btnFive.getText().equals("X") && btnNine.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }else if (btnSeven.getText().equals("X")&& btnFive.getText().equals("X") && btnThree.getText().equals("X")){
            JOptionPane.showMessageDialog(this, "Player X ","Win",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Mangayao,Kierby Ybrahim P.","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        JOptionPane.showMessageDialog(this, "The first to win 3 matches will win the game. ","Rules",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRulesActionPerformed


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
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backColor;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblOne;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTwo;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
