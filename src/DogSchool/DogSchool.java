/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author J.Riera
 */
public class DogSchool {
    private List<Perro> perros = new ArrayList<>();
    private List<Dueno> duenos = new ArrayList<>();
/**
 * La funcion anadirPerro anade un perro a la lista Perro
 * @param pet 
 */
public void anadirPerro(Perro perro){
  perros.add(perro);
  
}
/**
 * TODO: Anadir un nuevo dueno a la lista de duenos
 * @param owner 
 */
public void anadirDueno(Dueno dueno){
  duenos.add(dueno);
  
  
}
public Dueno consultarDueno(String cedula){
    for(Dueno dueno :duenos){
        if (dueno.getCedula().equals(cedula)){
            return dueno;
        }
    }
    return null;
}
public List<Perro> consultarPerro (Dueno dueno){
    return perros.stream().filter(e->e.getDueno().equals(dueno)).collect(Collectors.toList());
    
}
public Perro consultarPerro (int codigo){
    return perros.stream().filter(e->e.getIdPerro()==codigo).findAny().orElse(null);
    
}
public List<Perro>consultarPerro (String raza){
    return perros.stream().filter(e->e.getDueno().equals(raza)).collect(Collectors.toList());
       
}


}
