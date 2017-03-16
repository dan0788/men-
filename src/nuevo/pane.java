package nuevo;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class pane extends javax.swing.JFrame {

    public pane() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/naruto15.png")).getImage());
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/img/509462__akatsuki_p.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(),Image.SCALE_DEFAULT));
        fondo.setIcon(icono);
        this.repaint();
        setTitle("Pane");
        setLocationRelativeTo(null);
        setResizable(false);
        internal.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JRadioButton();
        input = new javax.swing.JRadioButton();
        confirm = new javax.swing.JRadioButton();
        input_combo = new javax.swing.JRadioButton();
        option = new javax.swing.JRadioButton();
        internal = new javax.swing.JRadioButton();
        salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Elija una opción");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        message.setForeground(new java.awt.Color(153, 153, 153));
        message.setText("showMessageDialog");
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        input.setForeground(new java.awt.Color(153, 153, 153));
        input.setText("showInputDialog");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        confirm.setForeground(new java.awt.Color(153, 153, 153));
        confirm.setText("showConfirmDialog");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        input_combo.setForeground(new java.awt.Color(153, 153, 153));
        input_combo.setText("showInputDialog (JCombox)");
        input_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_comboActionPerformed(evt);
            }
        });
        getContentPane().add(input_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        option.setForeground(new java.awt.Color(153, 153, 153));
        option.setText("showOptionDialog");
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });
        getContentPane().add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        internal.setForeground(new java.awt.Color(153, 153, 153));
        internal.setText("showInternalDialog");
        internal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internalActionPerformed(evt);
            }
        });
        getContentPane().add(internal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String[] colores={"Amarillo","Azul","Rojo"};
        String[] opciones={"Minato","Madara","Sasuke","Kakashi"};
    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
    if(message.isSelected()){
        input.setSelected(false);
        confirm.setSelected(false);
        input_combo.setSelected(false);
        option.setSelected(false);
        internal.setSelected(false);
        JOptionPane.showMessageDialog(message, "Hola mundo", "Hola",JOptionPane.OK_OPTION,null);
    }       
    message.setSelected(false);
    }//GEN-LAST:event_messageActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        if(input.isSelected()){
        message.setSelected(false);
        confirm.setSelected(false);
        input_combo.setSelected(false);
        option.setSelected(false);
        internal.setSelected(false);
        try{
            int n=Integer.parseInt(JOptionPane.showInputDialog(input,"Ingrese un número", "Entrada", JOptionPane.PLAIN_MESSAGE));
        JOptionPane.showMessageDialog(message, "El número ingresado es: "+n);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(input, "El número ingresado es incorrecto");
        }        
    }    
        input.setSelected(false);
    }//GEN-LAST:event_inputActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        if(confirm.isSelected()){
        input.setSelected(false);
        message.setSelected(false);
        input_combo.setSelected(false);
        option.setSelected(false);
        internal.setSelected(false);
        int ax=JOptionPane.showConfirmDialog(confirm,"¿Eres mayor de edad?","Pregunta",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
        if(ax == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(confirm, "Has seleccionado SI");
        }else {
            if(ax == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(confirm, "Has seleccionado NO");
            }else{
                if(ax == JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(confirm, "Has seleccionado CANCELAR");
                }
            }            
          }           
        }  
        confirm.setSelected(false);
    }//GEN-LAST:event_confirmActionPerformed

    private void input_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_comboActionPerformed
        if(input_combo.isSelected()){
        input.setSelected(false);
        confirm.setSelected(false);
        message.setSelected(false);
        option.setSelected(false);
        internal.setSelected(false);
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE, null ,colores, colores[1]);
        JOptionPane.showMessageDialog(input, "El color elegido es: "+opcion, "Colores", JOptionPane.INFORMATION_MESSAGE);
    }    
        input_combo.setSelected(false);
    }//GEN-LAST:event_input_comboActionPerformed

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed
        if(option.isSelected()){
        input.setSelected(false);
        confirm.setSelected(false);
        input_combo.setSelected(false);
        message.setSelected(false);
        internal.setSelected(false);
        int c=JOptionPane.showOptionDialog(option, "¿Quién es el papá de Naruto?","Naruto", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, opciones, null);
        if(opciones[c].equals("Minato")){
            JOptionPane.showMessageDialog(option, "La respuesta es correcta", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(opciones[c].equals("Madara")){
                JOptionPane.showMessageDialog(option, "La respuesta es incorrecta", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(opciones[c].equals("Sasuke")){
                    JOptionPane.showMessageDialog(option, "La respuesta es incorrecta", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if(opciones[c].equals("Kakashi")){
                        JOptionPane.showMessageDialog(option, "La respuesta es incorrecta", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }    
        option.setSelected(false);
    }//GEN-LAST:event_optionActionPerformed

    private void internalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internalActionPerformed
        if(internal.isSelected()){
        input.setSelected(false);
        confirm.setSelected(false);
        input_combo.setSelected(false);
        option.setSelected(false);
        message.setSelected(false);
//        JOptionPane.showInternalMessageDialog(null, "information","information", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_internalActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton confirm;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton input;
    private javax.swing.JRadioButton input_combo;
    private javax.swing.JRadioButton internal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton message;
    private javax.swing.JRadioButton option;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
