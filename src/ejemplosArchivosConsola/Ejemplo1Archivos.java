/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemplosArchivosConsola;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hace uso de clases File, FileWriter y 
 * FileReader.
 * @author Benedicto
 */
public class Ejemplo1Archivos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreArchivo="lista.txt";        
        File archivo = new File(nombreArchivo);
        FileWriter escribir;                                               
        FileReader leer;
        try {            
            //Abrir el archivo para escritura
            escribir = new FileWriter(archivo);
            //Escribir en el archivo
            escribir.write("1. 20209111, Kevin Arango Lara, Informática\n"
                             + "2. 19920152, Christian Magdiel Gabriel Vicente\n"
                             + "3. 21920103, Esteban Merlín Benítez\n"
                             + "4. 21420117, Hugolino Valentín Martínez\n"
                             + "5. 20920129, Genaro José Martínez\n");
            //Cerrar el archivo
            escribir.close();
        } catch (IOException ex) {
                Logger.getLogger(Ejemplo1Archivos.class.getName()).log(Level.SEVERE, null, ex);                                            

        }
        
        try {
            leer = new FileReader(archivo);
            try {
                int dato= leer.read();
                while (dato!=-1){
                    System.out.print((char) dato);
                    dato= leer.read();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejemplo1Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo1Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
}        
        
