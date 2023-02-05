package Ejercicio5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        pagoEmpleado pagoEmpleado = new pagoEmpleado();

        pagoEmpleado.codEmpleado = 6762;
        pagoEmpleado.setSalarioBasico(60000);
        pagoEmpleado.horasExtra = 4;
        pagoEmpleado.setNumeroHoras(98);
        pagoEmpleado.setDescuentoPrestamo(200000);

        System.out.println(" El valor de las horas extra es: " + pagoEmpleado.calcularValorHE());
        System.out.println(" El valor del devengado es: " + pagoEmpleado.calcularDevengado());
        System.out.println(" El valor del deducido es: " + pagoEmpleado.calcularDeducido());
        System.out.println(" El valor neto de su pago es: " + pagoEmpleado.calcularNeto());
    }
}
