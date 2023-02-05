package Ejercicio6;

public class areaRectangulo {

    public int base;
    public int altura;

    public String validarDatos(){
        return " La base es de: " + base + " y la altura: " + altura + " en centimetros ";
    }

    public int calcularArea(){
        return base*altura;
    }
}
