package is_tarea7;

/**
 * @author Pl_Hm
 */
public class Total {
    private float total = 0.0F;
    private int cantidad = 0;
    private Buscar compra;

    
    
    /**Setters and Getters**/
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
         total = this.total;
    }
    
     public int getCantidad() {
        return cantidad;
    }

    public void setCantidad() {
        cantidad = cantidad + 1;
    }
    
    public Buscar getCompra() {
        return compra;
    }

    public void setCompra(Buscar compra) {
         compra = this.compra;
    }
    
    
    /**Más métodos**/
    public void sumaPrecios (float nuevoProducto) 
    {
        setTotal(getTotal() + nuevoProducto);
        setCantidad();
    }
    
    public float total()
    {
        return descuento(getCantidad(), getTotal());
    }
    
    public float descuento(int cantidadPrendas, float totalSinDesc)
    {
        float descuento1 = (float) 0.95;
        float descuento2 = (float) 0.92;
        
        if (cantidadPrendas >= 3) {
            if (cantidadPrendas > 5)
            {
                return (totalSinDesc * descuento2);       
            } 
            else
                return (totalSinDesc * descuento1);
        }
        else {
              return totalSinDesc;           
             } 
        
    }
    
    public void agregarCompra(Buscar compraNueva)
    {
        setCompra(compraNueva);
        sumaPrecios (compraNueva.getPrecio());
        agregarBD(compraNueva);
    }
    
    
    public void agregarBD (Buscar compraNueva) 
    {
        /**AQUÍ SE UBICARÍAN LAS INSTRUCCIONES RELACIONADAS CON AAGREGAR UNA INSTANCIA A LA BASE DE DATOS.
         *Y DONDE EL CÓDIGO SERÍA ALGO ASÍ 
         
        // Crear una conexión con la base de datos
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_base_de_datos", "Ventas", "contraseña")) {

            // Crear una declaración SQL que inserte los datos en la tabla "ventas"
            String sql = "INSERT INTO personas (id, nombre, precio) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, compraNueva.getId());
            statement.setString(2, compraNueva.getNombreProduc());
            statement.setInt(3, compraNueva.getPrecio());

            // Ejecutar la declaración SQL
            int filasAfectadas = statement.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);

        } catch (SQLException ex) {
            System.out.println("Error al conectar con la base de datos: " + ex.getMessage());
                   
         **/
         
    }
    
}
