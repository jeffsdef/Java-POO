package java_proj;

public class aula3 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}
