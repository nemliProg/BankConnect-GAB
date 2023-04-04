package com.nexbank.nexonlinebanking;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {


    CardLayout cardLayout;
    ScaleImage scaler = new ScaleImage();

    public Login() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/nexbank/nexonlinebanking/icon.png"));
        Image img = icon.getImage();
        this.setLocationRelativeTo(null);
        this.setTitle("IBank");
        this.setIconImage(img);
        cardLayout = (CardLayout) cards.getLayout();
        scaler.scaleImage("/com/nexbank/nexonlinebanking/login.png", logo);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/openeye.png", showSignupPassword);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/openeye.png", showLoginPassword);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cards = new javax.swing.JPanel();
        loginPane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        loginEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        signupNow = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginPassword = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        showLoginPassword = new javax.swing.JToggleButton();
        signupPane = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        signupEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        signupName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        signupPassword = new javax.swing.JPasswordField();
        signupAccountNumber = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        loginNow = new javax.swing.JLabel();
        showSignupPassword = new javax.swing.JToggleButton();
        signupLabel = new javax.swing.JLabel();
        signupDOB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 72, 169));
        kGradientPanel1.setkStartColor(new java.awt.Color(142, 146, 241));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IBANK");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Banking Focused On ");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("YOU.");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4)))
                .addGap(23, 23, 23))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cards.setLayout(new java.awt.CardLayout());

        loginPane.setBackground(new java.awt.Color(255, 255, 255));
        loginPane.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel9.setText("Login");

        loginEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginEmail.setText("mrabie@gmail.com");
        loginEmail.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Password");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Not a client? ");

        signupNow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signupNow.setForeground(new java.awt.Color(0, 72, 169));
        signupNow.setText("Signup Now");
        signupNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupNowsignupButtonClicked(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(0, 72, 169));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginPassword.setText("12345678");

        loginLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginLabel.setForeground(new java.awt.Color(142, 146, 241));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        showLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLoginPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupNow, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(showLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPaneLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(signupNow))
                .addGap(68, 68, 68))
        );

        cards.add(loginPane, "loginPanel");

        signupPane.setBackground(new java.awt.Color(255, 255, 255));
        signupPane.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel14.setText("Signup");

        signupEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signupEmail.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Email");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Password");

        signupButton.setBackground(new java.awt.Color(102, 0, 51));
        signupButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Signup");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Name");

        signupName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signupName.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Account Number");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Date of Birth");

        try {
            signupAccountNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Already have an account?");

        loginNow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginNow.setForeground(new java.awt.Color(102, 0, 51));
        loginNow.setText(" Login");
        loginNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginNowMouseClicked(evt);
            }
        });

        showSignupPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSignupPasswordActionPerformed(evt);
            }
        });

        signupLabel.setForeground(new java.awt.Color(255, 0, 51));
        signupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        signupDOB.setText("1999-12-25");

        javax.swing.GroupLayout signupPaneLayout = new javax.swing.GroupLayout(signupPane);
        signupPane.setLayout(signupPaneLayout);
        signupPaneLayout.setHorizontalGroup(
            signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPaneLayout.createSequentialGroup()
                        .addGroup(signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPaneLayout.createSequentialGroup()
                                .addComponent(signupPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showSignupPassword))
                            .addComponent(signupLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signupName)
                            .addComponent(signupEmail)
                            .addComponent(signupAccountNumber)
                            .addComponent(signupDOB))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPaneLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(loginNow)
                        .addGap(92, 92, 92))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        signupPaneLayout.setVerticalGroup(
            signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupPaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showSignupPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signupPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signupPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(loginNow))
                .addGap(35, 35, 35))
        );

        cards.add(signupPane, "signupPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupNowsignupButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupNowsignupButtonClicked

        cardLayout.show(cards, "signupPanel");
    }//GEN-LAST:event_signupNowsignupButtonClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        addUser();    }//GEN-LAST:event_signupButtonActionPerformed

    private void loginNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginNowMouseClicked
        cardLayout.show(cards, "loginPanel");
    }//GEN-LAST:event_loginNowMouseClicked

    private void showSignupPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSignupPasswordActionPerformed
        if (showSignupPassword.isSelected()) {
            signupPassword.setEchoChar((char) 0);
            scaler.scaleImage("/com/nexbank/nexonlinebanking/closedeye.png", showSignupPassword);
        } else {
            signupPassword.setEchoChar('*');
            scaler.scaleImage("/com/nexbank/nexonlinebanking/openeye.png", showSignupPassword);
        }
    }//GEN-LAST:event_showSignupPasswordActionPerformed

    private void showLoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLoginPasswordActionPerformed
        if (showLoginPassword.isSelected()) {
            loginPassword.setEchoChar((char) 0);
            scaler.scaleImage("/com/nexbank/nexonlinebanking/closedeye.png", showLoginPassword);
        } else {
            loginPassword.setEchoChar('*');
            scaler.scaleImage("/com/nexbank/nexonlinebanking/openeye.png", showLoginPassword);
        }
    }//GEN-LAST:event_showLoginPasswordActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    protected Color errorStyle = Color.red;
    Color successStyle = Color.black;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private void launchDashboard(User c) {
        Dashboard d = new Dashboard();
        d.currentUser = c;
        d.setHome();
        d.setVisible(true);
        this.dispose();
    }

    private void login() {
        if (loginEmail.getText().isBlank() || String.valueOf(loginPassword.getPassword()).isBlank()) {
            loginEmail.setForeground(errorStyle);
            loginPassword.setForeground(errorStyle);
            loginLabel.setText("Missing Email or Password!");
            return;
        }
        String sql = "Select * From users Where email = ? And password = ?";
        try {
            conn = MySQLConnector.connectDB();
            assert conn != null;
            pst = conn.prepareStatement(sql);
            pst.setString(1, loginEmail.getText());
            pst.setString(2, String.valueOf(loginPassword.getPassword()));
            rs = pst.executeQuery();
            if (rs.next()) {
                User c = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(7), rs.getDouble(6));
                launchDashboard(c);
            } else {
                loginEmail.setForeground(errorStyle);
                loginPassword.setForeground(errorStyle);
                loginLabel.setText("Email or password is invalid!");
            }
        } catch (Exception e) {
            System.out.println(e);
            loginLabel.setText("Connection failed, please check your internet.");
            loginLabel.setForeground(errorStyle);
        }
    }

    private boolean emailAlreadyExists() throws SQLException {
        conn = MySQLConnector.connectDB();
        String sql = "Select * From users Where email = ?";
        assert conn != null;
        pst = conn.prepareStatement(sql);
        pst.setString(1, signupEmail.getText());
        ResultSet rs = pst.executeQuery();
        return rs.next();
    }

    private boolean accountNumberAlreadyExists() throws SQLException {
        conn = MySQLConnector.connectDB();
        String sql = "Select * From users Where account_number = ?";
        assert conn != null;
        pst = conn.prepareStatement(sql);
        pst.setString(1, signupAccountNumber.getText());
        ResultSet rs = pst.executeQuery();
        return rs.next();
    }

    private boolean isValidUser() throws SQLException {
        boolean isValid = true;
        if (signupName.getText().isBlank() || (signupName.getText().length() < 10)) {
            signupName.setForeground(errorStyle);
            isValid = false;
        } else {
            signupName.setForeground(successStyle);
        }

        if (signupEmail.getText().isBlank() || (emailAlreadyExists())) {
            signupEmail.setForeground(errorStyle);
            isValid = false;
        } else {
            signupEmail.setForeground(successStyle);
        }

        if (signupAccountNumber.getText().isBlank() || (signupAccountNumber.getText().length() < 8) || accountNumberAlreadyExists()) {
            signupAccountNumber.setForeground(errorStyle);
            isValid = false;
        } else {
            signupAccountNumber.setForeground(successStyle);
        }

        if (String.valueOf(signupPassword.getPassword()).isBlank() || (String.valueOf(signupPassword.getPassword()).length() < 8)) {
            signupPassword.setForeground(errorStyle);
            isValid = false;
        } else {
            signupPassword.setForeground(successStyle);
        }

        if (signupDOB.getText().isBlank()) {
            signupDOB.setForeground(errorStyle);
            isValid = false;
        } else {
            signupDOB.setForeground(successStyle);
        }
        return isValid;
    }

    public void addUser() {
        try {
            if (isValidUser()) {
                String sql = "insert into users (name, email, account_number,balance ,dob, password) values (?,?,?,?,?,?)";
                User newUser = new User(signupName.getText(), signupEmail.getText(), signupDOB.getText(), Integer.parseInt(signupAccountNumber.getText()));
                conn = MySQLConnector.connectDB();
                assert conn != null;
                pst = conn.prepareStatement(sql);
                pst.setString(1, newUser.getName());
                pst.setString(2, newUser.getEmail());
                pst.setInt(3, newUser.getAcc_num());
                pst.setDouble(4, newUser.getBalance());
                pst.setString(5, newUser.getDob());
                pst.setString(6, String.valueOf(signupPassword.getPassword()));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successful SignUp!");
                cardLayout.show(cards, "loginPanel");
            } else {
                signupLabel.setText("Please Fill In The Data Correctly!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            signupLabel.setText("Please Check Your Internet Connection!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cards;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginNow;
    private javax.swing.JPanel loginPane;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JLabel logo;
    private javax.swing.JToggleButton showLoginPassword;
    private javax.swing.JToggleButton showSignupPassword;
    private javax.swing.JFormattedTextField signupAccountNumber;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField signupDOB;
    private javax.swing.JTextField signupEmail;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JTextField signupName;
    private javax.swing.JLabel signupNow;
    private javax.swing.JPanel signupPane;
    private javax.swing.JPasswordField signupPassword;
    // End of variables declaration//GEN-END:variables
}
