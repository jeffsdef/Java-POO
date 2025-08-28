public class Circulo {
    public double r;

    public Circulo(double r){
        this.r = r;
    }

    public double Area(){
        return 3 * (this.r * this.r);
    }

    public double Perimetro(){
        return 2 * 3.14 * this.r;
    }
}
