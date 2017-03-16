package cuestionariodificil;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class d15 extends javax.swing.JFrame {
    private int num;
    private void resultado(int re){
        num=re;
        if(num<=45&&num>=35){
            JOptionPane.showMessageDialog(null,"Felicitaciones, sabes mucho de Naruto\nTu puntaje es "+num,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else if(num<35&&num>=28){
            JOptionPane.showMessageDialog(null,"Te falta aprender algunas cosas\nTu puntaje es "+num,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else if(num>=0&&num<28){
            JOptionPane.showMessageDialog(null,"Debes aprender mucho más\nTu puntaje es "+num, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public d15() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        deidara = new javax.swing.JRadioButton();
        pain = new javax.swing.JRadioButton();
        itachi = new javax.swing.JRadioButton();
        kisame = new javax.swing.JRadioButton();
        nmr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deidara.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        deidara.setText("Deidara");
        deidara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deidaraActionPerformed(evt);
            }
        });
        getContentPane().add(deidara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pain.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        pain.setText("Pain");
        pain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painActionPerformed(evt);
            }
        });
        getContentPane().add(pain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        itachi.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        itachi.setText("Itachi");
        itachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itachiActionPerformed(evt);
            }
        });
        getContentPane().add(itachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        kisame.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kisame.setText("Kisame");
        kisame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisameActionPerformed(evt);
            }
        });
        getContentPane().add(kisame, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        nmr.setEditable(false);
        getContentPane().add(nmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("15. Miembro de Akatsuki que llevaba el anillo \"Rei\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//n10 n=new n10();
int c=3,i=0,b;
    private void deidaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deidaraActionPerformed
        if(deidara.isSelected()){
            pain.setSelected(false);
            itachi.setSelected(false);
            kisame.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_deidaraActionPerformed

    private void painActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painActionPerformed
        if(pain.isSelected()){
            deidara.setSelected(false);
            itachi.setSelected(false);
            kisame.setSelected(false); 
            b=Integer.parseInt(nmr.getText());
            b=b+c;           
            dispose();            
            resultado(b);
        }
    }//GEN-LAST:event_painActionPerformed

    private void itachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itachiActionPerformed
        if(itachi.isSelected()){
            pain.setSelected(false);
            deidara.setSelected(false);
            kisame.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;   
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_itachiActionPerformed

    private void kisameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisameActionPerformed
        if(kisame.isSelected()){
            pain.setSelected(false);
            itachi.setSelected(false);
            deidara.setSelected(false);
            b=Integer.parseInt(nmr.getText());
            b=b+i;          
            dispose();
            resultado(b);
        }
    }//GEN-LAST:event_kisameActionPerformed

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
            java.util.logging.Logger.getLogger(d15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new d15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deidara;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton itachi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton kisame;
    public static javax.swing.JTextField nmr;
    private javax.swing.JRadioButton pain;
    // End of variables declaration//GEN-END:variables
}
