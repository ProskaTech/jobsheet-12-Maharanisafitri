/*
 Created By 21343008-Maharani Safitri
 */
package Latihan1;

public class RodaEmpat extends Kendaraan 
{
    double NaikHargaKe = 8;// 1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp." + hargaDasar);
    }  
}