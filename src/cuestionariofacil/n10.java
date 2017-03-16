package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class n10 extends javax.swing.JFrame {
    private int num;
    private void resultado(int re){
        num=re;
        if(num<=30&&num>=25){
            JOptionPane.showMessageDialog(null,"Felicitaciones, sabes mucho de Naruto\nTu puntaje es "+num,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else if(num<25&&num>=20){
            JOptionPane.showMessageDialog(null,"Te falta aprender algunas cosas\nTu puntaje es "+num,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else if(num>=0&&num<20){
            JOptionPane.showMessageDialog(null,"Debes aprender mucho más\nTu puntaje es "+num, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public n10() {
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
//        nmr.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tenten = new javax.swing.JRadioButton();
        hino = new javax.swing.JRadioButton();
        neji = new javax.swing.JRadioButton();
        chouji = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenten.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        tenten.setText("Tenten");
        tenten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentenActionPerformed(evt);
            }
        });
        getContentPane().add(tenten, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        hino.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        hino.setText("Hino");
        hino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hinoActionPerformed(evt);
            }
        });
        getContentPane().add(hino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        neji.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        neji.setText("Neji");
        neji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nejiActionPerformed(evt);
            }
        });
        getContentPane().add(neji, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        chouji.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        chouji.setText("Chouji");
        chouji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choujiActionPerformed(evt);
            }
        });
        getContentPane().add(chouji, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("los exámenes chunnin?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setText("10. ¿Contra quién pelea Naruto en");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//n9 n=new n9();
int c=3,i=0,b;

    private void tentenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentenActionPerformed
        if(tenten.isSelected()){
            hino.setSelected(false);
            neji.setSelected(false);
            chouji.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
//            n.nmr.setText(""+b);
//            n.setVisible(true);
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_tentenActionPerformed

    private void hinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hinoActionPerformed
        if(hino.isSelected()){
            tenten.setSelected(false);
            neji.setSelected(false);
            chouji.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
//            n.nmr.setText(""+b);
//            n.setVisible(true);
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_hinoActionPerformed

    private void nejiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nejiActionPerformed
        if(neji.isSelected()){
            hino.setSelected(false);
            tenten.setSelected(false);
            chouji.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_nejiActionPerformed

    private void choujiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choujiActionPerformed
        if(chouji.isSelected()){
            hino.setSelected(false);
            neji.setSelected(false);
            tenten.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_choujiActionPerformed

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
            java.util.logging.Logger.getLogger(n10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton chouji;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hino;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton neji;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton tenten;
    // End of variables declaration//GEN-END:variables
}
