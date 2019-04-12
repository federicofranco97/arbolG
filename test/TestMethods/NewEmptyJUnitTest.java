package TestMethods;


import Ejercicio.Imprimir;
import Ejercicio.Persona;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Persona("Juan", "m");
        per2 = new Persona("Juana", "f");
        per3 = new Persona("Miguel", "f");
        imp = new Imprimir();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddHijo()
    {
        p.addHijo(per2);
        assertNotEquals(-1, p.getHijos().indexOf(per2) );
    }   
    
    @Test
    public void testAddHijoNull()
    {
        p.addHijo(null);
        assertEquals(-1, p.getHijos().indexOf(null) );
    }
    
    @Test
    public void testAddHermano(){
        p.addHermano(per2);
        assertNotEquals(-1, p.getHermanos().indexOf(per2) );
    }
    
    @Test
    public void testAddHermanoNull()
    {
        p.addHermano(null);
        assertEquals(-1, p.getHermanos().indexOf(null) );
    }
    
    @Test
    public void testCreatePersona(){
        Persona l=new Persona("marcos","m");
        assertEquals("m",l.getGenero() );
    }
    
    
    @Test
    public void testGetHijosWhenNoHay(){
        assertEquals(true, p.getHijos().isEmpty());
    }
    
    @Test
    public void testGetHijos(){
        p.addHijo(per2);
        assertEquals(false,p.getHijos().isEmpty());
    }
    
    @Test
    public void testAgregarHijoAUnoMismo(){
        p.addHijo(p);
        assertEquals(true, p.getHijos().isEmpty());
    }
    
    @Test
    public void testAddHijos(){
        p.addHijos(Arrays.asList(per2, per3));
        assertEquals(false, p.getHijos().isEmpty());
    }
    
    @Test
    public void testAddHermanos(){
        p.addHermanos(Arrays.asList(per2, per3));
        assertEquals(false, p.getHermanos().isEmpty());
    }
    
    @Test
    public void testAddHijosNullos(){
        p.addHijos(Arrays.asList(null, null));
        assertEquals(true, p.getHijos().isEmpty());
    }
    

    
    /*
    Los metodos de la clase imprimir son todos iguales usan metodos que se testean
    arriba e imprimen el contenido, Como son metodos void no se pueden testear.
    */
    
//    
//    @Test
//    public void testImprimirPersonaNull(){
//        assertEquals(null, imp.imprimirPersona(p));
//    }
    
    
    
    private Persona p;
    private Persona per2;
    private Persona per3;
    private Imprimir imp;
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {
    //    int a = 0;
    //    int b = 0;
    //    assertEquals(true, a == b);
    // }
}
