/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Logica.ListaCantantesFamosos;

/**
 *
 * @author fambr
 */
public class VerLista extends javax.swing.JFrame {

    String name = "<html><p>NOMBRE</p>";
    String disco = "<html><p>DISCO</p>";
    String copias = "<html><p>COPIAS</p>";
    /**
     * Creates new form VerLista
     */
    public VerLista() {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblCopias = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTitulo.setText("LISTA DE CANTANTES REGISTRADOS");

        lblName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText(name);

        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setToolTipText("");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblCopias.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCopias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCopias.setText(copias);

        lblDisco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDisco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisco.setText(disco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblCopias)
                    .addComponent(lblDisco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Principal inicio = new Principal();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerLista().setVisible(true);
            }
        });
    }
    
    private void mostrarDatos(){
        for (int i = 0; i < ListaCantantesFamosos.listaCantantesFamosos.size(); i++) {
            name = name + "<p>" + ListaCantantesFamosos.listaCantantesFamosos.get(i).getNombres().toUpperCase() + "</p>" ;
            disco = disco + "<p>" + ListaCantantesFamosos.listaCantantesFamosos.get(i).getDiscoConMasVentas().toUpperCase() + "</p>";
            copias = copias + "<p>" + ListaCantantesFamosos.listaCantantesFamosos.get(i).getCopiasDisco() + "</p>";
        }
        lblName.setText(name);
        lblDisco.setText(disco);
        lblCopias.setText(copias);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCopias;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
