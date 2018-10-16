
package Models;


public class LocalModel {
    private Long id;
    private String nombre;
    private Long telefono;
    private String correo;
    private Long idCadena;

    public LocalModel(Long id, String nombre, Long telefono, String correo, Long idCadena) {
        this.id = 0L;
        this.nombre = "";
        this.telefono = 0L;
        this.correo = "";
        this.idCadena = 0L;
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Long getIdCadena() {
        return idCadena;
    }

    public void setIdCadena(Long cadenaId) {
        this.idCadena = idCadena;
    }
    
    
    
}
