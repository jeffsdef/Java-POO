package exercicios.lista11;

public class Circulo implements ObjetoGeometrico{
    private double raio;
    private double pi;

    public Circulo(double raio, double pi){
        this.raio = raio;
        this.pi = pi;
    }

    @Override
    public double calcularArea(){
        return this.pi * (this.raio * this.raio);
    }

    public double calcularPerimetro(){
        return 2 * this.pi * this.raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    
}
