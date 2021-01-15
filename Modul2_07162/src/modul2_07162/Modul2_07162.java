package modul2_07162;
import Entity07162.*;
import Model07162.*;
import java.util.Scanner;

public class Modul2_07162 {
    private static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
       int loop=0;
        System.out.println("Selamat Datang Di Warung Makanan !!");
        System.out.println("_____________________________________________________");
        int pil;
        do{
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("___________________________________________________");
            switch(pil){
                case 1: login();
                    break;
                case 2 :daftar();
                    break;
            }System.out.println("___________________________________________________");
        }while (pil!=3);
    }
    static void daftar(){
        System.out.print("Input nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
}
    static void login(){
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
    }
}