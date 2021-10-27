package problemas.primero;

public class TetraedroRegular extends FiguraTridimensional{
    double arista;

    public  TetraedroRegular(int Caras){
        Caras=4;
    }
    public TetraedroRegular(double base, double altura, double ancho) {
        this.arista=arista;

    }

    @Override

    public double calcularSuperficie() {
        return  Math.sqrt(2);

    }

    @Override
    public double calcularVolumen() {
        return Math.pow(arista,3);

    }
    public String toString() {

        return "Este producto es un TetraedroRegular";
    }
}

