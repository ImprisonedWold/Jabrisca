package edu.uprm.ece.icom4015.jabrisca.client.views;

import javax.swing.AbstractButton;

import edu.uprm.ece.icom4015.jabrisca.client.JabriscaController;

/**
 *
 * @author EltonJohn
 */
public class LoginSingUp extends JabriscaJPanel {

	/**
     * Creates new form LoginSingUp
     */
    public LoginSingUp() {
        super();
    }
    
    /**
     * Creates new form LoginSingUp
     */
    public LoginSingUp(JabriscaController listener) {
        super(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton8 = new javax.swing.JButton();
        
        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(876, 640));

        jPanel1.setPreferredSize(new java.awt.Dimension(876, 30));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Status");
        jLabel2.setName("statusBar_status");
        jPanel1.add(jLabel2);
        jProgressBar1.setName("statusBar_progressBar");
        jPanel1.add(jProgressBar1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setPreferredSize(new java.awt.Dimension(876, 640));
        jPanel2.setLayout(null);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Password");
        jTextField3.setName("password");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(370, 300, 140, 50);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Username");
        jTextField4.setName("username");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(370, 240, 140, 50);
        

        
        jButton3.setText("Sign Up!");
        jButton3.setName("singup"); // NOI18N
        jPanel2.add(jButton3);
        jButton3.setBounds(370, 400, 140, 23);
        
        
        jButton8.setText("Guest");
        jButton8.setName("guest"); // NOI18N
        jPanel2.add(jButton8);
        jButton8.setBounds(370, 430, 140, 23);
        
        jButton4.setText("Login");
        jButton4.setName("login"); // NOI18N
        jPanel2.add(jButton4);
        jButton4.setBounds(370, 370, 140, 23);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(360, 360, 160, 10);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Title.png"))); // NOI18N
        jLabel4.setName("jabrisca"); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(320, 110, 246, 79);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginBackground.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 876, 620);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu4.setText("Options");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("How to Play Brisca");
        jMenuItem1.setName("howToPlay"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        pack();
        setResizable(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginSingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
