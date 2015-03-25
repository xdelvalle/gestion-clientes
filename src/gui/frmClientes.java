package gui;

import bbdd.GestionBDFactory;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Clientes;
import model.Historicos;
import utils.Utils;

public class frmClientes extends javax.swing.JFrame {

    private List<Clientes> listaClientes = new ArrayList<Clientes>();
    int indexClientes = 0;

    public frmClientes(List<Clientes> clientes) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        this.listaClientes = clientes;
        btnGuardar.setEnabled(false);
        btnAnterior.setEnabled(false);
        if (this.listaClientes.size() == 1) {
            btnSiguiente.setEnabled(false);
        }
        mostrarCliente(this.listaClientes.get(0));
        txtIndexCliente.setText("1");
        lblClientesEncontrados.setText("Clientes encontrados: [" + listaClientes.size() + "]");
    }

    private void mostrarCliente(Clientes cliente) {
        txtId.setText(String.valueOf(cliente.getId()));
        txtNombre.setText(cliente.getNombre());
        txtApellido1.setText(cliente.getApellido1());
        txtApellido2.setText(cliente.getApellido2());
        txtEdad.setText(Utils.calcularEdad(cliente.getFechaNacimiento()));
        txtFechaNacimiento.setText(cliente.getFechaNacimiento());
        txtDireccionTipo.setText(cliente.getDireccionTipo());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(cliente.getTelefono());
        txtMovil.setText(cliente.getMovil());
        txtSexo.setText(cliente.getSexo());
        txtEmail.setText(cliente.getEmail());
        txtComentarios.setText(cliente.getComentarios());

        if (!cliente.getEdad().equals(Utils.calcularEdad(cliente.getFechaNacimiento()))) {
            cliente.setEdad(Utils.calcularEdad(cliente.getFechaNacimiento()));
            GestionBDFactory.getInstance().getBDMySQL().addCliente(cliente);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDireccionTipo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMovil = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        txtIndexCliente = new javax.swing.JTextField();
        lblClientesEncontrados = new javax.swing.JLabel();

        setTitle("Ficha de Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel1.setForeground(new java.awt.Color(8, 6, 6));
        jLabel1.setText("Ficha del Cliente");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Historial.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistorial)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnHistorial)
                    .addComponent(btnEliminar))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminar, btnGuardar, btnHistorial, btnModificar});

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setText("Id Cliente");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel5.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setText("Edad");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel7.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel8.setText("Dirección");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel9.setText("Teléfono");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel10.setText("Móvil");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel11.setText("E-Mail");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel12.setText("Comentarios");

        txtId.setFont(new java.awt.Font("Verdana", 0, 14));
        txtId.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 14));
        txtNombre.setEnabled(false);

        txtApellido1.setFont(new java.awt.Font("Verdana", 0, 14));
        txtApellido1.setEnabled(false);

        txtApellido2.setFont(new java.awt.Font("Verdana", 0, 14));
        txtApellido2.setEnabled(false);

        txtEdad.setFont(new java.awt.Font("Verdana", 0, 14));
        txtEdad.setEnabled(false);

        txtFechaNacimiento.setFont(new java.awt.Font("Verdana", 0, 14));
        txtFechaNacimiento.setEnabled(false);

        txtSexo.setFont(new java.awt.Font("Verdana", 0, 14));
        txtSexo.setEnabled(false);

        txtDireccionTipo.setFont(new java.awt.Font("Verdana", 0, 14));
        txtDireccionTipo.setEnabled(false);

        txtDireccion.setFont(new java.awt.Font("Verdana", 0, 14));
        txtDireccion.setEnabled(false);

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 14));
        txtTelefono.setEnabled(false);

        txtMovil.setFont(new java.awt.Font("Verdana", 0, 14));
        txtMovil.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 14));
        txtEmail.setEnabled(false);

        txtComentarios.setColumns(20);
        txtComentarios.setFont(new java.awt.Font("Verdana", 0, 14));
        txtComentarios.setRows(5);
        txtComentarios.setEnabled(false);
        jScrollPane1.setViewportView(txtComentarios);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/next.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/go-previous.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        txtIndexCliente.setEditable(false);
        txtIndexCliente.setFont(new java.awt.Font("Verdana", 0, 14));
        txtIndexCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblClientesEncontrados.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDireccionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIndexCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(lblClientesEncontrados, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnterior, btnSiguiente});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClientesEncontrados, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtIndexCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAnterior, btnSiguiente});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        indexClientes++;
        mostrarCliente(this.listaClientes.get(indexClientes));
        txtIndexCliente.setText(String.valueOf(indexClientes + 1));
        btnAnterior.setEnabled(true);
        if (indexClientes == (listaClientes.size() - 1)) {
            btnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indexClientes--;
        mostrarCliente(this.listaClientes.get(indexClientes));
        txtIndexCliente.setText(String.valueOf(indexClientes + 1));
        btnSiguiente.setEnabled(true);
        if (indexClientes == 0) {
            btnAnterior.setEnabled(false);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtNombre.setEnabled(true);
        txtApellido1.setEnabled(true);
        txtApellido2.setEnabled(true);
        txtEdad.setEnabled(true);
        txtFechaNacimiento.setEnabled(true);
        txtDireccionTipo.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtMovil.setEnabled(true);
        txtSexo.setEnabled(true);
        txtEmail.setEnabled(true);
        txtComentarios.setEnabled(true);

        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Clientes c = new Clientes();
            c.setId(Integer.parseInt(txtId.getText()));
            c.setNombre(txtNombre.getText());
            c.setApellido1(txtApellido1.getText());
            c.setApellido2(txtApellido2.getText());
            c.setEdad(txtEdad.getText());
            c.setDireccion(txtDireccion.getText());
            c.setDireccionTipo(txtDireccionTipo.getText());
            c.setFechaNacimiento(txtFechaNacimiento.getText());
            c.setSexo(txtSexo.getText());
            c.setTelefono(txtTelefono.getText());
            c.setMovil(txtMovil.getText());
            c.setComentarios(txtComentarios.getText());
            c.setEmail(txtEmail.getText());

            GestionBDFactory.getInstance().getBDMySQL().addCliente(c);
            JOptionPane.showMessageDialog(rootPane, "Cliente actualizado correctamente...", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido actualizar el cliente!!\n" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        this.setVisible(false);
        List<Historicos> h = GestionBDFactory.getInstance().getBDMySQL().findHistoricos(Integer.parseInt(txtId.getText()));
        String nombreCompleto = txtNombre.getText() + " " + txtApellido1.getText();
        System.out.println(h.toString() + "\n" + nombreCompleto);
        frmHistorial historial = new frmHistorial(h, listaClientes.get(indexClientes));
        historial.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de eliminar el cliente?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (eliminar == JOptionPane.YES_OPTION) {
            try {
                GestionBDFactory.getInstance().getBDMySQL().removeCliente(Integer.parseInt(txtId.getText()));
                JOptionPane.showMessageDialog(rootPane, "Cliente eliminado correctamente...", "Información", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "No se ha podido eliminar el cliente!!\n" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClientesEncontrados;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionTipo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIndexCliente;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
