import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicio VARIABLES
        Scanner sc = new Scanner(System.in);

        final long SEGUNDOS_POR_DIA = 86400; //Constante para el total de segundo que tiene un día
        final long SEGUNDOS_POR_MADRUGADA_O_NOCHE = 43200; //Constante para los segundos que tiene la mitad del dia
        String periodo = ""; //Para saber que periodo del dia se encuentra

        //Fin VARIABLES

        //Inicio PROGRAMA
        int segundos = sc.nextInt();
        long dia = (segundos / SEGUNDOS_POR_DIA) + 1; //sabremos el dia en que estamos situados

        long segundosRestantesDia = segundos % SEGUNDOS_POR_DIA; //Segundos restantes dentro del dia actual

        //Condicion para saber si es de madrugada o de noche
        if (segundosRestantesDia < SEGUNDOS_POR_MADRUGADA_O_NOCHE) {
            periodo = "mati";
        }else {
            periodo = "nit";
        }

        System.out.println(periodo + " del dia " + dia);



        //Fin PROGRAMA

    }
}