/*
 Created By 21343008-Maharani Safitri
 */
package Latihan4;

public class AnakUmur1Tahun extends Orang{
    
    public void namaAyahku(){
        System.out.println("Nama Ayahku adalah " + namaAyah);
}

@Override
    public void makan(){
        System.out.println("Anak umur 1 Tahun Makan Asi");
}

@Override
    public void minum(){
        System.out.println ("Anak Umur 1 Tahun Minum Asi");     
   }
}