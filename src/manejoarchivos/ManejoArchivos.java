/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoarchivos;

import java.io.*;
/**
 *
 * @author DIDIER JAVIER
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);//Se crea un objeto de tipo file en memoria
        try {
            PrintWriter salida = new PrintWriter(archivo);//PrintWriter permite crear y escribir archivos
            salida.close();//El archivo que se abrió se tiene que cerrar y en este momento se crea el archivo en memoria
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);//Se crea un objeto de tipo file en memoria
        try {
            PrintWriter salida = new PrintWriter(archivo);//PrintWriter permite crear y escribir archivos
            salida.println(contenido); //Se envía el contenido al archivo
            salida.close();//El archivo que se abrió se tiene que cerrar y en este momento se crea el archivo en memoria
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarInformacionArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);//Se crea un objeto de tipo file en memoria
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//PrintWriter permite crear y escribir archivos
            salida.println(contenido); //Se envía el contenido al archivo
            salida.close();//El archivo que se abrió se tiene que cerrar y en este momento se crea el archivo en memoria
            System.out.println("Se ha anexado información al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);//Se crea un objeto de tipo file en memoria
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));//Se lee la información del archivo
            var lectura = entrada.readLine();
            while(lectura != null){             //Ciclo while para leer la información hasta que haya una línea en blanco
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();//Se cierra el flujo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        
    }
}
