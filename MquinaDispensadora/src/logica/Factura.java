package logica;


public class Factura {
	int iva; 
	int cambio ; 
	int precio;

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public void setCambio(int cambio ) {
		this.cambio = cambio; 
	}
	public void factura(){
		System.out.println("La factura es: ");
		System.out.println("El precio del producto es: "+this.precio);
		System.out.println("El iva es de : "+this.iva);
		System.out.println("Su cambio es : "+ this.cambio);
	}
	 

}
