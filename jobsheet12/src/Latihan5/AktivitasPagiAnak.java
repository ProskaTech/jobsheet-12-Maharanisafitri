/*
 Created By 21343008-Maharani Safitri
 */
package Latihan5;

public abstract class AktivitasPagiAnak implements AktivitasPagi{
    
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    
    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}