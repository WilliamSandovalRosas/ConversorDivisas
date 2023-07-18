package Controller;

public class ControladorConversor {
	
	String monedaLocal, monedaCambio;
	double cantMonedaLocal, tasaCambio, divisa;
	
	
	public ControladorConversor(String monedeLocal, String monedaCambio, double cantMonedaLocal, double tasaCambio,
			double divisa) {
		super();
		this.monedaLocal = monedaLocal;
		this.monedaCambio = monedaCambio;
		this.cantMonedaLocal = cantMonedaLocal;
		this.tasaCambio = tasaCambio;
		this.divisa = divisa;
	}
	
	private double Divisa( double cantMonedaLocal,double tasaCambio) {
		divisa = cantMonedaLocal*tasaCambio;
		return divisa;
		
	}
	
	

}
