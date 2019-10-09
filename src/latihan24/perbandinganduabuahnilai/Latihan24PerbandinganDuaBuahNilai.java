/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk membandingkan dua buah nilai angka.
 */
public class Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //deklarasi variabel
        int nilai1, nilai2;
        String aktifitas = "Ya";
        int i = 0;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Perbandingan Nilai=====");
        while ("Ya".equals(aktifitas)) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = scanner.nextInt();
        
            //proses dan output
            if (nilai1 > nilai2) {
                System.out.println("Hasil : "+nilai1+" Lebih Besar Dari "+nilai2);
            }
            else if (nilai2 > nilai1) {
                System.out.println("Hasil : "+nilai2+" Lebih Besar Dari "+nilai1);
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aktifitas = scanner.next();
            System.out.println("");
        }
        System.out.println("");
    }
}
