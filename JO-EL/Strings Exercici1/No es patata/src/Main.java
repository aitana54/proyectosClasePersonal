import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in); //Para que el usuario pueda escribir
        String correctaFoto= "patata";
        String fotoPatata = " ";
        int numCasos = 0;
        String[] patatasEnviadas;
        //Fin VARIABLES


        //Inicio PROGRAMA
        numCasos = sc.nextInt();//Pregunto el numero de casos que se quiere enviar
        sc.nextLine();
        patatasEnviadas = new String[numCasos];
        //Recorro el for para que introduzca las "fotos" y el texto lo pongo minusculas
        for (int i = 0; i < numCasos; i++) {
            fotoPatata = sc.nextLine().toLowerCase();
            patatasEnviadas[i] = fotoPatata;
        }
        //Comprobar si cada caso es una Patata o no
        for (int i = 0; i < numCasos; i++) {
            if (patatasEnviadas[i].equals(correctaFoto)) {
                System.out.println("Es Patata");
            }else {
                System.out.println("No es Patata");
            }
        }
        //Fin PROGRAMA
    }
}