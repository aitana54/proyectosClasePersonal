import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //INICIO VARIABLES
        Scanner sc = new Scanner(System.in);
        int casos = 0;
        int edad = 0;
        //FIN VARIABLES


        //INICIO PROGRAMA
        edad = sc.nextInt();
        if (edad < 32 ) {
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
        //FIN PROGRAMA
    }
}