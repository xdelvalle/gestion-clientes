package gui;

import bbdd.GestionBDFactory;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import model.Clientes;

public class frmListadoClientes extends javax.swing.JFrame {

    public frmListadoClientes(List<Clientes> listClientes) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        printListadoClientes(listClientes);
        formateoTabla();
    }

    private void printListadoClientes(List<Clientes> listClientes) {
        Clientes cli = null;
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("Apellido1");
        tableHeaders.add("Apellido2");
        tableHeaders.add("Edad");
        tableHeaders.add("Sexo");
        tableHeaders.add("Tipo Vía");
        tableHeaders.add("Dirección");
        tableHeaders.add("Teléfono");
        tableHeaders.add("Móvil");
        tableHeaders.add("E-Mail");
        tableHeaders.add("Fecha de Nacimiento");
        tableHeaders.add("Comentarios");
        tableHeaders.add("Id");

        for (Object o : listClientes) {
            cli = (Clientes) o;
            Vector<Object> row = new Vector<Object>();

            row.add(cli.getNombre());
            row.add(cli.getApellido1());
            row.add(cli.getApellido2());
            row.add(cli.getEdad());
            row.add(cli.getSexo());
            row.add(cli.getDireccionTipo());
            row.add(cli.getDireccion());
            row.add(cli.getTelefono());
            row.add(cli.getMovil());
            row.add(cli.getEmail());
            row.add(cli.getFechaNacimiento());
            row.add(cli.getComentarios());
            row.add(cli.getId());

            tableData.add(row);
        }

        tablaClientes.setModel(new DefaultTableModel(tableData, tableHeaders));

        JTableHeader header = tablaClientes.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
    }

    private void formateoTabla() {
        TableColumn column = null;
        for (int i = 0; i < tablaClientes.getColumnCount(); i++) {
            column = tablaClientes.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(110);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 1:
                    column.setPreferredWidth(110);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 2:
                    column.setPreferredWidth(110);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 3:
                    column.setPreferredWidth(60);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 4:
                    column.setPreferredWidth(80);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 5:
                    column.setPreferredWidth(75);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 6:
                    column.setPreferredWidth(220);
                    column.sizeWidthToFit();
                    break;
                case 7:
                    column.setPreferredWidth(130);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 8:
                    column.setPreferredWidth(130);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 9:
                    column.setPreferredWidth(220);
                    column.sizeWidthToFit();
                    break;
                case 10:
                    column.setPreferredWidth(150);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 11:
                    column.setPreferredWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 12:
                    column.setPreferredWidth(30);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblListado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        btnMostrarFicha = new javax.swing.JButton();

        setTitle("Listado de Clientes");

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        lblListado.setFont(new java.awt.Font("Ubuntu", 2, 24));
        lblListado.setForeground(new java.awt.Color(8, 6, 6));
        lblListado.setText("Listado de clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblListado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblListado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tablaClientes.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setDoubleBuffered(true);
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tablaClientes);

        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMostrarFicha.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
        btnMostrarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Modificar.png"))); // NOI18N
        btnMostrarFicha.setText("Mostrar Ficha");
        btnMostrarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(417, Short.MAX_VALUE)
                .addComponent(btnMostrarFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addGap(119, 119, 119))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarFicha)
                    .addComponent(btnCerrar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jScrollPane1)
                    .addGap(57, 57, 57)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMostrarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFichaActionPerformed
        Object idCliente;
        try {
            idCliente = tablaClientes.getModel().getValueAt(tablaClientes.getSelectedRow(), 12);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el cliente a mostrar!!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            List<Clientes> cliente = GestionBDFactory.getInstance().getBDMySQL().findCliente(Integer.parseInt(idCliente.toString()), "", "", "");
            frmClientes frmCliente = new frmClientes(cliente);
            frmCliente.setVisible(true);
            this.setVisible(false);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Se ha producido un error mostrando la ficha del cliente!!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarFichaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMostrarFicha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListado;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
