package gui;

import bbdd.GestionBDFactory;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import model.Clientes;
import model.Historicos;
import utils.Utils;

public class frmAddHistorico extends javax.swing.JFrame {

    private Clientes cliente;

    public frmAddHistorico(Clientes cli) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        this.cliente = cli;
        lblNombre.setText(cli.getNombre() + " " + cli.getApellido1());
        txtFecha.setText(Utils.DatetimeNow());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTratamiento = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtRecomendaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnAñadirHistorial = new javax.swing.JButton();

        setTitle("Añadir al Historial");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Ubuntu", 2, 18));
        lblNombre.setForeground(new java.awt.Color(8, 6, 6));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(3, 4, 252))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel2.setText("Tratamiento");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel3.setText("Producto");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel5.setText("Recomendaciones");

        txtFecha.setFont(new java.awt.Font("Verdana", 0, 14));

        txtTratamiento.setFont(new java.awt.Font("Verdana", 0, 14));
        txtTratamiento.setNextFocusableComponent(txtProducto);

        txtProducto.setFont(new java.awt.Font("Verdana", 0, 14));
        txtProducto.setNextFocusableComponent(txtPrecio);

        txtPrecio.setFont(new java.awt.Font("Verdana", 0, 14));
        txtPrecio.setNextFocusableComponent(txtRecomendaciones);

        txtRecomendaciones.setFont(new java.awt.Font("Verdana", 0, 14));
        txtRecomendaciones.setNextFocusableComponent(btnAñadirHistorial);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel6.setText("€");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(txtRecomendaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecomendaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnAñadirHistorial.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAñadirHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Historial.png"))); // NOI18N
        btnAñadirHistorial.setText("Añadir Historial");
        btnAñadirHistorial.setNextFocusableComponent(btnCerrar);
        btnAñadirHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(btnAñadirHistorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAñadirHistorial, btnCerrar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnAñadirHistorial))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAñadirHistorial, btnCerrar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAñadirHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirHistorialActionPerformed
        if (!Utils.comprobarFormatoFecha(txtFecha.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Formato de fecha incorrecto!! (dd/MM/aaaa)", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            Historicos h = new Historicos(String.valueOf(cliente.getId()), txtFecha.getText(), txtTratamiento.getText(), txtPrecio.getText(),
                                          txtRecomendaciones.getText(), txtProducto.getText());
            try {
                GestionBDFactory.getInstance().getBDMySQL().addHistorico(h);
                JOptionPane.showMessageDialog(rootPane, "Historial guardado correctamente...", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                List<Historicos> listaHistoricos = GestionBDFactory.getInstance().getBDMySQL().findHistoricos(cliente.getId());
                frmHistorial historial = new frmHistorial(listaHistoricos, cliente);
                historial.setVisible(true);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "No se ha podido guardar el historial!!\n" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAñadirHistorialActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirHistorial;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtRecomendaciones;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
