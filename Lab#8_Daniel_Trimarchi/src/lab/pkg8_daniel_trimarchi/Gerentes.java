/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_daniel_trimarchi;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author X
 */
public class Gerentes extends javax.swing.JFrame {

    /**
     * Creates new form Gerentes
     */
    public Gerentes() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        registro = new javax.swing.JDialog();
        pop_up = new javax.swing.JPopupMenu();
        Promover = new javax.swing.JMenuItem();
        Despedir = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        j_empresa = new javax.swing.JTree();
        j_nombre = new javax.swing.JTextField();
        j_id = new javax.swing.JTextField();
        j_contraseña = new javax.swing.JTextField();
        j_Puesto = new javax.swing.JTextField();
        j_salario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_jefe = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel2.setText("Contraseña");

        registrar.setText("Registrarse");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        entrar.setText("Entrar");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usuario)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro.getContentPane());
        registro.getContentPane().setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        Promover.setText("Promover");
        Promover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoverActionPerformed(evt);
            }
        });
        pop_up.add(Promover);

        Despedir.setText("Despedir");
        Despedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirActionPerformed(evt);
            }
        });
        pop_up.add(Despedir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        j_empresa.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        j_empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_empresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(j_empresa);

        jLabel3.setText("IdEmpresa");

        jLabel4.setText("Nombre");

        jLabel5.setText("Contraseña");

        jLabel6.setText("Salario");

        jLabel7.setText("Puesto");

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));

        cb_jefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "No Tiene" }));

        jLabel11.setText("Jefe");

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(856, 856, 856)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_id, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Arbol", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        registro.setModal(true);
        registro.pack();
        registro.setLocationRelativeTo(this);
        registro.setVisible(true);
    }//GEN-LAST:event_registrarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
        System.out.println(temp.getNombre());
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_jefe.getModel();
        if (cb_jefe.getSelectedIndex() > 0) {
            if (cb_jefe.getSelectedIndex() == 1 && temp.getNombre().equals("N")) {
                temp = new empleado(j_nombre.getText(), j_id.getText(),
                        j_contraseña.getText(), j_Puesto.getText(), j_salario.getText());
                modelo.addElement(temp);
            } else {
                if (modelo.getSelectedItem() instanceof empleado) {
                    empleado jefe = (empleado) modelo.getSelectedItem();
                    empleado temp1 = new empleado(j_nombre.getText(), j_id.getText(),
                            j_contraseña.getText(), jefe, j_Puesto.getText(), j_salario.getText());
                    jefe.getLista_empleados().add(temp1);
                    modelo.addElement(temp1);
                }
            }
            cb_jefe.setModel(modelo);
            DefaultTreeModel tmodel = (DefaultTreeModel) j_empresa.getModel();
            tmodel.setRoot(new DefaultMutableTreeNode(temp));
            listar_no_orden(temp, (DefaultMutableTreeNode) tmodel.getRoot());
        }
    }//GEN-LAST:event_crearActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void PromoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoverActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel tmodel = (DefaultTreeModel) j_empresa.getModel();
        Object v1
                //EL OBJETO HACE REFERENCIA AL ULTIMO ELEMENTO SELECCIONADO
                = j_empresa.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;
        System.out.println(nodo_seleccionado.getParent() == tmodel.getRoot());
        if (!(nodo_seleccionado.getParent() == tmodel.getRoot())) {
            DefaultMutableTreeNode padre = (DefaultMutableTreeNode) nodo_seleccionado.getParent();
            DefaultMutableTreeNode padre2 = (DefaultMutableTreeNode) padre.getParent();
            if (padre2.getUserObject() instanceof empleado) {
                System.out.println("Paso");
                empleado emp
                        = (empleado) padre2.getUserObject();
                empleado emp1
                        = (empleado) nodo_seleccionado.getUserObject();
                empleado emp2
                        = (empleado) padre.getUserObject();
                int cont = 0;
                int a = 0;
                for (empleado e : emp2.getLista_empleados()) {
                    if (e.getNombre().equals(emp1.getNombre()) && e.getContraseña().equals(e.getContraseña())) {
                        System.out.println("Encontrado");
                        a = cont;
                    }
                    cont++;
                }
                emp2.getLista_empleados().remove(a);
                emp.getLista_empleados().add(emp1);
            }

        }
        tmodel.setRoot(new DefaultMutableTreeNode(temp));
        listar_no_orden(temp, (DefaultMutableTreeNode) tmodel.getRoot());
    }//GEN-LAST:event_PromoverActionPerformed

    private void j_empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_empresaMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = j_empresa.getClosestRowForLocation(evt.getX(), evt.getY());
            //MARCA LA FILA COMO SELECCIONADO
            j_empresa.setSelectionRow(row);
            pop_up.show(evt.getComponent(), evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_j_empresaMouseClicked

    private void DespedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel tmodel = (DefaultTreeModel) j_empresa.getModel();
        Object v1
                //EL OBJETO HACE REFERENCIA AL ULTIMO ELEMENTO SELECCIONADO
                = j_empresa.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;
        System.out.println(nodo_seleccionado.getParent() == tmodel.getRoot());
        DefaultMutableTreeNode padre = (DefaultMutableTreeNode) nodo_seleccionado.getParent();
        DefaultMutableTreeNode padre2 = (DefaultMutableTreeNode) padre.getParent();

        empleado emp
                = (empleado) padre2.getUserObject();

        empleado emp1
                = (empleado) nodo_seleccionado.getUserObject();
        empleado emp2
                = (empleado) padre.getUserObject();
        int cont = 0;
        int a = -1;
        for (empleado e : emp2.getLista_empleados()) {
            if (e.getNombre().equals(emp1.getNombre()) && e.getContraseña().equals(emp.getContraseña())) {
                a = cont;
                empleado asc = e;
            }
            cont++;
        }
        emp2.getLista_empleados().remove(a);
        if (emp1.getLista_empleados().size() > 0) {
            emp2.getLista_empleados().add(emp1.getLista_empleados().get(emp1.getLista_empleados().size() - 1));
            int size = emp1.getLista_empleados().size();
            int size2 = emp2.getLista_empleados().size() - 1;
            System.out.println("HMMMMMMM");
            ArrayList<empleado> es = new ArrayList();
            for (int i = 0; i < size; i++) {

                empleado Ascend = emp1.getLista_empleados().get(i);
                String nombre = emp2.getLista_empleados().get(size2).getNombre();
                String Contra = emp2.getLista_empleados().get(size2).getContraseña();
                if (!(nombre.equals(Ascend.getNombre()) && Contra.equals(Ascend.getContraseña()))) {
                    es.add(Ascend);
                }
            }
            System.out.println(es + "HOLA");
            for (empleado e : es) {
                emp2.getLista_empleados().get(size2).getLista_empleados().add(e);
            }

        }

        tmodel.setRoot(new DefaultMutableTreeNode(temp));
        listar_no_orden(temp, (DefaultMutableTreeNode) tmodel.getRoot());
    }//GEN-LAST:event_DespedirActionPerformed

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
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Despedir;
    private javax.swing.JMenuItem Promover;
    private javax.swing.JComboBox<String> cb_jefe;
    private javax.swing.JButton crear;
    private javax.swing.JButton entrar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField j_Puesto;
    private javax.swing.JTextField j_contraseña;
    private javax.swing.JTree j_empresa;
    private javax.swing.JTextField j_id;
    private javax.swing.JTextField j_nombre;
    private javax.swing.JTextField j_salario;
    private javax.swing.JPasswordField password;
    private javax.swing.JPopupMenu pop_up;
    private javax.swing.JButton registrar;
    private javax.swing.JDialog registro;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
 empleado temp = new empleado("N");

    public void listar_no_orden(Object p_raiz, DefaultMutableTreeNode nodo) {
        try {
            if (p_raiz instanceof empleado) {
                for (empleado p : ((empleado) p_raiz).getLista_empleados()) {
                    if (p.getLista_empleados().isEmpty()) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                    } else {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                        listar_no_orden(p, n);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buscar_no_orden(Object p_raiz, DefaultMutableTreeNode nodo) {
        try {
            if (p_raiz instanceof empleado) {
                for (empleado p : ((empleado) p_raiz).getLista_empleados()) {
                    if (p.getLista_empleados().isEmpty()) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                    } else {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(p);
                        nodo.add(n);
                        listar_no_orden(p, n);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
