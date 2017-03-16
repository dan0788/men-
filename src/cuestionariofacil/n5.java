package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n5 extends javax.swing.JFrame {
    public n5() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto12.png")).getImage());
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/img/naruto.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        setTitle("Cuánto sabes de Naruto");
        setLocationRelativeTo(null);
        setResizable(false);
        nmr.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tjo = new javax.swing.JRadioButton();
        nky = new javax.swing.JRadioButton();
        nko = new javax.swing.JRadioButton();
        sns = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("5. ¿Quienes son los 3 sannin?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        tjo.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        tjo.setText("Tsunade, Jirayja y Orochimaru");
        tjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjoActionPerformed(evt);
            }
        });
        getContentPane().add(tjo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        nky.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        nky.setText("Nagato, Konan y Yahiko");
        nky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nkyActionPerformed(evt);
            }
        });
        getContentPane().add(nky, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        nko.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        nko.setText("Nagato, Konan y Obito");
        nko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nkoActionPerformed(evt);
            }
        });
        getContentPane().add(nko, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        sns.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sns.setText("Sakura, Naruto y Sasuke");
        sns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snsActionPerformed(evt);
            }
        });
        getContentPane().add(sns, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 30, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n6 n=new n6();
int c=3,i=0,b;

    private void tjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjoActionPerformed
        if(tjo.isSelected()){
            nky.setSelected(false);
            nko.setSelected(false);
            sns.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tjoActionPerformed

    private void nkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nkyActionPerformed
        if(nky.isSelected()){
            tjo.setSelected(false);
            nko.setSelected(false);
            sns.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nkyActionPerformed

    private void nkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nkoActionPerformed
        if(nko.isSelected()){
            nky.setSelected(false);
            tjo.setSelected(false);
            sns.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nkoActionPerformed

    private void snsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snsActionPerformed
        if(sns.isSelected()){
            nky.setSelected(false);
            nko.setSelected(false);
            tjo.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_snsActionPerformed

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
            java.util.logging.Logger.getLogger(n5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton nko;
    private javax.swing.JRadioButton nky;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton sns;
    private javax.swing.JRadioButton tjo;
    // End of variables declaration//GEN-END:variables
}
