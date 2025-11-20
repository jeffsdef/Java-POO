package exercicios.lista13;

public class ValorInvalidoException extends Exception{
    public ValorInvalidoException(){   
    }

    public ValorInvalidoException(String message){
        System.out.println(message);
    }
}
