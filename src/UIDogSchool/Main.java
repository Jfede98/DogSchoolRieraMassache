/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIDogSchool;

import DogSchool.DogSchool;
import DogSchool.Dueno;
import DogSchool.Perro;
import java.util.Scanner;


/**
 *
 * @author J.Riera
 */
public class Main {
     DogSchool aplicacion = new DogSchool();
     static Scanner sc = new Scanner(System.in);
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Llamada menu
        Main main = new Main();
        main.menu();
    }
    public void menu(){
        String opcion="";
        while(!opcion.equals("6")){
              System.out.println("╔                Menu                       ╗");
              System.out.println("║ 1. Registro de Duenos                     ║");
              System.out.println("║ 2. Registro de Perros                     ║");
              System.out.println("║ 3. Consulta de Perros   por Dueno         ║");
              System.out.println("║ 4. Consulta de Perros   por Raza          ║");
              System.out.println("║ 5. Consulta/RemoverMascotas por Codigo    ║");              
              System.out.println("║ 6. Salir de DogSchool                     ║");        
              System.out.println("╚                                           ╝");
              System.out.print("Ingrese opcion: ");      
              opcion = sc.nextLine();
            switch (opcion){
                case "1":
                    registroDuenos();
                    break;
                case "2":
                    registroMascotas();
                    break;
                case "3": 
                    consultaMascotasPorDueno();
                    break;
                case "4":    
                    consultaMascotasPorRaza();
                    break;
                case "5":
                    consultaMascotasPorCodigo();
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            }
        }
        sc.close();
    }
    
    public void registroDuenos(){
        System.out.print("Ingresar cedula: ");
        String cedula=sc.nextLine();
        System.out.print("Ingresar nombre: ");
        String nombre=sc.nextLine();
        System.out.print("Ingresar ciudad: ");
        String ciudad=sc.nextLine();
        System.out.print("Ingresar direccion: ");
        String direccion=sc.nextLine();      
        System.out.print("Desea registrar Tarjeta de Credito ahora S/N: ");
        String opcion=sc.nextLine();
        Dueno d1;
        if (opcion.equals("S")){
             System.out.print("Ingresar tarjeta credito: ");
             long tarjeta=sc.nextLong();
             /**
              * Dueno que usa tarjeta
              */
            d1 = new Dueno(nombre,cedula,ciudad,direccion,tarjeta);
        }
        else{
            /*
               Dueno que no usa tarjeta             
            */
            d1= new Dueno(nombre,cedula,ciudad,direccion);
       
        }
        aplicacion.anadirDueno(d1);
        System.out.println("Se registro exitosamente!");
    }
    public void registroMascotas(){      
        System.out.print("Ingresar cedula dueno: ");
        String cedula= sc.nextLine();
        /**
         * Se busca la cedula del dueno, ademas se pregunta por el nombre y raza del perro
         */
        Dueno d1 =aplicacion.consultarDueno(cedula);
        if (d1==null){
            System.out.println("No existe cedula asociada");
        }
        else{
            System.out.println("Ingresar nombre");
            String nombre =sc.nextLine();
            System.out.println("Ingresare raza");
            String raza=sc.nextLine();
            
            Perro p1 =new Perro(raza,nombre,d1);
            aplicacion.anadirPerro(p1);
        }  
    }
    public void consultaMascotasPorDueno(){
       System.out.print("Ingresar cedula dueno: ");
       String cedula= sc.nextLine();
       Dueno d1 =aplicacion.consultarDueno(cedula);
        if (d1==null){
        for (Perro p:aplicacion.consultarPerro(d1)){
            System.out.println("");
            
        }    
       }
    }
    
     public void consultaMascotasPorRaza(){
       System.out.print("Ingresar raza: ");
       String raza= sc.nextLine();
       Dueno d2=aplicacion.consultarDueno(raza);
       if (d2!=null){
           
           for (Perro p2:aplicacion.consultarPerro(d2)){
               System.out.println(p2.getNombre());
           }
       }   
    }
     
    public void consultaMascotasPorCodigo(){
       System.out.print("Ingresar codigo: ");
       int codigo =sc.nextInt();
       Perro p2=aplicacion.consultarPerro(codigo);
        System.out.println(codigo+""+p2.getNombre()+"Dueno:"+p2.getDueno());
      
               
    }
    
}


//Preguntas de Reflexión
//1.- En la tarea 3: ¿Por qué no se puede acceder directamente a las listas Perros y Duenos del objeto
//“aplicacion” en la clase Main?
// Porque las listas son privadas, y como son privadas pertenecen a una sola clase y un solo paquete, por eso no se las puede acceder directamente.



//2.- En la tarea 3: Si quisiéramos acceder directamente a las listas Perros y Duenos del objeto
//“aplicacion” en la clase Main, ¿qué cambios deberíamos hacer? ¿Sería esta acción recomendable?
// Deberiamos cambiar el modificador de estas listas, de private a public asi los podemos llamar desde otra clase directamenete.


//3.-Investiga el concepto de sobrecarga. ¿En qué aspectos de este taller aplicamos el concepto de
//Sobrecarga? ¿Por qué utilizamos sobrecarga?
// La sobrecarga es cuando tomamos un mismo nombre de un constructor pero cambiamos sus parametros. Usamos la sobrecarga Para poder utilizar un mismo
//constructor pero cambiando su parametro como lo hicimos en la clase dueno. Porque de esta forma solo necesitamos un solo constructor que nos puede dar
//distintos parametros que se puede usar en un trabajpo.

