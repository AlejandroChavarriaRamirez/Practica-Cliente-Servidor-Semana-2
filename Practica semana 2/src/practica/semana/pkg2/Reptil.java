/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Reptil extends Animal {
    
    
    private boolean esVenenoso;
    private double longitud;

    public Reptil() {
        this.esVenenoso = false;
        this.longitud = 0;
    }

    public Reptil(boolean esVenenoso, double longitud, String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.esVenenoso = esVenenoso;
        this.longitud = longitud;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Reptil" 
                + "\nEs venenoso: " + esVenenoso 
                + "\nLongitud: " + longitud;
    }
    
    
    
    
    
}
