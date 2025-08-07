package java_proj;

public class caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("esta tampada? " + this.tampada);

    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! NAO POSSO RABISCAR");
        }else{
            System.out.println("RABISCANDO...");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
