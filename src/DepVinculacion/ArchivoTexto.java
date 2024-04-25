/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepVinculacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Genaro
 */
public class ArchivoTexto {
           
    public ArchivoTexto() {     
    }    
  
    
    
    public boolean guardarRegistro(String numeroControl,String nombre, String apellidos,String semestre,String carrera,String tipo,String descripcion,String fechaProtocolario){

      
        FMenuAlumnos objFMenuAlumnos = new FMenuAlumnos();

        if (!numeroControl.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El número de control debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
              
            if (numeroControl.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() 
                    || semestre.isEmpty() || carrera.isEmpty() || tipo.isEmpty() 
                    || descripcion.isEmpty()) {
                 JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{                  
                
                if(objFMenuAlumnos.buscarPorNumeroControl(numeroControl)){
                   JOptionPane.showMessageDialog(null, "el alumno ya existe");  
                   return false;
                }else{
                    
                    try (InputStream archivo = new FileInputStream("db/alumnos.xlsx");
                    XSSFWorkbook libro = new XSSFWorkbook(archivo)) {

                        
                    int numControl = 0;

                    numControl = Integer.parseInt(numeroControl);
                    XSSFSheet hoja = libro.getSheetAt(0);
                    int ultimaFila = hoja.getLastRowNum() + 1; // Obtener la última fila y sumar 1 para agregar la nueva fila              

                    // Crear la nueva fila y agregar los datos
                    Row nuevaFila = hoja.createRow(ultimaFila); 
                    nuevaFila.createCell(0).setCellValue(numControl);
                    nuevaFila.createCell(1).setCellValue(nombre);
                    nuevaFila.createCell(2).setCellValue(apellidos);
                    nuevaFila.createCell(3).setCellValue(semestre);
                    nuevaFila.createCell(4).setCellValue(carrera);
                    nuevaFila.createCell(5).setCellValue(tipo);
                    nuevaFila.createCell(6).setCellValue(descripcion);
                    nuevaFila.createCell(7).setCellValue(fechaProtocolario);          
                                            
                    JOptionPane.showMessageDialog(null, "Se ha agregado el alumno correctamente");
                   
          // Guardar los cambios en el archivo Excel
                try (FileOutputStream fileOut = new FileOutputStream("db/alumnos.xlsx")) {
                    libro.write(fileOut);
                }

                } catch (IOException e) {
                    e.printStackTrace();
                }  
                    return true;                    


            }

        }
    }     
        return false;
  }   
    
    
    
        
   public int eliminarAlumno(int filaSeleccionada) {
    
    if (filaSeleccionada != -1) {
        
         int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminarlo?");
        // Ajustar el índice de la fila seleccionada para omitir la fila de los títulos
        
          if (respuesta == 0) {
         int indiceFilaExcel = filaSeleccionada + 1;

        // Eliminar fila del archivo Excel
        try (InputStream file = new FileInputStream("db/alumnos.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            int ultimaFila = sheet.getLastRowNum();

            if (indiceFilaExcel < ultimaFila) {
                // Eliminar la fila del archivo Excel
                sheet.removeRow(sheet.getRow(indiceFilaExcel));

                // Desplazar las filas hacia arriba para que no quede vacía
                sheet.shiftRows(indiceFilaExcel + 1, ultimaFila, -1);
            } else {
                // Si es la última fila, simplemente elimina la fila sin desplazar
                sheet.removeRow(sheet.getRow(indiceFilaExcel));
            }
            

            try (FileOutputStream outFile = new FileOutputStream(new File("db/alumnos.xlsx"))) {
                workbook.write(outFile);
            }

            JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente");
              // Eliminar fila de la tabla
                return 1;


        } catch (IOException e) {
            e.printStackTrace();
           
        }

      
          }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }
        return 0;
   }
   

}
