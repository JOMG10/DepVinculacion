/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DepVinculacion;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class FMenuAlumnos extends javax.swing.JFrame {
    
    String[] columnas;
    DefaultTableModel dtm;


    public FMenuAlumnos() {
        initComponents(); 
        llenarTabla();
        dtm = (DefaultTableModel) tblAlumnos.getModel();
    } 
 
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarAlumno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregarNuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        setTitle("Departamento de gestion tecnologica y vinculacion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("N. Control");

        txtBuscarAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(153, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DepVinculacion/imagenes/buscar1.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        tblAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Control", "Nombre", "Apellidos", "Periodo", "Carrera", "Titulacion", "Descipcion", "Fecha de acto protocolario"
            }
        ));
        tblAlumnos.setMaximumSize(new java.awt.Dimension(2147483647, 500));
        jScrollPane1.setViewportView(tblAlumnos);

        btnEliminar.setBackground(new java.awt.Color(255, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DepVinculacion/imagenes/btnDelete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 255, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DepVinculacion/imagenes/btnEdit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnAgregarNuevo.setBackground(new java.awt.Color(153, 255, 255));
        btnAgregarNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgregarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DepVinculacion/imagenes/agregar.png"))); // NOI18N
        btnAgregarNuevo.setText("Agregar");
        btnAgregarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarNuevoMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEPARTAMENTO DE GESTION TECNOLOGICA Y VINCULACION");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DepVinculacion/imagenes/imagen_2024-04-09_144237770.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INSTITUTO TECNOLOGICO DEL VALLE DE OAXACA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(btnAgregarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAgregarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   // Método para verificar si el archivo Excel está abierto
public static boolean isFileOpen(File file) {
    try {
        FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
        FileLock lock = channel.tryLock();
        if (lock != null) {
            lock.release();
            channel.close();
            return false;
        }
        channel.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return true;
}

    
    
    public void llenarTabla(){
        
           File excelFile = new File("db/alumnos.xlsx");
        if (isFileOpen(excelFile)) {
            JOptionPane.showMessageDialog(this, "El archivo de Excel está abierto por otro programa. Ciérrelo y vuelva a intentarlo.");
            return;
        }
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();        
      
        tblAlumnos.setRowHeight(30);
        tblAlumnos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16)); 

        this.columnas= new String[]{"Num.control","Nombre","Apellidos",
                                    "Semestre","Carrera","Titulacion","Descripcion", "Fecha Protocolario"
                                    };                
        this.dtm =  new DefaultTableModel(this.columnas,0);        
  
               try (InputStream archivo = new FileInputStream("db/alumnos.xlsx");
             XSSFWorkbook libro = new XSSFWorkbook(archivo)) {

            XSSFSheet hoja = libro.getSheetAt(0);
            Iterator<Row> filaIterator = hoja.iterator();
            
             if (filaIterator.hasNext()) {
        filaIterator.next(); // Ignorar la primera fila
    }

            while (filaIterator.hasNext()) {
                Row fila = filaIterator.next();
                Iterator<Cell> celdaIterator = fila.iterator();             
                
         
         String numeroControl = "" ;
                String nombre = "";
                String apellido = "";
                String semestre = "";
                String carrera = "";
                String tipo ="";
                String descripcion="";
                String fechaProtocolario="";

                while (celdaIterator.hasNext()) {
                    Cell celda = celdaIterator.next();
                    int indiceColumna = celda.getColumnIndex();

                    switch (indiceColumna) {
                        case 0:
                            numeroControl =  celda.getStringCellValue();
                            break;
                        case 1:
                            nombre = celda.getStringCellValue();
                            break;
                        case 2:
                            apellido = celda.getStringCellValue();
                            break;
                         case 3:
                            semestre = celda.getStringCellValue();
                            break;
                        case 4:
                            carrera = celda.getStringCellValue();
                            break;
                        case 5:
                            tipo = celda.getStringCellValue();
                            break;
                        case 6:
                            descripcion = celda.getStringCellValue();
                            break;
                        case 7:
                            fechaProtocolario = celda.getStringCellValue();
                            break;
                    }
                }

                modelo.addRow(new Object[]{numeroControl, nombre, apellido, semestre, carrera, tipo, descripcion, fechaProtocolario});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       File excelFile = new File("db/alumnos.xlsx");
        if (isFileOpen(excelFile)) {
            JOptionPane.showMessageDialog(this, "El archivo de Excel está abierto por otro programa. Ciérrelo y vuelva a intentarlo.");
            return;
        }
        ArchivoTexto objArchivoTexto= new ArchivoTexto();
        int filaSeleccionada = tblAlumnos.getSelectedRow();
        int fila=objArchivoTexto.eliminarAlumno(filaSeleccionada);      
        
        dtm.removeRow(fila);
   
    }//GEN-LAST:event_btnEliminarMouseClicked


     
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
                   
        boolean dato = buscarPorNumeroControl(txtBuscarAlumno.getText());
        
        if(!dato){
            JOptionPane.showMessageDialog(this, "No se encontro ningun alumno con ese numero de control");

        }
        
        limpiarCajas();
        
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void limpiarCajas(){
        this.txtBuscarAlumno.setText("");  
    }
          
    // Método para buscar por número de control
    public boolean buscarPorNumeroControl(String numeroControl) {
        for (int i = 0; i < tblAlumnos.getRowCount(); i++) {
            if (tblAlumnos.getValueAt(i, 0).equals(numeroControl)) {
                tblAlumnos.setRowSelectionInterval(i, i);          
                return true;
            }
        }
        return false;
    }
                   

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
    
        File excelFile = new File("db/alumnos.xlsx");
        if (isFileOpen(excelFile)) {
            JOptionPane.showMessageDialog(this, "El archivo de Excel está abierto por otro programa. Ciérrelo y vuelva a intentarlo.");
            return;
        }
       int fila = this.tblAlumnos.getSelectedRow();
    if (fila != -1) {
        String numControl = this.tblAlumnos.getValueAt(fila, 0).toString();
        String nombre = this.tblAlumnos.getValueAt(fila, 1).toString();
        String apellido = this.tblAlumnos.getValueAt(fila, 2).toString();
        String semestre = this.tblAlumnos.getValueAt(fila, 3).toString();
        String carrera = this.tblAlumnos.getValueAt(fila, 4).toString();
        String tipo = this.tblAlumnos.getValueAt(fila, 5).toString();
        String descripcion = this.tblAlumnos.getValueAt(fila, 6).toString();
        

        // Obtener la fecha seleccionada del JDateChooser
        String fechaProtocolario = this.tblAlumnos.getValueAt(fila, 7).toString();

        FActualizarAlumnos objAgregarAlumno = new FActualizarAlumnos(this.dtm);
        objAgregarAlumno.setFilaSeleccionada(fila); // Asignar la fila seleccionada
            System.out.print(fila);

        objAgregarAlumno.EditForm(numControl, nombre, apellido, semestre, carrera, tipo, descripcion, fechaProtocolario);
        objAgregarAlumno.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona una fila");
    }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnAgregarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarNuevoMouseClicked
        
             File excelFile = new File("db/alumnos.xlsx");
        if (isFileOpen(excelFile)) {
            JOptionPane.showMessageDialog(this, "El archivo de Excel está abierto por otro programa. Ciérrelo y vuelva a intentarlo.");
            return;
        }
        FAgregarAlumno objAgregarAlumno = new FAgregarAlumno(this.dtm);
        objAgregarAlumno.setVisible(true);
    }//GEN-LAST:event_btnAgregarNuevoMouseClicked

    
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
            FMenuAlumnos objAlumnos = new FMenuAlumnos();            
            objAlumnos.setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNuevo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtBuscarAlumno;
    // End of variables declaration//GEN-END:variables
}
