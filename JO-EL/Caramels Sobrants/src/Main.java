import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombreCaramels = 0;
        int nombreNens = 0;
        int caramelsSobrants = 0;

        nombreCaramels = sc.nextInt();
        nombreNens = sc.nextInt();

        caramelsSobrants = nombreCaramels % nombreNens;
        System.out.println(caramelsSobrants);

    }
}