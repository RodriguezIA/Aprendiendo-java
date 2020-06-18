package estudiarJava;

public class practica5 {

    private int dato, horas, dias, semanas;

    public void setDato(int dato){
        this.dato = dato;
    }

    public void tiempo (){
        semanas = dato / 168;
        dias = (dato%168)/24;
        horas = (dato%168)%24;

        System.out.println(semanas + "semanas, " + dias +"dias, " + horas + "horas");
    }

}
