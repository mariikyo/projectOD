/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author chaka
 */
public class ProjClothingOD extends javax.swing.JFrame {

    /**
     * Creates new form ProjClothingOD
     */
    public ProjClothingOD() {
        initComponents();
        shopInterf.setEnabledAt(1, false);
        shopInterf.setEnabledAt(2,false);
        shopInterf.setEnabledAt(3,false);

        ////


        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shopInterf = new javax.swing.JTabbedPane();
        loginPnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        passwrdTxt = new javax.swing.JPasswordField();
        usernameTxt = new javax.swing.JTextField();
        usernamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        homeppnl = new javax.swing.JScrollPane();
        homePnl = new javax.swing.JPanel();
        shopppnel = new javax.swing.JScrollPane();
        shopPnl = new javax.swing.JPanel();
        item4ico = new javax.swing.JLabel();
        item1ico = new javax.swing.JLabel();
        item2ico = new javax.swing.JLabel();
        item3ico = new javax.swing.JLabel();
        item12ico = new javax.swing.JLabel();
        item5ico = new javax.swing.JLabel();
        item9ico = new javax.swing.JLabel();
        item7ico = new javax.swing.JLabel();
        item6ico1 = new javax.swing.JLabel();
        item8ico1 = new javax.swing.JLabel();
        item10ico = new javax.swing.JLabel();
        item15ico = new javax.swing.JLabel();
        addcart1 = new javax.swing.JButton();
        addcart2 = new javax.swing.JButton();
        addcart4 = new javax.swing.JButton();
        addcart3 = new javax.swing.JButton();
        addcart5 = new javax.swing.JButton();
        addcart6 = new javax.swing.JButton();
        addcart7 = new javax.swing.JButton();
        addcart8 = new javax.swing.JButton();
        addcart9 = new javax.swing.JButton();
        addcart10 = new javax.swing.JButton();
        addcart11 = new javax.swing.JButton();
        addcart12 = new javax.swing.JButton();
        item11ico = new javax.swing.JLabel();
        item13ico = new javax.swing.JLabel();
        item14ico = new javax.swing.JLabel();
        addcart13 = new javax.swing.JButton();
        addcart15 = new javax.swing.JButton();
        addcart14 = new javax.swing.JButton();
        checkoutPnl = new javax.swing.JPanel();
        aboutpnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logoLbl1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        infolbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shopInterf.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        shopInterf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shopInterf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        loginPnl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginPnl.setLayout(null);

        jPanel1.setOpaque(false);

        usernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernamelbl.setText("Username");

        passwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordlbl.setText("Password");

        loginBtn.setBackground(new java.awt.Color(255, 204, 153));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordlbl)
                    .addComponent(usernamelbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwrdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameTxt)
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(usernamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwrdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        loginPnl.add(jPanel1);
        jPanel1.setBounds(270, 220, 387, 258);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectdcloth/login.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        loginPnl.add(jLabel4);
        jLabel4.setBounds(0, 0, 940, 590);

        shopInterf.addTab("Login", loginPnl);

        homePnl.setLayout(null);
        homeppnl.setViewportView(homePnl);

        shopInterf.addTab("Home", homeppnl);

        shopppnel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        item4ico.setText("upper4");
        item4ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item1ico.setText("upper1");
        item1ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item2ico.setText("upper2");
        item2ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item3ico.setText("upper3");
        item3ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item12ico.setText("upper22");
        item12ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item5ico.setText("upper5");
        item5ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item9ico.setText("lower4");
        item9ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item7ico.setText("lower2");
        item7ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item6ico1.setText("lower1");
        item6ico1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item8ico1.setText("lower3");
        item8ico1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item10ico.setText("lower5");
        item10ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item15ico.setText("upper11");
        item15ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addcart1.setText("Add To Cart");

        addcart2.setText("Add To Cart");

        addcart4.setText("Add To Cart");

        addcart3.setText("Add To Cart");

        addcart5.setText("Add To Cart");

        addcart6.setText("Add To Cart");

        addcart7.setText("Add To Cart");

        addcart8.setText("Add To Cart");

        addcart9.setText("Add To Cart");

        addcart10.setText("Add To Cart");

        addcart11.setText("Add To Cart");

        addcart12.setText("Add To Cart");

        item11ico.setText("upper11");
        item11ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item13ico.setText("upper11");
        item13ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        item14ico.setText("upper11");
        item14ico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addcart13.setText("Add To Cart");

        addcart15.setText("Add To Cart");

        addcart14.setText("Add To Cart");

        javax.swing.GroupLayout shopPnlLayout = new javax.swing.GroupLayout(shopPnl);
        shopPnl.setLayout(shopPnlLayout);
        shopPnlLayout.setHorizontalGroup(
            shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPnlLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(addcart1)
                .addGap(108, 108, 108)
                .addComponent(addcart2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(addcart3)
                .addGap(104, 104, 104)
                .addComponent(addcart4)
                .addGap(156, 156, 156))
            .addGroup(shopPnlLayout.createSequentialGroup()
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shopPnlLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(shopPnlLayout.createSequentialGroup()
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item1ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item5ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item2ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item6ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(shopPnlLayout.createSequentialGroup()
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item9ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item13ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item10ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item14ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(shopPnlLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item12ico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(shopPnlLayout.createSequentialGroup()
                                        .addComponent(item3ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(item4ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(shopPnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item15ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(item11ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(shopPnlLayout.createSequentialGroup()
                                            .addComponent(item7ico, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(item8ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(shopPnlLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(addcart5)
                        .addGap(103, 103, 103)
                        .addComponent(addcart6)
                        .addGap(115, 115, 115)
                        .addComponent(addcart7)
                        .addGap(105, 105, 105)
                        .addComponent(addcart8))
                    .addGroup(shopPnlLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(addcart9)
                        .addGap(109, 109, 109)
                        .addComponent(addcart10)
                        .addGap(106, 106, 106)
                        .addComponent(addcart11)
                        .addGap(105, 105, 105)
                        .addComponent(addcart12))
                    .addGroup(shopPnlLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(addcart13)
                        .addGap(107, 107, 107)
                        .addComponent(addcart14)
                        .addGap(105, 105, 105)
                        .addComponent(addcart15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shopPnlLayout.setVerticalGroup(
            shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item2ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item1ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item3ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item4ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addcart1)
                    .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addcart2)
                        .addComponent(addcart3))
                    .addComponent(addcart4))
                .addGap(23, 23, 23)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item5ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item6ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item8ico1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcart5)
                    .addComponent(addcart6)
                    .addComponent(addcart7)
                    .addComponent(addcart8))
                .addGap(23, 23, 23)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item9ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item10ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item12ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item11ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcart9)
                    .addComponent(addcart10)
                    .addComponent(addcart11)
                    .addComponent(addcart12))
                .addGap(33, 33, 33)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item13ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item14ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item15ico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shopPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcart13)
                    .addComponent(addcart15)
                    .addComponent(addcart14))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        shopppnel.setViewportView(shopPnl);
        shopppnel.setHorizontalScrollBarPolicy(shopppnel.HORIZONTAL_SCROLLBAR_NEVER);

        shopInterf.addTab("Shop", shopppnel);

        javax.swing.GroupLayout checkoutPnlLayout = new javax.swing.GroupLayout(checkoutPnl);
        checkoutPnl.setLayout(checkoutPnlLayout);
        checkoutPnlLayout.setHorizontalGroup(
            checkoutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        checkoutPnlLayout.setVerticalGroup(
            checkoutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        shopInterf.addTab("Checkout", checkoutPnl);

        jLabel1.setText("<html>\n<h2> Our Team </h2>\n<ul style=\"font-size: larger;\">\n    <li>Kyla Marie Otacan</li> \n    <li>Ry Christofer Pahente</li>\n    <li>Abegail Marave</li>\n    <li>Pranz Cloma</li>\n    <li>Jeremy Tan</li>\n    <li>Jose Benito Monsanto</li>\n</ul>\n</html>");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        logoLbl1.setFont(new java.awt.Font("Kindly Rewind", 0, 48)); // NOI18N
        logoLbl1.setText("Delara Clothing Line Co.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(logoLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoLbl1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        infolbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infolbl.setText("<html><center> Delara Clothing Line Co. is a fashion brand that creates unique and stylish clothing for men and women.  Founded with a passion for fashion and a commitment to quality, Delara Clothing Line Co.  offers a range of trendy and affordable pieces that are perfect for any occasion.  With a focus on comfort and versatility, their designs are tailored to meet the needs of modern fashion-forward individuals.  Whether you're looking for a statement piece to dress up your wardrobe or something comfortable and chic for everyday wear,  Delara Clothing Line Co. has you covered.</center> </html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(infolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(infolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setText("<html> <h2> Designers</h2> <ul style=\"font-size: larger;\">     <li>Abegail Marave</li>     <li>Pranz Cloma</li>     <li>Jose Benito Monsanto</li> <li>Kyla Marie Otacan</li> </ul> </html>");

        jLabel3.setText("<html>\n<h2> Developers</h2>\n<ul style=\"font-size: larger;\">\n    <li>Jeremy Tan</li>\n    <li>Ry Christofer Pahente</li>\n    <li>Kyla Marie Otacan</li>\n</ul>\n</html>");

        javax.swing.GroupLayout aboutpnlLayout = new javax.swing.GroupLayout(aboutpnl);
        aboutpnl.setLayout(aboutpnlLayout);
        aboutpnlLayout.setHorizontalGroup(
            aboutpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aboutpnlLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(aboutpnlLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aboutpnlLayout.setVerticalGroup(
            aboutpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpnlLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(aboutpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        shopInterf.addTab("About Us", aboutpnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shopInterf, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(shopInterf, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String llogin = usernameTxt.getText();
        String ppaswd = new String(passwrdTxt.getPassword());

        if (llogin.equals("delara") && ppaswd.equals("delara")){
            JOptionPane.showMessageDialog(this, "Login Successful!");
            shopInterf.setEnabledAt(1, true);
            shopInterf.setEnabledAt(2,true);
            shopInterf.remove(0);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again!");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProjClothingOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjClothingOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjClothingOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjClothingOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjClothingOD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutpnl;
    private javax.swing.JButton addcart1;
    private javax.swing.JButton addcart10;
    private javax.swing.JButton addcart11;
    private javax.swing.JButton addcart12;
    private javax.swing.JButton addcart13;
    private javax.swing.JButton addcart14;
    private javax.swing.JButton addcart15;
    private javax.swing.JButton addcart2;
    private javax.swing.JButton addcart3;
    private javax.swing.JButton addcart4;
    private javax.swing.JButton addcart5;
    private javax.swing.JButton addcart6;
    private javax.swing.JButton addcart7;
    private javax.swing.JButton addcart8;
    private javax.swing.JButton addcart9;
    private javax.swing.JPanel checkoutPnl;
    private javax.swing.JPanel homePnl;
    private javax.swing.JScrollPane homeppnl;
    private javax.swing.JLabel infolbl;
    private javax.swing.JLabel item10ico;
    private javax.swing.JLabel item11ico;
    private javax.swing.JLabel item12ico;
    private javax.swing.JLabel item13ico;
    private javax.swing.JLabel item14ico;
    private javax.swing.JLabel item15ico;
    private javax.swing.JLabel item1ico;
    private javax.swing.JLabel item2ico;
    private javax.swing.JLabel item3ico;
    private javax.swing.JLabel item4ico;
    private javax.swing.JLabel item5ico;
    private javax.swing.JLabel item6ico1;
    private javax.swing.JLabel item7ico;
    private javax.swing.JLabel item8ico1;
    private javax.swing.JLabel item9ico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPnl;
    private javax.swing.JLabel logoLbl1;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwrdTxt;
    private javax.swing.JTabbedPane shopInterf;
    private javax.swing.JPanel shopPnl;
    private javax.swing.JScrollPane shopppnel;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}
