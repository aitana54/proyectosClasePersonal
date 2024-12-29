import java.util.Scanner;

public class Main {
    //Función para calcular y mostrar el área o volumen
    public static void calcularCilindro(char opcion, double radio, double altura){
        //Inicio VARIABLES
        double area = 0.0d;
        double volumen = 0.0d;
        //Fin VARIABLES

        if(opcion == 'a' || opcion == 'A'){
            area = 2 * Math.PI * radio * (radio + altura);
            System.out.printf("Area: %.2f\n", area);

        } else if (opcion == 'v' || opcion == 'V') {
            volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.printf("Volumen: %.2f\n", volumen);

        }else{
            System.out.println("Opción invalida, elige entre 'a' para el área o 'v' para el volumen");
        }
    }

    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        double radio = 0.0d;
        double altura = 0.0d;
        //Fin VARIABLES


        System.out.print("Introduce el radio que tiene tu cilindro ->  ");
        radio = sc.nextDouble();

        System.out.print("Introduce el altura de la cilindro ->  ");
        altura = sc.nextDouble();

        calcularCilindro('a', radio, altura);
        calcularCilindro('v', radio, altura);

    }
}