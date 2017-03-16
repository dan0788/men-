package nuevo;
import java.io.IOException;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class paginasweb extends javax.swing.JFrame {
menú mn=new menú();
public void abrir_web(String dir){
    try{
            if(Desktop.isDesktopSupported()){
                Desktop d=Desktop.getDesktop();
                if(d.isSupported(Desktop.Action.BROWSE)){
                    d.browse(new URI(dir));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
}
public void borrado(JTextField frame){
    frame.setText("");
    frame.requestFocus();
}
    public paginasweb() {        
        initComponents();        
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto4.png")).getImage());
        mn.imagen_label("img","wallpaper-hd-de-naruto-shippuden","jpg", fondo);        
        this.repaint();
        setTitle("Páginas web");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        paginas = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        Youtube = new javax.swing.JButton();
        facebook = new javax.swing.JButton();
        google = new javax.swing.JButton();
        vetealaversh = new javax.swing.JButton();
        Hotmail = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mega = new javax.swing.JButton();
        tbbt = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paginas.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        paginas.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 50, 320, 30));

        entrar.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, -1));

        Youtube.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        Youtube.setText("Youtube");
        Youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YoutubeActionPerformed(evt);
            }
        });
        getContentPane().add(Youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, -1));

        facebook.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        facebook.setText("Facebook");
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        google.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        google.setText("Google");
        google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleActionPerformed(evt);
            }
        });
        getContentPane().add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, -1));

        vetealaversh.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        vetealaversh.setText("Vete a la versh");
        vetealaversh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetealavershActionPerformed(evt);
            }
        });
        getContentPane().add(vetealaversh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, -1));

        Hotmail.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        Hotmail.setText("Hotmail");
        Hotmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotmailActionPerformed(evt);
            }
        });
        getContentPane().add(Hotmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, -1));

        salir.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 70, -1));

        mega.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        mega.setText("Mega");
        mega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megaActionPerformed(evt);
            }
        });
        getContentPane().add(mega, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        tbbt.setFont(new java.awt.Font("Cambria Math", 0, 13)); // NOI18N
        tbbt.setText("The Big Bang Theory");
        tbbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbbtActionPerformed(evt);
            }
        });
        getContentPane().add(tbbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String url="";
        url=paginas.getText();
        abrir_web(url); 
        borrado(paginas);
    }//GEN-LAST:event_entrarActionPerformed

    private void YoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YoutubeActionPerformed
        abrir_web("https://www.youtube.com/");
        borrado(paginas);
    }//GEN-LAST:event_YoutubeActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        abrir_web("https://www.facebook.com/");
        borrado(paginas);
    }//GEN-LAST:event_facebookActionPerformed

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
        abrir_web("https://www.google.com.ec/");
        borrado(paginas);
    }//GEN-LAST:event_googleActionPerformed

    private void vetealavershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetealavershActionPerformed
        abrir_web("https://www.youtube.com/user/vetealaversha");
        borrado(paginas);
    }//GEN-LAST:event_vetealavershActionPerformed

    private void HotmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotmailActionPerformed
        abrir_web("https://www.hotmail.com/");
        borrado(paginas);
    }//GEN-LAST:event_HotmailActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void megaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megaActionPerformed
        abrir_web("https://www.mega.nz/");
        borrado(paginas);
    }//GEN-LAST:event_megaActionPerformed

    private void tbbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbbtActionPerformed
    String opciones[]={"1","2","3","4","5","6","7","8","9","10"};
    int opcion=jOptionPane1.showOptionDialog(null,"Selecciona una temporada","Elegir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);    
    if(opciones[opcion].equals("1")||opciones[opcion].equals("2")||opciones[opcion].equals("3")
            ||opciones[opcion].equals("4")||opciones[opcion].equals("5")){
        abrir_web("http://lateoriadelbigbangenlatino.blogspot.com/2013/06/ver-big-bang-theory-temporada-"+opciones[opcion]+"-en.html");
    } else{
        if(opciones[opcion].equals("6")){
            abrir_web("http://lateoriadelbigbangenlatino.blogspot.com/2013/06/ver-big-bang-theory-temporada-"+opciones[opcion]+".html");
        }else{
            if(opciones[opcion].equals("8")){
                abrir_web("http://lateoriadelbigbangenlatino.blogspot.com/search/label/Temporada%208");
            }else{
                if(opciones[opcion].equals("7")){
                    abrir_web("http://lateoriadelbigbangenlatino.blogspot.com/2014/10/ver-big-bang-theory-temporada-"+opciones[opcion]+".html");
                }else{
                    if(opciones[opcion].equals("9")||opciones[opcion].equals("10")){
                        abrir_web("http://lateoriadelbigbangenlatino.blogspot.pe/search/label/Temporada%20"+opciones[opcion]);
                    }
                }
            }
        }
    }  
        borrado(paginas);    
    }//GEN-LAST:event_tbbtActionPerformed

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
            java.util.logging.Logger.getLogger(paginasweb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginasweb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginasweb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginasweb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginasweb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hotmail;
    private javax.swing.JButton Youtube;
    private javax.swing.JButton entrar;
    private javax.swing.JButton facebook;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton google;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JButton mega;
    private javax.swing.JTextField paginas;
    private javax.swing.JButton salir;
    private javax.swing.JButton tbbt;
    private javax.swing.JButton vetealaversh;
    // End of variables declaration//GEN-END:variables
}
