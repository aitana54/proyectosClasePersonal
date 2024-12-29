import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        String cadena = " ";


        //Fin VARIABLES

        //Inicio Programa
        System.out.print("Ingrese una cadena de texto: ");
        cadena = sc.next();
        int lengthCadena = cadena.length();
        if (lengthCadena < 2) {
            System.out.println(cadena);
        }
        String cadenaInicio = cadena.substring(0, 2);


        System.out.println(cadenaInicio + );
        //Fin Programa

    }
}