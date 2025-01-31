package model;

public class Perro {
    //Inicio variables
    private String nombre;
    private String raza;
    private int edad;
    private float peso;
    private int nivelEnergia;
    private int nivelHambre;
    //Fin variables

    public Perro(String nombre, String raza, int edad, float peso, int nivelEnergia, int nivelHambre) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.nivelEnergia = nivelEnergia;
        this.nivelHambre = nivelHambre;
    }

    public void dormir() {

    }
}
