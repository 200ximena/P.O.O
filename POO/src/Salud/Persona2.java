package Salud;

import java.util.Scanner;

public class Persona2 {
    String tipoDoc;
    int documento;
    String nombre;
    String apellido;
    //double peso;
    //double estatura;
    int edad;
    String sexo;
    double pesoActual;

    

    public void pedirDatos(){
        Scanner captura= new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=captura.next();
        System.out.println("Ingrese numero de documento");
        documento=captura.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=captura.next();
        System.out.println("Ingrese su apellido");
        apellido=captura.next();
        //System.out.println("Ingrese su peso en kilogramos");
        //peso=captura.nextDouble();
        //System.out.println("Ingrese su estatura");
        //estatura=captura.nextDouble();
        System.out.println("Ingrese su edad");
        edad=captura.nextInt();
        System.out.println("Ingrese su sexo");
        sexo=captura.next();
        captura.close();
    }
    public void mostrarPersona(){
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su numero de documento es "+documento);
        System.out.println("su nombre es "+nombre);
        System.out.println("su apellido es "+apellido);
        //System.out.println("su peso es "+peso);
        //System.out.println("su estatura es "+estatura);
        System.out.println("su edades "+edad);
        System.out.println("su sexo es "+sexo);


    }
    //correccion en clase 
    public double calcularmc(double peso, double estatura ){
        double imc=0;
         pesoActual =peso/(estatura*estatura);
        if(pesoActual<20){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("El peso esta por debajo de lo ideal");
        }else if(pesoActual>20 && pesoActual<25){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("El peso es ideal");
        }else if(pesoActual>25){
            System.out.println("Su IMC  es "+pesoActual);
            System.out.println("Esta en sobrepeso");
        }
        return imc;
    }
    public void mayorEdad(){
        if(edad>18){
            System.out.println("Usted es mayor de edad");
        }else if(edad <18){
        System.out.println("Usted es menor de edad");
        }else {
            System.out.println("Usted digito un numero incorrecto");
        }
    }
}
