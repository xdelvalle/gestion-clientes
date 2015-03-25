package gui;

import bbdd.GestionBDFactory;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import model.Clientes;
import utils.Utils;

public class frmCumpleanyos extends javax.swing.JFrame {

    private List<Clientes> listaClientes;
    
    public frmCumpleanyos(List<Clientes> clientes) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        printTablaCumpleanyos(clientes);
        formateoTabla();
        updateEnBBDD(clientes);
        this.listaClientes = clientes;
    }

    private void printTablaCumpleanyos(List<Clientes> listClientes) {
        Clientes cli = null;
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Nombre");
        tableHeaders.add("Apellido1");
        tableHeaders.add("Edad");
        tableHeaders.add("Telefono");
        tableHeaders.add("E-Mail");
        tableHeaders.add("Id");

        for (Object o : listClientes) {
            cli = (Clientes) o;
            Vector<Object> row = new Vector<Object>();

            row.add(cli.getNombre());
            row.add(cli.getApellido1());
            row.add(Utils.calcularEdad(cli.getFechaNacimiento()));

            if (cli.getMovil().equals("")) {
                row.add(cli.getTelefono());
            }
            else {
                row.add(cli.getMovil());
            }

            row.add(cli.getEmail());
            row.add(cli.getId());

            tableData.add(row);
        }

        tablaCumpleanyos.setModel(new DefaultTableModel(tableData, tableHeaders));

        JTableHeader header = tablaCumpleanyos.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
    }

    private void formateoTabla() {
        TableColumn column = null;
        for (int i = 0; i < tablaCumpleanyos.getColumnCount(); i++) {
            column = tablaCumpleanyos.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(90);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 1:
                    column.setPreferredWidth(90);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 2:
                    column.setPreferredWidth(50);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 3:
                    column.setPreferredWidth(90);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 4:
                    column.setPreferredWidth(150);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
                case 5:
                    column.setPreferredWidth(50);
                    column.setMaxWidth(200);
                    column.sizeWidthToFit();
                    break;
            }
        }
    }

    private void updateEnBBDD(List<Clientes> clientes) {
        try {
            for (Clientes c : clientes) {
                System.out.println(c.toString());
                c.setEdad(Utils.calcularEdad(c.getFechaNacimiento()));
                GestionBDFactory.getInstance().getBDMySQL().addCliente(c);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha habido un error al actualizar la edad de algún cliente...", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCumpleanyos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEnviarMail = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel1.setForeground(new java.awt.Color(8, 6, 6));
        jLabel1.setText("Hoy cumplen años..");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tablaCumpleanyos.setFont(new java.awt.Font("Verdana", 0, 14));
        tablaCumpleanyos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCumpleanyos.setDoubleBuffered(true);
        tablaCumpleanyos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCumpleanyos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tablaCumpleanyos);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEnviarMail.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnEnviarMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cumpleaños.png"))); // NOI18N
        btnEnviarMail.setText("Enviar Mail");
        btnEnviarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnEnviarMail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarMail)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEnviarMail, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

private void btnEnviarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMailActionPerformed
    List<String> listaBuena = new ArrayList<String>();
    for (Clientes c : listaClientes) {
        if (!c.getEmail().equals("")) {
            if (Utils.isFormatoEmail(c.getEmail())) {
                listaBuena.add(c.getEmail());
            }
        }
    }
    frmMailing mailing = new frmMailing(listaBuena);
    mailing.setVisible(true);
}//GEN-LAST:event_btnEnviarMailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarMail;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCumpleanyos;
    // End of variables declaration//GEN-END:variables
}
