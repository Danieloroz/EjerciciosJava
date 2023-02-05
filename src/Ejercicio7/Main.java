package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        envio envio = new envio();

        envio.numeroGuia = 110249845;
        envio.setFecha("04/02/23");
        envio.setTipoEmbalaje("caja");
        envio.cedulaCliente = "1105460753";
        envio.setPeso(4);
        envio.setCiudadOrigen("Armenia");
        envio.setCiudadDestino("Ibague");
        envio.setEstadoEnvio("Enviado");

        System.out.println(" El costo por kilo total es: " + envio.calcularCostoXkilo() + " debido al peso del paquete ");

        System.out.println(envio.verificarEntrega());
    }
}
