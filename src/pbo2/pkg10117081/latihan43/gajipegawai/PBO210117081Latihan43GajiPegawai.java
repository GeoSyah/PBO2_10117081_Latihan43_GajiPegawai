/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117081.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Menghitung total gaji dari uang transport beserta tunjangan
 *              ditambah dengan gaji pokok pegawai
 */
public class PBO210117081Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.print("Nama Karyawan \t: ");
        gaji.setNama(scn1.nextLine());
        System.out.print("Alamat \t: ");
        gaji.setAlamat(scn2.nextLine());
        System.out.print("Uang Tunjangan \t: Rp. ");
        gaji.setUangTunjangan(scn3.nextInt());
        System.out.print("Uang Transport \t: Rp. ");
        gaji.setUangTransport(scn3.nextInt());
        System.out.print("Gaji Pokok \t: Rp. ");
        gaji.setGajiPokok(scn3.nextInt());
        gaji.totalGaji(gaji.getUangTunjangan(),gaji.getUangTransport(),gaji.getGajiPokok());
        System.out.println("Total Gaji \t: Rp "+gaji.getTotalGaji());

        gaji.tampilData(gaji.getNama(),gaji.getAlamat(),gaji.getUangTunjangan()
                ,gaji.getUangTransport(),gaji.getGajiPokok(),gaji.getTotalGaji());
    }
    
}