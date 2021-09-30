package canada;

public class Producto {
   
    //VARIABLES DE INSTANCIAS (ATRIBUTOS)
    private String segmento;//posicion 0
    private String producto;//posicion 2
    private double unidadesVendidas;//posicion 4
    private double precioVenta;//posicion 6
    private String fechaVenta;//posicion 12
    
    //CONSTRUCTORES
    public Producto()  {
        
    }

    public Producto(String segmento, String producto, double unidadesVendidas, double precioVenta, String fechaVenta) {
        this.segmento = segmento;
        this.producto = producto;
        this.unidadesVendidas = unidadesVendidas;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
    }
    
    
    //GETTERS Y SETTERS
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(double unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    //METODOS OTROS
    public String obtenerFormatoCsv() {
        return this.segmento + ";" +
                this.producto + ";" +
               this.unidadesVendidas + ";" +
                this.precioVenta + ";" +
                this.fechaVenta + "\n";
    }
    
}
    
