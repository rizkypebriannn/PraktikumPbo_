package TugasPbo;

public class Kubus {
	
	private int Sisi;
	
	private int massa;
	
	public void setMassa (int massa) {
		this.massa = massa;
	}
	public int getMassa () {
		return this.massa;
	}
	public void setSisi (int Sisi) {
		this.Sisi = Sisi;
	}
	public int getSisi () {
		return this.Sisi;
	}
	public int hitungVolume(int parSisi) {
		this.Sisi = parSisi;
		return parSisi * parSisi * parSisi;
	}
	public int hitungMassaJenis(int parMassa, int volume) {
		volume = hitungVolume(this.getSisi ());
		parMassa = this.getMassa  () / volume;
		return parMassa;
	}
	
	 public static void main(String[] args) {
	        Kubus kubus = new Kubus();
	        kubus.setSisi(5);
	        kubus.setMassa(250);
	        System.out.println("====== Massa Jenis Kubus ======");
	        System.out.println("Sisi : " + kubus.getSisi());
	        System.out.println("Massa : " + kubus.getMassa() +
	                "\n\n");

	        System.out.println("====== Hasil Perhitungan ======");
	        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
	        System.out.println("Massa jenis : " + kubus.hitungMassaJenis(kubus.hitungVolume(kubus.getSisi()), kubus.getMassa()));
	    }
	}

