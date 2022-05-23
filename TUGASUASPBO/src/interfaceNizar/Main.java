/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceNizar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author nizar
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException {
        //membuat object dari gamenya untuk implementasikan login
        Login GenshinImpact = new Game();
        //membuat user untuk login game yang di implementasikan
        Gamers Nizar = new Gamers(GenshinImpact);
        while (true) {
            System.out.println("||========== MENU ==========||");
            System.out.println("||1.Login               ====||");
            System.out.println("||2.Logout              ====||");
            System.out.println("||3.Masukan Username    ====||");
            System.out.println("||4.Masukan Password    ====||");
            System.out.println("||5.Masuk Ke Game       ====||");
            System.out.println("||6.Keluar              ====||");
            System.out.println("||==========================||");
            String inputan_m;
            System.out.print("Masukan Menu :");
            inputan_m = br.readLine();
            if(inputan_m.equals("1")){
                Nizar.loginGamersAccount();
            } else if (inputan_m.equals("2")){
                Nizar.logoutGamersAccount();
            } else if (inputan_m.equals("3")){
                Nizar.EnterUsername();
            } else if (inputan_m.equals("4")){
                Nizar.EnterPassword();
            } else if (inputan_m.equals("5")){
                Nizar.EnterGames();
            } else if (inputan_m.equals("6")){
                System.exit(1);
            } else {
                System.out.println("SALAH PILIH MENU");
            }    
            
        }
        
    }
    
}
