package Ejercicio3;

public class prestamoLibro {

    public int codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public int codigoUsuario;
    public byte diasDePrestamo;
    public String estadoPrestamo;

    public String consultarEstadoPrestamo(){
        if(estadoPrestamo.equals("vigente")){
            return "Prestamo vigente";
        }else{
            return "Prestamo no vigente";
        }
    }

    public String consultarDatosPrestamo(){
        if(estadoPrestamo.equals("vigente")){
            return " Codigo de prestamo: " + codPrestamo + " fecha del prestamo: " + fechaPrestamo + " Libro: " + nombreLibro + " numero de dias: " + diasDePrestamo;
        }else{
            return "Sin prestamos";
        }
    }
}
