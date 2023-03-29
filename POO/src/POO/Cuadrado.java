package POO;

public class Cuadrado extends Figura{
    // Atributos
private float lado;
// método constructor
public Cuadrado(float lado){
    this.lado=lado;
}

 // métodos accesores  

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    //metodo de la subclase
    public void calcularArea() {
        float area=0;
        area=lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" y su area es "+area);
    }
}
