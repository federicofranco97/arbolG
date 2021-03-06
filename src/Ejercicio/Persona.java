
package Ejercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Persona {
    private String nombre;
    private String genero;
    private Persona padre;
    private Persona madre;
    private ArrayList<Persona> hijos = new ArrayList<>();
    private ArrayList<Persona> hermanos = new ArrayList<>();
    

    public Persona(String nombre, Persona padre, Persona madre,String genero) {
        this.nombre = nombre;
        this.genero=genero;
        this.padre = padre;
        this.madre = madre;
    }

    public Persona(String nombre,String genero) {
        this.nombre = nombre;
        this.genero=genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
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
        if(p==null)return;
        if(p.equals(this))return;
        getHijos().add(p);
    }
    
    public void addHijos(Collection<? extends Persona> hs)
    {
        if(hs.isEmpty() || hs.contains(null)) return;
        getHijos().addAll(hs);
    }
    
     public void addHermanos(Collection<? extends Persona> hs)
    {
        if(hs.isEmpty() || hs.contains(null)) return;
        getHermanos().addAll(hs);
    }
    
    public void addHermano(Persona p){
        if(p==null)return;
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
