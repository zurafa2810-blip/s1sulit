/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class Soal5 {

    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = inputan.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan Nilai Siswa ke-" + i + ": ");
            double nilain = inputan.nextDouble();
            totalNilai += nilain;
        }
                

        double rataRata = totalNilai / jumlahSiswa;
        System.out.println(" ");
        System.out.println("Jumlah Siswa          : " + jumlahSiswa);
        System.out.println("Total Nilai          : " + totalNilai);
        System.out.println("Nilai Rata-Rata Siswa : " + rataRata);

    }
}
    

