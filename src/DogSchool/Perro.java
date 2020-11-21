/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogSchool;

import java.util.Random;

/**
 *
 * @author J.Riera
 */
public class Perro {
    private String nombre;
    private String raza;
    private int idPerro;
    private Dueno dueno;
    /**
     * 
     * @param nombre del perro
     * @param raza del perro
     * @param idPerro identificacion del perro
     */
    
    public Perro (String nombre,String raza,Dueno d){
        this.dueno=d;
        this.idPerro=obtieneCodigo();
        
        this.nombre=nombre;
        this.raza=raza;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public Dueno getDueno(){
        return dueno;
    }
    public void setDueno(Dueno d){
        this.dueno=d;
    }
    public int getIdPerro(){
        return idPerro;
    }
    public void setIdPerro(int idPerro){
        int obtieneCodigo=idPerro;
        
    }
        
    
    /**
     * Metodo llamado desde el constructor para generar codigos a las mascotas ingresadas
     * @return Codigo entero aleatorio para las mascotas creadas
     * 
     */
    private int obtieneCodigo(){
        Random r = new Random();
        return r.nextInt(1500);
    }
    
  
}
