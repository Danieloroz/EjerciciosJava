package Ejercicio11;

public class lavadoras {

    public int tipoDeLavadora;
    public int cantidad;
    public int horas;
    public int precio;

    public void setTipo(int next){
        this.tipoDeLavadora = next;
    }

    public void setCantidad(int next){
        this.cantidad = next;
    }

    public void setHoras(int next){
        this.horas = next;
    }

    public void valor(){
        if(tipoDeLavadora == 1){
            precio = 4000;
        }else{
            precio = 3000;
        }
    }

    public int valorTotal(){
        if(cantidad >= 3){
            return (int) ((precio*horas)-(((precio*horas)*0.03)));
        }else{
            return precio*horas;
        }
    }
}
