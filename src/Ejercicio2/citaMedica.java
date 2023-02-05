package Ejercicio2;

public class citaMedica {

    public int codCita;
    public String fecha;
    public int hora;
    public String consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    public String centroMedico;

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    public String crearCita(){
        return " Paciente " + nombrePaciente + " con el código: " + codCita + " será atendido por el médico " + nombreMedico + " en el consultorio " + consultorio + " el día " + fecha + " a las " + hora;
    }

    public String consultarDatosCita(){
        return " Nombre " + nombrePaciente + " Código " + codCita + " Médico: " + nombreMedico + " en el consultorio: " + consultorio + ", el día " + fecha + " a las " + hora + " en el centro médico " + centroMedico;
    }

    public int cambiarCita(){
        return hora = 6;
    }
}
