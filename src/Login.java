
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Project.ConnectionProvider;
import java.sql.*;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        password_pwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        forgot_lbl = new javax.swing.JLabel();
        singup_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setLocation(new java.awt.Point(275, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, 20));

        username_txt.setBackground(new java.awt.Color(255, 255, 204));
        username_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 220, 30));

        password_pwd.setBackground(new java.awt.Color(255, 255, 204));
        password_pwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_pwdActionPerformed(evt);
            }
        });
        getContentPane().add(password_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 220, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hasira Methnuka\\OneDrive\\Desktop\\EAD Project\\Icon\\login.png")); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 100, 30));

        forgot_lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        forgot_lbl.setText("Forgot Password?");
        forgot_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_lblMouseClicked(evt);
            }
        });
        getContentPane().add(forgot_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        singup_btn.setBackground(new java.awt.Color(255, 204, 0));
        singup_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        singup_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/member-add-on-300x300.png"))); // NOI18N
        singup_btn.setText("SignUp");
        singup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        singup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singup_btnActionPerformed(evt);
            }
        });
        getContentPane().add(singup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 110, 30));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Library Management System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/X.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login page1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_pwdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(username_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Every Field is Required");
        }
        else if(username_txt.getText().equals("admin") && password_pwd.getText().equals("admin"))
        {
            setVisible(false);
            new Home().setVisible(true);
            //this.dispose();
        }
        else
         {
            String Query = "select * from user where username='"+username_txt.getText()+"' and password='"+password_pwd.getText()+"'";
            try
            {
                Connection con = ConnectionProvider.createDbConnection();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(Query);
                if(rs.next())
                {
                    new userHome().setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Wrong Username and Pssword");
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, "Insert Username and Password");;
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void singup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singup_btnActionPerformed
        // SignUp Button
        setVisible(false);
        new Registration().setVisible(true);
    }//GEN-LAST:event_singup_btnActionPerformed

    private void forgot_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_lblMouseClicked
        // SignUp
        new forgot().setVisible(true);
    }//GEN-LAST:event_forgot_lblMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password_pwd;
    private javax.swing.JButton singup_btn;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
