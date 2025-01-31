package model;

public class Perro {
    //Inicio variables
    private String nombre;
    private String raza;
    private int edad;
    private float peso;
    private int nivelEnergia = 100;
    private int nivelHambre = 0;
    //Fin variables

    public Perro() {
        nombre = "Momo";
        raza = "Huski";
        edad = 3;
        peso = 2.1f;
        nivelEnergia = 100;
        nivelHambre = 50;
    }
    public Perro(String nombre, String raza, int edad, float peso, int nivelEnergia, int nivelHambre) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.nivelEnergia = nivelEnergia;
        this.nivelHambre = nivelHambre;
    }

    /**
     * Función para dormir, aumenta nivel energia
     */
    public void dormir(int horas) {
        nivelEnergia += 50;
    }

    /**
     * Función ladrar
     */
    public void ladrar(){
        System.out.println("Guau guau");
        nivelEnergia -= 10;
    }

}
