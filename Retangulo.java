public class Retangulo {

    private double b;
    private double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double calcularArea() {
        return this.b * this.h;
    }

    public double calcularPerimetro() {
        return 2 * (this.b + this.h);
    }
}