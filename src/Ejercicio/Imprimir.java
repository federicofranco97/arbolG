
package Ejercicio;

import java.util.ArrayList;


public class Imprimir {
    
    public void imprimirLista(ArrayList<Persona> list){
        String msj="\n";
        for(int i=0;i<list.size();i++){
            msj=msj+list.get(i).getNombre()+"\n";
        }
        
        System.out.println(msj);
    }
    
    
    public void imprimirPersona(Persona p){
        String msj="\n"
                + "Nombre: "+p.getNombre()+"\n"
                + "Padre: "+p.getPadre().getNombre()+"\n"
                + "Madre: "+p.getMadre().getNombre()+"\n"
                +"Genero: "+p.getGenero()+"\n";
        System.out.println(msj);
    }
    
    public void imprimirHermanas(Persona p){
        String msj="";
        
        for(int i=0;i<p.getHermanos().size();i++){
            if(p.getHermanos().get(i).getGenero().equals("f")){
                msj=msj+p.getHermanos().get(i).getNombre()+"\n";
            }
        }
        
        System.out.println("\nLas hermanas son:\n"+msj);
    }
    
    public void imprimirHermanos(Persona p){
        String msj="";
        
        for(int i=0;i<p.getHermanos().size();i++){
            if(p.getHermanos().get(i).getGenero().equals("m")){
                msj=msj+p.getHermanos().get(i).getNombre()+"\n";
            }
        }
        
        System.out.println("\nLos hermanos son:\n"+msj);
    }
    
}
