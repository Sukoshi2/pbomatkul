/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceNizar;

public class Game implements Login{

    
    @Override
    public void LoginAccount() {
        System.out.println("Selamat datang");
        System.out.println("Akun anda telah masuk");
    }

    @Override
    public void LogoutAccount() {
        System.out.println("Selamat tinggal");
        System.out.println("Akun anda Telah Keluar");
    }
    
}
