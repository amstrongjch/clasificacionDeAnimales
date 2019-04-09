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
public class Perro extends Animales implements Acciones{

    public Perro(String animal, int edad, double peso, String sexo) {
        super(animal, edad, peso, sexo);
    }
    
    @override
    public void comer(){
            System.out.println("el perro"+ this.getNombre()+"esta jugando");
    
    }
    @override
    public void dormir(){
        System.out.println("el pero"+ this.getNombre()+ "esta durmiendo");
    }
    @override
    public void caminar(){
        System.out.println("el pero"+ this.getNombre()+"esta caminando");
    }
    @override
    public void jugar(){
        System.out.println("el pero"+ this.getNombre()+"esta jugando");
    }
    @override
    public void reproducirse(){
        System.out.println("el perro"+ this.getNombre()+"ellos se reproducen");;
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
