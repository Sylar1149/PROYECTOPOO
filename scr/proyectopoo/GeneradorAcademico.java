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
public class GeneradorAcademico {
    public static int GeneradorAcademico(int semestre)
    {
    int materias=5;
    
    materias=materias*semestre;
    
    int na= (int)(Math.random()*(3-0+1)+0);
    
    if(materias-na<5)
    return 5;        
        
    else
    return (materias-na);
    }
    
}
