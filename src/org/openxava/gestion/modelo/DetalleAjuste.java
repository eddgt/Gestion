package org.openxava.gestion.modelo;

import javax.persistence.*;
import javax.persistence.Entity;
//import javax.persistence.Table;

//import org.hibernate.annotations.*;
//import org.openxava.annotations.*;



@Entity
//@Table(name="detalle_ajuste", schema="openxavadb")
public class DetalleAjuste {
	
	 	@Id //@Hidden     
	    @GeneratedValue//(generator="system-uuid")// Identificador Universal Único (1)
	    //@GenericGenerator(name="system-uuid", strategy ="uuid")
	    @Column(name="idd",length=32)
	    private String idd;

	//@Column(name="cantidad",length=10)
	private Integer cantidad;
	
	//@Column(name="cod_origen",length=10)
	private String origen;	

	//@Column(name="cod_destino",length=10)
	private String destino;
	
	//@Column(name="cod_articulo",length=20)
	private String articulo;

	public String getIdd() {
		return idd;
	}
	
	public void setIdd(String idd) {
		this.idd = idd;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
		
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	public String getArticulo() {
		return articulo;
	}
	
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	/*@Column(name="id_ajuste",length=10)
	private Integer id_ajuste;
	
	public Integer getId_ajuste() {
		return id_ajuste;
	}
	
	public void setId_ajuste(Integer id_ajuste) {
		this.id_ajuste = id_ajuste;
	}*/
	
	
	// INICIO CÓDIGO A AÑADIR
	//@DescriptionsList  // AÑADE ESTO
    @ManyToOne    
    private Ajuste ajuste;
 
    public Ajuste getAjuste() {
		return ajuste;
	}
    
    public void setAjuste(Ajuste ajuste) {
		this.ajuste = ajuste;
	}
    
    // FIN CÓDIGO A AÑADIR
    
}