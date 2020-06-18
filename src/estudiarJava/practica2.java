//practica 2: programa que obtenga la suma del dinero que tiene guillermo, luis y juan,
// si guillermo tiene una cantidad N de dinero y juan tiene la mitad de guillermo,
//y luis tiene la mitad de lo btenido por juan.

package estudiarJava;

public class practica2 {
    private float guillermo, luis, juan, total;

    public void setGuillermo(float guillermo){
        this.guillermo = guillermo;
    }


    public float getTotal(){
        luis = guillermo / 2;
        juan = (luis +guillermo) / 2;
        total= guillermo + luis + juan;

        System.out.println("El total es: "+ total);
        return total;
    }
}
