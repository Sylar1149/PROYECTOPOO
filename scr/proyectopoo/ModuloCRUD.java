/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.util.Arrays;//librerias//
import java.util.Scanner;//librerias//
import static proyectopoo.GeneracionNumero.GeneracionNumero;//librerias//


/**
 *
 * @author galic
 */
public class ModuloCRUD {
    public static void Crear(Alumno[]al){//metodo crear alumno//
        int i=549;//variable//
        int a=0;//variable//
        int boleta=0;
       Scanner entrada = new Scanner(System.in);//Teclado//
       entrada = new Scanner(System.in);//Teclado//
       Scanner entrada2 = new Scanner(System.in);//Teclado//
       entrada2 = new Scanner(System.in);//Teclado//
       String direccion;//variable//
        Scanner entrada20 = new Scanner(System.in);//Teclado//
       entrada20 = new Scanner(System.in);//Teclado//
       
       
        while(al[i].getName()!=" ")//ciclo while//
        {
        i--;// contador//
        }
       
      System.out.println("Ingrese su nombre y apellido: "); //mensaje al usuario//
      al[i].setName(entrada.nextLine());//lectura//
          
      System.out.println("Ingrese semestre actual "); //mensaje al usuario//
      a=(entrada.nextInt());//lectura//
      al[i].setSemestre(String.valueOf(a)+" Semestre");//mensaje al usuario//
      
      System.out.println("Ingrese materias cursadas "); //mensaje al usuario//
      al[i].setMaterias(entrada.nextInt());//lectura//
            
      System.out.println("Ingrese edad"); //mensaje al usuario//
      al[i].setEdad(entrada.nextInt());   //lectura// 
      
        System.out.println("Ingrese su promedio"); //mensaje al usuario//
      al[i].setPromedio(entrada.nextFloat());   //lectura// 
       
       al[i].setIndicadorporcentual(GeneracionNumero(al[i].getMaterias(),a, al[i].getPromedio()));//asignación de los nuevos valores//
        al[i].setIndicador(GeneracionNumero(al[i].getMaterias(),a,  al[i].getPromedio()));//asignación de los nuevos valores//
       
      System.out.println("Ingrese la direccion");//mensaje al usuario//
      direccion=entrada2.nextLine();//lectura de datos//
      al[i].setDireccion(direccion);//asignación de valores//
      
       System.out.println("Ingrese la boleta");//mensaje al usuario//
      boleta=entrada20.nextInt();//lectura de datos//
      al[i].setBoleta(boleta);//asignación de valores//
       
       Arrays.sort(al);//ordenamiento del arreglo//
           for(int j=0;j<550;j++)
        {      
            al[j].setIndicador(550-j);//asignación del indicador//
        }
         
}
    
    
    public static int Buscar(Alumno[]al){//metodo para la busqueda del alumno//
      int i=0;//variable//
      Scanner entrada = new Scanner(System.in);//lectura del teclado//
      entrada = new Scanner(System.in);
      String nombre;
      int a = 0;
      String b=null;
          
      System.out.print("Ingrese su nombre y apellido: "); 
      nombre=(entrada.nextLine());
         
      for(i=0;i<al.length;i++)
      {
          b=al[i].getName();
        if(b.equals(nombre))
         return i;
  
      }
    return -1;
    
    }
    
    
    
    public static void read(Alumno[]al){
    
    int z=Buscar(al);
    
      if(z!=-1)
     {
     System.out.println(al[z].getName());
     System.out.println(al[z].getEdad());
     System.out.println(al[z].getSemestre());
     System.out.println(al[z].getMaterias());
     System.out.println(al[z].getIndicador());
     System.out.println(al[z].getDireccion());
      System.out.println(al[z].getBoleta()); 
     System.out.println("\n"); 
     } 
    
    else
    System.out.println("No existe");
    
    
    }
    
     public static void readall(Alumno[]al){
    
  int z=0;
  for(z=0;z<550;z++)
  {
     System.out.println(al[z].getName());
     System.out.println(al[z].getEdad());
     System.out.println(al[z].getSemestre());
     System.out.println(al[z].getMaterias());
     System.out.println(al[z].getIndicador());
     System.out.println(al[z].getDireccion()); 
     System.out.println("\n");  
  }
    }
    
    
    
