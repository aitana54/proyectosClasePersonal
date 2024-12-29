import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<String> initArray(){
        ArrayList<String> personas = new ArrayList<>();
        personas.add("Jose");
        personas.add("Julie");
        personas.add("Julia");
        personas.add("Aitana");
        personas.add("Alex");
        return personas;
    }

    public static ArrayList<String> eliminarNombre(ArrayList<String> array, int index) {
        array.remove(index);
        return array;
    }

    public static int eleccionNombre(ArrayList<String> personas){
        int idx=0;
        String nombre =personas.get(idx);


        return idx;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayPersonas = new ArrayList<>();
        arrayPersonas = initArray();

        int idx = eleccionNombre(arrayPersonas);
        String nombre = arrayPersonas.get(idx);
        arrayPersonas = eliminarNombre(arrayPersonas, idx);


    }
}