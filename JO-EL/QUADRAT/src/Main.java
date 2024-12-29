import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;

        numero = sc.nextInt();

        resultado = numero*numero;

        System.out.println(resultado);
    }
}