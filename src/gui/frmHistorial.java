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
import model.Historicos;

public class frmHistorial extends javax.swing.JFrame {

    private Clientes cliente;

    public frmHistorial(List<Historicos> historial, Clientes cli) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        this.cliente = cli;
        lblNombre.setText(cli.getNombre() + " " + cli.getApellido1());
        printHistorial(historial);
        formateoTabla();
    }

    private void printHistorial(List<Historicos> listaHistoricos) {
        Historicos historico = null;
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id Historico");
        tableHeaders.add("Fecha");
        tableHeaders.add("Tratamiento");
        tableHeaders.add("Producto");
        tableHeaders.add("Precio");
        tableHeaders.add("Recomendaciones");

        for (Object o : listaHistoricos) {
            historico = (Historicos) o;
            Vector<Object> row = new Vector<Object>();

            row.add(historico.getIdHistorico());
            row.add(historico.getFecha());
            row.add(historico.getTratamiento());
            row.add(historico.getProducto());
            row.add(historico.getPrecio());
            row.add(historico.getRecomendaciones());

            tableData.add(row);
        }

        tablaHistorico.setModel(new DefaultTableModel(tableData, tableHeaders));

        JTableHeader header = tablaHistorico.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
    }

    private void formateoTabla() {
        TableColumn column = null;
        for (int i = 0; i < tablaHistorico.getColumnCount(); i++) {
            column = tablaHistorico.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(100);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 1:
                    column.setPreferredWidth(120);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 2:
                    column.setPreferredWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 3:
                    column.setPreferredWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 4:
                    column.setPreferredWidth(60);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 5:
                    column.setPreferredWidth(200);
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
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorico = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setTitle("Historial del Cliente");

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(8, 6, 6));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(lblLogo))
                .addContainerGap())
        );

        tablaHistorico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tablaHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaHistorico.setDoubleBuffered(true);
        tablaHistorico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaHistorico.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tablaHistorico);

        btnAgregar.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        btnAgregar.setText("Añadir");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregar, btnEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregar, btnEliminar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        frmAddHistorico addHistorico = new frmAddHistorico(cliente);
        addHistorico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(rootPane, "Va a eliminar el histórico, ¿Está seguro?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (eliminar == JOptionPane.YES_OPTION) {
            Object idHistorico;
            try {
                idHistorico = tablaHistorico.getModel().getValueAt(tablaHistorico.getSelectedRow(), 0);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(rootPane, "Debe seleccionar la fila a eliminar!!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                GestionBDFactory.getInstance().getBDMySQL().removeHistorico(Integer.parseInt(idHistorico.toString()));
                JOptionPane.showMessageDialog(rootPane, "Histórico eliminado correctamente...", "Información!", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                List<Historicos> listaHistoricos = GestionBDFactory.getInstance().getBDMySQL().findHistoricos(cliente.getId());
                frmHistorial historial = new frmHistorial(listaHistoricos, cliente);
                historial.setVisible(true);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "No se ha podido eliminar el histórico!!!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tablaHistorico;
    // End of variables declaration//GEN-END:variables
}
