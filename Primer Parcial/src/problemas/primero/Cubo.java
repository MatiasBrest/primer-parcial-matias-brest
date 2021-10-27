package problemas.primero;

public class Cubo extends FiguraTridimensional{
double lado;



public  Cubo(double lado){

    lado=1;

}



 public  Cubo(int Caras){
    Caras=1;
}




    @Override

    public double calcularSuperficie() {
        return Math.pow(lado,3);
    }

    @Override
    public double calcularVolumen() {
        return 6*Math.pow(lado,2);
    }
    public String toString() {

        return "Este producto es un Cubo";
    }
}