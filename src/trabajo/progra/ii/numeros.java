package trabajo.progra.ii;
import java.awt.Image;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class numeros extends javax.swing.JFrame {    
    public numeros() {
        initComponents();
        setTitle("Números impares");
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon fot = new ImageIcon(this.getClass().getResource("/image/Naruto_Shippuden_7_1024x768.jpg"));
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(icono);
        this.repaint();
        setIconImage(new ImageIcon(getClass().getResource("/image/the-big-bang-theory.jpg")).getImage());        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Números impares");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Desde");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Hasta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 102, 0));
        jTextField1.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 102, 0));
        jTextField2.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton1.setText("Ingresar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton3.setText("Suma total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 230, 30));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 430, 50));

        jButton4.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jButton5.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jButton5.setText("Continuar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 410));
        jLabel5.getAccessibleContext().setAccessibleName("img");

        pack();
    }// </editor-fold>//GEN-END:initComponents
int desde, hasta, i=0; 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        desde=Integer.parseInt(jOptionPane1.showInputDialog(null, "Desde", "Caja ingreso", 0));
        jTextField1.setText(""+desde);
        hasta=Integer.parseInt(jOptionPane1.showInputDialog(null, "Hasta", "Caja ingreso", 0));
        while (hasta<=desde){
            jOptionPane1.showMessageDialog(null, "Error de ingreso de datos", "Caja ingreso", 0);
            hasta=Integer.parseInt(jOptionPane1.showInputDialog(null, "Hasta", "Caja ingreso", 0));            
        }
        jTextField2.setText(""+hasta);
    }//GEN-LAST:event_jButton1ActionPerformed
int j = 0, a[];
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ((desde % 2)==0){
            double r=hasta-desde;
            if (r<0){
                r=r*(-1);
            }
            desde++;
            r=r/2;
            BigDecimal big = new BigDecimal(r);
            big = big.setScale(0,RoundingMode.HALF_UP);  
            int h=big.intValue();
            a=new int [h];
            while (desde<=hasta){                 
                a[j]=desde;                
                i = desde + i;
                desde=desde+2; 
                j=j+1;
            }
            for (int b=0;b<a.length;b++) {
                jTextArea1.append(" / "+a[b]);
            }
        } else {
            if ((hasta%2)==1){
                double r=hasta-desde;
                if (r<0){
                r=r*(-1);
            }
                r=r+1;
                r=r/2;
                BigDecimal big = new BigDecimal(r);
                big = big.setScale(0,RoundingMode.HALF_UP);  
                int h=big.intValue();
                a=new int [h];
            while (desde<=hasta){  
                a[j]=desde;                
                i = desde + i;
                desde=desde+2; 
                j=j+1;                
            }
            for (int b=0;b<a.length;b++) {
                jTextArea1.append(" / "+a[b]);
            }
            }  else {
                double r=hasta-desde;
                if (r<0){
                r=r*(-1);
            }
                r=r/2;
                BigDecimal big = new BigDecimal(r);
                big = big.setScale(0,RoundingMode.HALF_UP);  
                int h=big.intValue();
                a=new int [h];
            while (desde<=hasta){  
                a[j]=desde;                
                i = desde + i;
                desde=desde+2; 
                j=j+1;                
            }
            for (int b=0;b<a.length;b++) {
                jTextArea1.append(" / "+a[b]);
            }
            }     
        }                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel6.setText(""+i);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        jLabel6.setText("");
        desde=0; hasta=0; i=0; j=0;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        poema p = new poema();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new numeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