    public static void actualizar(Alumno []al){
       int opcion,z,edad2,semes,mat;
       float semes2;
       String alumno,direc2;
       Scanner entrada10 = new Scanner(System.in);
       entrada10 = new Scanner(System.in);
       Scanner entrada = new Scanner(System.in);
       entrada = new Scanner(System.in);
       Scanner entrada2 = new Scanner(System.in);
       entrada2 = new Scanner(System.in);
       Scanner entrada3 = new Scanner(System.in);
       entrada3 = new Scanner(System.in);
       Scanner entrada4 = new Scanner(System.in);
       entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);
       entrada5 = new Scanner(System.in);
        Scanner entrada6 = new Scanner(System.in);
       entrada6 = new Scanner(System.in);
        Scanner entrada7 = new Scanner(System.in);
       entrada7 = new Scanner(System.in); 
  
       
       z=Buscar(al);
       if(z!=-1)
       {
       System.out.println("Opcion 1.Nombre: \n"); 
       System.out.println("Opcion 2.Edad: \n"); 
       System.out.println("Opcion 3.Semestre: \n");
       System.out.println("Opcion 4.Materias: \n");
       System.out.println("Opcion 5.Direccion: \n");
       System.out.println("Opcion 6.Boleta: \n");
       System.out.println("Opcion 7.Promedio: \n");
       System.out.println("Ingrese la opcion: "); 
       opcion=(entrada.nextInt());   
       
       switch(opcion)
        {
           case 1: 
               System.out.println("Ingrese el nombre del alumno "); 
               alumno=entrada10.nextLine();
               al[z].setName(alumno);
               break;
           case 2: 
               System.out.println("Ingrese la edad del alumno "); 
               edad2=(entrada2.nextInt());
               al[z].setEdad(edad2);
               break;
               
           case 3: 
               System.out.println("Ingrese el semestre del alumno "); 
               semes=(entrada3.nextInt());
               al[z].setSemestre(semes+" Semestre");
               al[z].setIndicadorporcentual(GeneracionNumero(al[z].getMaterias(),semes,al[z].getPromedio()));
               break;
               
               
           case 4: 
               System.out.println("Ingrese el numero de materias cursadas por el alumnos "); 
               mat=(entrada4.nextInt());
               al[z].setMaterias(mat);
                al[z].setIndicadorporcentual(GeneracionNumero(mat,(int)(mat/5),al[z].getPromedio()));
                break;
           
           case 5: 
               System.out.println("Ingrese la direccion del alumno "); 
              direc2=(entrada5.nextLine());
               al[z].setDireccion(direc2);
               break;
               
             case 6: 
               System.out.println("Ingrese la boleta "); 
              int direc3=(entrada6.nextInt());
               al[z].setBoleta(direc3);
               break;   
               
           case 7:
               System.out.println("Ingrese el promedio del alumno "); 
               semes2=(entrada7.nextFloat());
               al[z].setPromedio(semes2);
               
                String a=al[z].getSemestre();
                String[] parts = a.split(" ");
                String part1 = parts[0]; // 123
                String part2 = parts[1];
                
                int c = Integer.parseInt(part1);
               
               
               al[z].setIndicadorporcentual(GeneracionNumero(al[z].getMaterias(),c,al[z].getPromedio()));
               break;               
               
           default:
               break;
               }

       Arrays.sort(al);
    for(int j=0;j<550;j++)
        {      
            al[j].setIndicador(550-j);
        }
       }
    }
    
    
    public static void eliminar(Alumno []al){
    int z=Buscar(al);
    
    if(z!=-1)
    {
         al[z].setName(" ");
    al[z].setEdad(0);
    al[z].setSemestre(" ");
    al[z].setMaterias(0);
    al[z].setIndicador((float)0.0);
    al[z].setPromedio(0);
    al[z].setIndicadorporcentual((float)0.0);
    al[z].setDireccion(" ");
    al[z].setBoleta(0);
            
        Arrays.sort(al);
    for(int j=0;j<550;j++)
        {      
            al[j].setIndicador(550-j);
        }
    }
      
    else
            {
            System.out.println("No existe");
            }  
    }    
}
