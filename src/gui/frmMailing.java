package gui;

import java.awt.Component;
import java.awt.Toolkit;
import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import utils.EnviarMail;

public class frmMailing extends javax.swing.JFrame {

    private List<String> listaMails;
    DefaultListModel modelo = new DefaultListModel();
    private File filePlantilla = null;
    private File fileAdjunto = null;
    private JFileChooser fc = new JFileChooser();
    private String subject = null;

    public frmMailing(List<String> lista) {
        for (String s : lista) {
            modelo.addElement(s);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Program Files/Gestion Clientes v3.0/resources/estrella_peque.png"));
        lblBloques.setText("Se han encontrado [" + lista.size() + "] E-mails.");
        this.listaMails = lista;
        this.progressBar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBloques = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        btnCerrar = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        lblInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlantilla = new javax.swing.JTextField();
        btnPlantilla = new javax.swing.JButton();
        btnAdjunto = new javax.swing.JButton();
        txtAdjuntos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Mailing");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 183, 222));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 6, 6));
        jLabel1.setText("Mailing");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_ambar_transp4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
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

        lblBloques.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        btnEnviar.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Copiar.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        list.setModel(modelo);
        jScrollPane1.setViewportView(list);

        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel3.setText("Plantilla E-Mail");

        btnPlantilla.setText("...");
        btnPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantillaActionPerformed(evt);
            }
        });

        btnAdjunto.setText("...");
        btnAdjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntoActionPerformed(evt);
            }
        });

        jLabel4.setText("Adjuntos");

        jLabel5.setText("Asunto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAdjuntos, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlantilla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdjunto, 0, 1, Short.MAX_VALUE)
                                    .addComponent(btnPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                            .addComponent(txtSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBloques, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(216, Short.MAX_VALUE)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar)))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCerrar, btnEnviar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblBloques, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlantilla)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAdjunto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (txtPlantilla.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tiene que seleccionar el cuerpo del mensaje...", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(txtSubject.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe rellenar el campo 'Asunto'...", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            setSubject(txtSubject.getText());
        }
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);
        lblInfo.setText("Enviando E-Mail...");
        TaskEnviarMail mailing = new TaskEnviarMail();
        mailing.execute();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantillaActionPerformed
        fc.showOpenDialog(this);

        if (fc.getSelectedFile() != null) {
            this.setFilePlantilla(fc.getSelectedFile());
            txtPlantilla.setText(fc.getSelectedFile().toString());
        }
}//GEN-LAST:event_btnPlantillaActionPerformed

    private void btnAdjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntoActionPerformed
        fc.showOpenDialog(this);

        if (fc.getSelectedFile() != null) {
            this.setFileAdjunto(fc.getSelectedFile());
            txtAdjuntos.setText(fc.getSelectedFile().toString());
        }
}//GEN-LAST:event_btnAdjuntoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjunto;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnPlantilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloques;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JList list;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txtAdjuntos;
    private javax.swing.JTextField txtPlantilla;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables

    public File getFilePlantilla() {
        return filePlantilla;
    }

    public void setFilePlantilla(File filePlantilla) {
        this.filePlantilla = filePlantilla;
    }

    public File getFileAdjunto() {
        return fileAdjunto;
    }

    public void setFileAdjunto(File fileAdjunto) {
        this.fileAdjunto = fileAdjunto;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    class TaskEnviarMail extends SwingWorker<Void, Void> {

        @Override
        protected Void doInBackground() throws Exception {

            EnviarMail send = new EnviarMail();
            boolean enviado = false;

            if (getFileAdjunto() == null) {
                enviado = send.sendMail(listaMails, getFilePlantilla().toString(), null, getSubject());
            }
            else {
                enviado = send.sendMail(listaMails, getFilePlantilla().toString(), getFileAdjunto().toString(), getSubject());
            }

            progressBarIndeterminate(false);

            if (enviado) {
                showSimpleMessageDialog(rootPane, "E-Mails enviados correctamente...");
            }
            else {
                showSimpleMessageDialog(rootPane, "Ha habido algún problema enviando algún E-Mail!!");
            }

            changeJLabel(lblInfo, "");

            progressBar.setVisible(false);
            
            return null;
        }

        private void showSimpleMessageDialog(final Component c, final String text) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    JOptionPane.showMessageDialog(c, text);
                }
            });
        }

        private void progressBarIndeterminate(final boolean b) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    progressBar.setIndeterminate(b);
                }
            });
        }

        private void changeJLabel(final JLabel label, final String text) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    label.setText(text);
                }
            });
        }
    }
}
