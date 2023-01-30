package bms;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umar Aziz
 */
public class LoginBanker extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public LoginBanker() {
        initComponents();
    }
    void enter(JPanel btn){
        btn.setBackground(new Color(21,79,128));
    }
    void exit(JPanel btn){
        btn.setBackground(new Color(21,103,153));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        smalllogo = new javax.swing.JLabel();
        DBMS1 = new javax.swing.JLabel();
        DBMS = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BasePanel = new javax.swing.JPanel();
        loginprofiletext = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        signbtn = new javax.swing.JLabel();
        LoginProfile = new javax.swing.JLabel();
        passwordtf = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(21, 103, 153,150));

        smalllogo.setBackground(new java.awt.Color(21, 103, 153));
        smalllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smalllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/logo.png"))); // NOI18N

        DBMS1.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        DBMS1.setForeground(new java.awt.Color(255, 255, 255));
        DBMS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DBMS1.setText("MANAGEMENT SYSTEM ");

        DBMS.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        DBMS.setForeground(new java.awt.Color(255, 255, 255));
        DBMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DBMS.setText("DIGITAL BANK ");

        jButton2.setBackground(new java.awt.Color(21, 103, 153));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\KAMIL RAZA\\Documents\\NetBeansProjects\\BMS\\src\\pics\\icons8-logout-rounded-left-30.png")); // NOI18N
        jButton2.setText("Logout");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DBMS1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addComponent(smalllogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DBMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(smalllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DBMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DBMS1)
                .addGap(83, 83, 83)
                .addComponent(jButton2)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/mainbankbg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        BasePanel.setBackground(new java.awt.Color(255, 255, 255));

        loginprofiletext.setBackground(new java.awt.Color(21, 103, 153));
        loginprofiletext.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        loginprofiletext.setForeground(new java.awt.Color(21, 103, 153));
        loginprofiletext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginprofiletext.setText(" Welcome Admin");

        Password.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Password.setText("Password:");

        Username1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Username1.setText(" Username:");

        usernametf.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        usernametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametfActionPerformed(evt);
            }
        });

        signbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/sign-in.png"))); // NOI18N
        signbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signbtnMouseClicked(evt);
            }
        });

        LoginProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/login-profile.png"))); // NOI18N

        passwordtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtfActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-close-window-30.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BasePanelLayout = new javax.swing.GroupLayout(BasePanel);
        BasePanel.setLayout(BasePanelLayout);
        BasePanelLayout.setHorizontalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginprofiletext, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametf, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtf)))
                    .addGroup(BasePanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(signbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addGroup(BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(LoginProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BasePanelLayout.setVerticalGroup(
            BasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasePanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(LoginProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(loginprofiletext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernametf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(signbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(BasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 520, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametfActionPerformed

    private void signbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signbtnMouseClicked
        
        String username="admin12";
        String password="adminpassword12";
        
        if(usernametf.getText().equals(username) && passwordtf.getText().equals(password)){
        
        AddAccount Addacc=new AddAccount();    
        Addacc.setVisible(true);
        dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong Details");
        }
    }//GEN-LAST:event_signbtnMouseClicked

    private void passwordtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtfActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main mn=new Main();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(LoginBanker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBanker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBanker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBanker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBanker().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BasePanel;
    private javax.swing.JLabel DBMS;
    private javax.swing.JLabel DBMS1;
    private javax.swing.JLabel LoginProfile;
    private javax.swing.JLabel Password;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Username1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginprofiletext;
    private javax.swing.JPasswordField passwordtf;
    private javax.swing.JLabel signbtn;
    private javax.swing.JLabel smalllogo;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
