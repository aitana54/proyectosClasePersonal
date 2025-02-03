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
        if (horas <= 0) {
            nivelEnergia += 0;
        } else if (horas >= 1) {
            nivelEnergia += 5;
        } else if (horas >= 3) {
            nivelEnergia += 10;
        } else if (horas >= 4) {
            nivelEnergia += 20;
        } else if (horas >= 5) {
            nivelEnergia += 40;
        } else if (horas >= 6) {
            nivelEnergia += 60;
        } else if (horas >= 7) {
            nivelEnergia += 80;
        } else if (horas >= 8) {
            nivelEnergia += 100;
        }
    }

    /**
     * Función ladrar
     */
    public void ladrar(){
        System.out.println("Guau guau");
        nivelEnergia -= 10;
    }

    /**
     * Función pasear
     */
    public void pasear(){
        nivelEnergia -= 70;
    }

    /**
     * Función darle de comer
     */
    public void darComida(String tipo){
        nivelHambre += 10;
        nivelEnergia -= 5;
    }

}
