package Ejercicio14;

public class numMayor {

    public int num1;
    public int num2;
    public int num3;

    public void setNum1(int next){
        this.num1 = next;
    }

    public void setNum2(int next){
        this.num2 = next;
    }

    public void setNum3(int next){
        this.num3 = next;
    }

    public String comprobar(){
        if(num1 > num3 && num1 > num2){
            return num1 + " es el mayor de los tres ";
        }else if(num2 > num1 && num2 > num3){
            return num2 + " es el mayor de los tres ";
        }else if(num3 > num2 && num3 > num1){
            return num3 + " es el mayor de los tres ";
        }else{
            return null;
        }
    }
}
