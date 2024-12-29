import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inici variables
        Scanner sc = new Scanner(System.in);
        int any = 0;
        //Fin variables

        //Inici PROGRAMA
        any = sc.nextInt();

        if (any >= 1945 && any <= 1965) {
            System.out.print("ok boomer");
        } else {
            System.out.print("nah");
        }

        //Fin PROGRAMA
    }
}