package nuevo;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class eliminar_user extends javax.swing.JFrame {
Connection con=null;
Statement stmt=null; 
String url = "jdbc:mysql://localhost:3306/login";
String usuario = "root";
String contraseña = "root";              

    public eliminar_user() {
        initComponents();
        setTitle("Eliminar registro");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto5.png")).getImage());
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/img/Fondo-escritorio-Naruto.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono); 
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon foto1=new ImageIcon(this.getClass().getResource("/iconos/naruto23.png"));
        Icon icono1=new ImageIcon(foto1.getImage().getScaledInstance(eliminar.getWidth(),eliminar.getHeight(),Image.SCALE_DEFAULT));
        eliminar.setIcon(icono1);
        this.repaint();
        ImageIcon foto2=new ImageIcon(this.getClass().getResource("/iconos/naruto36.png"));
        Icon icono2=new ImageIcon(foto2.getImage().getScaledInstance(cancelar.getWidth(),cancelar.getHeight(),Image.SCALE_DEFAULT));
        cancelar.setIcon(icono2);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        user2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 230, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Eliminar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, 60));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Cancelar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 70, 60));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
     boolean p;
        String usu=user2.getText(); 
             if(usu.equals("")){
                 jOptionPane1.showMessageDialog(null,"Usuario no ingresado");
             }else{
                 try{
                 Class.forName("com.mysql.jdbc.Driver").newInstance();              
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) {
                    System.out.println("Se ha establecido una conexión a la base de datos de " +  "\n " + url );   
                  stmt = con.createStatement(); 
                  ResultSet rs = stmt.executeQuery("select * from login.bd");
                  while(rs.next()){
                      if(!usu.equals(rs.getString(9))){
                          jOptionPane1.showMessageDialog(null, "El usuario no existe");
                      }else{
                          if(usu.equals(rs.getString(9))){
                          usu=rs.getString(9);
                          stmt.executeUpdate("delete from login.bd where user='"+usu+"'");
                          jOptionPane1.showMessageDialog(null,"Usuario eliminado con éxito");
                          dispose();
                      } 
                      }
                          
                  }          
                  
             }     
        } catch (InstantiationException ex) {
           Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       }    
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();                    
//                    dispose();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }   
             }
             
    }//GEN-LAST:event_eliminarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(eliminar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminar_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminar_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField user2;
    // End of variables declaration//GEN-END:variables
}
