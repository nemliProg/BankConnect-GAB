package com.nexbank.nexonlinebanking;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {


    CardLayout cardLayout;
    public User currentUser = new User();

    public Dashboard() {
        initComponents();
        cardLayout = (CardLayout) cards.getLayout();
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/nexbank/nexonlinebanking/icon.png"));
        Image img = icon.getImage();
        this.setLocationRelativeTo(null);
        this.setTitle("IBank");
        this.setIconImage(img);
        scaleIcons();
    }

    private void scaleIcons() {
        ScaleImage scaler = new ScaleImage();
        scaler.scaleImage("/com/nexbank/nexonlinebanking/logout.png", logout);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/home.png", homeButton);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/deposit.png", depositButton);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/withdraw.png", withdrawButton);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/convert.png", convertButton);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/transfer.png", transferButton);
        scaler.scaleImage("/com/nexbank/nexonlinebanking/switchicon.png", switchButton);
    }

    public void setHome() {
        name.setText(currentUser.getName());
        dob.setText(currentUser.getDob());
        accountNumber.setText(Integer.toString(currentUser.getAcc_num()));
        balance.setText("$" + String.format("%.2f", currentUser.getBalance()));
        email.setText(currentUser.getEmail());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        transferButton = new javax.swing.JButton();
        convertButton = new javax.swing.JButton();
        cards = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        accountNumber = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        depositPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirmDepositButton = new javax.swing.JButton();
        depositAmount = new javax.swing.JTextField();
        depositLabel = new javax.swing.JLabel();
        withdrawPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        confirmWithdrawButton = new javax.swing.JButton();
        withdrawLabel = new javax.swing.JLabel();
        withdrawAmount = new javax.swing.JTextField();
        transferPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        confirmTransferButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        transferLabel = new javax.swing.JLabel();
        transferAmount = new javax.swing.JTextField();
        recieverAccountNumber = new javax.swing.JTextField();
        convertPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        firstCurrency = new javax.swing.JComboBox<>();
        convertButton1 = new javax.swing.JButton();
        secondCurrency = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(85, 84, 85));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 550));

        homeButton.setBackground(new java.awt.Color(85, 84, 85));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setFocusPainted(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        withdrawButton.setBackground(new java.awt.Color(85, 84, 85));
        withdrawButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(255, 255, 255));
        withdrawButton.setText("Withdraw");
        withdrawButton.setBorder(null);
        withdrawButton.setBorderPainted(false);
        withdrawButton.setContentAreaFilled(false);
        withdrawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawButton.setFocusPainted(false);
        withdrawButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(new java.awt.Color(85, 84, 85));
        depositButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        depositButton.setForeground(new java.awt.Color(255, 255, 255));
        depositButton.setText("Deposit");
        depositButton.setBorder(null);
        depositButton.setBorderPainted(false);
        depositButton.setContentAreaFilled(false);
        depositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositButton.setFocusPainted(false);
        depositButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        transferButton.setBackground(new java.awt.Color(89, 88, 89));
        transferButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        transferButton.setForeground(new java.awt.Color(255, 255, 255));
        transferButton.setText("Transfer");
        transferButton.setBorder(null);
        transferButton.setBorderPainted(false);
        transferButton.setContentAreaFilled(false);
        transferButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferButton.setFocusPainted(false);
        transferButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferButtonActionPerformed(evt);
            }
        });

        convertButton.setBackground(new java.awt.Color(85, 84, 85));
        convertButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        convertButton.setForeground(new java.awt.Color(255, 255, 255));
        convertButton.setText("Convert");
        convertButton.setBorder(null);
        convertButton.setBorderPainted(false);
        convertButton.setContentAreaFilled(false);
        convertButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertButton.setFocusPainted(false);
        convertButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(transferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(transferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        cards.setBackground(new java.awt.Color(255, 255, 255));
        cards.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 84, 85));
        jLabel1.setText("Hello,");

        name.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        name.setForeground(new java.awt.Color(85, 84, 85));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Account Number:");

        accountNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Date of Birth:");

        dob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(85, 84, 85));
        jLabel9.setText("Current Balance");

        balance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("OverView");

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(accountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        cards.add(homePanel, "homePanel");

        depositPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Please Enter The Deposited Amount Below:");

        jLabel4.setText("Maximum Amount is 10000 Per Deposit.");

        confirmDepositButton.setBackground(new java.awt.Color(85, 84, 85));
        confirmDepositButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        confirmDepositButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmDepositButton.setText("Confirm");
        confirmDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDepositButtonActionPerformed(evt);
            }
        });

        depositAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout depositPanelLayout = new javax.swing.GroupLayout(depositPanel);
        depositPanel.setLayout(depositPanelLayout);
        depositPanelLayout.setHorizontalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositPanelLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(confirmDepositButton)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(depositAmount)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        depositPanelLayout.setVerticalGroup(
            depositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(confirmDepositButton)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        cards.add(depositPanel, "depositPanel");

        withdrawPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Please Enter The Withdrawed Amount Below:");

        jLabel10.setText("Maximum Amount is 10000 Per Deposit.");

        confirmWithdrawButton.setBackground(new java.awt.Color(85, 84, 85));
        confirmWithdrawButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        confirmWithdrawButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmWithdrawButton.setText("Confirm");
        confirmWithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmWithdrawButtonActionPerformed(evt);
            }
        });

        withdrawAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout withdrawPanelLayout = new javax.swing.GroupLayout(withdrawPanel);
        withdrawPanel.setLayout(withdrawPanelLayout);
        withdrawPanelLayout.setHorizontalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawPanelLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(confirmWithdrawButton)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawAmount)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(withdrawLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        withdrawPanelLayout.setVerticalGroup(
            withdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(withdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(confirmWithdrawButton)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        cards.add(withdrawPanel, "withdrawPanel");

        transferPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Please Enter The Reciever Account Number:");

        jLabel14.setText("Maximum Amount is 10000 Per Transfer.");

        confirmTransferButton.setBackground(new java.awt.Color(85, 84, 85));
        confirmTransferButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        confirmTransferButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmTransferButton.setText("Confirm");
        confirmTransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTransferButtonActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Please Enter The Transfered Amount Below:");

        transferAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        recieverAccountNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout transferPanelLayout = new javax.swing.GroupLayout(transferPanel);
        transferPanel.setLayout(transferPanelLayout);
        transferPanelLayout.setHorizontalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferPanelLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(confirmTransferButton)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(transferPanelLayout.createSequentialGroup()
                        .addGroup(transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recieverAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transferAmount))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        transferPanelLayout.setVerticalGroup(
            transferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recieverAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(confirmTransferButton)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        cards.add(transferPanel, "transferPanel");

        convertPanel.setBackground(new java.awt.Color(255, 255, 255));
        convertPanel.setPreferredSize(new java.awt.Dimension(640, 550));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Result");

        resultTextField.setEditable(false);
        resultTextField.setBackground(new java.awt.Color(255, 255, 255));
        resultTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        firstCurrency.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Currency...", "USD", "EUR", "GBP", "CAD", "AED", "EGP", "SAR", "INR", "JPY", "CHF", "RUB", "SGD", "SEK", "BRL", "IQD", "MAD", "CNY", "MXN", "KWD", "TRY", "ARS", "LYD", "AUD", " " }));

        convertButton1.setBackground(new java.awt.Color(85, 84, 85));
        convertButton1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        convertButton1.setForeground(new java.awt.Color(255, 255, 255));
        convertButton1.setText("Convert");
        convertButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButton1ActionPerformed(evt);
            }
        });

        secondCurrency.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Currency...", "USD", "EUR", "GBP", "CAD", "AED", "EGP", "SAR", "INR", "JPY", "CHF", "RUB", "SGD", "SEK", "BRL", "IQD", "MAD", "CNY", "MXN", "KWD", "TRY", "ARS", "LYD", "AUD", " " }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("From");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("To");

        amountTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Amount");

        resetButton.setBackground(new java.awt.Color(85, 84, 85));
        resetButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        switchButton.setContentAreaFilled(false);
        switchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        switchButton.setIconTextGap(0);
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout convertPanelLayout = new javax.swing.GroupLayout(convertPanel);
        convertPanel.setLayout(convertPanelLayout);
        convertPanelLayout.setHorizontalGroup(
            convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, convertPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(convertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(convertPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountTextField)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(convertPanelLayout.createSequentialGroup()
                        .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstCurrency, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultTextField))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        convertPanelLayout.setVerticalGroup(
            convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convertPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCurrency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(convertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        cards.add(convertPanel, "convertPanel");

        jSplitPane1.setRightComponent(cards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed

        cardLayout.show(cards, "homePanel");
        setHome();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        cardLayout.show(cards, "depositPanel");
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        cardLayout.show(cards, "withdrawPanel");
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void transferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferButtonActionPerformed
        cardLayout.show(cards, "transferPanel");
    }//GEN-LAST:event_transferButtonActionPerformed

    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        cardLayout.show(cards, "convertPanel");
    }//GEN-LAST:event_convertButtonActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked

        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void confirmDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDepositButtonActionPerformed

        confirmDeposit();

    }//GEN-LAST:event_confirmDepositButtonActionPerformed

    private void confirmWithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmWithdrawButtonActionPerformed
        confirmWithdraw();
    }//GEN-LAST:event_confirmWithdrawButtonActionPerformed

    private void confirmTransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTransferButtonActionPerformed
        confirmTransfer();    }//GEN-LAST:event_confirmTransferButtonActionPerformed

    private void convertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButton1ActionPerformed
        double amount;
        String from = firstCurrency.getSelectedItem().toString();
        String to = secondCurrency.getSelectedItem().toString();
        String value = "";
        if (firstCurrency.getSelectedIndex() == 0 || secondCurrency.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Currency!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            amount = Double.parseDouble(amountTextField.getText());
            value = String.format("%.2f", convert(from, to, amount));
            resultTextField.setText(value + " " + secondCurrency.getSelectedItem());
        } catch (NumberFormatException e) {
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed!", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_convertButton1ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        firstCurrency.setSelectedIndex(0);
        secondCurrency.setSelectedIndex(0);
        resultTextField.setText("");
        amountTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        int firstIndex = firstCurrency.getSelectedIndex();
        firstCurrency.setSelectedIndex(secondCurrency.getSelectedIndex());
        secondCurrency.setSelectedIndex(firstIndex);
        convertButton1ActionPerformed(evt);
    }//GEN-LAST:event_switchButtonActionPerformed

    Color errorStyle = Color.red;
    Color successStyle = Color.green;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void deposit(double amount) {

        try {
            if ((amount <= 0.0) || (amount > 10000)) {
                throw new IllegalArgumentException();
            }
            double total = amount + currentUser.getBalance();
            currentUser.setBalance(total);
            Connection conn = MySQLConnector.connectDB();
            String sql = "UPDATE users SET balance = ? Where email = ?";
            assert conn != null;
            pst = conn.prepareStatement(sql);
            pst.setDouble(1, total);
            pst.setString(2, currentUser.getEmail());
            pst.executeUpdate();
            depositLabel.setText("Deposit Succeeded");
            depositLabel.setForeground(successStyle);
            depositAmount.setText("");

        } catch (SQLException e) {
            depositLabel.setText("Deposit Failed!");
            depositLabel.setForeground(errorStyle);
            depositAmount.setText("");
        }
    }

    public void confirmDeposit() {
        try {
            double amount = Double.parseDouble(depositAmount.getText());
            deposit(amount);
        } catch (Exception e) {
            depositLabel.setText("Please Enter a Valid Amount!");
            depositLabel.setForeground(errorStyle);
            depositAmount.setText("");
        }
    }

    public void withdraw(double amount) {
        if (((currentUser.getBalance() - amount) < 0) || (amount <= 0) || (amount > 10000)) {
            throw new IllegalArgumentException();
        } else {
            double total = currentUser.getBalance() - amount;
            currentUser.setBalance(total);
            try {

                Connection conn = MySQLConnector.connectDB();
                String sql = "UPDATE users SET balance = ? Where email = ?";
                assert conn != null;
                pst = conn.prepareStatement(sql);
                pst.setDouble(1, total);
                pst.setString(2, currentUser.getEmail());
                pst.executeUpdate();
                withdrawLabel.setText("Withdraw Succeeded");
                withdrawLabel.setForeground(successStyle);
                withdrawAmount.setText("");
            } catch (Exception e) {
                withdrawLabel.setText("Please Enter A Valid Amount!");
                withdrawLabel.setForeground(errorStyle);
                withdrawAmount.setText("");
            }
        }
    }

    public void confirmWithdraw() {
        try {
            double amount = Double.parseDouble(withdrawAmount.getText());
            withdraw(amount);
        } catch (Exception e) {
            withdrawLabel.setText("Please Enter a Numeric Value Less Than 10000");
            withdrawLabel.setForeground(errorStyle);
            withdrawAmount.setText("");
        }
    }

    public void transfer(double amount) throws SQLException {
        if (transferAmount.getText().isBlank() || Objects.equals(recieverAccountNumber.getText(), String.valueOf(currentUser.getAcc_num()))) {
            throw new IllegalArgumentException();
        }
        int recieverAccNumber = Integer.parseInt(recieverAccountNumber.getText());
        Connection conn = MySQLConnector.connectDB();
        String sql = "SELECT* FROM users WHERE account_number = ?";
        assert conn != null;
        pst = conn.prepareStatement(sql);
        pst.setInt(1, recieverAccNumber);
        rs = pst.executeQuery();
        if (rs.next()) {
            User reciever = new User(rs.getString(2), rs.getString(3), rs.getString(6), rs.getInt(4), rs.getDouble(5));
            try {
                if (amount < 0 || amount > currentUser.getBalance() || recieverAccountNumber.getText().length() != 8) {
                    throw new IllegalArgumentException();
                }
                withdraw(Double.parseDouble(transferAmount.getText()));
                User temp = currentUser;
                currentUser = reciever;
                deposit(Double.parseDouble(transferAmount.getText()));
                currentUser = temp;
                transferLabel.setText("Transfer Succeeded!");
                transferLabel.setForeground(successStyle);
                recieverAccountNumber.setText("");
                transferAmount.setText("");
            } catch (Exception e) {
                transferLabel.setText("Transfer Failed!");
                transferLabel.setForeground(errorStyle);
            }
        } else {
            transferLabel.setText("User Not Found!");
            transferLabel.setForeground(errorStyle);
        }
    }

    public void confirmTransfer() {
        try {
            double amount = Double.parseDouble(transferAmount.getText());
            transfer(amount);
        } catch (Exception e) {
            transferLabel.setText("Transfer Failed!");
            transferLabel.setForeground(errorStyle);
        }
    }

    public double convert(String from, String to, double amount) throws MalformedURLException, IOException {
        double result;
        String url_str = "https://api.exchangerate.host/convert?from=" + from + "&to=" + to;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("GET");
        request.connect();
        int responseCode = request.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            String req_result = jsonobj.get("result").getAsString();
            result = Double.parseDouble(req_result);
            return amount * result;
        } else {
            JOptionPane.showMessageDialog(null, "MySQLConnectorion Failed!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNumber;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel balance;
    private javax.swing.JPanel cards;
    private javax.swing.JButton confirmDepositButton;
    private javax.swing.JButton confirmTransferButton;
    private javax.swing.JButton confirmWithdrawButton;
    private javax.swing.JButton convertButton;
    private javax.swing.JButton convertButton1;
    private javax.swing.JPanel convertPanel;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JComboBox<String> firstCurrency;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name;
    private javax.swing.JTextField recieverAccountNumber;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JComboBox<String> secondCurrency;
    private javax.swing.JButton switchButton;
    private javax.swing.JTextField transferAmount;
    private javax.swing.JButton transferButton;
    private javax.swing.JLabel transferLabel;
    private javax.swing.JPanel transferPanel;
    private javax.swing.JTextField withdrawAmount;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JPanel withdrawPanel;
    // End of variables declaration//GEN-END:variables
}
