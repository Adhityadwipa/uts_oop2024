/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Made Adhitya Dwipayana 2201010366 18 April 2024
 */
public class anggota {
    private String nama, nim;
    private int umur;
    int no = 0;
    
    public anggota(String nama, String nim, int umur){
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getnama(){
        return nama;
    }
    
     public void setnim(String nim){
        this.nim = nim;
    }
    
    public String getNIM(){
        return nim;
    }
    
    public void setumur(int umur){
        this.umur = umur;
    }
    
    public int getumur(){
        return umur;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim+ ", Umur :"+umur;
    }
    
}
