/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Complejos;
import javax.swing.JOptionPane;
/**
 *
 * @author pared
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroUno = new javax.swing.JTextField();
        txtNumeroDos = new javax.swing.JTextField();
        txtNumero3 = new javax.swing.JTextField();
        txtNumeroCuatro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbOperacion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        cmbCalcular = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Complejos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Numero 1:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Numero 2:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Numero 3:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Numero 4:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));
        jPanel1.add(txtNumeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 90, 80, -1));
        jPanel1.add(txtNumeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 80, -1));

        txtNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, -1));
        jPanel1.add(txtNumeroCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Operacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Resultado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        txtResultado.setEditable(false);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 100, -1));

        cmbCalcular.setText("Calcular");
        cmbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("i");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 10, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("i");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 10, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero3ActionPerformed

    private void cmbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalcularActionPerformed
        // TODO add your handling code here:
        Complejos num1, num2, num3 = null, num4;
        double n1, n2, n3, n4;
        int op;
        if (txtNumeroUno.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese Numero 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNumeroUno.requestFocusInWindow();
        }
        else if (txtNumeroDos.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Ingrese Numero 2", "ERROR", JOptionPane.ERROR_MESSAGE);
          txtNumeroDos.requestFocusInWindow();
        }
        else if (txtNumero3.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Ingrese Numero 3", "ERROR", JOptionPane.ERROR_MESSAGE);
          txtNumero3.requestFocusInWindow();
        }
        else if (txtNumeroCuatro.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Ingrese Numero 4", "ERROR", JOptionPane.ERROR_MESSAGE);
          txtNumeroCuatro.requestFocusInWindow();
        }
        else{
        op= cmbOperacion.getSelectedIndex();
        n1= Integer.parseInt(txtNumeroUno.getText());
        n2= Integer.parseInt(txtNumeroDos.getText());
        n3= Integer.parseInt(txtNumero3.getText());
        n4= Integer.parseInt(txtNumeroCuatro.getText());
        
        num1= new Complejos (n1, n3);
        num2= new Complejos (n2, n4);
        
        switch (op)
        {
            case 0:
                num3= num1.sumar(num2);
                break;
            case 1:
                num3= num1.restar(num2);
                break;  
            case 2:
                num3= num1.multiplicar(num2);
                break;
            case 3:
                num4= num1.division(num2);
                break;
        }
        
        txtResultado.setText("" + num3.getNumero1()+ " + " + num3.getNumero2()+"i");
        }
    }//GEN-LAST:event_cmbCalcularActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtNumero3.setText("");
        txtNumeroCuatro.setText("");
        txtNumeroDos.setText("");
        txtNumeroUno.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_cmbBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCalcular;
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtNumeroCuatro;
    private javax.swing.JTextField txtNumeroDos;
    private javax.swing.JTextField txtNumeroUno;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
