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
public class GeneradorNombres {
    public static String[] Generador() {
       
    int i;
    String[] nombresrandom=new String[500];
    
    String[] nombres= {"Juan","Luis","Rocio","Alberto","Abigail","Abril","Adrian","Adriana","Adan","Aime",
            "Alan","Alejandro","Alejandra","Alexis","Alfonso","Alfredo","Alma","America","Ana",
    "Andrea","Andres","Angel","Angelica","Antonio","Arturo","Benjamin","Brandon","Brenda","Bruno"
    ,"Bryan","Camila","Carlos","Cesar","Cesar","Dafne","Daniel","Daniela","David","Diana"
    ,"Diego","Dulce","Edgar","Edith","Elizabeth","Emmanuel","Enrique","Erika","Esmeralda","Fatima"};
    
     String[] apellido= {"Galicia","Puga","Ramirez","Esparza","Valdez","Coello","Magaña","Vaca","Lara","Clavellina"
     ,"Sanchez","Baltazar","Nava","Aguilar","Mendoza","Gonzalez","Aguirre","Blanco","Arias","Quiroz",
     "Ortiz","Garcia","Avedaño","Mendez","Valdovinos","Bautista","Jimenez","Anduaga","Caballero","Figueroa"
     ,"Canales","Villaroel","Aquino","Rivera","Jaramillo","Hernandez","Bolaños","Castillo","Barajas","Landero",
     "Barrueta","Velasquez","Cruz","Serret","Luna","Ortega","Reyes","Marquez","Manriquez","Cosio"
     ,"Guerrero","Almanza","Quintero","Jaimes","Mendiola"};
   
     for(i=0;i<500;i++)
     {
    nombresrandom[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "+
            apellido[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))]+" " 
       + apellido[(int) (Math.floor(Math.random() * ((apellido.length - 1) - 0 + 1) + 0))];
     }
        return nombresrandom;
    }
    
    public static void imprimir(String[] nombresGenerados) {
		for (int i = 0; i < nombresGenerados.length; i++) {
			System.out.println(nombresGenerados[i]);
		}
	}
  
}