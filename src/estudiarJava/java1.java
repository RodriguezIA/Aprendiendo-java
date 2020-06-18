package estudiarJava;
//Importacion de Scanner
import java.util.Scanner;

public class java1 {
    public static void main (String[] args){
        //instanciamiento de Scanner
        Scanner entrada = new Scanner(System.in);
        practica1 cal = new practica1();
        practica2 dineroN = new practica2();
        practica3 pro = new practica3();
        practica4 suma = new practica4();

        /*entrada y salida
        int numero;


        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        System.out.println("el numero es: " + numero);

        float numero_aleatorio;
        System.out.println("Digite un numero: ");
        numero_aleatorio = entrada.nextFloat();
        entrada.nextLine(); //despues de un next int agregar un nextline para limpiar el sacnner        System.out.println("el numero es: " + numero_aleatorio);

        String nombre;
        System.out.print("Ingrese su nombre:");
        nombre = entrada.nextLine();

        char letras;
        System.out.println("Inserte una palabra: ");
        letras = entrada.next().charAt(0);
        System.out.println(letras);



        //variables y print
        int edad = 20;
        Integer nulo = null;
        String nombre1 = "mi nombre es: " + nombre;
        System.out.println("Hola mundo, yo tengo " + edad + " años y "+nombre);

        // radio de un constantes
        final double pi = 3.1416;
        double radio = 12.8;
        double resultado = 0;
        resultado = pi * (radio * radio);
        System.out.println("el radio del circulo es: "+ resultado);
         */

        /* operadores
        float numero1,numero2, suma, resta, multi, div, resto;


        System.out.println("Digite un 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        */

        /* suma= numero1 + numero2;
        resta= numero1 - numero2;
        multi= numero1 * numero2;
        div= numero1 / numero2;
        resto= numero1 % numero2;

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multi);
        System.out.println("El resultado de la divison es: "+div);
        System.out.println("El resultado del resto es: "+ resto);

         */

        /* operador de aumento y de disminucion
        int x = 5;
        x++;

        System.out.println(x);

         */
        
        // metodos clase math

        /*double raiz = Math.sqrt(12);
        System.out.println(raiz);

        int r = (int)Math.sqrt(9); //saca la raiz cuadrada del parametro
        System.out.println(r);

        double base1 = 6, exponente1 = 4, resultado1;

        resultado1 = Math.pow(base1, exponente1);
        System.out.println(resultado1);

        int base = 6, exponente = 4, resultado;

        resultado = (int)Math.pow(base, exponente); //eleva un numero al exponente solicitado (base. exponente)
        System.out.println(resultado);

        double numero= 8.17;
        long n = Math.round(numero);//redondea un parametro double;
        System.out.println(n);

        float num= 8.17f;
        int n2 = Math.round(num); //redondea un parametro float;
        System.out.println(n2);

        double random = Math.random(); //numero aleatorio;
        System.out.println(random);
         */

        /*
        //programa para promedio

        System.out.println("ingrese la calificacion 1: ");
        float cal1 = entrada.nextFloat();

        System.out.println("ingrese la calificacion 2: ");
        float cal2 = entrada.nextFloat();

        System.out.println("ingrese la calificacion 3: ");
        float cal3 = entrada.nextFloat();

         cal.setCalificacion1(cal1);
         cal.setCalificacion2(cal2);
         cal.setCalificacion3(cal3);
         cal.getResultado();

        */

        /*
        //programa practica 2
        System.out.println("Ingrese el dinero de guillermo: ");
        float dinero = entrada.nextFloat();
        dineroN.setGuillermo(dinero);
        dineroN.getTotal();
        */

        /*
        //programa para calcular la nota final de un alumno
        System.out.println("ingrese las calificaciones del 1 al 10 con decimales");
        System.out.println("ingrese la  calificacion de participacion: ");
        float participacion = entrada.nextFloat();
        System.out.println("ingrese la  calificacion de examen 1: ");
        float examen1 = entrada.nextFloat();
        System.out.println("ingrese la  calificacion de examen 2: ");
        float examen2 = entrada.nextFloat();
        System.out.println("ingrese la  calificacion de examen 3: ");
        float examen3 = entrada.nextFloat();

        pro.setExamen1(examen1);
        pro.setExamen2(examen2);
        pro.setExamen3(examen3);
        pro.getTotal();
        */

        //suma de la forma (a+b)^2
        System.out.println("Ingrese el primer termino: ");
        int uno= entrada.nextInt();
        System.out.println("Ingrese el segundo termino: ");
        int dos = entrada.nextInt();
        suma.setPrimer_termino(uno);
        suma.setSegundo_termino(dos);
        suma.resultado();



    }
}
