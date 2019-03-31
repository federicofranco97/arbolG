
package Ejercicio;

import java.util.ArrayList;


public class Imprimir {
    
    /*
    Metodos:
    imprimir lista
    imprimir Persona
    imprimir hija/s
    imprimir hijo/s
    imprimir hermano/s
    imprimir hermana/s
    imprimir tio/s
    imprimir tia/s
    imprimir abuelo/s
    imprimir abuela/s
    imprimir sobrino/s
    imprimir sobrina/s
    */
    
    public void imprimirLista(ArrayList<Persona> list){
        String msj="\n";
        for(int i=0;i<list.size();i++){
            msj=msj+list.get(i).getNombre()+"\n";
        }
        
        System.out.println(msj);
    }
    
    public void imprimirSobrinos(Persona p){
        String msj="";
        for(int i=0;i<p.getHermanos().size();i++){
            for(int j=0;j<p.getHermanos().get(i).getHijos().size();j++){
                if(p.getHermanos().get(i).getHijos().get(j).getGenero().equals("m")){
                     msj=msj+p.getHermanos().get(i).getHijos().get(j).getNombre()+"\n";
                }                
            }
        }
        
        System.out.println(msj);
    }
    
    public void imprimirSobrinas(Persona p){
        String msj="";
        for(int i=0;i<p.getHermanos().size();i++){
            for(int j=0;j<p.getHermanos().get(i).getHijos().size();j++){
                if(p.getHermanos().get(i).getHijos().get(j).getGenero().equals("f")){
                     msj=msj+p.getHermanos().get(i).getHijos().get(j).getNombre()+"\n";
                }                
            }
        }
        
        System.out.println(msj);
    }
    
    public void imprimirAbuelos(Persona p){
        String msj="";
        System.out.println("Sobrino/s:\n"
                + p.getPadre().getPadre().getNombre()+"\n"
                        +p.getMadre().getPadre().getNombre());
        
    }
    
    public void imprimirAbuelas(Persona p){
        String msj="";
        System.out.println("Abuela/s:\n"
                + p.getPadre().getMadre().getNombre()+"\n"
                        +p.getMadre().getMadre().getNombre());
        
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
        if(msj.equals("")) {
            System.out.println("La persona no tiene hermana/s");
            return;
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
        if(msj.equals("")) {
            System.out.println("La persona no tiene hermano/s");
            return;
        }
        System.out.println("\nLos hermanos son:\n"+msj);
    }
    
    public void imprimirHijos(Persona p){
        String msj="";
        
        for(int i=0;i<p.getHijos().size();i++){
            if(p.getHijos().get(i).getGenero().equals("m")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        
        if(msj.equals("")) {
            System.out.println("La persona no tiene hijo/s");
            return;
        }
        System.out.println("\nLos hijos son:\n"+msj);
    }
    
    public void imprimirHijas(Persona p){
        String msj="";
        
        for(int i=0;i<p.getHijos().size();i++){
            if(p.getHijos().get(i).getGenero().equals("f")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        if(msj.equals("")) {
            System.out.println("La persona no tiene hija/s");
            return;
        }
        System.out.println("\nLos hermanos son:\n"+msj);
    }
    
    public void imprimirTios(Persona p){
        String msj="";
        
        for(int i=0;i<p.getPadre().getHermanos().size();i++){
            if(p.getPadre().getHermanos().get(i).getGenero().equals("m")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        
        for(int i=0;i<p.getMadre().getHermanos().size();i++){
            if(p.getMadre().getHermanos().get(i).getGenero().equals("m")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        
        if(msj.equals("")) {
            System.out.println("La persona no tiene tio/s");
            return;
        }
        
        System.out.println("\nLos hijos son:\n"+msj);
    }
    
    public void imprimirTias(Persona p){
        String msj="";
        
        for(int i=0;i<p.getPadre().getHermanos().size();i++){
            if(p.getPadre().getHermanos().get(i).getGenero().equals("f")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        
        for(int i=0;i<p.getMadre().getHermanos().size();i++){
            if(p.getMadre().getHermanos().get(i).getGenero().equals("f")){
                msj=msj+p.getHijos().get(i).getNombre()+"\n";
            }
        }
        
        if(msj.equals("")) {
            System.out.println("La persona no tiene tia/s");
            return;
        }
        System.out.println("\nLos hermanos son:\n"+msj);
    }
    
    
}
