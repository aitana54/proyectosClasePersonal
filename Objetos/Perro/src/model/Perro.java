package model;

public class Perro {
    //Inicio variables
    String nombre;
    String raza;
    int edad;
    float peso;
    int nivelEnergia;
    int nivelHambre;
    //Fin variables

    public Perro(String nombre, String raza, int edad, float peso, int nivelEnergia, int nivelHambre) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.nivelEnergia = nivelEnergia;
        this.nivelHambre = nivelHambre;
    }
}
