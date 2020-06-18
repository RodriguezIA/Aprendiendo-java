/*
Practica 3: la calficacion final de un alumno es definida por cuatro parametros.

participacion = 10%,
examen primer parcial = 25%
examen sengundo parcial = 25%
examen tercer parcial = 40%

necesito la calificacion final
*/

package estudiarJava;

public class practica3 {
    float participacion, examen1, examen2, examen3, total;

    public void setParticipacion(float participacion){
        this.participacion = participacion;
    }

    public void setExamen1(float examen1){
        this.examen1 = examen1;
    }

    public void setExamen2(float examen2){
        this.examen2 = examen2;
    }

    public void setExamen3(float examen3){
        this.examen3 = examen3;
    }

    public float getTotal(){
        participacion *= 0.10f;
        examen1 *= 0.25f;
        examen2 *= 0.25f;
        examen3 *= 0.40f;
        total = participacion + examen1 + examen2 + examen3;
        System.out.println("la calicacion del ealumno es: "+ total);
        return total;
    }


}
