package POO;

public class Circulo extends Figura{
    // Atributos
    private float radio;
    // método constructor
    public Circulo(float radio){
        this.radio=radio;
    }
     // métodos accesores  

     public float getradio() {
        return radio;
    }

    public void setradio(float radio) {
        this.radio = radio;
    }
    //metodo propio
    public void calcularArea() {
        double area=0;
        double pi=3.1416;
        area = (radio*radio)*pi;
        System.out.println("El radio del circulo es "+radio+" y su area es "+area);
    }
    
}

