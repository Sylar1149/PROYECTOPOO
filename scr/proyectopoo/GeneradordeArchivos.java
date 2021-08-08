/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author galic
 */
public class GeneradordeArchivos {
    public static void GeneradorArch(Alumno []al) throws IOException{
     ArrayList<Alumno> al2=new ArrayList();
     
     for(int i=0;i<550;i++)
     {
     al2.add(al[i]);
     }
     
     CsvWriter csvWriter=new CsvWriter("FICHERO.CSV");
     
     for(Alumno al3: al2){
     String[]al4=al3.getArray();
     csvWriter.writeRecord(al4);
     
     }
     
     csvWriter.close();
  
        }
    }
    
    
    

