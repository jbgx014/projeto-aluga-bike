/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alugabike;

import Controller.LoginDao;
import Modelos.LoginModel;

/**
 *
 * @author juuh2
 */
public class alugabike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        LoginDao testeLogin = new LoginDao();
        LoginModel login = new LoginModel();
        login.setUsername("1");
        login.setSenha("1234");
        testeLogin.Logar (login);
        
        if ( testeLogin.Logar(login) ){
            System.out.println("dados corretos");
        } else{
            System.out.println("dados incorretos");
        }
        
        Login Janela = new Login();
        Janela.setVisible(true);
        
        
    }
    
}
