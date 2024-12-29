public class Main {

    public static String parImpar(int num) {
        if(num % 2 == 0){
            return "El " + num + " es par";
        }else {
            return "El " + num + " es impar";
        }
    }

    public static void main(String[] args) {
        System.out.println(parImpar(1));
    }
}