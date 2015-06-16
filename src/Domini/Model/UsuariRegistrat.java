/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.Model;

/**
 *
 * @author JOAN
 */
public class UsuariRegistrat {
    private String nom;
    private String cognom;
    private String username;
    private String pwd;
    
    public String getPassword(){return getPwd();}
    public String getUserName(){return getUsername();}

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cognom
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
