package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class d2 extends javax.swing.JFrame {
    
    public d2() {
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
        shisui = new javax.swing.JRadioButton();
        fugaku = new javax.swing.JRadioButton();
        izuna = new javax.swing.JRadioButton();
        tekka = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2. Nombre del padre de Itachi Uchiha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 290, -1));

        shisui.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        shisui.setText("Shisui Uchiha");
        shisui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shisuiActionPerformed(evt);
            }
        });
        getContentPane().add(shisui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        fugaku.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        fugaku.setText("Fugaku Uchiha");
        fugaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fugakuActionPerformed(evt);
            }
        });
        getContentPane().add(fugaku, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        izuna.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        izuna.setText("Izuna Uchiha");
        izuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izunaActionPerformed(evt);
            }
        });
        getContentPane().add(izuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        tekka.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tekka.setText("Tekka Uchiha");
        tekka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekkaActionPerformed(evt);
            }
        });
        getContentPane().add(tekka, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d3 n=new d3();
int c=3,i=0,b;
    private void shisuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shisuiActionPerformed
        if(shisui.isSelected()){
            fugaku.setSelected(false);
            izuna.setSelected(false);
            tekka.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_shisuiActionPerformed

    private void fugakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fugakuActionPerformed
        if(fugaku.isSelected()){
            shisui.setSelected(false);
            izuna.setSelected(false);
            tekka.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+c;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_fugakuActionPerformed

    private void izunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izunaActionPerformed
        if(izuna.isSelected()){
            fugaku.setSelected(false);
            shisui.setSelected(false);
            tekka.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_izunaActionPerformed

    private void tekkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekkaActionPerformed
        if(tekka.isSelected()){
            fugaku.setSelected(false);
            izuna.setSelected(false);
            shisui.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tekkaActionPerformed

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
            java.util.logging.Logger.getLogger(d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton fugaku;
    private javax.swing.JRadioButton izuna;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton shisui;
    private javax.swing.JRadioButton tekka;
    // End of variables declaration//GEN-END:variables
}
