package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n2 extends javax.swing.JFrame {

    public n2() {
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        sasori = new javax.swing.JRadioButton();
        itachi = new javax.swing.JRadioButton();
        hidan = new javax.swing.JRadioButton();
        nagato = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("2. ¿Quién adora al dios Jashin?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, -1));

        sasori.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sasori.setText("Sasori");
        sasori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sasoriActionPerformed(evt);
            }
        });
        getContentPane().add(sasori, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        itachi.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        itachi.setText("Itachi");
        itachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itachiActionPerformed(evt);
            }
        });
        getContentPane().add(itachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        hidan.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hidan.setText("Hidan");
        hidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidanActionPerformed(evt);
            }
        });
        getContentPane().add(hidan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        nagato.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        nagato.setText("Nagato");
        nagato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nagatoActionPerformed(evt);
            }
        });
        getContentPane().add(nagato, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        nmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmrActionPerformed(evt);
            }
        });
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n3 n=new n3();
int c=3,i=0,b;

    private void sasoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sasoriActionPerformed
        if(sasori.isSelected()){
            itachi.setSelected(false);
            hidan.setSelected(false);
            nagato.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_sasoriActionPerformed

    private void itachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itachiActionPerformed
        if(itachi.isSelected()){
            sasori.setSelected(false);
            hidan.setSelected(false);
            nagato.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_itachiActionPerformed

    private void hidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidanActionPerformed
        if(hidan.isSelected()){
            itachi.setSelected(false);
            sasori.setSelected(false);
            nagato.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hidanActionPerformed

    private void nagatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nagatoActionPerformed
        if(nagato.isSelected()){
            itachi.setSelected(false);
            hidan.setSelected(false);
            sasori.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nagatoActionPerformed

    private void nmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmrActionPerformed
        
    }//GEN-LAST:event_nmrActionPerformed

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
            java.util.logging.Logger.getLogger(n2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hidan;
    private javax.swing.JRadioButton itachi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JRadioButton nagato;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton sasori;
    // End of variables declaration//GEN-END:variables
}
