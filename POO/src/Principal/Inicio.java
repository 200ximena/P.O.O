package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;
import Salud.Persona2;

public class Inicio {
    public static void main(String[] args) {
        //RETO 1
        /*Persona nueva=new Persona();
        //invocan los metodos
        nueva.pedirDatos();
        nueva.mostrarPersona();
        nueva.mayorEdad();
        nueva.calcularImc();*/
    
        //RETO 2
        /*Persona2 nueva2=new Persona2();
        double peso, estatura;
        Scanner captura= new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos");
        peso=captura.nextDouble();
        System.out.println("Ingrese su estatura");
        estatura=captura.nextDouble();
        nueva2.pedirDatos();
        nueva2.mostrarPersona();
        nueva2.mayorEdad();
        nueva2.calcularmc( peso, estatura);
        captura.close();*/

        
        //RETO 3

        Scanner captura= new Scanner(System.in);

        String cargo;
        int valorhora;
        int horastrabajadas; 
        String departamento;
       
        System.out.println("Escriba su cargo ");
        cargo=captura.next();
        System.out.println("Escriba el valor de la hora ");
        valorhora=captura.nextInt();
        System.out.println("Escriba sus horas trabajadas ");
        horastrabajadas=captura.nextInt();
        System.out.println("Escriba su departamento ");
        departamento=captura.next();
        

        Persona ximena =new Persona();
        ximena.pedirDatos();
        Empleado empleado= new Empleado(ximena.getTipoDoc(),ximena.getDocumento(),ximena.getNombre(),ximena.getApellido()
        ,ximena.getPeso(),ximena.getEstatura(),ximena.getEdad(),ximena.getSexo(),ximena.getPesoActual());
        empleado.setCargo(cargo);
        empleado.setValorhora(valorhora);
        empleado.setHorastrabajadas(horastrabajadas);
        empleado.setDepartamento(departamento);
        
        empleado.mostrarPersona();
        empleado.calcularHonorarios();
        captura.close();
    }


}