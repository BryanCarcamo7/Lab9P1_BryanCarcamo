/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab9P1_BryanCarcamo {
    public static void main(String[] args) {
         Scanner lea=new Scanner(System.in).useDelimiter("\n");
   
        
         int opcion=0;
        while(opcion!=4){
        System.out.println("---------MENU--------");
        System.out.println("1.Pase a la ventanilla ");
        System.out.println("2.Salir ");
        System.out.println("Opcion: ");
       opcion=lea.nextInt();
       
       switch(opcion){
           case 1:
               System.out.println("Ingrese el numero de clientes a generar: ");
               int clientes=lea.nextInt();
               
               System.out.println("Ingrese el numero de escritorios disponibles: ");
               int escritorios=lea.nextInt();
               
               break;
              
           case 2:
               System.out.println("Feliz dia");
               break;
           
       }
        }
        
        
    }
}
