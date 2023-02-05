package Ejercicio15;

public class alcaldia {
    public String genero;
    public int edad;

    public void setGenero(String next){
        this.genero = next;
    }
    public void setEdad(int next){
        this.edad = next;
    }

    public String todo(){
        if(genero.equals(" mujer ") && edad > 50){
            return " Recibira 120000 ";
        }else if(genero.equals(" mujer ") && edad > 30 && edad < 50){
            return " Recibira 100000 ";
        }else if(genero.equals(" hombre ")){
            return " Recibira 40000 ";
        }else{
            return null;
        }
    }
}
