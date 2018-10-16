
package Models;


public class RubroModel {
    private Long id;
    private String tipo;

    public RubroModel(Long id, String tipo) {
        this.id = 0L;
        this.tipo = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
