/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepVinculacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Genaro
 */
public class ArchivoTexto {
    
   
    private File archivo;
    private FileWriter fWriter;                                               
    private FileReader fReader;
    private BufferedWriter escribir;
    private BufferedReader leer;
        
    public ArchivoTexto() {        
        this.fWriter = null;
        this.fReader = null;
        this.escribir = null;
        this.leer = null;        
        this.archivo = null;
    }
    
    protected boolean existeArchivo(String nombreArchivo) {    
        return new File(nombreArchivo).exists();
    }
       
    protected void abrirArchivo(String nombreArchivo, char modo) {
        this.archivo = new File(nombreArchivo);
        try {
            switch (modo) {
                case 'w':
                    fWriter = new FileWriter(this.archivo, true);
                    escribir = new BufferedWriter(fWriter); 
                    break;
                case 'r':
                    fReader = new FileReader(this.archivo);
                    leer = new BufferedReader(fReader);   
                    break;
                default:
                    throw new IllegalArgumentException("Modo de apertura no válido: " + modo);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void escribirRegistro(String registro) {
        try {
            escribir.write(registro);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    protected ArrayList<String> leerLineas() {
        ArrayList<String> listaHuespedes = new ArrayList<>();
        try {            
            String linea = leer.readLine();
            while (linea != null) {
                listaHuespedes.add(linea);
                linea = leer.readLine();
            }            
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarArchivo('r');
        }
        return listaHuespedes;
    }
       
    protected void cerrarArchivo(char modo) {
        try {
            switch (modo) {
                case 'w':
                    if (escribir != null) {
                        escribir.close();
                    }
                    if (fWriter != null) {
                        fWriter.close();
                    }
                    break;
                case 'r':
                    if (leer != null) {
                        leer.close();
                    }
                    if (fReader != null) {
                        fReader.close();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Modo de cierre no válido: " + modo);
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean buscarRegistro(String numIdentidadBuscar) {
        try {            
            String linea = leer.readLine();            
            while (linea != null) {
                String[] arreglo = linea.split(",");
                if (arreglo[0].equals(numIdentidadBuscar)) {
                    return true;
                }
                linea = leer.readLine();
            }                        
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarArchivo('r');
        }
        return false;
    }
    
    
    protected boolean eliminarRegistro(String numIdentidadEliminar, ArchivoTexto archivoTemporal) {               
    try {            
        String linea = leer.readLine();                
        while (linea != null) {                                
            String[] arreglo = linea.split(",");
            if (!(arreglo[0].equals(numIdentidadEliminar))) {
                archivoTemporal.escribirRegistro(linea + "\n");
            }
            linea = leer.readLine();
        }                  
    } catch (IOException ex) {
        Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    } finally {
        cerrarArchivo('r');
    }
    return true;                       
}

    
    protected boolean eliminarArchivo(String nombreArchivo) {
        File archivoFuente = new File(nombreArchivo);
        return archivoFuente.delete();
    }
    
    protected void cambiarNombre(String nombreArchivoActual, String nombreArchivoNuevo) {
        File archivoActual = new File(nombreArchivoActual);
        File archivoNuevo = new File(nombreArchivoNuevo);
        archivoActual.renameTo(archivoNuevo);        
    }
    
    
    public void editarArchivo(String nombreArchivo, ArrayList<String> filas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String fila : filas) {
                bw.write(fila);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
}
