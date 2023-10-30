/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tunjangan;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Gaji = sc.nextDouble();
        System.out.println("Berapa gaji pokok anda Perbulan?  : " + Gaji);
        String status = sc.toString();
        System.out.println("Status anda? (menikah?Belum) :" +status);
        
        double Persen = 100;
        double persen = 35;
        double hitung = ((persen/Persen*Gaji));
        System.out.println("Tunjangan :" +hitung);
        double hasil =(hitung+Gaji);
        String sd ="menikah";
        String blm = "Belum";
        if ((status.equals(sd))){
            System.out.println("Total :" +hasil);
            
        }
        else if (status.equals(blm)){
            System.out.println("Total :" + Gaji);
        
    }
        else {
            System.out.println("maaf yang anda masukan salah");
        }
        
        
    }
    
}
