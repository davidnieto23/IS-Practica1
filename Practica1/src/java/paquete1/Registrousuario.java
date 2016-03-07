package paquete1;
// Generated 07-mar-2016 16:02:11 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Registrousuario generated by hbm2java
 */
@Entity
@Table(name="registrousuario"
    ,schema="public"
)
public class Registrousuario  implements java.io.Serializable {


     private int idregistro;
     private Usuario usuario;
     private Integer numerodesesiones;

    public Registrousuario() {
    }

	
    public Registrousuario(int idregistro, Usuario usuario) {
        this.idregistro = idregistro;
        this.usuario = usuario;
    }
    public Registrousuario(int idregistro, Usuario usuario, Integer numerodesesiones) {
       this.idregistro = idregistro;
       this.usuario = usuario;
       this.numerodesesiones = numerodesesiones;
    }
   
     @Id 

    
    @Column(name="idregistro", unique=true, nullable=false)
    public int getIdregistro() {
        return this.idregistro;
    }
    
    public void setIdregistro(int idregistro) {
        this.idregistro = idregistro;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nidusuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="numerodesesiones")
    public Integer getNumerodesesiones() {
        return this.numerodesesiones;
    }
    
    public void setNumerodesesiones(Integer numerodesesiones) {
        this.numerodesesiones = numerodesesiones;
    }




}


