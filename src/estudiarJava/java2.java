package estudiarJava;

//se importa para poder usar el JoptionPane
import javax.swing.*;

public class java2 {
    public static void main (String[] args){
        //variables
        String cadena;
        int numero;
        char letra;
        double decimal;

        //ventana con JOptionPane
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite una cifra: "));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null, "lacadena es: "+ cadena);
        JOptionPane.showMessageDialog(null, "El numero es: "+ numero);
        JOptionPane.showMessageDialog(null, "La letra es: "+ letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+ decimal);
    }
}
