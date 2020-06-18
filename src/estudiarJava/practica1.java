//practica 1, programa que obtenga tres programas obtenga el promedio.

package estudiarJava;

public class practica1 {

    private float calificacion1;
    private float calificacion2;
    private float calificacion3;
    private float resultado;

    public void setCalificacion1 (float calificacion1){
        this.calificacion1 = calificacion1;
    }

    public void setCalificacion2 (float calificacion2){
        this.calificacion2 = calificacion2;
    }

    public void setCalificacion3 (float calificacion3){
        this.calificacion3 = calificacion3;
    }


    public float getCalificacion1(){
        return calificacion1;
    }

    public float getCalificacion2(){
        return calificacion2;
    }

    public float getCalificacion3(){
        return calificacion3;
    }

    public void getResultado(){
        resultado= (calificacion1 + calificacion2 + calificacion3)/3;
        System.out.println("el promedio es: "+resultado);
    }

}
