package is_tarea7;


/**
 * @author Pl_Hm
 */
public class Buscar{
   
    private int id; // Será la primary key en base de datos
    private String nombreProduc;
    private float precio;

    /**Constructor**/
    
    public Buscar ()
    {
        id = -1;
        nombreProduc = null;
        precio = (float) 0.0;
        
    }
    
    /**Setters and Getters**/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProduc() {
        return nombreProduc;
    }

    public void setNombreProduc(String nombreProduc) {
        this.nombreProduc = nombreProduc;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    /**Otros métodos**/
    //Este método sera el principal en esta clase, se encargará de buscar y retornar los datos
    public Buscar prodcuto(int id)
    {
        Boolean esEnBD = false;
        Buscar productoCatalogo = new Buscar();
        
        /**AQUÍ SE UBICARÍAN LAS INSTRUCCIONES RELACIONADAS CON LA BUSQUEDA EN BASE DE DATOS.
         * SI SE ENCUENTRA EN OLA BASE DE DATOS DE CATALOGO EL VALOR DE:
         * esEnBD será True
         * y
         * productoCatalogo adquirirá los valores del elemento en la Base de Datos
         * 
         * Las instrucciones a ejecutar serán parecidas a: 
           (Lo siguiente solo es ejemplo)
           * 
            //Obtener el objeto con id = 1 de la tabla catalogo
            String consulta = "SELECT * FROM catalogo WHERE id = 1";
            ResultSet resultados = statement.executeQuery(consulta);

            // Crear un objeto Cliente y asignar los valores de las columnas correspondientes
            Cliente cliente = new Cliente();
            if (resultados.next()) {
                cliente.setId(resultados.getInt("id"));
                cliente.setNombre(resultados.getString("nombre"));
                cliente.setApellido(resultados.getString("apellido"));
            }

            // Cerrar la conexión
            conexion.close();
         **/
        
        if (esEnBD == true){
            return productoCatalogo;
        }
        else {
            System.out.println("Error: Producto no escontrado");
            return productoCatalogo;
        }
        
    }
    
}
