/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrms;

import java.awt.HeadlessException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LORDsajan
 */
public class AdminPanel extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        Addpan.setVisible(false);
        EditPan.setVisible(false);
        AdduserPanel.setVisible(false);
        EditUserPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AddLa = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        Addpan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        nextBtn = new javax.swing.JButton();
        prevBtn1 = new javax.swing.JButton();
        EditUser = new javax.swing.JLabel();
        EditPan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdduserPanel = new javax.swing.JPanel();
        heading2 = new javax.swing.JPanel();
        addClose = new javax.swing.JLabel();
        headLabel2 = new javax.swing.JLabel();
        addresslab = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        addresslab3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        addresslab4 = new javax.swing.JLabel();
        ContADDinp = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        userAdd = new javax.swing.JTextField();
        EmailADD = new javax.swing.JTextField();
        addresslab2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        addresslab5 = new javax.swing.JLabel();
        fullnameAdd = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        passAddinp = new javax.swing.JPasswordField();
        addresslab6 = new javax.swing.JLabel();
        TypeAddinp = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        AddSubBtn = new javax.swing.JButton();
        addresslab9 = new javax.swing.JLabel();
        useridadd = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        EditUserPanel = new javax.swing.JPanel();
        heading3 = new javax.swing.JPanel();
        headLabel3 = new javax.swing.JLabel();
        editClose = new javax.swing.JLabel();
        addresslab1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        addresslab7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        usernameEd = new javax.swing.JTextField();
        OldPassEd = new javax.swing.JPasswordField();
        EdSubBtn = new javax.swing.JButton();
        addresslab8 = new javax.swing.JLabel();
        NewPassEd = new javax.swing.JPasswordField();
        jSeparator11 = new javax.swing.JSeparator();
        addresslab10 = new javax.swing.JLabel();
        newusernameEd = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AdminPanel");
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddLa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddLa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/images/addim.png"))); // NOI18N
        AddLa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddLaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddLaMouseExited(evt);
            }
        });
        jPanel1.add(AddLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 230, 230));

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        labelDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(labelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 160, 30));

        Addpan.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout AddpanLayout = new javax.swing.GroupLayout(Addpan);
        Addpan.setLayout(AddpanLayout);
        AddpanLayout.setHorizontalGroup(
            AddpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        AddpanLayout.setVerticalGroup(
            AddpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(Addpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 230, 230));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(51, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(51, 204, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 10, 40));

        nextBtn.setBackground(new java.awt.Color(0, 102, 102));
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/images/next2.png"))); // NOI18N
        nextBtn.setBorderPainted(false);
        nextBtn.setEnabled(false);
        nextBtn.setFocusPainted(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel2.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        prevBtn1.setBackground(new java.awt.Color(0, 102, 102));
        prevBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/images/prev2.png"))); // NOI18N
        prevBtn1.setBorderPainted(false);
        prevBtn1.setFocusPainted(false);
        prevBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(prevBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        EditUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/images/ediit.png"))); // NOI18N
        EditUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditUserMouseExited(evt);
            }
        });
        jPanel1.add(EditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 230, 230));

        EditPan.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout EditPanLayout = new javax.swing.GroupLayout(EditPan);
        EditPan.setLayout(EditPanLayout);
        EditPanLayout.setHorizontalGroup(
            EditPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        EditPanLayout.setVerticalGroup(
            EditPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel1.add(EditPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 230, 230));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 230, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD USER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 230, 40));

        AdduserPanel.setBackground(new java.awt.Color(149, 183, 221));
        AdduserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading2.setBackground(new java.awt.Color(0, 102, 102));
        heading2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/images/close.png"))); // NOI18N
        addClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCloseMouseClicked(evt);
            }
        });
        heading2.add(addClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 40));

        headLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        headLabel2.setForeground(new java.awt.Color(255, 255, 255));
        headLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headLabel2.setText("ADD USER");
        heading2.add(headLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        AdduserPanel.add(heading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 40));

        addresslab.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab.setText("Username");
        AdduserPanel.add(addresslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 80, 20));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 200, 10));

        addresslab3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab3.setText("Password");
        AdduserPanel.add(addresslab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 80, 20));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 200, 10));

        addresslab4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab4.setText("Contact");
        AdduserPanel.add(addresslab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 80, 20));

        ContADDinp.setBackground(new java.awt.Color(149, 183, 221));
        ContADDinp.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        ContADDinp.setForeground(new java.awt.Color(0, 0, 51));
        ContADDinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContADDinp.setBorder(null);
        ContADDinp.setOpaque(false);
        ContADDinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContADDinpActionPerformed(evt);
            }
        });
        AdduserPanel.add(ContADDinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 200, 20));

        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 200, 10));

        userAdd.setBackground(new java.awt.Color(149, 183, 221));
        userAdd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        userAdd.setForeground(new java.awt.Color(0, 0, 51));
        userAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userAdd.setBorder(null);
        userAdd.setOpaque(false);
        AdduserPanel.add(userAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 20));

        EmailADD.setBackground(new java.awt.Color(149, 183, 221));
        EmailADD.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        EmailADD.setForeground(new java.awt.Color(0, 0, 51));
        EmailADD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailADD.setBorder(null);
        EmailADD.setOpaque(false);
        AdduserPanel.add(EmailADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 200, 20));

        addresslab2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab2.setText("Email");
        AdduserPanel.add(addresslab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 80, 20));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 200, 10));

        addresslab5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab5.setText("Full Name");
        AdduserPanel.add(addresslab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, 20));

        fullnameAdd.setBackground(new java.awt.Color(149, 183, 221));
        fullnameAdd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        fullnameAdd.setForeground(new java.awt.Color(0, 0, 51));
        fullnameAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullnameAdd.setBorder(null);
        fullnameAdd.setOpaque(false);
        AdduserPanel.add(fullnameAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 200, 20));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 200, 10));

        passAddinp.setBackground(new java.awt.Color(149, 183, 221));
        passAddinp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passAddinp.setForeground(new java.awt.Color(204, 204, 255));
        passAddinp.setBorder(null);
        passAddinp.setCaretColor(new java.awt.Color(255, 255, 255));
        passAddinp.setOpaque(false);
        AdduserPanel.add(passAddinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 200, 20));

        addresslab6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab6.setText("Type");
        AdduserPanel.add(addresslab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 80, 20));

        TypeAddinp.setBackground(new java.awt.Color(149, 183, 221));
        TypeAddinp.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        TypeAddinp.setForeground(new java.awt.Color(0, 0, 51));
        TypeAddinp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TypeAddinp.setText("Admin");
        TypeAddinp.setBorder(null);
        TypeAddinp.setOpaque(false);
        TypeAddinp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeAddinpActionPerformed(evt);
            }
        });
        AdduserPanel.add(TypeAddinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 200, 20));

        jSeparator10.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 200, 10));

        AddSubBtn.setBackground(new java.awt.Color(0, 153, 102));
        AddSubBtn.setText("SUBMIT");
        AddSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubBtnActionPerformed(evt);
            }
        });
        AdduserPanel.add(AddSubBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 380, 40));

        addresslab9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab9.setText("User ID");
        AdduserPanel.add(addresslab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        useridadd.setBackground(new java.awt.Color(149, 183, 221));
        useridadd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        useridadd.setForeground(new java.awt.Color(0, 0, 51));
        useridadd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        useridadd.setBorder(null);
        useridadd.setOpaque(false);
        AdduserPanel.add(useridadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 200, 20));

        jSeparator12.setForeground(new java.awt.Color(204, 204, 204));
        AdduserPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 10));

        jPanel1.add(AdduserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 580, 540));

        EditUserPanel.setBackground(new java.awt.Color(149, 183, 221));
        EditUserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading3.setBackground(new java.awt.Color(0, 102, 102));
        heading3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        headLabel3.setForeground(new java.awt.Color(255, 255, 255));
        headLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headLabel3.setText("EDIT USER");
        heading3.add(headLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        editClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\LORDsajan\\Documents\\NetBeansProjects\\javaclassuiui\\HRMS\\images\\close.png")); // NOI18N
        editClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCloseMouseClicked(evt);
            }
        });
        heading3.add(editClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 40));

        EditUserPanel.add(heading3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 40));

        addresslab1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab1.setText("Username");
        EditUserPanel.add(addresslab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, 20));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        EditUserPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, 10));

        addresslab7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab7.setText("Old Password");
        EditUserPanel.add(addresslab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 110, 20));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        EditUserPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, 10));

        usernameEd.setBackground(new java.awt.Color(149, 183, 221));
        usernameEd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        usernameEd.setForeground(new java.awt.Color(0, 0, 51));
        usernameEd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameEd.setBorder(null);
        usernameEd.setOpaque(false);
        EditUserPanel.add(usernameEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 20));

        OldPassEd.setBackground(new java.awt.Color(149, 183, 221));
        OldPassEd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        OldPassEd.setForeground(new java.awt.Color(51, 51, 51));
        OldPassEd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        OldPassEd.setBorder(null);
        OldPassEd.setCaretColor(new java.awt.Color(255, 255, 255));
        OldPassEd.setOpaque(false);
        OldPassEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPassEdActionPerformed(evt);
            }
        });
        EditUserPanel.add(OldPassEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 20));

        EdSubBtn.setBackground(new java.awt.Color(0, 153, 102));
        EdSubBtn.setText("SUBMIT");
        EdSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdSubBtnActionPerformed(evt);
            }
        });
        EditUserPanel.add(EdSubBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 400, 40));

        addresslab8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab8.setText("New Password");
        EditUserPanel.add(addresslab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 20));

        NewPassEd.setBackground(new java.awt.Color(149, 183, 221));
        NewPassEd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NewPassEd.setForeground(new java.awt.Color(153, 153, 153));
        NewPassEd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NewPassEd.setBorder(null);
        NewPassEd.setCaretColor(new java.awt.Color(255, 255, 255));
        NewPassEd.setOpaque(false);
        EditUserPanel.add(NewPassEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, 20));

        jSeparator11.setForeground(new java.awt.Color(204, 204, 204));
        EditUserPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 200, 10));

        addresslab10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        addresslab10.setText("New Username");
        EditUserPanel.add(addresslab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 20));

        newusernameEd.setBackground(new java.awt.Color(149, 183, 221));
        newusernameEd.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        newusernameEd.setForeground(new java.awt.Color(0, 0, 51));
        newusernameEd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newusernameEd.setBorder(null);
        newusernameEd.setOpaque(false);
        EditUserPanel.add(newusernameEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 20));

        jSeparator13.setForeground(new java.awt.Color(204, 204, 204));
        EditUserPanel.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 200, 10));

        jPanel1.add(EditUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 580, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 802, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnActionPerformed

    private void prevBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtn1ActionPerformed
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prevBtn1ActionPerformed

    private void AddLaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLaMouseExited
        Addpan.setVisible(false);
    }//GEN-LAST:event_AddLaMouseExited

    private void AddLaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLaMouseEntered
        Addpan.setVisible(true);
    }//GEN-LAST:event_AddLaMouseEntered

    private void EditUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditUserMouseEntered
        EditPan.setVisible(true);
    }//GEN-LAST:event_EditUserMouseEntered

    private void EditUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditUserMouseExited
        EditPan.setVisible(false);
    }//GEN-LAST:event_EditUserMouseExited

    private void ContADDinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContADDinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContADDinpActionPerformed

    private void TypeAddinpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeAddinpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeAddinpActionPerformed

    private void AddSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubBtnActionPerformed
        AddLa.setVisible(true);
        EditUser.setVisible(true);
        AdduserPanel.setVisible(false);
        EditUserPanel.setVisible(false);
        EditPan.setVisible(false);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        try {

            String id = useridadd.getText();
            String fullname = fullnameAdd.getText();
            String email = EmailADD.getText();
            String username = userAdd.getText();
            char[] password = passAddinp.getPassword();
            String pass = MD5(new String(password));
            String cont = ContADDinp.getText();
            String type = TypeAddinp.getText();
            SqliteConnect.connectDb();
            String sql = "INSERT INTO user(id,full_name,email,username,password,phone_no,type)VALUES('" + id + "','" + fullname + "','" + email + "','" + username + "','" + pass + "','" + cont + "','" + type + "');";
            pst = SqliteConnect.conn.prepareStatement(sql);
            int a = pst.executeUpdate();
            if (a != 0) {
                JOptionPane.showMessageDialog(null, "User added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error in insertation");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_AddSubBtnActionPerformed

    private void EdSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdSubBtnActionPerformed
        String name = usernameEd.getText();
        String newName = newusernameEd.getText();
        char[] op = OldPassEd.getPassword();
        String oldPass = MD5(new String(op));
        char[] np = NewPassEd.getPassword();
        String newPass = MD5(new String(np));
        if (name != null && op != null && np != null && newName != null) {
            try {
                SqliteConnect.connectDb();
                String sql = "SELECT * FROM user WHERE username='" + name + "'";
                pst = SqliteConnect.conn.prepareStatement(sql);
                rs = pst.executeQuery();
                String Old = null;
                String Onam = null;
                while (rs.next()) {
                    Old = rs.getString("password");
                    Onam = rs.getString("username");
                }
                if (Old.equals(oldPass) == false) {
                    JOptionPane.showMessageDialog(null, "The given password doesnot match");
                } else if (Onam.equals(newName)) {
                    JOptionPane.showMessageDialog(null, "Please provide a new name");
                } else {
                    SqliteConnect.connectDb();
                    String sqli = "UPDATE user SET username='" + newName + "',password='" + newPass + "' WHERE username='" + name + "'";
                    System.out.println(sqli);
                    pst = SqliteConnect.conn.prepareStatement(sqli);
                    System.out.println(sqli);
                    int a = pst.executeUpdate();
                    if (a != 0) {
                        JOptionPane.showMessageDialog(null, "Successfully Edited User");
                    } else {
                        JOptionPane.showMessageDialog(null, "Something went wrong in editing");
                    }
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cant be Null");
        }
    }//GEN-LAST:event_EdSubBtnActionPerformed

    private void AddLaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLaMouseClicked
        AddLa.setVisible(false);
        EditUser.setVisible(false);
        AdduserPanel.setVisible(true);
        Addpan.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_AddLaMouseClicked

    private void EditUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditUserMouseClicked
        AddLa.setVisible(false);
        EditUser.setVisible(false);
        AdduserPanel.setVisible(false);
        EditUserPanel.setVisible(true);
        EditPan.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_EditUserMouseClicked

    private void editCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCloseMouseClicked
        AddLa.setVisible(true);
        EditUser.setVisible(true);
        AdduserPanel.setVisible(false);
        EditUserPanel.setVisible(false);
        EditPan.setVisible(false);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);

    }//GEN-LAST:event_editCloseMouseClicked

    private void addCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCloseMouseClicked
        AddLa.setVisible(true);
        EditUser.setVisible(true);
        AdduserPanel.setVisible(false);
        EditUserPanel.setVisible(false);
        EditPan.setVisible(false);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_addCloseMouseClicked

    private void OldPassEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPassEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPassEdActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLa;
    private javax.swing.JButton AddSubBtn;
    private javax.swing.JPanel Addpan;
    private javax.swing.JPanel AdduserPanel;
    protected javax.swing.JTextField ContADDinp;
    private javax.swing.JButton EdSubBtn;
    private javax.swing.JPanel EditPan;
    private javax.swing.JLabel EditUser;
    private javax.swing.JPanel EditUserPanel;
    protected javax.swing.JTextField EmailADD;
    private javax.swing.JPasswordField NewPassEd;
    private javax.swing.JPasswordField OldPassEd;
    protected javax.swing.JTextField TypeAddinp;
    private javax.swing.JLabel addClose;
    private javax.swing.JLabel addresslab;
    private javax.swing.JLabel addresslab1;
    private javax.swing.JLabel addresslab10;
    private javax.swing.JLabel addresslab2;
    private javax.swing.JLabel addresslab3;
    private javax.swing.JLabel addresslab4;
    private javax.swing.JLabel addresslab5;
    private javax.swing.JLabel addresslab6;
    private javax.swing.JLabel addresslab7;
    private javax.swing.JLabel addresslab8;
    private javax.swing.JLabel addresslab9;
    private javax.swing.JLabel editClose;
    protected javax.swing.JTextField fullnameAdd;
    private javax.swing.JLabel headLabel2;
    private javax.swing.JLabel headLabel3;
    private javax.swing.JPanel heading2;
    private javax.swing.JPanel heading3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel lblTime;
    protected javax.swing.JTextField newusernameEd;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPasswordField passAddinp;
    private javax.swing.JButton prevBtn1;
    protected javax.swing.JTextField userAdd;
    protected javax.swing.JTextField useridadd;
    protected javax.swing.JTextField usernameEd;
    // End of variables declaration//GEN-END:variables

    private String MD5(String password) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes(Charset.forName("US-ASCII")), 0, password.length());
            byte[] magnitude = digest.digest();
            BigInteger bi = new BigInteger(1, magnitude);
            String hash = String.format("%0" + (magnitude.length << 1) + "x", bi);
            return hash;
        } catch (NoSuchAlgorithmException e) {
        }
        return "";
    }
}
