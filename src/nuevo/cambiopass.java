package nuevo;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class cambiopass extends javax.swing.JFrame {
    ImageIcon foto=new ImageIcon(this.getClass().getResource("/iconos/tenten.jpg"));
    Icon icono=new ImageIcon(foto.getImage().getScaledInstance(60,90,Image.SCALE_DEFAULT));
    public boolean cp;    
Connection con=null;
Statement stmt=null; 
String url = "jdbc:mysql://localhost:3306/login";
String usuario = "root";
String contraseña = "root"; 
//login ln=new login();
    public cambiopass() {        
        initComponents();
        setTitle("Cambio de contraseña");
        setLocationRelativeTo(null);        
        setResizable(false);
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/img/fondo sasuke.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        ImageIcon foto1=new ImageIcon(this.getClass().getResource("/iconos/naruto22.png"));
        Icon icono1=new ImageIcon(foto1.getImage().getScaledInstance(guardar.getWidth(),guardar.getHeight(),Image.SCALE_DEFAULT));
        guardar.setIcon(icono1);
        this.repaint();
        ImageIcon foto2=new ImageIcon(this.getClass().getResource("/iconos/naruto37.png"));
        Icon icono2=new ImageIcon(foto2.getImage().getScaledInstance(cancelar.getWidth(),cancelar.getHeight(),Image.SCALE_DEFAULT));
        cancelar.setIcon(icono2);
        this.repaint();
//        if(cp=false){
//            user.setText(""+ln.usu);
//            user.setEditable(false);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass_anterior = new javax.swing.JPasswordField();
        new_pass = new javax.swing.JPasswordField();
        confirm_pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Contraseña anterior");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nueva contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Confirme contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(pass_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, -1));
        getContentPane().add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, -1));
        getContentPane().add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));

        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 70, 60));

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 70, 60));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Guardar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Cancelar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Connection con = null;
   Statement stmt = null;
   String usu=user.getText();
    String pas=pass_anterior.getText();
        try {            
            String url = "jdbc:mysql://localhost:3306/login";
            String usuario = "root";
            String contraseña = "root";              
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null){
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.bd");
                   while (rs.next()){
                       if(usu.equals(rs.getString(9))&&pas.equals(rs.getString(10))){
                           if(new_pass.getText().equals(confirm_pass.getText())){
                               stmt.executeUpdate("update login.bd set Pass='"+confirm_pass.getText()+"' where User='"+usu+"'");  
                                jOptionPane1.showMessageDialog(null,"Su contraseña ha sido cambiada","Contraseña",jOptionPane1.INFORMATION_MESSAGE,icono);
                                menú m=new menú();
                                dispose();
                                m.setVisible(true);
                           } else if(!new_pass.getText().equals(confirm_pass.getText())){
                               jOptionPane1.showMessageDialog(null,"Contraseñas diferentes","Cambio",2);
                           }                      
                       } else if(usu.equals(rs.getString(9))&&!pas.equals(rs.getString(10))){
                           jOptionPane1.showMessageDialog(null,"Contraseña incorrecta","Cambio",2);
                       } else if(!usu.equals(rs.getString(9))){
                           jOptionPane1.showMessageDialog(null,"El usuario no existe","Cambio",2);
                       }
                    }
               }                  
        }
        catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(cambiopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiopass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPasswordField pass_anterior;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
