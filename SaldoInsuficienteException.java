package exercicios.lista13;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message){
        System.out.println(message);
    }
}
