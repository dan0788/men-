package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class n3 extends javax.swing.JFrame {
    public n3() {
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
        hyuga = new javax.swing.JRadioButton();
        uzumaki = new javax.swing.JRadioButton();
        haruno = new javax.swing.JRadioButton();
        nara = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("3. ¿Sakura pertenece a qué clan?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, -1));

        hyuga.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hyuga.setText("Hyuga");
        hyuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hyugaActionPerformed(evt);
            }
        });
        getContentPane().add(hyuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        uzumaki.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        uzumaki.setText("Uzumaki");
        uzumaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uzumakiActionPerformed(evt);
            }
        });
        getContentPane().add(uzumaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        haruno.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        haruno.setText("Haruno");
        haruno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harunoActionPerformed(evt);
            }
        });
        getContentPane().add(haruno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        nara.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        nara.setText("Nara");
        nara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naraActionPerformed(evt);
            }
        });
        getContentPane().add(nara, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 30, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n4 n=new n4();
int c=3,i=0,b;

    private void hyugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hyugaActionPerformed
        if(hyuga.isSelected()){
            uzumaki.setSelected(false);
            haruno.setSelected(false);
            nara.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hyugaActionPerformed

    private void uzumakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uzumakiActionPerformed
        if(uzumaki.isSelected()){
            hyuga.setSelected(false);
            haruno.setSelected(false);
            nara.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_uzumakiActionPerformed

    private void harunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harunoActionPerformed
        if(haruno.isSelected()){
            uzumaki.setSelected(false);
            hyuga.setSelected(false);
            nara.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_harunoActionPerformed

    private void naraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naraActionPerformed
        if(nara.isSelected()){
            uzumaki.setSelected(false);
            haruno.setSelected(false);
            hyuga.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_naraActionPerformed

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
            java.util.logging.Logger.getLogger(n3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton haruno;
    private javax.swing.JRadioButton hyuga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton nara;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton uzumaki;
    // End of variables declaration//GEN-END:variables
}
