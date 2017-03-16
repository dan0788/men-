package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d7 extends javax.swing.JFrame {
    
    public d7() {
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
        onoki = new javax.swing.JRadioButton();
        ishikawa = new javax.swing.JRadioButton();
        kurotsuchi = new javax.swing.JRadioButton();
        mu = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("7. Maestro del Tercer Tsuchikage");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, -1));

        onoki.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        onoki.setText("Onoki");
        onoki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onokiActionPerformed(evt);
            }
        });
        getContentPane().add(onoki, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        ishikawa.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        ishikawa.setText("Ishikawa");
        ishikawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ishikawaActionPerformed(evt);
            }
        });
        getContentPane().add(ishikawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        kurotsuchi.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kurotsuchi.setText("Kurotsuchi");
        kurotsuchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurotsuchiActionPerformed(evt);
            }
        });
        getContentPane().add(kurotsuchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        mu.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        mu.setText("Mu");
        mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muActionPerformed(evt);
            }
        });
        getContentPane().add(mu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d8 n=new d8();
int c=3,i=0,b;
    private void onokiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onokiActionPerformed
        if(onoki.isSelected()){
            ishikawa.setSelected(false);
            kurotsuchi.setSelected(false);
            mu.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_onokiActionPerformed

    private void ishikawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ishikawaActionPerformed
        if(ishikawa.isSelected()){
            onoki.setSelected(false);
            kurotsuchi.setSelected(false);
            mu.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ishikawaActionPerformed

    private void kurotsuchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurotsuchiActionPerformed
        if(kurotsuchi.isSelected()){
            ishikawa.setSelected(false);
            onoki.setSelected(false);
            mu.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_kurotsuchiActionPerformed

    private void muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muActionPerformed
        if(mu.isSelected()){
            ishikawa.setSelected(false);
            kurotsuchi.setSelected(false);
            onoki.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_muActionPerformed

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
            java.util.logging.Logger.getLogger(d7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton ishikawa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton kurotsuchi;
    private javax.swing.JRadioButton mu;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton onoki;
    // End of variables declaration//GEN-END:variables
}
