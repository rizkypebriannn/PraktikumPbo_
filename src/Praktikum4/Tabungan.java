package Praktikum4;

public class Tabungan {
	public int saldo;
	public Tabungan(int initsaldo) {
		saldo = initsaldo;
	}
	public boolean ambilUang(int jumlah) {
		if(saldo - jumlah < 0 ) {
			return false;
		}else {
		saldo = saldo - jumlah;
		return true; 
	}
}		
	public int simpanUang(int jumlah) {
		return saldo = saldo + jumlah;
	}
	public int getSaldo() {
		return saldo;
	}
}
