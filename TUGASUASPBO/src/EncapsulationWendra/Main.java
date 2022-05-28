/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EncapsulationWendra;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        Barang TokoPBO = new Barang("Pulpen Standard", 3500);
        System.out.println("Harga Barang 1 : "+TokoPBO.getNama());
        System.out.println("Harga Barang 1 beli 10 : "+TokoPBO.getHarga()*10);
        System.out.println("====================");
        TokoPBO.setNama("Pulpen Pilot");
        TokoPBO.setHarga(4000);
        System.out.println("Nama barang 2 : "+TokoPBO.getNama());
        System.out.println("Harga Barang 2 beli 5 :"+TokoPBO.getHarga()*5);
}
}
