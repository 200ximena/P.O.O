package Juego;


import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego{

   //atributos
   private int opcion;
   private String jugador;
   private int jugada;


   //instancia para capturar
   Scanner captura= new Scanner (System.in);
   
    //solicitar datos
 
    public void iniciar() {
        
        System.out.println("Ingrese el nombre del jugador");
        jugador=captura.next();
    }

    public void jugar() {
       System.out.println(jugador+ "Ingrese la opcion que desee para jugar. \n 1.Piedra  \n 2.Papel  \n 3. Tijera");
       opcion=captura.nextInt();
       Random aleatorio= new Random();
       jugada=aleatorio.nextInt(3)+1;
       System.out.println("Eligiendo la opcion");
    }


    public void finalizar() {
        if (opcion ==1 && jugada ==1){
            System.out.println("usted " +jugador+ " ha quedado en empate con la maquina");  
        }else if (opcion ==2 && jugada ==2){
            System.out.println("usted " +jugador+ " ha quedado en empate con la maquina");  
        }else if (opcion ==3 && jugada ==3){
            System.out.println("usted " +jugador+" ha quedado en empate con la maquina");  
        }else if (opcion ==1 && jugada ==2){
            System.out.println("usted " +jugador+" ha ganado!!");  
        }else if (opcion ==1 && jugada ==3){
            System.out.println("usted " +jugador+ " ha ganado!!");  
        }else if (opcion ==2 && jugada ==1){ 
            System.out.println("usted " +jugador+ " ha ganado!!");  
        }else if (opcion ==2 && jugada ==3){
            System.out.println("usted " +jugador+" ha ganado!!");   
        }else if (opcion ==3 && jugada ==1){
            System.out.println("usted " +jugador+ " ha ganado!!");  
        }else if (opcion ==3 && jugada ==2){
            System.out.println("usted " +jugador+ " ha ganado!!");  
        }
    }
    
}
