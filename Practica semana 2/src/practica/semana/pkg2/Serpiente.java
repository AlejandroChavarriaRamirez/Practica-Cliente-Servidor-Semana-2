/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.semana.pkg2;

/**
 *
 * @author aleja
 */
public class Serpiente extends Reptil {
    
    private String tipoVeneno;
    private int escamas;

    public Serpiente() {
        this.tipoVeneno = "";
        this.escamas = 0;
    }

    public Serpiente(String tipoVeneno, int escamas, boolean esVenenoso, double longitud, String nombre, int edad, double peso) {
        super(esVenenoso, longitud, nombre, edad, peso);
        this.tipoVeneno = tipoVeneno;
        this.escamas = escamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public int getEscamas() {
        return escamas;
    }

    public void setEscamas(int escamas) {
        this.escamas = escamas;
    }

    @Override
    public String toString() {
        return "Serpiente" 
                + "\nTipo veneno: " + tipoVeneno 
                + "\nEscamas: " + escamas;
    }

}
