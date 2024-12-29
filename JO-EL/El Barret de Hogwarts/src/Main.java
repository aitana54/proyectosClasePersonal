import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta ="";

        respuesta = sc.nextLine();

        if(respuesta.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (respuesta.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (respuesta.equals("Ambicio")) {
            System.out.println("Slytherin");
        }else {
            System.out.println("Hufflepuff");
        }
    }
}