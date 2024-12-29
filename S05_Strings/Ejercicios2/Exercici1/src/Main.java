import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicio variables
        Scanner sc = new Scanner(System.in);
        String frase = " ";
        int fraseLonguitud = 0;
        //Fin variables

        //Inicio Programa
        System.out.println("Ingresa una frase: ");
        frase = sc.nextLine();
        fraseLonguitud = frase.length();

        System.out.println("La frase "+ "'"+ frase + "'"+ " su longuitud es " + frase.length());
        //Fin programa



    }
}