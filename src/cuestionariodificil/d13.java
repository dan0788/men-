package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d13 extends javax.swing.JFrame {
    
    public d13() {
        initComponents();
        setTitle("Cuánto sabes de Naruto");
        setLocationRelativeTo(null);
        setResizable(false);
        //sl,slrt, sr, icono,imagen
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto11.png")).getImage());
        ImageIcon foto = new ImageIcon(this.getClass().getResource("/img/temarid.jpg"));
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        nmr.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hakke = new javax.swing.JRadioButton();
        gogyo = new javax.swing.JRadioButton();
        shiki = new javax.swing.JRadioButton();
        shiro = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("al Kyubi en Naruto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        hakke.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        hakke.setText("Hakke Fujin");
        hakke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hakkeActionPerformed(evt);
            }
        });
        getContentPane().add(hakke, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        gogyo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        gogyo.setText("Gogyo Fuin");
        gogyo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gogyoActionPerformed(evt);
            }
        });
        getContentPane().add(gogyo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        shiki.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        shiki.setText("Shiki Fujin");
        shiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shikiActionPerformed(evt);
            }
        });
        getContentPane().add(shiki, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        shiro.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        shiro.setText("Shiro Fujin");
        shiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiroActionPerformed(evt);
            }
        });
        getContentPane().add(shiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("13. Sello utilizado por el Cuarto Hokage para sellar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d14 n=new d14();
int c=3,i=0,b;
    private void hakkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hakkeActionPerformed
        if(hakke.isSelected()){
            gogyo.setSelected(false);
            shiki.setSelected(false);
            shiro.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_hakkeActionPerformed

    private void gogyoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gogyoActionPerformed
        if(gogyo.isSelected()){
            hakke.setSelected(false);
            shiki.setSelected(false);
            shiro.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_gogyoActionPerformed

    private void shikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shikiActionPerformed
        if(shiki.isSelected()){
            gogyo.setSelected(false);
            hakke.setSelected(false);
            shiro.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_shikiActionPerformed

    private void shiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiroActionPerformed
        if(shiro.isSelected()){
            gogyo.setSelected(false);
            shiki.setSelected(false);
            hakke.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_shiroActionPerformed

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
            java.util.logging.Logger.getLogger(d13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton gogyo;
    private javax.swing.JRadioButton hakke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton shiki;
    private javax.swing.JRadioButton shiro;
    // End of variables declaration//GEN-END:variables
}
