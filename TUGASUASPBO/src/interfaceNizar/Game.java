/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceNizar;
import java.util.Scanner;
/**
 *
 * @author nizar
 */
public class Game implements Login{

    private boolean isLoggedIn;
    private String Username;
    private String Password;
    
    //Constructor
    public Game() {
        this.Username = "";
        this.Password = "";
    }
    
    Scanner input = new Scanner(System.in);
    String inUser;
    String inPass;
    @Override
    public void LoginAccount() {
        isLoggedIn = true;
        System.out.println("WELCOME TO THE GAME");
        System.out.println("SEBELUM MASUK MASUKAN USERNAME DAN PASSWORD DULU");
    }

    @Override
    public void LogoutAccount() {
       isLoggedIn = false;
        System.out.println("Akun ada Telah Keluar");
        this.Username = "";
        this.Password = "";
    }

    @Override
    public void EnterUsernameAccount(){
         if (isLoggedIn) {
             if (this.Username == "") {
                 System.out.print("MASUKAN USERNAME ANDA : ");
                 inUser = input.nextLine();
                 this.Username = inUser;
             } else {
                 System.out.println("Username Anda : " + this.getUsername());
             }
        } else {
             System.out.println("Kamu Harus Login Dahulu!");
        }
    }

    @Override
    public void EnterPasswwordAccount() {
        if (isLoggedIn) {
             if (this.Password == "") {
                 System.out.print("MASUKAN USERNAME ANDA : ");
                 inPass = input.nextLine();
                 this.Password = inPass;
             } else {
                 System.out.println("Username Anda : " + this.getPassword());
             }
        } else {
             System.out.println("Kamu Harus Login Dahulu!");
        }
    }
    
    public String getUsername(){
        return this.Username;
    }
    
    public String getPassword(){
        return this.Password;
    }

    @Override
    public void EnterGame() {
      if (isLoggedIn) {
           if(this.Username != "") {
               if (this.Password != "") {
                    System.out.println("ANDA TELAH MASUK KE GAME");
               } else {
                   System.out.println("ANDA BELUM MASUKAN PASSWORD");
               }
            } else {
            System.out.println("ANDA BELUM LOGIN ATAUPUN MASUKAN USERNAME DAN PASSWORD");
            }
      } else {
          System.out.println("Kamu Harus Login dahulu!");
            
      }

    }
    
}
