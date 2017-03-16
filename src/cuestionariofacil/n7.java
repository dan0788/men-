package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n7 extends javax.swing.JFrame {
    public n7() {
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
        minato = new javax.swing.JRadioButton();
        itachi = new javax.swing.JRadioButton();
        gaara = new javax.swing.JRadioButton();
        sasuke = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("aparte de Naruto?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        minato.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        minato.setText("Minato");
        minato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minatoActionPerformed(evt);
            }
        });
        getContentPane().add(minato, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        itachi.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        itachi.setText("Itachi");
        itachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itachiActionPerformed(evt);
            }
        });
        getContentPane().add(itachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        gaara.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        gaara.setText("Gaara");
        gaara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaaraActionPerformed(evt);
            }
        });
        getContentPane().add(gaara, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        sasuke.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sasuke.setText("Sasuke");
        sasuke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sasukeActionPerformed(evt);
            }
        });
        getContentPane().add(sasuke, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("7. ¿Quién tiene la otra mitad de Kurama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n8 n=new n8();
int c=3,i=0,b;

    private void minatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minatoActionPerformed
        if(minato.isSelected()){
            itachi.setSelected(false);
            gaara.setSelected(false);
            sasuke.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
                        n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_minatoActionPerformed

    private void itachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itachiActionPerformed
        if(itachi.isSelected()){
            minato.setSelected(false);
            gaara.setSelected(false);
            sasuke.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
                        n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_itachiActionPerformed

    private void gaaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaaraActionPerformed
        if(gaara.isSelected()){
            itachi.setSelected(false);
            minato.setSelected(false);
            sasuke.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
                        n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_gaaraActionPerformed

    private void sasukeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasukeActionPerformed
        if(sasuke.isSelected()){
            itachi.setSelected(false);
            gaara.setSelected(false);
            minato.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
                        n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sasukeActionPerformed

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
            java.util.logging.Logger.getLogger(n7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton gaara;
    private javax.swing.JRadioButton itachi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton minato;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton sasuke;
    // End of variables declaration//GEN-END:variables
}
