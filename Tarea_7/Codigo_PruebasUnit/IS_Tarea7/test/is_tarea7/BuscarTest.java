package is_tarea7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *@author Pl_Hm
 */

/**
@Test: Se utiliza para marcar un método como un método de prueba. El método anotado con @Test debe ser público y no debe devolver ningún valor.

@BeforeAll: Este método se ejecuta una sola vez antes de que se ejecuten todos los métodos de prueba de la clase. Es útil para configurar el entorno de prueba antes de que se ejecuten las pruebas. Por ejemplo, puede usar esta anotación para iniciar una conexión a la base de datos o para inicializar una variable global que se usará en todas las pruebas.

@BeforeEach: Este método se ejecuta antes de cada método de prueba. Es útil para realizar una preparación específica antes de cada prueba. Por ejemplo, puede usar esta anotación para inicializar una nueva instancia de una clase que se usará en una prueba o para reiniciar el estado de una variable que se usa en varias pruebas.

@AfterEach: Este método se ejecuta después de cada método de prueba. Es útil para realizar una limpieza específica después de cada prueba. Por ejemplo, puede usar esta anotación para cerrar una conexión a la base de datos que se abrió para una prueba o para liberar recursos utilizados en la prueba.

@AfterAll: Este método se ejecuta una sola vez después de que se hayan ejecutado todos los métodos de prueba de la clase. Es útil para realizar una limpieza final después de que se hayan ejecutado todas las pruebas. Por ejemplo, puede usar esta anotación para cerrar una conexión a la base de datos que se abrió en la anotación @BeforeAll.

En resumen, las anotaciones @BeforeAll y @AfterAll se utilizan para configurar y limpiar el entorno de pruebas antes y después de todas las pruebas de la clase, mientras que las anotaciones @BeforeEach y @AfterEach se utilizan para configurar y limpiar el entorno de pruebas antes y después de cada prueba individual. De esta manera, se garantiza que cada prueba se ejecute en un entorno controlado y consistente, y que cualquier recurso utilizado en las pruebas se libere adecuadamente.

-Fuente: ChatGPT
**/



public class BuscarTest {
    
    public BuscarTest() {
    }
    /**
    ESTO MÉTODOS @AfterEach, @AfterAll, @BeforeEach y @BeforeAll, DE MOMENTO NO SON UTILIZADOS
    SIN EMBARGO, CUANDO SE TENGA LA BASE DE DATOS Y SE VINCULEN, SERÁ NECESARIO IMPLEMENTARLOS.
     

    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    **/
    
    /**
     * Test of getId method, of class Buscar.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Buscar instance = new Buscar();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buscar.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Buscar instance = new Buscar();
        instance.setId(id);
        assertEquals(id, instance.getId());
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreProduc method, of class Buscar.
     */
    @Test
    public void testGetNombreProduc() {
        System.out.println("getNombreProduc");
        Buscar instance = new Buscar();
        String expResult = "";
        String result = instance.getNombreProduc();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreProduc method, of class Buscar.
     */
    @Test
    public void testSetNombreProduc() {
        System.out.println("setNombreProduc");
        String nombreProduc = "";
        String expResult = "";
        Buscar instance = new Buscar();
        instance.setNombreProduc(nombreProduc);
        assertEquals(expResult, instance.getNombreProduc());
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Buscar.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Buscar instance = new Buscar();
        float expResult = 0.0F;
        float result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Buscar.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        float precio = 0.0F;
        Buscar instance = new Buscar();
        instance.setPrecio(precio);
        assertEquals(precio, instance.getPrecio());
        fail("The test case is a prototype.");
    }

    
}
