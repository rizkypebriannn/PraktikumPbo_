package Praktikum1;
import java.util.Scanner;

public class Latihan1 {
	public static void main(String args[]) {
//		inisiasi scanner input
		Scanner input = new Scanner(System.in);
		
		String namaDepan, namaBelakang, fullName, npm;
		
		System.out.println("Nama depan: ");
		namaDepan = input.next();
		System.out.println("Nama belakang: ");
		namaBelakang = input.next();
		fullName = namaDepan + " " + namaBelakang;
		
		System.out.println("NPM: ");
		npm = input.next();
		
		System.out.println("\nNama : "+fullName);
		System.out.println("NPM : "+npm +"\n");
		
//		inisiasi variable		
		int angka1, angka2, hasil;
//	
//		user input
		System.out.println("Masukan angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.println("Masukan angka 2 : ");
		angka2 = input.nextInt();
//		perhitungan hasil
		hasil = angka1 + angka2;
//		output
		System.out.println("Hasilnya : "+hasil);
		
	}
}
