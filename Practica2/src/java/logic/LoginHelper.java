/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Clases.Usuario;

/**
 *
 * @author miguel
 */
public class LoginHelper {

    private Session session;

    public LoginHelper() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public Usuario getLoginPorNombre(String nombre) {
        Usuario usuario;
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.getNamedQuery("BuscaPorNombre").setString("usuario", nombre);
            return (Usuario) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
