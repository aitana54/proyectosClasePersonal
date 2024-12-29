import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Main {




    public static void saludoUsuario(String nombre){
        System.out.println("Buenos dias " + nombre);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String user = sc.nextLine();
        String pass = sc.nextLine();
        if (user == "aitana" && pass == "2") {
            System.out.println("Has iniciado correctamente");
            saludoUsuario("gf");

        }else {
            System.out.println("Has iniciado incorrectamente");
        }
    }
}