/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DepVinculacion;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FMenuAlumnos extends javax.swing.JFrame {
    
    String[] columnas;
    DefaultTableModel dtm;

    public FMenuAlumnos() {
        initComponents();        
        llenarTabla();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHuespedes = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Huéspedes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("N. Control");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        tblHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num. Control", "Nombre", "Apellidos", "Semestre", "Carrera", "Tipo", "Descipcion"
            }
        ));
        tblHuespedes.setMaximumSize(new java.awt.Dimension(2147483647, 500));
        jScrollPane1.setViewportView(tblHuespedes);

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALUMNOS TITULADOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void llenarTabla(){
        this.columnas= new String[]{"Num.control","Nombre","Apellidos",
                                    "Semestre","Carrera","Tipo","Descripcion"
                                    };                
        this.dtm =  new DefaultTableModel(this.columnas,0);        
  
                ArrayList<String> listaHuespedes ;        

            ArchivoTexto objArchivoTexto =  new ArchivoTexto();        
        if (objArchivoTexto.existeArchivo("db/alumnos.txt")){           
            objArchivoTexto.abrirArchivo("db/alumnos.txt",'r');            
            listaHuespedes = objArchivoTexto.leerLineas();
            Iterator <String> it=listaHuespedes.iterator();
            while(it.hasNext()){  //Si hay registros entra
                //cuando encuentre una coma y lo pasamos a un arreglo de tipo String
                String registro[]=it.next().split(",");
                dtm.addRow(registro);
            }
            objArchivoTexto.cerrarArchivo('r');            
        }                
         this.tblHuespedes.setModel(dtm);
    }
    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        FAgregarAlumno objAgregarCliente = new FAgregarAlumno(this.dtm);
        objAgregarCliente.setVisible(true);
        
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:                
        int fila = this.tblHuespedes.getSelectedRow();
        JOptionPane.showMessageDialog(this,"Fila seleccionada" + fila);
        if(fila!=-1){
        
            String numIdentidadEliminar = this.tblHuespedes.getValueAt(fila, 0).toString();
            //Abrir el archivo para lectura      
            ArchivoTexto objArchivoTexto =  new ArchivoTexto();                                
            objArchivoTexto.abrirArchivo("db/alumnos.txt",'r');            
            //Buscamos el registro, si lo encuentra retornamos un true
            boolean encontrado=objArchivoTexto.buscarRegistro(numIdentidadEliminar);
            //Cerramos el archivo
            objArchivoTexto.cerrarArchivo('r');            
            //Fin de Buscar ----------------------------------------------
            
            if (encontrado)
            {   
                int respuesta=JOptionPane.showConfirmDialog(this,"Está seguro que desea eliminarlo?");
                if(respuesta==0){
                    objArchivoTexto.abrirArchivo("db/alumnos.txt",'r');
                    ArchivoTexto objArchivoTextoTemporal = objArchivoTexto;
                    objArchivoTextoTemporal.abrirArchivo("db/temporal.txt",'w');                    
                    boolean eliminado = objArchivoTexto.eliminarRegistro(numIdentidadEliminar);
                    objArchivoTextoTemporal.cerrarArchivo('w');
                    objArchivoTexto.cerrarArchivo('r');
                    objArchivoTexto.eliminarArchivo("db/alumnos.txt");
                    objArchivoTexto.cambiarNombre("db/temporal.txt","db/alumnos.txt");                    
                    if (eliminado){
                        this.dtm.removeRow(fila);
                        JOptionPane.showMessageDialog(this,"Registro Eliminado");
                    }    
                }    
            }        
            else
                JOptionPane.showMessageDialog(this,"El registro no existe");
        }
        else
            JOptionPane.showMessageDialog(this,"Selecciona una fila" );        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        String numIdentidadBuscar = this.txtBuscarCliente.getText().toString();
        
        for (int i = 0; i < tblHuespedes.getRowCount(); i++) {           
           if (tblHuespedes.getValueAt(i, 0).equals(numIdentidadBuscar)) {                                           
                  tblHuespedes.changeSelection(i, 0, false, false);
                  break;
           }
        }        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
     
       int fila = this.tblHuespedes.getSelectedRow();
    if (fila != -1) {
        String id = this.tblHuespedes.getValueAt(fila, 0).toString();
        String nombre = this.tblHuespedes.getValueAt(fila, 1).toString();
        String apellido = this.tblHuespedes.getValueAt(fila, 2).toString();
        String procedencia = this.tblHuespedes.getValueAt(fila, 3).toString();

        FActualizarAlumno objAgregarCliente = new FActualizarAlumno(this.dtm);
        objAgregarCliente.setFilaSeleccionada(fila); // Asignar la fila seleccionada
        objAgregarCliente.EditForm(id, nombre, apellido, procedencia);
        objAgregarCliente.setVisible(true);
    }
    }//GEN-LAST:event_btnEditarMouseClicked

    
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
            java.util.logging.Logger.getLogger(FMenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHuespedes;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
