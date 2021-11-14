package ObjektAuto;

public class Motor {
	
	/**
	 * Vychozi spotreba vozidla l/100km
	 */
	private static final double VYCHOZI_SPOTREBA = 8;
	
	private String jmeno;
	
	private EPalivo palivo;
	
	/**
	 * Spotreba vozidla l/100km
	 */
	private double spotreba = VYCHOZI_SPOTREBA;
	
	Motor(String jmeno, EPalivo typPaliva, double spotreba){
		this.jmeno = jmeno;
		this.palivo = typPaliva;
		this.spotreba = spotreba;
	}
	
	Motor(String jmeno, EPalivo typPaliva){
		this(jmeno, typPaliva, VYCHOZI_SPOTREBA);
	}
	
	public String getJmeno() {
		return jmeno;
	}
	
	public EPalivo getPalivo() {
		return palivo;
	}
	
	public double getSpotreba() {
		return spotreba;
	}

}
