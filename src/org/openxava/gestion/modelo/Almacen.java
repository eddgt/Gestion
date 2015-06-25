package org.openxava.gestion.modelo;
import javax.persistence.*;
import org.openxava.annotations.*;


@Entity
public class Almacen {
	
	@Id @Column(length=3) @Required
    private int codigo;
 
    @Column(length=40) @Required
    private String nombre;
    
    @Column(length=50) @Required
    private String direccion;
    
    @Column(length=5) @Required
    private int capcombust;
 
    
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCapcombust() {
        return capcombust;
    }
 
    public void setCapcombust(int capcombust) {
        this.capcombust = capcombust;
    }
    
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
   

}
