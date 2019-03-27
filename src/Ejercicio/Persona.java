
package Ejercicio;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private Persona padre;
    private Persona madre;
    private ArrayList<Persona> hijos = new ArrayList<>();
    private ArrayList<Persona> hermanos = new ArrayList<>();
    

    public Persona(String nombre, Persona padre, Persona madre) {
        this.nombre = nombre;
        this.padre = padre;
        this.madre = madre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getPadre() {
        return padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public ArrayList<Persona> getHermanos() {
        return hermanos;
    }
    
    
    public void addHijo(Persona p){
        getHijos().add(p);
    }
    
    public void addHermano(Persona p){
        getHermanos().add(p);
    }
    
    public String traerNombreHijos(){
        String msj="";
        if(getHijos().isEmpty()){
            return "Esta persona no tiene hijos";
        }else{
            System.out.println("Los nombres de los hijos son:");
            for (int i = 0; i < getHijos().size(); i++) {
                msj=msj+(getHijos().get(i).getNombre()+"\n");
            }
            return msj;
        }
        
    }
    
    public String traerNombreHermanos(){
        String msj="";
        if(getHermanos().isEmpty()){
            return("Esta persona no tiene hermanos");
        }else{
            System.out.println("Los nombres de los hermanos son:");
            for (int i = 0; i < getHermanos().size(); i++) {
                msj=msj+(getHermanos().get(i).getNombre()+"\n");
            }
            return msj;
        }
        
    }
}
