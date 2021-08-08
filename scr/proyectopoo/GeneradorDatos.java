package proyectopoo;

/**
 *
 * @author galic
 */
public class GeneradorDatos{

    public static int GenerarEdad(){
    int old = 0;
        old= (int)(Math.random()*(27-18+1)+18);

        return old;
    }
    
    public static int GenerarSemestre(int edad){
    String semes = null;
    
    int a = (int)(Math.random()*(10-1+1)+1);
    if(edad==18&a==5){
    a-=2;
    }
    
     else if(edad==18&a==6){
    a-=3;
    }
    else if(edad==18&a==7){
    a-=4;
    }
     else if(edad==18&a==8){
    a-=4;
    }
    
    else if(edad==18&a==9){
    a-=6;
    }
     else if(edad==18&a==10){
    a-=6;
    }
    
    else if(edad==19&a==6){
    a-=1;
    }
    
     else if(edad==19&a==7){
    a-=2;
    }
    
     else if(edad==19&a==8){
    a-=3;
    }
    
    else if(edad==19&a==9){
    a-=4;
    }
    
    else if(edad==19&a==10){
    a-=5;
    }
    
    
     else if(edad==20&a==8){
    a-=1;
    }
    
    else if(edad==20&a==9){
    a-=2;
    }
    
    else if(edad==20&a==10){
    a-=3;
    }
    
    else if(edad==21&a==10){
    a-=2;
    }

    return a;
    }
   
}
