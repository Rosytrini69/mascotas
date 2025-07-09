
/*
 
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mascotas;


import java.util.Scanner;

/**
 *
 * @author Rosa Maria Trinidad
 */
public class Mascotas {

    public static void main(String[] args) {
        
        
        //decirle al usuario cuantos animales va a registrar
        Scanner scan = new Scanner(System.in);
        
        
       
  
    System.out.println("Escribe la cantidad de perros que quieres agregar");
   
   int cantPerro = scan.nextInt();
   
   
   //creamos arreglo
   
   Perro[] perros = new Perro[cantPerro];
   
   for( int i =0 ; i < cantPerro ; i++ ){
       
   
   perros[cantPerro]= new Perro();    
   
   System.out.println("Escribe el nombre del perro");
   String name = scan.next();
    perros[i].nombre=name;
    
   }
       
        
   
    for (Perro perro: perros){
        
        perro.comer();
        perro.ladrar();
        System.out.println("el nombre del perro es " + perro.nombre);
        System.out.println("");
       
       
            
  
            
    }        
    
        // creamoa arreglo
        
        Gato[] gato = new Gato [2];
        
        gato[0]= new Gato();
        gato[0].nombre ="misha";
        
    
    
    
    
    
    
    
    
    }
}
