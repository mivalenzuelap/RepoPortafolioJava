
package Models;


public class CadenaModel {
    private Long id;
    private String nombre;
    private Long idRubro;

    public CadenaModel(Long id, String nombre, Long idRubro) {
        this.id = 0L;
        this.nombre = "";
        this.idRubro = 0L;
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

    public Long getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(Long idRubro) {
        this.idRubro = idRubro;
    }
    
    
}
