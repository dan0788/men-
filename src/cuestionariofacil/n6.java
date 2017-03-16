package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n6 extends javax.swing.JFrame {
    public n6() {
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
        madara = new javax.swing.JRadioButton();
        hanzo = new javax.swing.JRadioButton();
        hashirama = new javax.swing.JRadioButton();
        mito = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("6. El fundador de la Aldea de la Hoja es:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        madara.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        madara.setText("Madara");
        madara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                madaraActionPerformed(evt);
            }
        });
        getContentPane().add(madara, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        hanzo.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hanzo.setText("Hanzo");
        hanzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanzoActionPerformed(evt);
            }
        });
        getContentPane().add(hanzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        hashirama.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hashirama.setText("Hashirama");
        hashirama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashiramaActionPerformed(evt);
            }
        });
        getContentPane().add(hashirama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        mito.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        mito.setText("Mito");
        mito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitoActionPerformed(evt);
            }
        });
        getContentPane().add(mito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n7 n=new n7();
int c=3,i=0,b;

    private void madaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_madaraActionPerformed
   if(madara.isSelected()){
            hanzo.setSelected(false);
            hashirama.setSelected(false);
            mito.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_madaraActionPerformed

    private void hanzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanzoActionPerformed
        if(hanzo.isSelected()){
  madara.setSelected(false);
            hashirama.setSelected(false);
            mito.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hanzoActionPerformed

    private void hashiramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashiramaActionPerformed
        if(hashirama.isSelected()){
            hanzo.setSelected(false);
  madara.setSelected(false);
            mito.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hashiramaActionPerformed

    private void mitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitoActionPerformed
        if(mito.isSelected()){
            hanzo.setSelected(false);
            hashirama.setSelected(false);
  madara.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mitoActionPerformed

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
            java.util.logging.Logger.getLogger(n6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hanzo;
    private javax.swing.JRadioButton hashirama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton madara;
    private javax.swing.JRadioButton mito;
    public static javax.swing.JTextField nmr;
    // End of variables declaration//GEN-END:variables
}
