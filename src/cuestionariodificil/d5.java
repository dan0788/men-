package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d5 extends javax.swing.JFrame {
    
    public d5() {
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
        tazuna = new javax.swing.JRadioButton();
        inari = new javax.swing.JRadioButton();
        shizune = new javax.swing.JRadioButton();
        zazuna = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zabuza para asesinarlo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        tazuna.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tazuna.setText("Tazuna");
        tazuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tazunaActionPerformed(evt);
            }
        });
        getContentPane().add(tazuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        inari.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        inari.setText("Inari");
        inari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inariActionPerformed(evt);
            }
        });
        getContentPane().add(inari, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        shizune.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        shizune.setText("Shizune");
        shizune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shizuneActionPerformed(evt);
            }
        });
        getContentPane().add(shizune, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        zazuna.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        zazuna.setText("Zazuna");
        zazuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zazunaActionPerformed(evt);
            }
        });
        getContentPane().add(zazuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("5. Nombre del constructor al cual Gato contrató a");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d6 n=new d6();
int c=3,i=0,b;
    private void tazunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tazunaActionPerformed
        if(tazuna.isSelected()){
            inari.setSelected(false);
            shizune.setSelected(false);
            zazuna.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_tazunaActionPerformed

    private void inariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inariActionPerformed
        if(inari.isSelected()){
            tazuna.setSelected(false);
            shizune.setSelected(false);
            zazuna.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_inariActionPerformed

    private void shizuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shizuneActionPerformed
        if(shizune.isSelected()){
            inari.setSelected(false);
            tazuna.setSelected(false);
            zazuna.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_shizuneActionPerformed

    private void zazunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zazunaActionPerformed
        if(zazuna.isSelected()){
            inari.setSelected(false);
            shizune.setSelected(false);
            tazuna.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_zazunaActionPerformed

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
            java.util.logging.Logger.getLogger(d5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton inari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton shizune;
    private javax.swing.JRadioButton tazuna;
    private javax.swing.JRadioButton zazuna;
    // End of variables declaration//GEN-END:variables
}
