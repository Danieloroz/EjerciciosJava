package Ejercicio22;

public class sandwichOrder {
    public String tamaño;
    public String proteina;
    public String queso;
    public String jalapeño;
    public int precio;

    public void setTamaño(String next){
        this.tamaño = next;
    }
    public void setProteina(String next){
        this.proteina = next;
    }
    public void setQueso(String next){
        this.queso= next;
    }
    public void setJalapeños(String next){
        this.jalapeño = next;
    }

    public void armado(){
        if (tamaño.equals("pequeño")) {
            precio += 6000;
        } else {
            precio += 12000;
        }
        if (proteina.equals("pavo")){
            precio += 3000;
        } else if (proteina.equals("tocineta")) {
            precio += 3000;
        }
        if(queso.equals("si")){
            precio += 2500;
        }
    }

    public String mensaje(){
        return "El precio final de su sanduche es de: " + precio;
    }

}
