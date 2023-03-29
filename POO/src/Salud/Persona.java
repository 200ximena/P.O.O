package Salud;

import java.util.Scanner;

public class Persona {
    //atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;


    //metodo constructor vacio

    public Persona(){
        
    }

    //metodo constructpr
    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
    }
    //metodos acesores
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

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
        System.out.println("Ingrese su peso en kilogramos");
        peso=captura.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=captura.nextDouble();
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
        System.out.println("su peso es "+peso);
        System.out.println("su estatura es "+estatura);
        System.out.println("su edades "+edad);
        System.out.println("su sexo es "+sexo);
    }
    public void calcularImc(){
        pesoActual=peso/(estatura*estatura);
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
    }
    public void mayorEdad(){
        if(edad>18){
            System.out.println("Usted es mayor de edad");
        }else 
        System.out.println("Usted es menor de edad");

    }

}
