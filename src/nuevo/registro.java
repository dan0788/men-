package nuevo;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class registro extends javax.swing.JFrame {
Connection con;
Statement stmt;
    public registro() {
        initComponents();
        setTitle("Registro");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto2.png")).getImage());
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/iconos/informacion.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(jButton1.getWidth(),jButton1.getHeight(),Image.SCALE_DEFAULT));
        jButton1.setIcon(icono);
        jButton2.setIcon(icono);
        this.repaint();
        ImageIcon foto1=new ImageIcon(this.getClass().getResource("/img/Ultimate_Ninja_Impact_1.jpg"));
        Icon icono1=new ImageIcon(foto1.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono1);
        this.repaint();
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon foto2=new ImageIcon(this.getClass().getResource("/iconos/naruto15.png"));
        Icon icono2=new ImageIcon(foto2.getImage().getScaledInstance(guardar.getWidth(),guardar.getHeight(),Image.SCALE_DEFAULT));
        guardar.setIcon(icono2);
        this.repaint();
        ImageIcon foto3=new ImageIcon(this.getClass().getResource("/iconos/naruto17.png"));
        Icon icono3=new ImageIcon(foto3.getImage().getScaledInstance(cancelar.getWidth(),cancelar.getHeight(),Image.SCALE_DEFAULT));
        cancelar.setIcon(icono3);
        this.repaint();
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        nick = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        guardar = new javax.swing.JButton();
        pais = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        repitepass = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("DATOS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 220, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("País de nacimiento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setText("Día");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setText("Mes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setText("Año");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 610, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setText("Nick");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        getContentPane().add(nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 140, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel12.setText("User");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 170, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 200, -1));

        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 90, 70));

        pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paisKeyTyped(evt);
            }
        });
        getContentPane().add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, -1));

        dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diaKeyTyped(evt);
            }
        });
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 50, -1));

        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesKeyTyped(evt);
            }
        });
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 50, -1));

        año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añoKeyTyped(evt);
            }
        });
        getContentPane().add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 70, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel17.setText("Repita");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel18.setText("password");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        getContentPane().add(repitepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 0));
        jLabel19.setText("Guardar");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 0));
        jLabel20.setText("Cancelar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 70));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 20, 20));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 20, 20));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jTextField1.setText("Nombre con el que serás conocido");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jTextField2.setText("por el resto del programa");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jTextField3.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jTextField3.setText("Se recomienda una contraseña que contenga entre");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jTextField4.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jTextField4.setText("mayúsculas y minúsculas, números y caracteres.");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
            evt.consume();}//hace que esa pulsación de tecla se rechace y el JTextField no la trate
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
            evt.consume();}
    }//GEN-LAST:event_apellidoKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String cadena2,cadena3,cadena4,cadena8,cadena9,cadena10,cadena12;       
        int cadena5,cadena6,cadena7,cadena11;
        Calendar fecha = GregorianCalendar.getInstance();
        cadena11= fecha.getWeekYear();
        cadena2 = nombre.getText();
        cadena3 = apellido.getText();
        cadena4 = pais.getText();
        cadena5 = Integer.parseInt(dia.getText());
        cadena6 = Integer.parseInt(mes.getText());
        cadena7 = Integer.parseInt(año.getText());
        cadena8 = nick.getText();
        cadena9 = user.getText();
        cadena10 = password.getText().toString();
        cadena12= repitepass.getText().toString();
        if(cadena7>cadena11){
            javax.swing.JOptionPane.showMessageDialog(this,"Fecha incorrecta\nNo puedes haber nacido en el futuro","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(cadena7<=(cadena11-100)){
                javax.swing.JOptionPane.showMessageDialog(this,"Fecha incorrecta\nNo puedes ser tan viejo","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                            
        if(cadena10.equals(cadena12)){
            if (cadena2.equals("")||cadena3.equals("")||cadena8.equals("")||cadena9.equals("")
           ||cadena4.equals("")||cadena5<1||cadena5>31||(cadena6==2&&cadena5>29&&(cadena7%4==0||cadena7%400==0))||(cadena6==2&&cadena5>28&&(cadena7%4!=0||cadena7%400!=0))
                ||cadena6<1||cadena6>12||cadena10.equals("")||cadena7>=cadena11) {            
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \no la fecha está mal ingresada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            nombre.requestFocus();
        } else {
        try {           
            String url = "jdbc:mysql://localhost:3306/login";
            String usuario = "root";
            String contraseña = "root";            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos de " +  "\n " + url );   
                  stmt = con.createStatement(); 
//                  stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS login");
//                  stmt.executeUpdate("CREATE TABLE IF NOT EXISTS bd()");
                  stmt.executeUpdate("INSERT INTO login.bd(Nombre,Apellido,País,Día,Mes,Año,Nick,User,Pass) VALUES('"+cadena2+"','"+cadena3+"'"
                          + ",'"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"','"+cadena8+"','"+cadena9+"','"+cadena10+"')");
                  //executeUpdate es para insertar datos en la tabla
                  
                  System.out.println("Los valores han sido agregados a la base de datos ");                 
                   
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
            boolean a,b;
            if (con != null) {
                try {
                    
                    
                    con.close();
                    stmt.close();
                    login lg=new login();
                    dispose();
                    lg.setVisible(true);
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         
        this.nombre.setText("");
        this.apellido.setText("");
        this.pais.setText("");
        this.dia.setText("");
        this.mes.setText("");
        this.año.setText("");
        this.nick.setText("");
        this.user.setText("");
        this.password.setText("");
        this.repitepass.setText("");
        }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this,"Contraseñas diferentes","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
            }
        }
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void paisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paisKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '||c>' ')){
            evt.consume();
        }
    }//GEN-LAST:event_paisKeyTyped

    private void diaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if(c<'0'||c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_diaKeyTyped

    private void mesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if(c<'0'||c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_mesKeyTyped

    private void añoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyTyped
        char c=evt.getKeyChar();//este método sirve para ingresar un tipo de variable
        if(c<'0'||c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_añoKeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();        
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
    }//GEN-LAST:event_jButton1MousePressed
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField año;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nick;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pais;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repitepass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
