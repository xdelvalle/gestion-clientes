package gui;

import bbdd.GestionBDFactory;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.Clientes;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.BusinessBlueSteelSkin;
import org.pushingpixels.substance.api.skin.MarinerSkin;
import utils.Utils;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        pnlBuscar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCumpleanyos = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnMailing = new javax.swing.JButton();
        pnlAñadir = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAddNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddApellido1 = new javax.swing.JTextField();
        txtAddApellido2 = new javax.swing.JTextField();
        txtSexo = new javax.swing.JComboBox();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAddDireccionTipo = new javax.swing.JComboBox();
        txtAddDireccion = new javax.swing.JTextField();
        txtAddTelefono = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAddMovil = new javax.swing.JTextField();
        txtAddEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAddComentarios = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnAddLimpiar = new javax.swing.JButton();
        btnBackup = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Clientes v3.0   ## Centro de estetica AMBAR ##");
        setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        setResizable(false);

        pnlTop.setBackground(new java.awt.Color(225, 183, 222));
        pnlTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel19.setText("Gestión Clientes v3.0");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(47, 47, 47))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap(5, Short.MAX_VALUE))
        );

        tabbedPane.setFont(new java.awt.Font("Ubuntu", 1, 15));

        pnlBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        pnlBuscar.setRequestFocusEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 15), new java.awt.Color(20, 27, 248))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel1.setText("Id.");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel4.setText("Teléfono");

        txtId.setFont(new java.awt.Font("Verdana", 0, 14));
        txtId.setNextFocusableComponent(txtNombre);

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 14));
        txtNombre.setNextFocusableComponent(txtApellido);

        txtApellido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellido.setNextFocusableComponent(btnBuscar);

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 14));
        txtTelefono.setNextFocusableComponent(btnBuscar);

        btnBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setNextFocusableComponent(btnSalir);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscar, btnLimpiar});

        btnCumpleanyos.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnCumpleanyos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cumpleaños.png"))); // NOI18N
        btnCumpleanyos.setText("Cumpleaños Hoy");
        btnCumpleanyos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumpleanyosActionPerformed(evt);
            }
        });

        btnListado.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Listado.png"))); // NOI18N
        btnListado.setText("Listado Clientes");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        btnMailing.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnMailing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Mailing.png"))); // NOI18N
        btnMailing.setText("Mailing");
        btnMailing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(btnCumpleanyos)
                        .addGap(51, 51, 51)
                        .addComponent(btnListado)
                        .addGap(59, 59, 59)
                        .addComponent(btnMailing)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pnlBuscarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCumpleanyos, btnListado, btnMailing});

        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCumpleanyos)
                    .addComponent(btnListado)
                    .addComponent(btnMailing))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlBuscarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCumpleanyos, btnListado, btnMailing});

        tabbedPane.addTab("Buscar Cliente", new javax.swing.ImageIcon(getClass().getResource("/resources/Buscar.png")), pnlBuscar); // NOI18N

        pnlAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlAñadir.setFont(new java.awt.Font("Comic Sans MS", 1, 15));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(9, 2, 247))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel10.setText("Sexo");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel11.setText("Fecha de Nacimiento");

        txtAddNombre.setNextFocusableComponent(txtAddApellido1);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel12.setText("Apellidos");

        txtAddApellido1.setNextFocusableComponent(txtAddApellido2);

        txtAddApellido2.setNextFocusableComponent(txtSexo);

        txtSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mujer", "Hombre" }));
        txtSexo.setNextFocusableComponent(txtFechaNacimiento);

        txtFechaNacimiento.setNextFocusableComponent(txtAddDireccionTipo);

        jLabel13.setText("dd/MM/aaaa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(txtSexo, 0, 163, Short.MAX_VALUE)
                    .addComponent(txtAddNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAddApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(8, 4, 248))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel14.setText("Dirección");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel15.setText("Teléfono");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel16.setText("E-Mail");

        txtAddDireccionTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calle", "Avenida", "Paseo", "Carretera", "Pasaje", "Vía", "Plaza" }));
        txtAddDireccionTipo.setNextFocusableComponent(txtAddDireccion);

        txtAddDireccion.setNextFocusableComponent(txtAddTelefono);

        txtAddTelefono.setNextFocusableComponent(txtAddMovil);

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel17.setText("Móvil");

        txtAddMovil.setNextFocusableComponent(txtAddEmail);

        txtAddEmail.setNextFocusableComponent(txtAddComentarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtAddDireccionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAddEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(txtAddTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAddMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddDireccionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtAddMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15));
        jLabel18.setText("Comentarios");

        txtAddComentarios.setNextFocusableComponent(btnGuardar);

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setNextFocusableComponent(btnSalir);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAddLimpiar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnAddLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Limpiar.png"))); // NOI18N
        btnAddLimpiar.setText("Limpiar");
        btnAddLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAñadirLayout = new javax.swing.GroupLayout(pnlAñadir);
        pnlAñadir.setLayout(pnlAñadirLayout);
        pnlAñadirLayout.setHorizontalGroup(
            pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAñadirLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAñadirLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAñadirLayout.setVerticalGroup(
            pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAñadirLayout.createSequentialGroup()
                .addGroup(pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAñadirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAñadirLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddComentarios)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlAñadirLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddLimpiar, btnGuardar});

        tabbedPane.addTab("Añadir Cliente", new javax.swing.ImageIcon(getClass().getResource("/resources/add.png")), pnlAñadir); // NOI18N

        btnBackup.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Backup.png"))); // NOI18N
        btnBackup.setText("Backup BBDD");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnBackup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackup)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int salir = JOptionPane.showConfirmDialog(rootPane, "Va a salir del sistema, ¿está seguro?", "Confirme la salida", JOptionPane.YES_NO_OPTION);
        if (salir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        AccionBotonBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtAddNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "El campo Nombre no puede estar vacío!!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (txtAddApellido1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "El campo Apellido no puede estar vacío!!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (txtAddTelefono.getText().equals("") && txtAddMovil.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe especificar algún teléfono!!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (!Utils.comprobarFormatoFecha(txtFechaNacimiento.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Formato de fecha incorrecto!! (dd/MM/aaaa)", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if (!txtAddEmail.getText().equals("") && !Utils.isFormatoEmail(txtAddEmail.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Formato de E-Mail incorrecto!!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            List<Clientes> cliente = new ArrayList<Clientes>();
            Clientes cli = new Clientes();
            try {
                cli.setNombre(txtAddNombre.getText());
                cli.setApellido1(txtAddApellido1.getText());
                cli.setApellido2(txtAddApellido2.getText());
                cli.setSexo(txtSexo.getSelectedItem().toString());
                cli.setFechaNacimiento(txtFechaNacimiento.getText());
                cli.setDireccionTipo(txtAddDireccionTipo.getSelectedItem().toString());
                cli.setDireccion(txtAddDireccion.getText());
                cli.setTelefono(txtAddTelefono.getText());
                cli.setMovil(txtAddMovil.getText());
                cli.setEmail(txtAddEmail.getText());
                cli.setComentarios(txtAddComentarios.getText());
                cli.setEdad(Utils.calcularEdad(txtFechaNacimiento.getText()));

                GestionBDFactory.getInstance().getBDMySQL().addCliente(cli);
                JOptionPane.showMessageDialog(rootPane, "Cliente guardado correctamente...", "Información!", JOptionPane.INFORMATION_MESSAGE);
                cliente.add(cli);
                frmClientes frmCliente = new frmClientes(cliente);
                frmCliente.setVisible(true);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Se ha producido un error al guardar el cliente!!\n" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAddLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLimpiarActionPerformed
        inicializarCampos();
    }//GEN-LAST:event_btnAddLimpiarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        inicializarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        List<Clientes> listadoClientes = GestionBDFactory.getInstance().getBDMySQL().getListClientes();
        frmListadoClientes frmListado = new frmListadoClientes(listadoClientes);
        frmListado.setVisible(true);
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnCumpleanyosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumpleanyosActionPerformed
        List<Clientes> listaClientes = GestionBDFactory.getInstance().getBDMySQL().getListaCumpleanyos();
        if (!listaClientes.isEmpty()) {
            frmCumpleanyos frmCumple = new frmCumpleanyos(listaClientes);
            frmCumple.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Hoy no cumple años ningún cliente...", "Información!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCumpleanyosActionPerformed

    private void btnMailingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailingActionPerformed
        List<Clientes> lista = GestionBDFactory.getInstance().getBDMySQL().getListaMails();
        List<String> listaBuena = new ArrayList<String>();
        for (Clientes c : lista) {
            if (!c.getEmail().equals("")) {
                if (Utils.isFormatoEmail(c.getEmail())) {
                    listaBuena.add(c.getEmail());
                }
            }
        }
        frmMailing mailing = new frmMailing(listaBuena);
        mailing.setVisible(true);
    }//GEN-LAST:event_btnMailingActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        String cadena = "cmd.exe /K c:/Backup/Backup.bat";

        try {
            File file = new File("c:/Backup/BackupBBDD.sql");
            File fileOld = new File("c:/Backup/BackupBBDD_old.sql");

            if (fileOld.exists()) {
                fileOld.delete();
            }
            if (file.exists()) {
                file.renameTo(fileOld);
            }
            // Ejecutamos el Backup de la BBDD
            Runtime.getRuntime().exec(cadena);

            JOptionPane.showMessageDialog(rootPane, "Backup realizado correctamente...", "Información!", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception ioe) {
            JOptionPane.showMessageDialog(rootPane, "Se ha producido un error al hacer el Backup!!\n" + ioe.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void AccionBotonBuscar() {
        try {
            if (txtId.getText().equals("") && txtNombre.getText().equals("") && txtApellido.getText().equals("") && txtTelefono.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar algún campo!!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else {
                List<Clientes> cli;
                if (txtId.getText().equals("")) {                    
                    cli = GestionBDFactory.getInstance().getBDMySQL().findCliente(0, txtNombre.getText(), txtApellido.getText(), txtTelefono.getText());
                }
                else {
                    cli = GestionBDFactory.getInstance().getBDMySQL().findCliente(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtApellido.getText(), txtTelefono.getText());
                }
                if (!cli.isEmpty()) {
                    frmClientes clientes = new frmClientes(cli);
                    clientes.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ningún cliente!!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Se ha producido un error en la búsqueda de clientes!!\n" + ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
            
    
    private void inicializarCampos() {
        txtAddApellido1.setText("");
        txtAddApellido2.setText("");
        txtAddComentarios.setText("");
        txtAddDireccion.setText("");
        txtAddDireccionTipo.setSelectedIndex(0);
        txtAddEmail.setText("");
        txtAddMovil.setText("");
        txtAddNombre.setText("");
        txtAddTelefono.setText("");
        txtApellido.setText("");
        txtFechaNacimiento.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtSexo.setSelectedIndex(0);
        txtTelefono.setText("");
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    //SubstanceLookAndFeel.setSkin(new MarinerSkin());
                    SubstanceLookAndFeel.setSkin(new BusinessBlueSteelSkin());
                    
                    GestionBDFactory.getInstance().getBDMySQL().firstConnection();
                }
                catch (Exception ex) {
                    System.out.println("Exception:" + ex.getMessage());
                }
                new frmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLimpiar;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCumpleanyos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnMailing;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlAñadir;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtAddApellido1;
    private javax.swing.JTextField txtAddApellido2;
    private javax.swing.JTextField txtAddComentarios;
    private javax.swing.JTextField txtAddDireccion;
    private javax.swing.JComboBox txtAddDireccionTipo;
    private javax.swing.JTextField txtAddEmail;
    private javax.swing.JTextField txtAddMovil;
    private javax.swing.JTextField txtAddNombre;
    private javax.swing.JTextField txtAddTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JComboBox txtSexo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
