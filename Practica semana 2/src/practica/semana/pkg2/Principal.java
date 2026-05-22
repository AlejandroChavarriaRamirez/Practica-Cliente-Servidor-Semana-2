/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.semana.pkg2;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Perro perro = new Perro("Pastor Aleman", true,  true, 38.5, "Titan", 4, 30.5);
        Gato gato = new Gato(false, 9, true, 38.0, "Zoe", 3,  4.2);
        Aguila aguila = new Aguila(160.0, "Aguila imperial", 120.0, true, "Zeus", 6, 5.8);
        Serpiente serpiente = new Serpiente("Cascabel", 320, true, 2.5, "Draco", 5, 1.2);

        JOptionPane.showMessageDialog(null, perro.toString());
        JOptionPane.showMessageDialog(null, gato.toString());
        JOptionPane.showMessageDialog(null, aguila.toString());
        JOptionPane.showMessageDialog(null, serpiente.toString());
    }
}
