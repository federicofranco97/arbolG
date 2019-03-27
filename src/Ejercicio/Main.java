
package Ejercicio;


public class Main {
    public static void main(String[] args) {
        /*
            HARDCODEO DE LA INFO
            PARA VER LAS PRUEBAS DEL CODIGO IR ABAJO DE TODO        
        */
        
        
        //bisabuelos
        Persona bisa = new Persona("Don Carlos");
        Persona bisa2 = new Persona("Esmeralda");
        Persona bisa3 = new Persona("Miguel");
        Persona bisa4 = new Persona("Rosa");
        //abuelos
        Persona abue = new Persona("Manuel", bisa, bisa2);
        Persona abue2 = new Persona("Gilda",bisa3,bisa4);
        Persona abue3 = new Persona("Marcos",bisa3,bisa4);
        Persona abue4 = new Persona("Estela",bisa3,bisa4);
        
        //seteo abuelos como hijos de los bisa
        bisa.addHijo(abue);
        bisa2.addHijo(abue);
        bisa3.addHijo(abue2);
        bisa4.addHijo(abue2);
        //Creo papas
        Persona papa = new Persona("Jorge",abue,abue2);
        Persona papa2 = new Persona("Maria",abue3,abue4);
        //Creo tios
        Persona tio = new Persona("Fernando",abue,abue2);
        Persona tio2 = new Persona("Tomas",abue,abue2);
        Persona tio3 = new Persona("Agustina",abue,abue2);
        //Agrego hijos a los abuelos
        abue.addHijo(tio);
        abue.addHijo(tio2);
        abue.addHijo(tio3);
        abue2.addHijo(tio);
        abue2.addHijo(tio2);
        abue2.addHijo(tio3);
        //Agrego a los tios como hermanos entre si
        papa.addHermano(tio);
        papa.addHermano(tio2);
        papa.addHermano(tio3);
        tio.addHermano(papa);
        tio.addHermano(tio2);
        tio.addHermano(tio3);
        tio2.addHermano(tio);
        tio2.addHermano(papa);
        tio2.addHermano(tio3);
        tio3.addHermano(tio);
        tio3.addHermano(tio2);
        tio3.addHermano(papa);
        //Creo los hijos
        Persona hijo = new Persona("Martin",papa,papa2);
                
        /*
            FIN HARDCODEO
            DE ACA PARA ABAJO PRUEBAS DEL CODIGO
            Notas:
                Para traer los nombres de los hermanos o hijos usar el metodo 
                traerNombreHermanos() / traerNombreHijos().
        
        */
        
        //imprimir nombre del papa del tio
        System.out.println(tio.getPadre().getNombre());
        
        //immprimir los nombres de los hermanos del papa
        System.out.println(papa.traerNombreHermanos());
        
        
    }
    
}
