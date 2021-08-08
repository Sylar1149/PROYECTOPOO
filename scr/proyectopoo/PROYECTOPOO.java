/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;


//Librerias importadas de otras clases para ser utilizadas dentro de la clase principal//
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static proyectopoo.Direccion.muestraContenido;
import static proyectopoo.GeneracionNumero.GeneracionNumero;
import static proyectopoo.GeneradorAcademico.GeneradorAcademico;
import static proyectopoo.GeneradorDatos.GenerarEdad;
import static proyectopoo.GeneradorDatos.GenerarSemestre;
import static proyectopoo.GeneradorNombres.Generador;
import static proyectopoo.GeneradorNombres.imprimir;
import static proyectopoo.GeneradordeArchivos.GeneradorArch;
import static proyectopoo.ModuloCRUD.Buscar;
import static proyectopoo.ModuloCRUD.Crear;
import static proyectopoo.ModuloCRUD.actualizar;
import static proyectopoo.ModuloCRUD.eliminar;
import static proyectopoo.ModuloCRUD.read;
import static proyectopoo.ModuloCRUD.readall;

/**
 *
 * @author galic
 */
public class PROYECTOPOO extends Alumno{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // INICIALIZACION//
         String[] Alumnos2 = Generador();//Inicialización de los alumnos//
         Alumno al1[]=new Alumno[550];//creacion del nombre//
         String Direct[]=new String[500];//Inicializacion de la direccion//
         Scanner entrada3 = new Scanner(System.in);//Teclado para el usuario//
         entrada3 = new Scanner(System.in);//Teclado para el usuario//
         Scanner entrada4 = new Scanner(System.in);//Teclado para el usuario//
         entrada4 = new Scanner(System.in);//Teclado para el usuario//
         int opcion;//variable//
         Direct=muestraContenido("D:\\Documentos\\4° Semestre\\POO\\PROYECTOPOO\\build\\classes\\proyectopoo\\DIRECCIONESPROYECTO2.csv");//Lectura de direcciones//
            
        for(int i=0;i<550;i++)//Inicializacion de los datos de los alumnos//
        {
            if(i<500)//Creación de 500 alumnos//
            {
            int a=GenerarEdad();//Generacion de edad//
            int c=GenerarSemestre(a);//Generacion de semestre//
            String b=String.valueOf(c)+" Semestre";//Creacion del semestre como string//
            int materias=GeneradorAcademico(c);//Generacion de materias//
            float promedio = (float) ((Math.random()*4)+6);//Inicializacion del semestre//
            float d=GeneracionNumero(materias,c,promedio); //Generacion del numero de inscripcion//
            int boleta=(int)(Math.random()*(4200000-3140000+1)+3140000);//Generacion de boleta//
            al1[i]=new Alumno(Alumnos2[i],a,b,materias,d,promedio,GeneracionNumero(materias,c,promedio),Direct[i],boleta);//Inicializacion de los valores de los atributos de los objetos//
            } 
            else
            {
            al1[i]=new Alumno(" ",0," ",0, (float) 0.0,0, (float) 0.0," ",0);//Inicialización de los valores de los atributos del alumno//
            }   
        }
        
         Arrays.sort(al1);//función para ordenar//
         
         for(int i=0;i<550;i++)   
         {
            al1[i].setIndicador(550-i);//Ordenamiento de los indicadores//
         }
          
         String eleccion="SI";//variables auxiliar//
         
         
           System.out.println("****BIENVENIDO AL SISTEMA DE CALIFICACIONES DE LA CARRERA DE COMPUTACIÓN DE LA FI******");//menu//
         while("SI".equals(eleccion)){//Decisión para comparar//
         //MENU//
         System.out.println("1.Crear algun alumno:");//opcion al usuario//
         System.out.println("2.Actualizar algun alumno");//opcion al usuario//
         System.out.println("3.Leer datos de algun alumno");//opcion al usuario//
         System.out.println("4.Eliminar algun alumno");//opcion al usuario//
         System.out.println("5.Generar un archivo");//opcion al usuario//
         System.out.println("Elija la opción deseada:");//opcion al usuario//
         opcion = entrada3.nextInt();//opcion al usuario//
         
         switch(opcion)//Switch de acuerdo a los casos//
        {
           case 1: 
              Crear(al1);//opcion al usuario//
              break;
           case 2: 
               actualizar(al1);//opcion al usuario//
               break;
           case 3: 
              read(al1);//opcion al usuario//
              break;
           case 4: 
              eliminar(al1);//opcion al usuario//
              break;
           case 5:
                GeneradorArch(al1);//opcion al usuario//
                break;
           default:
               break;
         }
         System.out.println("Quiere realizar otra acción:");//mensaje al usuario//
         eleccion = entrada4.nextLine();//lectura del usuario//
         }
         
         System.out.println("****GRACIAS POR SU VISITA******");//mensaje al usuario//
    }   
}
