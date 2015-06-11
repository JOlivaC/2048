/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini.UseCaseController;

import Domini.DataInterface.CtrlUsuariRegistrat;
import Domini.Factories.DataControllerFactory;
import Domini.Model.UsuariRegistrat;
import Excepcions.pwdIncorrecte;
import Excepcions.userNameNoExisteix;

/**
 *
 * @author JOAN
 */
public class CuLogin {
    public void login(String userN,String passwd) throws pwdIncorrecte,userNameNoExisteix{
        CtrlUsuariRegistrat cu =  DataControllerFactory.getInstance().getUsuariRegistratController();
        UsuariRegistrat u = cu.getUsuariRegistrat(userN);
        String pwd = u.getPassword();
        if (pwd.compareTo(passwd) != 0) throw new pwdIncorrecte();
    }
}
