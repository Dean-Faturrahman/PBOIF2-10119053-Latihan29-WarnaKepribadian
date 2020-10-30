/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan29.warnakepribadian;

import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menampilkan kepribadian dari warna
 */
public class PBOIF210119053Latihan29WarnaKepribadian {
    public static final String SANE = "\u001B[0m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";
    public static final String REDBG = "\u001B[41m";
    public static final String GREENBG = "\u001B[42m";
    public static final String YELLOWBG = "\u001B[43m";
    public static final String BLUEBG = "\u001B[44m";
    public static final String PURPLEBG = "\u001B[45m";
    public static final String WHITEBG = "\u001b[47m";
    
    public static void merah(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println(SANE + "Warna Favoritmu adalah " + RED + "MERAH");
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang Sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }
    
    public static void hijau(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println(SANE + "Warna Favoritmu adalah " + GREEN + "HIJAU");
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Tegus pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    
    public static void kuning(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println(SANE + "Warna Favoritmu adalah " + YELLOW + "KUNING");
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    
    public static void biru(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println(SANE + "Warna Favoritmu adalah " + BLUE + "BIRU");
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    
    public static void ungu(String warna, String nama){
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println(SANE + "Warna Favoritmu adalah " + PURPLE + "UNGU");
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String warna, nama;
        
        System.out.println(RED + "YUK" + GREEN + " CEK" + YELLOW + " KEPRIBADIANMU" + CYAN + " DARI" + PURPLE + " WARNA" + BLUE + " FAVORITMU");
        System.out.println("");
        System.out.println(REDBG + WHITE + "          MERAH          ");
        System.out.println(GREENBG + WHITE + "          HIJAU          ");
        System.out.println(YELLOWBG + WHITE + "          KUNING         ");
        System.out.println(BLUEBG + WHITE + "          BIRU           ");
        System.out.println(PURPLEBG + WHITE + "          UNGU           ");
        System.out.println(BLACK);
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        System.out.println("");
        
        switch(warna) {
            case "MERAH":
                merah(warna,nama);
                break;
            case "HIJAU":
                hijau(warna,nama);
                break;
            case "KUNING":
                kuning(warna,nama);
                break;
            case "BIRU":
                biru(warna,nama);
                break;
            case "UNGU":
                ungu(warna,nama);
                break;
            default:
                System.out.println("Oops.. Belum teridentifikasi");
        }
        
    }
    
}
