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
public class login extends javax.swing.JFrame {
    Connection con=null;
    Statement stmt=null;
    ImageIcon foto=new ImageIcon(this.getClass().getResource("/iconos/boruto.jpg"));
    Icon icono=new ImageIcon(foto.getImage().getScaledInstance(60,90,Image.SCALE_DEFAULT));
    String usuari = "root";
    String contraseñ = "root"; 
    public String usu,pas;  
    menú mn=new menú();
    public login() {
        initComponents();        
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto25.png")).getImage());
        mn.imagen_label("img","108142","jpg", fondo);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        contraseña.setVisible(false);
        usuario.setVisible(false);
        siguiente.setVisible(false);        
        registro.setVisible(false);
        cancelar.setVisible(false);
        setTitle("Bienvenido");
        setLocationRelativeTo(null);        
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        comenzar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        registro = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proyecto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        usuario.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, -1));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        comenzar.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        comenzar.setText("Comenzar");
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        getContentPane().add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        siguiente.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        siguiente.setText("Ingresar datos");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        registro.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        registro.setText("Registrarse");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        cancelar.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("conexiones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        contraseña.setVisible(true);
        usuario.setVisible(true);
        siguiente.setVisible(true);
        comenzar.setVisible(false);
        registro.setVisible(true);
        cancelar.setVisible(true);
    }//GEN-LAST:event_comenzarActionPerformed
int ct=0;
//cambiopass cpw=new cambiopass();
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
    usu=usuario.getText();
    pas=contraseña.getText();        
        try {            
            String url = "jdbc:mysql://localhost:3306/login";
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuari,contraseñ);
               if (con!= null){
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from login.bd");
                   while (rs.next()){
                   if(usu.equals(rs.getString(9))&&pas.equals(rs.getString(10))){
                    if(usu.equals("dan14")){
                       jOptionPane1.showMessageDialog(null,"Bienvenido administrador","Mensaje",jOptionPane1.INFORMATION_MESSAGE,icono);
                        menú m=new menú();
                        m.setVisible(true);
                        dispose();
//                        cpw.cp=true;
                   }else{
                        jOptionPane1.showMessageDialog(null,"Puede seguir","Mensaje",jOptionPane1.INFORMATION_MESSAGE,icono);
                        menú mv=new menú();
                        mv.setVisible(true);
                        dispose();
//                        cpw.cp=false;
                    } } }          
      ct++;
        if (ct==3) {
            jOptionPane1.showOptionDialog(siguiente,"Se acabaron el número de oportunidades","Fin del Login", jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE,icono,null,null);
            System.exit(0);
            ct=0;
        } }                   
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
        
    }//GEN-LAST:event_siguienteActionPerformed
int i=0,c=1,b=1;
    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        registro r=new registro();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_registroActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton comenzar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JButton registro;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
