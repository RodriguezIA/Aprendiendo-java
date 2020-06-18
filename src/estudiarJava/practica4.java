//programa para resolver la suma de un binomio al cuadrado

package estudiarJava;


public class practica4 {

    private int primer_termino, segundo_termino;
            double aCuadrada, bCuadrada, dosXaXb;

    public void setPrimer_termino(int primer_termino){
        this.primer_termino = primer_termino;
    }

    public void setSegundo_termino(int segundo_termino){
        this.segundo_termino = segundo_termino;
    }

    public void resultado (){

        aCuadrada= Double.parseDouble(String.valueOf(primer_termino));
        aCuadrada= Math.pow(aCuadrada, 2);

        bCuadrada= Double.parseDouble(String.valueOf(segundo_termino));
        bCuadrada= Math.pow(bCuadrada, 2);

        dosXaXb = 2*(primer_termino * segundo_termino);

        System.out.println(" El resultado de la suma es: " + aCuadrada + "+" + bCuadrada + "+" + dosXaXb);
    }


}
