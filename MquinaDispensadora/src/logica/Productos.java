package logica;
public class Productos {
	private int codigo;
	private int precio;
	private int cantidad;
	private String nombre;
		public Productos(int codigo, int precio, int cantidad, String nombre) {
			this.codigo=codigo;
			this.precio=precio;
			this.cantidad=cantidad;
			this.nombre=nombre;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}