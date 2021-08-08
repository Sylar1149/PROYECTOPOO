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
public class Alumno implements Comparable<Alumno>{
    private String name;
    private int edad;
    private String semestre;
    private int materias;
    private float indicador;
    private float promedio;
    private float indicadorporcentual;
    private String direccion;
    private int boleta;

    public Alumno() {
    }

    public Alumno(String name, int edad, String semestre, int materias,float indicador,float promedio,float indicadorporcentual,String direccion,int boleta) {
        this.name = name;
        this.edad = edad;
        this.semestre = semestre;
        this.materias = materias;
        this.indicador=indicador;
        this.promedio=promedio;
        this.indicadorporcentual=indicadorporcentual;
        this.direccion=direccion;
        this.boleta=boleta;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public float getIndicadorporcentual() {
        return indicadorporcentual;
    }

    public void setIndicadorporcentual(float indicadorporcentual) {
        this.indicadorporcentual = indicadorporcentual;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public float getIndicador() {
        return indicador;
    }

    public void setIndicador(float indicador) {
        this.indicador = indicador;
    }

    
    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }


    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Alumno o) {
       if(indicadorporcentual<o.indicadorporcentual)
       {
       return -1;
       }
       
       if(indicadorporcentual>o.indicadorporcentual)
       {
           return 1;
       }
       
       return 0;
    }
    
    public String[] getArray()
    {
    String[] datos={name,String.valueOf(edad),semestre,String.valueOf(materias),String.valueOf(indicador),String.valueOf(promedio),String.valueOf(indicadorporcentual),direccion,String.valueOf(boleta)};
    return datos;
    
    } 
}
