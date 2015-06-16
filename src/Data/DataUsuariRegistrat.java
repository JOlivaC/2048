/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domini.DataInterface.CtrlUsuariRegistrat;
import Domini.Model.UsuariRegistrat;
import Excepcions.userNameNoExisteix;
import org.hibernate.Session;

/**
 *
 * @author JOAN
 */
public class DataUsuariRegistrat implements CtrlUsuariRegistrat {

    @Override
    public UsuariRegistrat getUsuariRegistrat(String UserN)throws userNameNoExisteix {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            UsuariRegistrat u = (UsuariRegistrat)session.get(UsuariRegistrat.class,UserN);
            u.getCognom();
            session.close();
            return u;
        }  catch (Exception ex) {
            throw new userNameNoExisteix();
        }       
    }
    
}
