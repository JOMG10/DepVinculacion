/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplosArchivosGrafico;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Benedicto
 */
public class FMenuHuespedes extends javax.swing.JFrame {
    
    String[] columnas;
    DefaultTableModel dtm;

    public FMenuHuespedes() {
        initComponents();        
        llenarTabla();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHuespedes = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Huéspedes");

        jLabel2.setText("Num Identidad");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        tblHuespedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Num. Identidad", "Nombre", "Apellidos", "Procedencia"
            }
        ));
        jScrollPane1.setViewportView(tblHuespedes);

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("HUÉSPEDES");

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
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImprimir)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnImprimir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void llenarTabla(){
        this.columnas= new String[]{"Num.Identidad","Nombre",
                                    "Apellidos","Procedencia",
                                    };                
        //Creamos el modelo que contiene el nombre de las columnas y filas 0
        this.dtm =  new DefaultTableModel(this.columnas,0);        
        //Leemos los registros del archivo y los guardamos en un ArrayList
        //Creamos el ArrayList
        ArrayList<String> listaHuespedes =  new ArrayList();        
        //Enseguida creo la referecia (objeto) de la clase ArchivoTexto que es
        //la que me da el control para las operaciones con archivos
        ArchivoTexto objArchivoTexto =  new ArchivoTexto();        
        //Enseguida verifico si el archivo existe (validar que exista)
        if (objArchivoTexto.existeArchivo("huespedes.txt")){           
            //Abro el archivo para lectura de datos
            objArchivoTexto.abrirArchivo("huespedes.txt",'r');            
            //Leemos los registros (Extraemos la información del archivo)
            listaHuespedes = objArchivoTexto.leerLineas();
            //Usamos un while para recorrer la lista y subir los registros a la tabla
            //Antes creamos una variable de referencia del tipo iterador             
            Iterator <String> it=listaHuespedes.iterator();
            while(it.hasNext()){  //Si hay registros entra
                //Extraemos el registro y los separamos (split) en partes 
                //cuando encuentre una coma y lo pasamos a un arreglo de tipo String
                String registro[]=it.next().split(",");
                //Subimos el registro al modelo, y por lo tanto a la tabla
                dtm.addRow(registro);
            }
            //Cerramos el archivo
            objArchivoTexto.cerrarArchivo('r');            
        }                
        //String fila[] ={"123457","Sara","Lopez","Oaxaca","Editar", "Eliminar"};
        //this.dtm.addRow(fila);
        this.tblHuespedes.setModel(dtm);
    }
    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        // TODO add your handling code here:
        FAgregarHuesped objAgregarCliente = new FAgregarHuesped(this.dtm);
        objAgregarCliente.setVisible(true);
        
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:                
        int fila = this.tblHuespedes.getSelectedRow();
        JOptionPane.showMessageDialog(this,"Fila seleccionada" + fila);
        if(fila!=-1){
            // ----------------------------------------------------
            /*
              BUSCAR EL HUESPED A ELIMINAR
              Primero determino que fila seleccioné            
              Enseguida extraigo el dato de la fila y columna seleccionada
              En este caso debe ser el numero de identidad        
            */
            String numIdentidadEliminar = this.tblHuespedes.getValueAt(fila, 0).toString();
            //Abrir el archivo para lectura      
            ArchivoTexto objArchivoTexto =  new ArchivoTexto();                                
            objArchivoTexto.abrirArchivo("huespedes.txt",'r');            
            //Buscamos el registro, si lo encuentra retornamos un true
            boolean encontrado=objArchivoTexto.buscarRegistro(numIdentidadEliminar);
            //Cerramos el archivo
            objArchivoTexto.cerrarArchivo('r');            
            //Fin de Buscar ----------------------------------------------
            
            if (encontrado)
            {   //Si lo encuentra confirmar para eliminar
                int respuesta=JOptionPane.showConfirmDialog(this,"Está seguro que desea eliminarlo?");
                if(respuesta==0){
                    /*Si la respuesta es si, Eliminar el registro del archivo de datos                       
                      Para eliminar usaremos el archivo fuente y un temporal
                      Abrimos el archivo fuente (original), se abre para lectura
                      Nota: la referencia objArchivoTexto ya no se crea, se creó lineas antes
                    */
                    //ArchivoTexto objArchivoTexto2 = new ArchivoTexto();
                    objArchivoTexto.abrirArchivo("huespedes.txt",'r');
                    /*Abrimos o creamos otra referencia del tipo ArchivoTexto
                      En este solo le asignamos la referencia del objArchivoTexto
                      Para que los dos estén apuntando al mismo objeto
                    */
                    ArchivoTexto objArchivoTextoTemporal = objArchivoTexto;
                    //Abrimos o creamos el archivo temporal
                    objArchivoTextoTemporal.abrirArchivo("temporal.txt",'w');                    
                    /*Eliminamos el registro, en este caso podemos llamar al método
                      eliminarRegistro con cualquiera de las dos referencias de tipo
                      ArchivoTexto
                    */
                    boolean eliminado = objArchivoTexto.eliminarRegistro(numIdentidadEliminar);
                    //Cerramos los archivos
                    objArchivoTextoTemporal.cerrarArchivo('w');
                    objArchivoTexto.cerrarArchivo('r');
                    //borrar el archivo fuente (original)
                    objArchivoTexto.eliminarArchivo("huespedes.txt");
                    //Renombrar el archivo temporal por el nombre original
                    objArchivoTexto.cambiarNombre("temporal.txt","huespedes.txt");                    
                    if (eliminado){
                        //Una vez eliminado el registro del archivo, tambien lo eliminamos
                        //de la tabla.
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNuevoActionPerformed

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

        FActualizarHuesped objAgregarCliente = new FActualizarHuesped(this.dtm);
        objAgregarCliente.setFilaSeleccionada(fila); // Asignar la fila seleccionada
        objAgregarCliente.EditForm(id, nombre, apellido, procedencia);
        objAgregarCliente.setVisible(true);
    }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            boolean completado = this.tblHuespedes.print();
            if (completado) {
                System.out.println("Impresión finalizada!");
            } else {
                System.out.println("Error al imprimir");
            }   } catch (PrinterException ex) {
            Logger.getLogger(FMenuHuespedes.class.getName()).log(Level.SEVERE, null, ex);
        }       
       
    }//GEN-LAST:event_btnImprimirMouseClicked

    
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FMenuHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuHuespedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuHuespedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHuespedes;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
