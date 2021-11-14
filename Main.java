package ObjektAuto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Oh hi Mark");
		
		Motor dieselMotor = new Motor("1.9 TDI", EPalivo.NAFTA, 5.1);
		Vozidlo mojeAuto = new Vozidlo("Octavia", dieselMotor);
		System.out.println("Moje auto je: " + mojeAuto);
		
		System.out.println("Stav nadrze: " + mojeAuto.getNadrz() + " L");
		
		double doplnenoO = mojeAuto.doplnNadrz(10);
		System.out.println("Doplneno o: " + doplnenoO + " L");
		System.out.println("Stav nadrze: " + mojeAuto.getNadrz() + " L");
		
		doplnenoO = mojeAuto.doplnNadrz(60);
		System.out.println("Doplneno o: " + doplnenoO + " L");
		System.out.println("Stav nadrze: " + mojeAuto.getNadrz() + " L");
		
		System.out.println();
		double najezd = mojeAuto.jedem(125);
		System.out.println("Ujeto : " + najezd + " Km");
		System.out.println("Spotreba auta : " + mojeAuto.getSpotreba() + " L / 100Km");
		System.out.println("Stav nadrze: " + mojeAuto.getNadrz() + " L");
		
		Motor benzinMotor = new Motor("LS4", EPalivo.BENZIN, 12);
		mojeAuto.engineSwap(benzinMotor);
		mojeAuto.doplnNadrz(60);
		
		System.out.println();
		System.out.println();
		najezd = mojeAuto.jedem(125);
		System.out.println("Ujeto : " + najezd + " Km");
		System.out.println("Spotreba auta : " + mojeAuto.getSpotreba() + " L / 100Km");
		System.out.println("Stav nadrze: " + mojeAuto.getNadrz() + " L");
	
	}

}
