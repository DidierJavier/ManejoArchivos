/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author DIDIER JAVIER
 */
public class ManejoArchivos {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);//Se crea un objeto de tipo file en memoria
        try {
            PrintWriter salida = new PrintWriter(archivo);//PrintWriter permite crear y escribir archivos
            salida.close();//El archivo que se abrió se tiene que cerrar y en este momento se crea el archivo en memoria
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
