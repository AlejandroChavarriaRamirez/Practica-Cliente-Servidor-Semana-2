/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Perro extends Mamifero{
    
    private String raza;
    private boolean entrenado;

    public Perro() {
        this.raza = "";
        this.entrenado = false;
    }

    public Perro(String raza, boolean entrenado, boolean tienePelo, double tempCorporal, String nombre, int edad, double peso) {
        super(tienePelo, tempCorporal, nombre, edad, peso);
        this.raza = raza;
        this.entrenado = entrenado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }

    @Override
    public String toString() {
        return "Perro" 
                + "\nRaza: " + raza 
                + "\nEntrenado: " + entrenado;
    }
    
    
    
}
