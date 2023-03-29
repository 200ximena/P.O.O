package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float lado,base,altura;
        float radio=0;
        float pi=(float) 3.1416;
        int i;
        int n,op;

        Scanner captura=new Scanner(System.in);
        System.out.println("Bienvenido al menu de opciones para calcular el area de ciertas figuras");
        System.out.println("Cuantas veces desea repetir el programa?");
        n=captura.nextInt();

        for(i=0; i<n; i++){
            System.out.println("Elija una figura para calcular su area \n 1. Cuadrado || 2. Rectangulo || 3. Circulo  ");
            op=captura.nextInt();

            switch(op){
            case 1: 
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=captura.nextFloat();

        //crear el objeto de la subclase cuadrado
        Cuadrado c1=new Cuadrado(lado);
        c1.calcularArea();
            break;

            case 2:
        System.out.println("Ingrese el valor de la base del reactángulo");
        base=captura.nextFloat();
        System.out.println("Ingrese el valor de la altura del reactángulo");
        altura=captura.nextFloat();
        //crear el objeto de la subclase rectángulo
        Rectangulo r1=new Rectangulo(base, altura);
        r1.calcularArea();

            break;

            case 3:
        System.out.println("Ingrese el valor del radio  del circulo");
        radio=captura.nextFloat();
        //crear el objeto de la subclase circulo
        Circulo d1=new Circulo(radio);
        d1.calcularArea();
            
        default: System.out.println("");break;
        }

            }System.out.println("Ya no puedes repetir mas el programa");

    captura.close();

    }
}

