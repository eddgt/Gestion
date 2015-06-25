package org.openxava.gestion.modelo;


import java.util.*;

import javax.persistence.*;

//import org.openxava.annotations.*;




@Entity
//@Table(name="ajuste_inventario", schema="openxavadb")
public class Ajuste  {

	@Id //@Hidden
    @GeneratedValue	
	//@Column(name="id",length=10)
	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	//@Column(name="fecha",length=20) @Required
    private java.util.Date fecha;
		
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}
	
	
	//@Column(name="tipo",length=20) @Required
    private String tipo;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//@Column(name="cogido_bodega_creacion",length=20) @Required
    private String bodegaorigen;
	
	public String getBodegaorigen() {
		return bodegaorigen;
	}
	
	public void setBodegaorigen(String bodegaorigen) {
		this.bodegaorigen = bodegaorigen;
	}
	
	//@Column(name="codigo_empleado_autoriza",length=30) @Required
    private String autoriza;
	
	public String getAutoriza() {
		return autoriza;
	}
	
	public void setAutoriza(String autoriza) {
		this.autoriza = autoriza;
	}
		
	
	//@Column(name="codigo_empleado_opera",length=30) @Required
    private String opera;
	
	public String getOpera() {
		return opera;
	}
	
	public void setOpera(String opera) {
		this.opera = opera;
	}
	
	//@Column(name="razon",length=30) @Required
    private String razon;
	
	public String getRazon() {
		return razon;
	}
	
	public void setRazon(String razon) {
		this.razon = razon;
	}
	
	
	
	// INICIO CÓDIGO A AÑADIR
    @OneToMany//(mappedBy="ajuste")
    
    private Collection<DetalleAjuste> ajustes;
 
    public Collection<DetalleAjuste> getAjustes() {
        return ajustes;
    }
 
    public void setAjustes(Collection<DetalleAjuste> ajustes) {
        this.ajustes = ajustes;
    }
    
    
    
    // FIN CÓDIGO A AÑADIR	
	
	/*// INICIO CÓDIGO A AÑADIR
    @OneToMany(mappedBy="teacher")
    private Collection<Pupil> pupils;
 
    public Collection <Pupil> getPupils() {
        return pupils;
    }
 
    public void setPupils(Collection <Pupil> pupils) {
        this.pupils = pupils;
    }
    // FIN CÓDIGO A AÑADIR
	 * */
	
	
}