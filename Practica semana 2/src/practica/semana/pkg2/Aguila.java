/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Aguila extends Ave {
    
    private double velocidad;
    private String especie;

    public Aguila() {
        this.velocidad = 0;
        this.especie = "";
    }

    public Aguila(double velocidad, String especie, double envergadura, boolean puedeVolar, String nombre, int edad, double peso) {
        super(envergadura, puedeVolar, nombre, edad, peso);
        this.velocidad = velocidad;
        this.especie = especie;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Aguila" 
                + "\n Velocidad: " + velocidad 
                + "\n Especie: " + especie;
    }
    
    
    
    
    
    
}
