/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Mamifero extends Animal {
    
    private boolean tienePelo;
    private double tempCorporal;

    public Mamifero() {
        this.tienePelo = false;
        this.tempCorporal = 0;
    }

    public Mamifero(boolean tienePelo, double tempCorporal, String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        this.tienePelo = tienePelo;
        this.tempCorporal = tempCorporal;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    public double getTempCorporal() {
        return tempCorporal;
    }

    public void setTempCorporal(double tempCorporal) {
        this.tempCorporal = tempCorporal;
    }

    @Override
    public String toString() {
        return "Mamifero" 
                + "\nTiene pelo: " + tienePelo 
                + "\nTemperatura corporal: " + tempCorporal;
    }
    
    
    
    
    
}
