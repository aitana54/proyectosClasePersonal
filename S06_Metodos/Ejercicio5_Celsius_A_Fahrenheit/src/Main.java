import java.util.Scanner;

public class Main {

    public static double CelsiusAFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;

    }

    public static double FahrenheitACelsius(double fahrenheit) {
        return (5.0 /9) * (fahrenheit - 32);

    }

    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;
        double tempcelsius = 0.0d;
        double tempfahrenheit = 0.0d;
        //Fin VARIABLES
        while (!salir) {
            System.out.println("--Menu--");
            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elige una opción -> ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de Celsius: ");
                    tempcelsius = sc.nextDouble();
                    System.out.println(tempcelsius + "°C equivale a " + CelsiusAFahrenheit(tempcelsius) + "°F");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Ingrese el valor de Fahrenheit: ");
                    tempfahrenheit = sc.nextDouble();
                    System.out.println(tempfahrenheit + "°F equivale a " + CelsiusAFahrenheit(tempfahrenheit) + "°C");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Hasta la próxima");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}