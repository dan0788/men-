package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d9 extends javax.swing.JFrame {
    
    public d9() {
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
        uchiha = new javax.swing.JRadioButton();
        kaguya = new javax.swing.JRadioButton();
        toriba = new javax.swing.JRadioButton();
        otsutsuki = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("9. Nombre del clan de Kimimaro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, -1));

        uchiha.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        uchiha.setText("Uchiha");
        uchiha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uchihaActionPerformed(evt);
            }
        });
        getContentPane().add(uchiha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        kaguya.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kaguya.setText("Kaguya");
        kaguya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaguyaActionPerformed(evt);
            }
        });
        getContentPane().add(kaguya, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        toriba.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        toriba.setText("Toriba");
        toriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toribaActionPerformed(evt);
            }
        });
        getContentPane().add(toriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        otsutsuki.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        otsutsuki.setText("Otsutsuki");
        otsutsuki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otsutsukiActionPerformed(evt);
            }
        });
        getContentPane().add(otsutsuki, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d10 n=new d10();
int c=3,i=0,b;
    private void uchihaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uchihaActionPerformed
        if(uchiha.isSelected()){
            kaguya.setSelected(false);
            toriba.setSelected(false);
            otsutsuki.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_uchihaActionPerformed

    private void kaguyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaguyaActionPerformed
        if(kaguya.isSelected()){
            uchiha.setSelected(false);
            toriba.setSelected(false);
            otsutsuki.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+c;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_kaguyaActionPerformed

    private void toribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toribaActionPerformed
        if(toriba.isSelected()){
            kaguya.setSelected(false);
            uchiha.setSelected(false);
            otsutsuki.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_toribaActionPerformed

    private void otsutsukiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otsutsukiActionPerformed
        if(otsutsuki.isSelected()){
            kaguya.setSelected(false);
            toriba.setSelected(false);
            uchiha.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_otsutsukiActionPerformed

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
            java.util.logging.Logger.getLogger(d9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton kaguya;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton otsutsuki;
    private javax.swing.JRadioButton toriba;
    private javax.swing.JRadioButton uchiha;
    // End of variables declaration//GEN-END:variables
}
