package Praktikum4;
import java.util.Scanner;
public class TestTabungan {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int saldo, tariktunai;
	
	System.out.println("Masukan Saldo : ");
	saldo = input.nextInt();
	Tabungan atm = new Tabungan(200000);
	System.out.println("Saldo Anda : "+atm.saldo);
	
	System.out.println("Masukan nominal tarik tunai : ");
	tariktunai = input.nextInt();
	atm.ambilUang(tariktunai);
	System.out.println("Jumlah saldo yang diambil : "+tariktunai);
	
	System.out.println("Saldo saat ini  : "+atm.saldo);
	
	}


}