/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author galic
 */
public class Direccion {
     public static String[] muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        String[] direc=new String[500];
        int i=0;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
           direc[i]=cadena;
           i++;
        }
        
         b.close();
        
        return(direc);    
}}
