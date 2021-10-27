package problemas.primero;

public class Ortoedro extends FiguraTridimensional{
    double base ;
    double altura ;
    double ancho ;

    public Ortoedro(double base, double altura, double ancho) {
        this.base = base;
        this.altura = altura;
        this.ancho = ancho;

    }


    @Override


    public double calcularSuperficie() {
        return ancho*base*altura;
    }

    @Override
    public double calcularVolumen() {
        return  2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);

    }
    public String toString() {

        return "Este producto es un ortoedro";
}
}
