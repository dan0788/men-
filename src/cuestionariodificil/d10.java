package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d10 extends javax.swing.JFrame {
    
    public d10() {
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

        serpiente = new javax.swing.JRadioButton();
        buey = new javax.swing.JRadioButton();
        toro = new javax.swing.JRadioButton();
        tigre = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serpiente.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        serpiente.setText("Serpiente");
        serpiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serpienteActionPerformed(evt);
            }
        });
        getContentPane().add(serpiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        buey.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        buey.setText("Buey");
        buey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bueyActionPerformed(evt);
            }
        });
        getContentPane().add(buey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        toro.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        toro.setText("Toro");
        toro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toroActionPerformed(evt);
            }
        });
        getContentPane().add(toro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        tigre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tigre.setText("Tigre");
        tigre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigreActionPerformed(evt);
            }
        });
        getContentPane().add(tigre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("10. El sello \"Tora\" es un/a:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d11 n=new d11();
int c=3,i=0,b;
    private void serpienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serpienteActionPerformed
        if(serpiente.isSelected()){
            buey.setSelected(false);
            toro.setSelected(false);
            tigre.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_serpienteActionPerformed

    private void bueyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bueyActionPerformed
        if(buey.isSelected()){
            serpiente.setSelected(false);
            toro.setSelected(false);
            tigre.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_bueyActionPerformed

    private void toroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toroActionPerformed
        if(toro.isSelected()){
            buey.setSelected(false);
            serpiente.setSelected(false);
            tigre.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_toroActionPerformed

    private void tigreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigreActionPerformed
        if(tigre.isSelected()){
            buey.setSelected(false);
            toro.setSelected(false);
            serpiente.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tigreActionPerformed

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
            java.util.logging.Logger.getLogger(d10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new d10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buey;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton serpiente;
    private javax.swing.JRadioButton tigre;
    private javax.swing.JRadioButton toro;
    // End of variables declaration//GEN-END:variables
}
