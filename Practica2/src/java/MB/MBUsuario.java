/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import DAO.Usuario;
import controlador.UsuarioDaoHibernate;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author David
 */

@ManagedBean
@SessionScoped

public class MBUsuario {
    
     private static SessionFactory factory; 
     private int id;
     private String nombre;
     private String correo;
     private String contraseña;
     private String msn;
    
    public void guarda() {
        Usuario tmp = new Usuario();
        try {
            tmp.setNombre(getNombre());
            tmp.setCorreo(getCorreo());
            tmp.setContraseña(getContraseña());
            UsuarioDaoHibernate usuarioDAO = new UsuarioDaoHibernate();
            usuarioDAO.save(tmp);

            msn = "El usuario se guardo correctamente";
        } catch (Exception e) {

            msn = "upss! Ocurrio un error " + e;
            System.out.println(" upss! Ocurrio un error.  " + e);
        }
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
