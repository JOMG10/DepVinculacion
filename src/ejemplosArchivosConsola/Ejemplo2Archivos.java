/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosArchivosConsola;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hace uso de las clases File, FileWriter,
 * FileReader, BufferedWriter, y BufferedReader
 * @author Benedicto
 */
public class Ejemplo2Archivos {        
     public static void main(String[] args) {
        // TODO code application logic here
        String nombreArchivo="lista2.txt";        
        File archivo = new File(nombreArchivo);
        FileWriter fWriter=null;                                               
        FileReader fReader=null;
        BufferedWriter escribir=null;
        BufferedReader leer=null;
        
        try {            
            //Abrir el archivo para escritura
            fWriter = new FileWriter(archivo,true);
            escribir = new BufferedWriter(fWriter);          
            //Escribir en el archivo
            escribir.write("1. 20209111, Kevin Arango Lara, Informática\n"
                             + "2. 19920152, Christian Magdiel Gabriel Vicente\n"
                             + "3. 21920103, Esteban Merlín Benítez\n"
                             + "4. 21420117, Hugolino Valentín Martínez\n"
                             + "5. 20920129, Genaro José Martínez\n");
            //Cerrar el archivo
            escribir.close();
            fWriter.close();            
        } catch (IOException ex) {
                Logger.getLogger(Ejemplo2Archivos.class.getName()).log(Level.SEVERE, null, ex);                                            

        }

         try {
             fReader = new FileReader(archivo);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Ejemplo2Archivos.class.getName()).log(Level.SEVERE, null, ex);
         }
        leer = new BufferedReader(fReader);
        try {
            String linea= leer.readLine();
            while (linea!=null){
                System.out.println( linea);
                linea= leer.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo2Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }    
}
