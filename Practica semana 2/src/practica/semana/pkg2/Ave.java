/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Ave extends Animal{
    
    private double envergadura;
    private boolean puedeVolar;

    public Ave() {
        this.envergadura = 0;
        this.puedeVolar = false;
    }

    public Ave(double envergadura, boolean puedeVolar, String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.envergadura = envergadura;
        this.puedeVolar = puedeVolar;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Ave" 
                + "\nEnvergadura: " + envergadura 
                + "\nPuede volar: " + puedeVolar;
    }
    
}
