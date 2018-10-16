
package Models;


public class ProductoModel {
    private Long id;
    private String nombre;
    private String descripcion;
    private Long precio;
    private String marca;

    public ProductoModel(Long id, String nombre, String descripcion, Long precio, String marca) {
        this.id = 0L;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0L;
        this.marca = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
