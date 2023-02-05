package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        areaRectangulo areaRectangulo = new areaRectangulo();

        areaRectangulo.base = 4;
        areaRectangulo.altura = 6;

        System.out.println(" El area del rectangulo es de: " + areaRectangulo.calcularArea() + " centimetros ");
    }
}
