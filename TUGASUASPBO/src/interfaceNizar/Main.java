/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceNizar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException {
        //membuat object dari gamenya untuk implementasikan login
        Game GenshinImpact = new Game();
        while (true) {
            System.out.println("||======== MENU GAME =======||");
            System.out.println("||1.Login               ====||");
            System.out.println("||2.Logout              ====||");
            System.out.println("||3.Keluar              ====||");
            System.out.println("||==========================||");
            String inputan_m;
            System.out.print("Masukan Menu :");
            inputan_m = br.readLine();
            if(inputan_m.equals("1")){
                GenshinImpact.LoginAccount();
            } else if (inputan_m.equals("2")){
                GenshinImpact.LogoutAccount();
            }  else if (inputan_m.equals("3")){
                System.exit(1);
            } else {
                System.out.println("SALAH PILIH MENU");
            }    
            
        }
        
    } 
}
