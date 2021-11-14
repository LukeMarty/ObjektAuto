package ObjektAuto;

public class Vozidlo {
	
	/**
	 * Limit nadrze v litrech
	 */
	private final double NADRZ_LIMIT = 60;
	

	/**
	 * Udava motor pouzity v aute
	 */
	private Motor nasMotor;
	
	/**
	 * Aktualni stav nadrze v aute
	 */
	private double nadrz = 0.0;
	
	/**
	 * Jmeno auta
	 */
	private String jmeno;
	
	
	Vozidlo(String jmeno, Motor motor){
		this.jmeno = jmeno;
		this.nasMotor = motor;
	}
	
	public void engineSwap(Motor novyMotor) {
		this.nasMotor = novyMotor;
	}
	
	public double jedem(double kmKUjeti) {
		double kmNaPalivo = (kmKUjeti/100)*this.nasMotor.getSpotreba();
		
		if(this.nadrz - kmNaPalivo > 0) {
			//Tohle znamena ze to ujedes cele 
			//TLDR: V Nadrzi je dost paliva na celou cestu
			this.nadrz -= kmNaPalivo;
			return kmKUjeti;
		}
		//Tohle se vykoná pokud v nadrzi NENI dost paliva...
		double kmNaNadrzMax = (this.nadrz/this.nasMotor.getSpotreba())*100;
		this.nadrz = 0.0;
		return kmNaNadrzMax;
	}
	
	
	public double doplnNadrz(double oKolik) {
		double soucet = this.nadrz + oKolik;
		
		if(soucet > this.NADRZ_LIMIT) {
			this.nadrz = this.NADRZ_LIMIT;
			return (oKolik - (soucet - this.NADRZ_LIMIT));
		}
		
		this.nadrz += oKolik;
		return oKolik;
	}
	
	
	public String getJmeno() {
		return jmeno;
	}
	
	public double getNadrz() {
		return nadrz;
	}
	
	public double getSpotreba() {
		return this.nasMotor.getSpotreba();
	}
	
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	
	@Override
	public String toString() {
		return "Jmeno tohoto auta je: " + getJmeno();
	}

}
