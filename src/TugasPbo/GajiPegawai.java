package TugasPbo;
import java.util.Scanner;

public class GajiPegawai {
	public static void main(String args []) {
		String nama, alamat;
		int uangTunjangan=3000000, uangTransport=250000, gajiPokok=5050000, totalGaji;
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("masukan Nama : ");
		nama = input.next();
		System.out.print("masukan Alamat anda : ");
		alamat = input.next();
	
		totalGaji = gajiPokok + uangTunjangan + uangTransport;
		
		System.out.println("Nama :"+nama);
		System.out.println("uang Tunjangan = Rp :"+uangTunjangan);
		System.out.println("uang Transport:"+uangTransport);
		System.out.println("gaji Pokok :"+gajiPokok);
		System.out.println("total Gaji :"+totalGaji);
	
	}

}
