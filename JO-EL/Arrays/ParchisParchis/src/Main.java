import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);
        int numCasos; // Número de casos de prueba
        int[] resultats; // Array para guardar los resultados
        int posicio; // Posición actual en el juego
        int[] tirades; // Array para guardar las tiradas de dados
        //Fin VARIABLES

        //Inicio PROGRAMA
        //Lectura del numero de casos de prueba
        numCasos = sc.nextInt();
        resultats = new int[numCasos];//Inicializo el array de resultados

        //Procesa cada caso de prueba
        for (int i = 0; i < numCasos; i++) {
            //Leer la posicion inicial y tirdas de dados
            posicio = sc.nextInt();
            tirades = new int[3]; //Inicializo array tirdas
            for (int j = 0; j < 3; j++) {
                tirades[j] = sc.nextInt();
            }

            //Procesar las tiradas
            for (int j = 0; j < tirades.length; j++) {
                int tirada = tirades[j];
                posicio += tirada; //Sumar tirada a la posicion
                if (posicio == 8) {
                    posicio = 8; //Has ganado
                    break;
                } else if (posicio > 8) {
                    posicio = 16 - posicio; //Rebote
                }
            }
            resultats[i] = posicio; //Guardar el resultado final
        }
        //Imprimo el resultado
        for (int i = 0; i < resultats.length; i++) {
            int resultat = resultats[i];
            System.out.println(resultat);
        }
        //Fin PROGRAMA
    }
}