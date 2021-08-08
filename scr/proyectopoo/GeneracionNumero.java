/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author galic
 */
public class GeneracionNumero {
    public static float GeneracionNumero(int asig,int semestre,float promedio){
    
        float escolaridad;
        float velocidad;
        float indicador;
        
        
        escolaridad=(float) (((float)asig)/((float)(semestre*5))*100.00);
        
        velocidad=(float) (((float)(asig*4.78)/((float)(semestre*5)*4.78))*100);
        
        
        indicador=escolaridad*velocidad*promedio;

        
        return indicador;
         
    
    }
}
    
    