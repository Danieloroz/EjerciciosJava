package Ejercicio12;

public class parImpar {

    public int numero;

    public void setNumero(int next){
        this.numero = next;
    }

    public String calculo(){
        if((numero%2) == 0){
            return numero + " es par ";
        }else{
            return numero + " es impar ";
        }
    }
}
