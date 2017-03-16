package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d6 extends javax.swing.JFrame {
    
    public d6() {
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
        mito = new javax.swing.JRadioButton();
        toshiya = new javax.swing.JRadioButton();
        karin = new javax.swing.JRadioButton();
        kimawari = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("6. Hija menor del Séptimo Hokage");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, -1));

        mito.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        mito.setText("Mito Uzumaki");
        mito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitoActionPerformed(evt);
            }
        });
        getContentPane().add(mito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        toshiya.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        toshiya.setText("Toshiya Uzumaki");
        toshiya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toshiyaActionPerformed(evt);
            }
        });
        getContentPane().add(toshiya, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        karin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        karin.setText("Karin Uzumaki");
        karin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karinActionPerformed(evt);
            }
        });
        getContentPane().add(karin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        kimawari.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kimawari.setText("Kimawari Uzumaki");
        kimawari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimawariActionPerformed(evt);
            }
        });
        getContentPane().add(kimawari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d7 n=new d7();
int c=3,i=0,b;
    private void mitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitoActionPerformed
        if(mito.isSelected()){
            toshiya.setSelected(false);
            karin.setSelected(false);
            kimawari.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_mitoActionPerformed

    private void toshiyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toshiyaActionPerformed
        if(toshiya.isSelected()){
            mito.setSelected(false);
            karin.setSelected(false);
            kimawari.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_toshiyaActionPerformed

    private void karinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karinActionPerformed
        if(karin.isSelected()){
            toshiya.setSelected(false);
            mito.setSelected(false);
            kimawari.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_karinActionPerformed

    private void kimawariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimawariActionPerformed
        if(kimawari.isSelected()){
            toshiya.setSelected(false);
            karin.setSelected(false);
            mito.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_kimawariActionPerformed

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
            java.util.logging.Logger.getLogger(d6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton karin;
    private javax.swing.JRadioButton kimawari;
    private javax.swing.JRadioButton mito;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton toshiya;
    // End of variables declaration//GEN-END:variables
}
