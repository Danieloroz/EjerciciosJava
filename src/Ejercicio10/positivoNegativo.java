package Ejercicio10;

public class positivoNegativo {

    public byte numero;

    public void setNumero(byte next){
        this.numero = next;
    }

    public String resultado(){
        if(numero<0){
            return " El numero ingresado " + numero + " es negativo ";
        }else{
            return " El numero ingresado " + numero + " es positivo ";
        }
    }
}
