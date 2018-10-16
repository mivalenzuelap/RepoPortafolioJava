/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author dark_
 */
public class ReporteOfertaModel {
    private Long id;
    private Long idTienda;
    private String tienda;
    private Long usuarios;
    private Long correos;
    private Long valoraciones;
    private Long descuentos;

    public ReporteOfertaModel(Long id, Long idTienda, String tienda, Long usuarios, Long correos, Long valoraciones, Long descuentos) {
        this.id = 0L;
        this.idTienda = 0L;
        this.tienda = "";
        this.usuarios = 0L;
        this.correos = 0L;
        this.valoraciones = 0L;
        this.descuentos = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Long idTienda) {
        this.idTienda = idTienda;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public Long getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Long usuarios) {
        this.usuarios = usuarios;
    }

    public Long getCorreos() {
        return correos;
    }

    public void setCorreos(Long correos) {
        this.correos = correos;
    }

    public Long getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(Long valoraciones) {
        this.valoraciones = valoraciones;
    }

    public Long getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Long descuentos) {
        this.descuentos = descuentos;
    }
    
    
}
