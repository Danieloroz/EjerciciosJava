package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        citaMedica citaMedica = new citaMedica();

        citaMedica.nombrePaciente = "Cristian ";
        citaMedica.codCita = 051;
        citaMedica.nombreMedico = "Sebastián";
        citaMedica.consultorio = "107B";
        citaMedica.hora = 4;
        citaMedica.fecha = "14/02/23";
        citaMedica.setCentroMedico("SaludTotal");

        System.out.println("Usted ha creado exitosamente su cita " + citaMedica.crearCita());

        System.out.println("Los datos correspondientes a la cita son: " + citaMedica.consultarDatosCita());

        citaMedica.cambiarCita();

        System.out.println("La hora de su cita ha sido cambiada: " + citaMedica.consultarDatosCita());
    }
}
