
package cafe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.PasswordView;

/**
 *
 * @author eliftugba
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel_hwc = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_passworld = new javax.swing.JPasswordField();
        jLabel_username = new javax.swing.JLabel();
        jLabel_passworld = new javax.swing.JLabel();
        jLabel_visible = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        Btn_close = new javax.swing.JButton();
        jLabel_not_visible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_hwc.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_hwc.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_hwc.setForeground(new java.awt.Color(0, 102, 102));
        jLabel_hwc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_hwc.setText("HELLO WORLD COFFEE");
        jPanel1.add(jLabel_hwc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, 70));

        jTextField_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 240, 30));

        jPasswordField_passworld.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jPasswordField_passworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 184, 240, -1));

        jLabel_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_username.setText("USERNAME:");
        jPanel1.add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));

        jLabel_passworld.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_passworld.setText("PASSWORLD:");
        jPanel1.add(jLabel_passworld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel_visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        jLabel_visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_visibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 20));

        btn_login.setBackground(new java.awt.Color(0, 204, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("LOGİN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        Btn_close.setBackground(new java.awt.Color(255, 0, 51));
        Btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn_close.setText("CLOSE");
        Btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_closeActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel_not_visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invisible.png"))); // NOI18N
        jLabel_not_visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_not_visibleMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_not_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_closeActionPerformed

    int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel_visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_visibleMouseClicked
        jPasswordField_passworld.setEchoChar((char) 0);
        jLabel_visible.setVisible(false);
        jLabel_not_visible.setVisible(true);
    }//GEN-LAST:event_jLabel_visibleMouseClicked

    private void jLabel_not_visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_not_visibleMouseClicked
        jPasswordField_passworld.setEchoChar('*');
        jLabel_visible.setVisible(true);
        jLabel_not_visible.setVisible(false);
    }//GEN-LAST:event_jLabel_not_visibleMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (isEmpty()) {
            String username = jTextField_username.getText();
            String passworld = String.valueOf(jPasswordField_passworld.getPassword());
            
            if (username.equals("elif") && passworld.equals("elif")) {
                try {
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                    dashboard.pack();
                    this.dispose();
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "passworld or username invalid", "warning", 2);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    public boolean isEmpty() {
        if (jLabel_username.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "username is missing", "warning", 2);
            return false;
        }
        if (String.valueOf(jPasswordField_passworld.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "passworld is missing", "warning", 2);
            return false;
        }

        return true;
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
    private javax.swing.JButton Btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel_hwc;
    private javax.swing.JLabel jLabel_not_visible;
    private javax.swing.JLabel jLabel_passworld;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JLabel jLabel_visible;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_passworld;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}