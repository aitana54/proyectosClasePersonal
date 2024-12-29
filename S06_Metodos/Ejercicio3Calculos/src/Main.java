import java.util.Scanner;

public class Main {
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double producto(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0.0) {
            System.out.println("Error: No se puede dividir por cero");
            return Double.NaN; //Retorna NaN si quiere dividir entre cero
        }
        return num1 / num2;
    }

    public static double exponencial(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double primerNumero = 0.0d;
        double segundoNumero = 0.0d;
        boolean salir = false;
        //Fin VARIABLES

        System.out.println("--Menu--");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Producto");
        System.out.println("4. Division");
        System.out.println("5. Exponencial");
        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();

        System.out.print("Elige el primer numero: ");
        primerNumero = sc.nextDouble();
        System.out.print("Elige el segundo numero: ");
        segundoNumero = sc.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma: " + suma(primerNumero, segundoNumero));
            break;
            case 2:
                System.out.println("El resultado de la resta: " + resta(primerNumero, segundoNumero));
            break;
            case 3:
                System.out.println("El resultado de la multiplicación: " + producto(primerNumero, segundoNumero));
            break;
            case 4:
                System.out.println("El resultado de la division: " + division(primerNumero, segundoNumero));
            break;
            case 5:
                System.out.println("El resultado de la exponencial: " + exponencial(primerNumero, segundoNumero));
            break;
        }
    }
}