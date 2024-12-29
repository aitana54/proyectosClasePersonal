import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);

        int casos; // Número de casos de prueba
        int N; // Número total de números
        int mitad; // Mitad de N
        int[] nombres; // Array para almacenar los números

        // Leer el número de casos
        casos = sc.nextInt();

        // Iterar sobre cada caso de prueba
        for (int i = 0; i < casos; i++) {
            // Leer el número de números N
            N = sc.nextInt();
            // Inicializar el array para almacenar los números
            nombres = new int[N];

            // Leer los N números y almacenarlos en el array
            for (int j = 0; j < N; j++) {
                nombres[j] = sc.nextInt();
            }

            // Ordenar el array utilizando Insertion Sort
            for (int j = 1; j < N; j++) {
                int clave = nombres[j]; // Elemento clave a insertar
                int k = j - 1;

                // Mover los elementos que son mayores que "clave" una posición a la derecha
                while (k >= 0 && nombres[k] > clave) {
                    nombres[k + 1] = nombres[k];
                    k--;
                }
                nombres[k + 1] = clave; // Insertar la clave en su posición correcta
            }

            // Calcular la mitad de N
            mitad = N / 2;

            // Array para almacenar los resultados de las sumas
            int[] resultados = new int[mitad];

            // Calcular las sumas de los pares opuestos
            for (int j = 0; j < mitad; j++) {
                resultados[j] = nombres[j] + nombres[N - 1 - j];
            }

            // Imprimir el resultado en una sola línea
            for (int j = 0; j < resultados.length; j++) {
                System.out.print(resultados[j]);
                if (j < resultados.length - 1) {
                    System.out.print(" "); // Agregar un espacio entre números, excepto el último
                }
            }
            System.out.println(); // Nueva línea después de cada caso
        }
        //Fin PROGRAMA
    }
}