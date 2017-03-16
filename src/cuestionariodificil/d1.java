package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class d1 extends javax.swing.JFrame {
    
    public d1() {
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
        jLabel2 = new javax.swing.JLabel();
        madara = new javax.swing.JRadioButton();
        obito = new javax.swing.JRadioButton();
        nagato = new javax.swing.JRadioButton();
        mizuki = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(360, 230));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("1. Ninja que engañó a Naruto para que robe ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("el Pergamino de los Sellos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        madara.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        madara.setText("Madara Uchiha");
        madara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madaraActionPerformed(evt);
            }
        });
        getContentPane().add(madara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        obito.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        obito.setText("Obito Uchiha");
        obito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obitoActionPerformed(evt);
            }
        });
        getContentPane().add(obito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        nagato.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        nagato.setText("Nagato Uzumaki");
        nagato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nagatoActionPerformed(evt);
            }
        });
        getContentPane().add(nagato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        mizuki.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        mizuki.setText("Mizuki Touji");
        mizuki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mizukiActionPerformed(evt);
            }
        });
        getContentPane().add(mizuki, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d2 n=new d2();
    private void madaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madaraActionPerformed
        if(madara.isSelected()){
            obito.setSelected(false);
            nagato.setSelected(false);
            mizuki.setSelected(false);            
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_madaraActionPerformed

    private void obitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obitoActionPerformed
        if(obito.isSelected()){
            madara.setSelected(false);
            nagato.setSelected(false);
            mizuki.setSelected(false);            
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_obitoActionPerformed

    private void nagatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nagatoActionPerformed
        if(nagato.isSelected()){
            obito.setSelected(false);
            madara.setSelected(false);
            mizuki.setSelected(false);            
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nagatoActionPerformed

    private void mizukiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mizukiActionPerformed
        if(mizuki.isSelected()){
            obito.setSelected(false);
            nagato.setSelected(false);
            madara.setSelected(false);            
            n.nmr.setText(""+3);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mizukiActionPerformed

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
            java.util.logging.Logger.getLogger(d1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton madara;
    private javax.swing.JRadioButton mizuki;
    private javax.swing.JRadioButton nagato;
    private javax.swing.JTextField nmr;
    private javax.swing.JRadioButton obito;
    // End of variables declaration//GEN-END:variables
}
