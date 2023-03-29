package Salud;


public class Empleado extends Persona {
    //atributos
    private String cargo;
    private int valorhora;
    private int horastrabajadas;
    private String departamento;
    

    //metodo constructor
    
    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
        this.cargo = cargo;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }


     //metodos acesores
    
     public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public int getValorhora() {
        return valorhora;
    }


    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }


    public int getHorastrabajadas() {
        return horastrabajadas;
    }


    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //metodo para mostrar los datos 

    public void mostrarPersona(){
        System.out.println("Su nombre es: " +getNombre()+ " \nSu apellido es " +getApellido()+ " \nSu tipo de documento es: "
        +getTipoDoc()+ "\n Su documento es: "+getDocumento()+ " \nSu edad es : "+getEdad()+ " \nSu estatura es "  +getEstatura()+
        " \nSu peso es "+getPeso()+"\n Su sexo es : "+getSexo()+"\n su valor hora es de: "+valorhora+" \nSus horas trabajadas son: "
        +horastrabajadas+"\nSu departamento es: "+departamento);
    }


    //metodo para calcularlos honorarios 
    public void calcularHonorarios(){
        double calcular=0;
        double calcular2=0;
        calcular=(valorhora*horastrabajadas);
        calcular2 = calcular-0.966;
        System.out.println("Sus ganancias son de: " +calcular2);

    }
}
