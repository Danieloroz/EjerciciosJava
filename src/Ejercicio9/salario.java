package Ejercicio9;

public class salario {

    public String nombre;
    public int numeroDeHoras;
    public int pagoDeHoras;

    public void setNombre(String next) {
        this.nombre = next;
    }

    public void setNumeroDeHoras(int next) {
        this.numeroDeHoras = next;
    }

    public void calcularValorHoras(){
        if(numeroDeHoras > 10){
            pagoDeHoras = 33000;
        }else{
            pagoDeHoras = 30000;
        }
    }

    public int salarioTotal(){
        return numeroDeHoras*pagoDeHoras;
    }
}
