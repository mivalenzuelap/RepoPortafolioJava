
package Models;


public class DescuentoModel {
   private Long ind;
   private Long porcentaje;
   private Long tope;

    public DescuentoModel(Long ind, Long porcentaje, Long tope) {
        this.ind = ind;
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    public Long getInd() {
        return ind;
    }

    public void setInd(Long ind) {
        this.ind = ind;
    }

    public Long getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Long getTope() {
        return tope;
    }

    public void setTope(Long tope) {
        this.tope = tope;
    }
   
   
}
