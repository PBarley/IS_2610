package is_tarea7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pl_Hm
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



public class TotalTest {
    
    //CONSTRUCTOR DE LA CLASE
    public TotalTest() {
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
    
    
    
    
    
    
    
    //SETTER AND GETTERS
    
    /**
     * Test del método getTotal, de la clase Total.
     */
    @Test
    public void testGetTotal() {
        System.out.println("TEST: getTotal");
        //Se instancia de la clase "Total".
        Total instance = new Total();
        float expResult = 0.0F;
        float result = instance.getTotal();
        //Este método verificara si el resultado esperado (expResult) es igual al resultado real (result) con una tolerancia de 0.0
        assertEquals(expResult, result, 0.0);
        // Es una llamada que indica que el caso de prueba es un prototipo y aún no se ha implementado (se elimina cuando se haya implementado).
        fail("The test case is a prototype.");
    }

    /**
     * Test del método setTotal, de la clase Total.
     */
    @Test
    public void testSetTotal() {
        System.out.println("TEST: setTotal");
        float total = 0.0F;
        //Se instancia de la clase "Total".
        Total instance = new Total();
        instance.setTotal(total); 
        //Este método verificara si el resultado que se le asigno a Total (total) es igual al que se ha registrado en la variable, para ello se usa "instance.getTotal()" con una tolerancia de 0.0
        assertEquals(total, instance.getTotal(), 0.0);
        // Es una llamada que indica que el caso de prueba es un prototipo y aún no se ha implementado (se elimina cuando se haya implementado).
        fail("The test case is a prototype.");
    }

    /**
     * Test del método getCantidad, de la clase Total.
     */
    //Este método sige la misma lógica del set y get anterior (dependiendo su caso)
    @Test
    public void testGetCantidad() {
        System.out.println("TEST: getCantidad");
        Total instance = new Total();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test del método setCantidad, de la clase Total.
     */
    //Este método sige la misma lógica del set y get anterior (dependiendo su caso)
    @Test
    public void testSetCantidad() {
        System.out.println("TEST: setCantidad");
        Total instance = new Total();
        instance.setCantidad();
        int cantidad = 1;
        assertEquals(cantidad, instance.getCantidad());
        fail("The test case is a prototype.");
    }

    /**
     * Test del método getCompra, de la clase Total.
     */
    //Este método sige la misma lógica del set y get anterior (dependiendo su caso)
    @Test
    public void testGetCompra() {
        System.out.println("TEST: getCompra");
        Total instance = new Total();
        Buscar expResult = null;
        Buscar result = instance.getCompra();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test del método setCompra, de la clase Total.
     */
    //Este método sige la misma lógica del set y get anterior (dependiendo su caso)
    @Test
    public void testSetCompra() {
        System.out.println("TEST: setCompra");
        Buscar compra = null;
        Total instance = new Total();
        instance.setCompra(compra);
        fail("The test case is a prototype.");
    }

    
    
    
    
    
    
    
    
    
    // OTROS METODOS
    
    /**
     * Test del método sumaPrecios, de la clase Total.
     */
    @Test
    public void testSumaPrecios() {
        System.out.println("TEST: sumaPrecios");
        float nuevoProducto = 1.0F;
        Total instance = new Total();
        instance.sumaPrecios(nuevoProducto);
        assertEquals(nuevoProducto,instance.getTotal(), 0.0);
        //El método de set no se vuelve a compro
        fail("The test case is a prototype.");
    }

    /**
     * Test del método total, de la clase Total.
     */
    @Test
    public void testTotal() {
        System.out.println("TEST: total");
        Total instance = new Total();
        float expResult = 0.0F;
        float result = instance.total();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test del método descuento, de la clase Total.
     */
    @Test
    public void testDescuento() {
        System.out.println("TEST: descuento");
        int cantidadPrendas = 3;
        float totalSinDesc = 570.0F;
        Total instance = new Total();
        float expResult = 541.5F;
        float result = instance.descuento(cantidadPrendas, totalSinDesc);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test del método agregarCompra, de la clase Total.
     */
    @Test
    public void testAgregarCompra() {
        System.out.println("TEST: agregarCompra");
        Buscar compraNueva = null;
        Total instance = new Total();
        instance.agregarCompra(compraNueva);
        assertEquals(null, instance.getCompra());
        fail("The test case is a prototype.");
    }
    
}
