import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DHARUN
 */
public class managerlogin extends javax.swing.JFrame {

    /**
     * Creates new form managerlogin
     */
    public managerlogin() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        one = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        two = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        three = new javax.swing.JPasswordField();
        gets = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel6.setText("MANAGER LOGIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 40, 260, 43);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("NAME  :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 130, 90, 33);

        one.setBackground(new java.awt.Color(204, 204, 255));
        one.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(one);
        one.setBounds(300, 130, 250, 40);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("PASSWORD  :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 220, 150, 30);

        two.setBackground(new java.awt.Color(204, 204, 255));
        two.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(two);
        two.setBounds(300, 220, 250, 40);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("RETYPE PASSWORD  :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 220, 33);

        three.setBackground(new java.awt.Color(204, 204, 255));
        three.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        getContentPane().add(three);
        three.setBounds(300, 300, 250, 40);

        gets.setBackground(new java.awt.Color(204, 204, 255));
        gets.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gets.setText("get started into   >>>>");
        gets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getsActionPerformed(evt);
            }
        });
        getContentPane().add(gets);
        gets.setBounds(150, 420, 370, 50);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 730, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getsActionPerformed
        String name=one.getText();
        String password=String.valueOf(two.getPassword());
        String retypepassword=String.valueOf(three.getPassword());

        String query="SELECT * FROM `manager` WHERE `name`=? AND`password`=? AND`retypepassword`=?";

        PreparedStatement deny;
        ResultSet tommy;

        try{
            deny=connectivity.getConnection().prepareStatement(query);
            deny.setString(1, name);
            deny.setString(2, password);
            deny.setString(3, retypepassword);
            
            tommy=deny.executeQuery();
            if(tommy.next())
            {
                register task=new register();
                task.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"service number (or) password does not match  try after sometime");
            }

        }catch(Exception check){
            System.out.println(check);
        }
    }//GEN-LAST:event_getsActionPerformed

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
            java.util.logging.Logger.getLogger(managerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gets;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField one;
    private javax.swing.JPasswordField three;
    private javax.swing.JPasswordField two;
    // End of variables declaration//GEN-END:variables
}
