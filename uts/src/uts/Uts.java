/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Made Adhitya Dwipayana 2201010366 18 April 2024
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtIN = new Scanner(System.in);
        int max_anggota = 5;
        anggota[] AnggotaArray = new anggota[max_anggota];
        int no = 0;
        
        
        int ch;
        //MEMBUAT MENU
        do {
            System.out.println("--- DATA ANGGOTA JBI ---");
            System.out.println("SILAHKAN MEMILIH SALAH SATU MENU BERIKUT : ");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Selesai\n");

            System.out.println("PILIH MENU (1-5) : ");
            ch = dtIN.nextInt();
            dtIN.nextLine();

             switch (ch) {
                case 1: //INPUT DATA
                    if (no >= max_anggota) {
                        System.out.println("TIDAK DAPAT MENAMBAH ANGGOTA LAGI.");
                        return;
                    }
                    System.out.println("\nInput Anggota Baru ke-:"+ (no +1));
                    System.out.print("Nama      : ");
                    String nama = dtIN.nextLine();
                    System.out.print("NIM     : ");
                    String nim = dtIN.nextLine();
                    System.out.print("Umur     : ");
                    int umur = dtIN.nextInt();
                    
                    dtIN.nextLine();
                    
                    AnggotaArray [no++] = new anggota(nama, nim, umur);
                    System.out.println("ANGGOTA BARU BERHASIL DITAMBAHKAN\n");
                    break;
                   
                case 2:  // TAMPIL DATA
                    if (no == 0) {
                        System.out.println("\nDATA ANGGOTA BELUM ADA!!!");
                    } else {
                        System.out.println("\nLIST ANGGOTA : ");
                        for (int i = 0; i < no; i++) {
                            System.out.println("Anggota ke-" + (i + 1));
                            System.out.println(AnggotaArray[i]);
                            System.out.println("-------------------------------------------");
                        }
                    }
                    break;
                 

                case 3: //UBAH DATA
                    System.out.print("\nMASUKKAN NO ANGGOTA YANG INGIN DIUBAH : ");
                    int indexUbah = dtIN.nextInt();
                    dtIN.nextLine();
                    
                    if (indexUbah < 1 || indexUbah > no) {
                        System.out.println("\nNomor Anggota tidak ada!");
                    } else {
                        System.out.println("EDIT ANGGOTA : " + indexUbah);
                        System.out.print("Nama      : ");
                        nama = dtIN.nextLine();
                        System.out.print("NIM     : ");
                        nim = dtIN.nextLine();
                        System.out.print("Umur     : ");
                        umur = dtIN.nextInt();
                        dtIN.nextLine();

                        AnggotaArray[indexUbah - 1].setnama(nama);
                        AnggotaArray[indexUbah - 1].setnim(nim);
                        AnggotaArray[indexUbah - 1].setumur(umur);

                        
                        System.out.println("\nDATA ANGGOTA BERHASIH DI-UPDATE!\n");
                    }
                    break;
                    
                case 4: //HAPUS DATA
                    System.out.print("MASUKKAN NO ANGGOTA YANG INGIN DIHAPUS : ");
                    int indexHapus = dtIN.nextInt();
                    dtIN.nextLine(); 
                    
                    if (indexHapus < 1 || indexHapus > no) {
                        System.out.println("\nNO ANGGOTA TIDAK VALID!\n");
                    } else {
                        for (int i = indexHapus - 1; i < no - 1; i++) {
                            AnggotaArray[i] = AnggotaArray[i + 1];
                        }
                        no--;
                        System.out.println("\nANGGOTA TELAH DIHAPUS!\n");
                    }
                    break;
            }
        }while(ch != 0);
        dtIN.close();
    }
    
}