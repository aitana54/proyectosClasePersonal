import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        dia = sc.nextInt();


        if (dia <= 31) {/* Enero va del 1 al 31*/
            System.out.println("1");
        } else if (dia <= 59) {/* Febrero va del 32 al 59*/
            System.out.println("2");
        } else if (dia <= 90) {/* Marzo va del 60 al 90*/
            System.out.println("3");
        } else if (dia <= 120) {/* Abril va del 91 al 120*/
            System.out.println("4");
        } else if (dia <= 151) {/* Mayo va del 121 al 151*/
            System.out.println("5");
        } else if (dia <= 181) {/* Junio va del 152 al 181*/
            System.out.println("6");
        } else if (dia <= 212) {/* Julio va del 182 al 212*/
            System.out.println("7");
        } else if (dia <= 243) {/* Agosto va del 213 al 243*/
            System.out.println("8");
        } else if (dia <= 273) {/* Septiembre va del 244 al 273*/
            System.out.println("9");
        } else if (dia <= 304) {/* Octubre va del 274 al 304*/
            System.out.println("10");
        } else if (dia <= 334) {/* Noviembre va del 305 al 334*/
            System.out.println("11");
        } else if (dia <= 365) {/* Diciembre va del 335 al 365*/
            System.out.println("12");
        }
    }
}