package com.oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int jumlah_porsi,pilihan,bayar,harga,total,totall,diskon,kembalian,total_diskon;
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("==================== WARUNG SAGALAYA ====================");
        System.out.println("=========================================================");
        System.out.println("\nNo.\t\tNama Barang \t\t\t\t\t\tHarga");
        System.out.println("1.\t\tAyam Geprek\t\t\t\t\t\t\tRp.\t27.000");
        System.out.println("2.\t\tNasi Goreng\t\t\t\t\t\t\tRp.\t45.000");
        System.out.println("3.\t\tMie Pangsit + Jus\t\t\t\t\tRp.\t35.000");
        System.out.println("4.\t\tNasi Timbel Komplit + Teh Hangat\tRp.\t50.000");
        System.out.println("5.\t\tSeblak Campur + Jus\t\t\t\t\tRp.\t18.000");
        System.out.println("6.\t\tBaso Tahu + Teh Es\t\t\t\t\tRp.\t25.000");
        System.out.println("=========================================================");
        System.out.print("Masukkan Pilihan Anda (1-6) : ");
        pilihan = input.nextInt();
        if(pilihan == 1){
            harga = 27000;
            System.out.println("\nAyam Geprek" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 2){
            harga = 45000;
            System.out.println("Nasi Goreng" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 3){
            harga = 35000;
            System.out.println("Mie Pangsit + Jus" +
                    "\nHarga : Rp. " + harga);
        }else if(pilihan == 4){
            harga = 50000;
            System.out.println("Nasi Timbel Komplit + Teh Hangat" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 5){
            harga = 18000;
            System.out.println("Seblak Campur + Jus" +
                    "\nharga : Rp. " + harga);
        }else if(pilihan == 6){
            harga = 25000;
            System.out.println("Baso Tahu + Teh Es" +
                    "\nharga : Rp. " + harga);
        }else{
            System.out.println("Kode Yang Anda Masukkan Tidak Ada");
            return;
        }
        System.out.print("Jumlah Porsi : ");
        jumlah_porsi = input.nextInt();
        total = harga * jumlah_porsi;
        if (total >= 100000){
            diskon=total*10/100;
            total_diskon=total-diskon;
            System.out.println("Anda harus membayar : Rp. " + total);
            System.out.print("Bayar : Rp. ");
            bayar = input.nextInt();
            kembalian= (bayar-total_diskon);
            System.out.println("Diskon 10% : Rp. " +diskon);
            System.out.println("Kembaliannya : Rp. " +kembalian);
            System.out.println("Terimakasih, selamat berbelanja kembali");
            return;
        } else
            System.out.println("Anda harus membayar : Rp. " + total);
        System.out.print("Bayar : Rp. ");
        bayar = input.nextInt();
        totall = (bayar - total);
        System.out.println("Kembaliannya : Rp. " +totall);
        System.out.println("Terimakasih, selamat berbelanja kembali");
        return;
    }
}
