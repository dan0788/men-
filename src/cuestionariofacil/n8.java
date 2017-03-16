package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n8 extends javax.swing.JFrame {
    public n8() {
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
        hinata = new javax.swing.JRadioButton();
        sakura = new javax.swing.JRadioButton();
        tenten = new javax.swing.JRadioButton();
        ino = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("en su infancia?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        hinata.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hinata.setText("Hinata");
        hinata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hinataActionPerformed(evt);
            }
        });
        getContentPane().add(hinata, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        sakura.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sakura.setText("Sakura");
        sakura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sakuraActionPerformed(evt);
            }
        });
        getContentPane().add(sakura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        tenten.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        tenten.setText("Tenten");
        tenten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentenActionPerformed(evt);
            }
        });
        getContentPane().add(tenten, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        ino.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        ino.setText("Ino");
        ino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inoActionPerformed(evt);
            }
        });
        getContentPane().add(ino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("8. ¿Quién es el amor platónico de Naruto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n9 n=new n9();
int c=3,i=0,b;

    private void hinataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hinataActionPerformed
        if(hinata.isSelected()){
            sakura.setSelected(false);
            tenten.setSelected(false);
            ino.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hinataActionPerformed

    private void sakuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sakuraActionPerformed
        if(sakura.isSelected()){
            hinata.setSelected(false);
            tenten.setSelected(false);
            ino.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sakuraActionPerformed

    private void tentenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentenActionPerformed
        if(tenten.isSelected()){
            sakura.setSelected(false);
            hinata.setSelected(false);
            ino.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tentenActionPerformed

    private void inoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inoActionPerformed
        if(ino.isSelected()){
            sakura.setSelected(false);
            tenten.setSelected(false);
            hinata.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_inoActionPerformed

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
            java.util.logging.Logger.getLogger(n8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hinata;
    private javax.swing.JRadioButton ino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton sakura;
    private javax.swing.JRadioButton tenten;
    // End of variables declaration//GEN-END:variables
}
