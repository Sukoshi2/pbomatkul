/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractFinalLutfi;

public abstract class Barang {
    //karakteristik benda
    protected String warna_barang, nama_barang, jenis_barang, waktu_serah;
    protected int banyak_barang;
    
    
    //untuk inputan data penitip
    
    
    public Barang(String nama_barang, String warna_barang, String jenis_barang, int banyak_barang, String waktu_serah){
        this.nama_barang        = nama_barang;
        this.warna_barang       = warna_barang;
        this.jenis_barang       = jenis_barang;
        this.banyak_barang      = banyak_barang;
        this.waktu_serah        = waktu_serah;
    }
}
