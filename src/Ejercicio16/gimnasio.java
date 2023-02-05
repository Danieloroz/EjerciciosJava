package Ejercicio16;

public class gimnasio {
    public int tiempo;

    public void setTiempo(int next){
        this.tiempo = next;
    }

    public String mensaje(){
        switch(tiempo){
            case 15:
                return " El costo es de 18000 ";
            case 30:
                return " EL costo es de 35000 ";
            case 3:
                return " El costo es de 86000 ";
            default:
                return " ERROR";
        }
    }
}
