package Ejercicio17;

public class triangulo {

    public int num1;
    public int num2;
    public int num3;
    public int suma;

    public void setNum1(int next){
        this.num1 = next;
    }
    public void setNum2(int next){
        this.num2 = next;
    }
    public void setNum3(int next){
        this.num3 = next;
    }

    public void sumar(){
        suma = num1+num2+num3;
    }

    public String resultado(){
        if (suma == 180){
            return "Con esos 3 angulos si se puede formar un triangulo de: " + suma + " grados";
        }else{
            return "Con esos 3 angulos no se puede formar un triangulo de " + suma + " grados";
        }
    }
}
