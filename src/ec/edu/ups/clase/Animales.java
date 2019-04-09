/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Ordenador
 */
public class Animales {

    private String animal;
    private int edad;
    private double peso;
    private String sexo;

    public Animales(String animal, int edad, double peso, String sexo) {
        this.animal = animal;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }
    public void setAnimal(String animal){
         this.animal=animal;
    }
    public String getAnimal(){
        return animal;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    
    public void setSexo(String sexo){
         this.sexo=sexo;
    }
    public String getSexo(){
        return sexo;
    }
           
    
    
}
