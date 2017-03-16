package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class d11 extends javax.swing.JFrame {
    
    public d11() {
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
        karasu = new javax.swing.JRadioButton();
        hiruko = new javax.swing.JRadioButton();
        salamandra = new javax.swing.JRadioButton();
        kuroari = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("oculto a Sasori?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        karasu.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        karasu.setText("Karasu");
        karasu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karasuActionPerformed(evt);
            }
        });
        getContentPane().add(karasu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        hiruko.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        hiruko.setText("Hiruko");
        hiruko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirukoActionPerformed(evt);
            }
        });
        getContentPane().add(hiruko, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        salamandra.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        salamandra.setText("Salamandra");
        salamandra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salamandraActionPerformed(evt);
            }
        });
        getContentPane().add(salamandra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        kuroari.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kuroari.setText("Kuroari");
        kuroari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuroariActionPerformed(evt);
            }
        });
        getContentPane().add(kuroari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("11. ¿Cómo se llama la marioneta que mantiene");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d12 n=new d12();
int c=3,i=0,b;
    private void karasuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karasuActionPerformed
        if(karasu.isSelected()){
            hiruko.setSelected(false);
            salamandra.setSelected(false);
            kuroari.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_karasuActionPerformed

    private void hirukoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirukoActionPerformed
        if(hiruko.isSelected()){
            karasu.setSelected(false);
            salamandra.setSelected(false);
            kuroari.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+c;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hirukoActionPerformed

    private void salamandraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salamandraActionPerformed
        if(salamandra.isSelected()){
            hiruko.setSelected(false);
            karasu.setSelected(false);
            kuroari.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_salamandraActionPerformed

    private void kuroariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuroariActionPerformed
        if(kuroari.isSelected()){
            hiruko.setSelected(false);
            salamandra.setSelected(false);
            karasu.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_kuroariActionPerformed

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
            java.util.logging.Logger.getLogger(d11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new d11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hiruko;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton karasu;
    private javax.swing.JRadioButton kuroari;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton salamandra;
    // End of variables declaration//GEN-END:variables
}
