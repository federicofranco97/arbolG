
package Ejercicio;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        /*
            HARDCODEO DE LA INFO
            PARA VER LAS PRUEBAS DEL CODIGO IR ABAJO DE TODO        
        */
        
        
        //bisabuelos
        Persona bisa = new Persona("Don Carlos","m");
        Persona bisa2 = new Persona("Esmeralda","f");
        Persona bisa3 = new Persona("Miguel","m");
        Persona bisa4 = new Persona("Rosa","f");
        //abuelos
        Persona abue = new Persona("Manuel", bisa, bisa2,"m");
        Persona abue2 = new Persona("Gilda",bisa3,bisa4,"f");
        Persona abue3 = new Persona("Marcos",bisa3,bisa4,"m");
        Persona abue4 = new Persona("Estela",bisa3,bisa4,"f");
        
        //seteo abuelos como hijos de los bisa
        bisa.addHijo(abue);
        bisa2.addHijo(abue);
        bisa3.addHijo(abue2);
        bisa4.addHijo(abue2);
        //Creo papas
        Persona papa = new Persona("Jorge",abue,abue2,"m");
        Persona papa2 = new Persona("Maria",abue3,abue4,"f");
        //Creo tios
        Persona tio = new Persona("Fernando",abue,abue2,"m");
        Persona tio2 = new Persona("Tomas",abue,abue2,"m");
        Persona tio3 = new Persona("Agustina",abue,abue2,"f");
        //Agrego hijos a los abuelos
        abue.addHijos(Arrays.asList(papa,tio, tio2, tio3));
        abue2.addHijos(Arrays.asList(papa,tio, tio2, tio3));
        //Agrego a los tios como hermanos entre si
        
        papa.addHermanos(Arrays.asList(tio, tio2, tio3));
        tio.addHermanos(Arrays.asList(papa, tio2, tio3));
        tio2.addHermanos(Arrays.asList(papa, tio, tio3));
        tio3.addHermanos(Arrays.asList(papa, tio, tio2));
        
        //Creo los hijos
        Persona hijo = new Persona("Martin",papa,papa2,"m");
                
        /*
            FIN HARDCODEO
            DE ACA PARA ABAJO PRUEBAS DEL CODIGO
            Notas:
                Para traer los nombres de los hermanos o hijos usar el metodo 
                traerNombreHermanos() / traerNombreHijos().
        
        */
        
        Imprimir imprimir = new Imprimir();
        imprimir.imprimirHermanas(papa);
        imprimir.imprimirHermanos(papa);
        
//        imprimir.imprimirLista(papa.getHermanos());
//        imprimir.imprimirLista(papa.getPadre().getHijos());
//        imprimir.imprimirLista(papa.getHijos());
            
        
        
    }
    
}
