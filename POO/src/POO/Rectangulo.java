package POO;

public class Rectangulo extends Figura{
    // Atributos
private float base;
private float altura;
// método constructor
public Rectangulo(Float base, float altura){
this.base=base;
this.altura=altura;
}

 // métodos accesores  
 public float getBase() {
    return base;
}

public void setBase(float base) {
    this.base = base;
}

public float getAltura() {
    return altura;
}

public void setAltura(float altura) {
    this.altura = altura;
}  
    
    //metodo de la subclase
    public void calcularArea() {
        float area=0;
        area=base*altura;
        System.out.println("La base del rectangulo es "+base+" su altura es "+altura+" y el área es "+area);
    }

}
