import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        int casos; //Para el nombre de casos de prueba
        int[] cartas = new int[7]; //Las 7 cartas de cada caso de prueba

        boolean diez, jack, reina, rei, as; //Para comprobar si tenemos la escala real


        //Variables para comprobar si tenemos escala normal
        int escalasConsecutivas;
        boolean escala, asBajo, dos, tres, cuatro, cinco;
        //Fin VARIABLES



        //Inicio PROGRAMA
        casos = sc.nextInt(); //Leemos el numero de casos de prueba

        for (int i = 0; i < casos; i++) {
            // Lee las cartas
            for (int j = 0; j < 7; j++) {
                cartas[j] = sc.nextInt();
            }

            // Ordena las cartas (Burbuja)
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6 - j; k++) {
                    if (cartas[k] > cartas[k + 1]) {
                        // Intercambia cartas[k] y cartas[k + 1]
                        int temp = cartas[k];
                        cartas[k] = cartas[k + 1];
                        cartas[k + 1] = temp;
                    }
                }
            }

            // Inicialización de los valores para la escala real
            diez = false; jack = false; reina = false; rei = false; as = false;

            // Comprobación de la escala real -> 10, 11, 12, 13 y 1
            for (int j = 0; j < 7; j++) {
                if (cartas[j] == 10) diez = true;
                if (cartas[j] == 11) jack = true;
                if (cartas[j] == 12) reina = true;
                if (cartas[j] == 13) rei = true;
                if (cartas[j] == 1) as = true;
            }

            // Si es una escala real, imprimimos el resultado y continuamos con el siguiente caso
            if (diez && jack && reina && rei && as) {
                System.out.println("ESCALA REIAL");
                continue; // Asegura que no se evalúe más este caso
            }

            // Inicialización de variables para comprobar la escala normal
            escala = false;

            // Recorremos las cartas para comprobar si son consecutivas
            escalasConsecutivas = 1; // Inicia el conteo en 1

            for (int j = 1; j < 7; j++) {
                if (cartas[j] == cartas[j - 1]) {
                    continue; // Ignoramos duplicados
                }
                if (cartas[j] == cartas[j - 1] + 1) {
                    escalasConsecutivas++;
                } else {
                    escalasConsecutivas = 1; // Reinicia el contador si no son consecutivas
                }

                // Si se encuentran 5 consecutivas, se ha encontrado una escala
                if (escalasConsecutivas >= 5) {
                    escala = true;
                    break; // Salimos del bucle si encontramos una escala
                }
            }

            // Comprobación de la escala especial -> As(1), 2, 3, 4, 5
            if (!escala) {
                asBajo = false; dos = false; tres = false; cuatro = false; cinco = false;
                for (int j = 0; j < 7; j++) {
                    if (cartas[j] == 1) asBajo = true;
                    if (cartas[j] == 2) dos = true;
                    if (cartas[j] == 3) tres = true;
                    if (cartas[j] == 4) cuatro = true;
                    if (cartas[j] == 5) cinco = true;
                }
                if (asBajo && dos && tres && cuatro && cinco) {
                    escala = true;
                }
            }

            // Resultado por pantalla
            if (escala) {
                System.out.println("ESCALA");
            } else {
                System.out.println("NO");
            }
        }

        //Fin PROGRAMA
    }
}