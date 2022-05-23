/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceNizar;

public class Gamers {
    //ini class untuk objek orang/pengguna
    //untuk me
    private final Login login;
    
    public Gamers(Login login) {
        this.login = login;
    }
    
    void loginGamersAccount(){
        this.login.LoginAccount();
    }
    
    void logoutGamersAccount(){
        this.login.LogoutAccount();
    }
    
    void EnterUsername(){
        this.login.EnterUsernameAccount();
    }
    
    void EnterPassword(){
        this.login.EnterPasswwordAccount();
    }
    void EnterGames(){
        this.login.EnterGame();
    };
}
