/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Gato extends Mamifero {
    
    private boolean callejero;
    private int vidas;

    public Gato() {
        this.callejero = false;
        this.vidas = 0;
    }

    public Gato(boolean callejero, int vidas, boolean tienePelo, double tempCorporal, String nombre, int edad, double peso) {
        super(tienePelo, tempCorporal, nombre, edad, peso);
        this.callejero = callejero;
        this.vidas = vidas;
    }

    public boolean isCallejero() {
        return callejero;
    }

    public void setCallejero(boolean callejero) {
        this.callejero = callejero;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Gato" 
                + "\nCallejero: " + callejero 
                + "\nVidas: " + vidas;
    }
    
}
