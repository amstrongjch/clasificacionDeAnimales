/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.clase2.Acciones;

/**
 *
 * @author Ordenador
 */
public class Ave extends Animales implements Acciones{

    public Ave(String animal, int edad, double peso, String sexo) {
        super(animal, edad, peso, sexo);
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
