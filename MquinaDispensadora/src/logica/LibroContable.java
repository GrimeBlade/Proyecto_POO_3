package logica;

public class LibroContable {
	int ventas=0; 
	int ganancias; 
	
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		if (ventas ==1) {
			this.ventas= this.ventas+1; 
		}

	}
	public int getGanancias() {
		return ganancias;
	}
	public void setGanancias(int ganancias) {
		
		this.ganancias = this.ganancias + ganancias;
	
	}

	

}
