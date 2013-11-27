/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean;

import java.util.Date;

/**
 *
 * @author al037805
 */
public class CalificacionActividadOfflineBean {

    private Integer id = 0;
    private actividad_offlineBean actividad_offline = null;
    private UsuarioBean usuario = null;
    private Date fecha;

    public CalificacionActividadOfflineBean() {
        this.usuario = new UsuarioBean();
    }

    public CalificacionActividadOfflineBean(Integer id) {
        this.id = id;
        this.usuario = new UsuarioBean();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the usuario
     */
    public UsuarioBean getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
