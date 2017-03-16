package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class d3 extends javax.swing.JFrame {
    
    public d3() {
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
        izanami = new javax.swing.JRadioButton();
        izanagi = new javax.swing.JRadioButton();
        amaterasu = new javax.swing.JRadioButton();
        kamui = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a Kabuto Yakushi en la Cuarta Gran Guerra Ninja?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, -1));

        izanami.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        izanami.setText("Izanami");
        izanami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izanamiActionPerformed(evt);
            }
        });
        getContentPane().add(izanami, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        izanagi.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        izanagi.setText("Izanagi");
        izanagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izanagiActionPerformed(evt);
            }
        });
        getContentPane().add(izanagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        amaterasu.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        amaterasu.setText("Amaterasu");
        amaterasu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amaterasuActionPerformed(evt);
            }
        });
        getContentPane().add(amaterasu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        kamui.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kamui.setText("Kamui");
        kamui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kamuiActionPerformed(evt);
            }
        });
        getContentPane().add(kamui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("3. ¿Qué técnica utilizó Itachi Uchiha para vencer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
d4 n=new d4();
int c=3,i=0,b;
    private void izanamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izanamiActionPerformed
        if(izanami.isSelected()){
            izanagi.setSelected(false);
            amaterasu.setSelected(false);
            kamui.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+c;
            n.nmr.setText(""+b);
            n.setVisible(true);  
            dispose();
        }
    }//GEN-LAST:event_izanamiActionPerformed

    private void izanagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izanagiActionPerformed
        if(izanagi.isSelected()){
            izanami.setSelected(false);
            amaterasu.setSelected(false);
            kamui.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+i;           
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_izanagiActionPerformed

    private void amaterasuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amaterasuActionPerformed
        if(amaterasu.isSelected()){
            izanagi.setSelected(false);
            izanami.setSelected(false);
            kamui.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_amaterasuActionPerformed

    private void kamuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kamuiActionPerformed
        if(kamui.isSelected()){
            izanagi.setSelected(false);
            amaterasu.setSelected(false);
            izanami.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;            
            n.nmr.setText(""+b);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_kamuiActionPerformed

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
            java.util.logging.Logger.getLogger(d3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amaterasu;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton izanagi;
    private javax.swing.JRadioButton izanami;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton kamui;
    public static javax.swing.JTextField nmr;
    // End of variables declaration//GEN-END:variables
}
