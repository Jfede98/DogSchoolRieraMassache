/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogSchool;

/**
 *
 * @author J.Riera
 */
public class Dueno {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String cedula;
    private long tarjeta;
    /**
     * 
     * @param nombre del dueno del perro
     * @param direccion del dueno
     * @param ciudad de donde es el dueno
     * @param cedula del dueno
     */
    
    public Dueno (String nombre, String direccion,String ciudad,String cedula){
        this.nombre=nombre;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.cedula=cedula;
        
    }
    public Dueno (String cedula,String nombre, String direccion,String ciudad, long tarjeta){
        this.nombre=nombre;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.tarjeta=tarjeta;
        this.cedula=cedula;
        
    }
     public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
        
    }
     public String getDirecc(){
        return direccion;
    }
    public void setDirecc(String direccion){
        this.direccion=direccion;
        
    } 
   
    
}
