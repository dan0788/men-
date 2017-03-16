package cuestionariofacil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class n1 extends javax.swing.JFrame { 

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
            java.util.logging.Logger.getLogger(n1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(n1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(n1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(n1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n1().setVisible(true);
                
            }
        });
    }
    public n1() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto12.png")).getImage());
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/img/naruto.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        setTitle("Cuánto sabes de Naruto");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        naruto = new javax.swing.JRadioButton();
        itachi = new javax.swing.JRadioButton();
        hidan = new javax.swing.JRadioButton();
        killer_bee = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("1. ¿Como se llama el hermano de Sasuke?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, -1));

        naruto.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        naruto.setText("Naruto");
        naruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narutoActionPerformed(evt);
            }
        });
        getContentPane().add(naruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

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

        killer_bee.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        killer_bee.setText("Killer Bee");
        killer_bee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killer_beeActionPerformed(evt);
            }
        });
        getContentPane().add(killer_bee, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
n2 n=new n2();

private static void delay(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            JOptionPane.showMessageDialog(null,"Error","InterruptedException",0);
        }
    }

    private void narutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narutoActionPerformed
        if(naruto.isSelected()){
            itachi.setSelected(false);
            hidan.setSelected(false);
            killer_bee.setSelected(false);            
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_narutoActionPerformed

    private void itachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itachiActionPerformed
        if(itachi.isSelected()){
            naruto.setSelected(false);
            hidan.setSelected(false);
            killer_bee.setSelected(false);
            n.nmr.setText(""+3);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_itachiActionPerformed

    private void hidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidanActionPerformed
        if(hidan.isSelected()){
            itachi.setSelected(false);
            naruto.setSelected(false);
            killer_bee.setSelected(false);
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_hidanActionPerformed

    private void killer_beeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killer_beeActionPerformed
        if(killer_bee.isSelected()){
            itachi.setSelected(false);
            hidan.setSelected(false);
            naruto.setSelected(false);
            n.nmr.setText(""+0);
            n.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_killer_beeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//for (int i = 0; i < 3; i++) {
//                    jTextField1.setText(""+i);
//                    delay();
//                }
    }//GEN-LAST:event_formWindowActivated

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton hidan;
    private javax.swing.JRadioButton itachi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JRadioButton killer_bee;
    private javax.swing.JRadioButton naruto;
    // End of variables declaration//GEN-END:variables
}
