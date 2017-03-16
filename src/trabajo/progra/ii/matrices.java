package trabajo.progra.ii;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import nuevo.login;
public class matrices extends javax.swing.JFrame {
    public matrices() {
        initComponents();
        setTitle("Matrices");
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon fot = new ImageIcon(this.getClass().getResource("/image/Naruto Wallpaper 08.jpg"));
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/image/travian.jpg")).getImage());     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 640, 290));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Calibri Light", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Ingresar dimensión cuadrada de ambos vectores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 60, -1));

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Suma");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Resta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton5.setText("Atrás");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        jButton6.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton6.setText("Finalizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        jButton7.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int dA;double matA[][], matB[][];
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dA=Integer.parseInt(jOptionPane1.showInputDialog(null, "Ingrese la dimensión cuadrada  de ambos vectores", "Caja de Ingreso", 0));
        jTextField1.setText(""+dA);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        matA=new double[dA][dA];
        matB=new double[dA][dA];
        jOptionPane1.showMessageDialog(null, "Ingrese los elementos de la matriz "+1,"CAJA DE INGRESO ", 2, null);
        for (int i = 0; i < dA; i++) {
                    for (int j = 0; j < dA; j++) {                        
                        matA[i][j]=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el elemento ["+(i+1)+"]["+(j+1)+"]", " Caja de ingreso", 0));                        
                    }                   
            }        
        jTextArea1.append("Vector 1");
        jTextArea1.append(" \n");              
        for (int i = 0; i < dA; i++) {
                    for (int j = 0; j < dA; j++) {
                       jTextArea1.append("       "+matA[i][j]); 
                    }
                   jTextArea1.append(" \n");                      
            }        
        jOptionPane1.showMessageDialog(null, "Ingrese los elementos de la matriz "+2,"Caja de ingreso", 3, null);      
        jTextArea1.append(" \n");   
        for (int i=0;i<dA;i++) {
                    for (int j=0;j<dA;j++) {
                        matB[i][j]=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el elemento ["+(i+1)+"]["+(j+1)+"]", " Caja de ingreso", 0));                        
                    }                    
            }
        jTextArea1.append("Vector 2");
        jTextArea1.append(" \n");  
        for (int i=0;i<dA;i++) {
                    for (int j=0;j<dA;j++) {
                       jTextArea1.append("       "+matB[i][j]); 
                    }
                   jTextArea1.append(" \n");                      
            }           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.append("La suma da como resultado:"); 
        jTextArea1.append(" \n"); 
        for (int i=0;i<dA;i++) {
            for (int j=0;j<dA;j++) {
                jTextArea1.append("       "+(matA[i][j]+matB[i][j])); 
            }
            jTextArea1.append(" \n");                      
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.append("La resta da como resultado:"); 
        jTextArea1.append(" \n"); 
        for (int i=0;i<dA;i++) {
            for (int j=0;j<dA;j++) {
                jTextArea1.append("       "+(matA[i][j]-matB[i][j])); 
            }
            jTextArea1.append(" \n");                      
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea1.setText("");        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tres_en_raya t = new tres_en_raya();
        t.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButton5ActionPerformed
login lg=new login();
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrices().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
