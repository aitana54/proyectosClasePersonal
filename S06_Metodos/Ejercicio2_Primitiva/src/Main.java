import java.util.Random;
import java.util.Scanner;

public class Main {

    static int[] usuario = new int[6];
    static int[] primitiva = new int[6];

    //Leer los numeros que introduce el usuario
    public static void leerNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 6 numeros entre 0 y 49");

        for (int i = 0; i < 6; i++) {//Pregunto los numeros y los añado al array
            System.out.print("Números " + (i + 1) + ": ");
            usuario[i] = sc.nextInt();
        }
    }

    //METODO para generar los numeros de la primitiva
    public static void generarNumero() {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            primitiva[i] = random.nextInt(50);
        }
    }

    //METODO para contar los aciertos que hace el usuario
    public static int contarAciertos() {
        int aciertos = 0;
        for (int i = 0; i < usuario.length; i++) {
            if (usuario[i] == primitiva[i]) {
                aciertos++;
            }
        }
        return aciertos;
    }

    //METODO para mostrar los numeros
    public static  void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leerNumeros();
        generarNumero();
        int aciertos = contarAciertos();

        System.out.print("Tus números: ");
        mostrarNumeros(usuario);
        System.out.print("Números de la primitiva: ");
        mostrarNumeros(primitiva);
        System.out.println("Aciertos: " + aciertos);
    }
}