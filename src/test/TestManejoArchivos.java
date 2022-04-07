/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author DIDIER JAVIER
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        
        var nombreArchivo = "Prueba.txt";
        //crearArchivo(nombreArchivo);//Como el archivo ya se creó, no hay necesidad de volver a crearlo para escribir el archivo
        
        escribirArchivo(nombreArchivo, "Hola desde JAVA");
    }
}
