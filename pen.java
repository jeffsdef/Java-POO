package java_proj;

public class pen {
    public String modelo;
    private float ponta;
    public boolean tampada;
    private String cor;

    public pen() { //método construtor
        this.tampar();
        this.cor = "azul";
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("COR: " + this.cor);
        System.out.println("ESTA TAMPADA? " + this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
