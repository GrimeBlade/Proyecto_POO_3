package logica;
public class Usuario {
	private int numId;
	private int	dinero;
	private int	empresa;
	private String nombre;
	private String apellido;
		public Usuario(int numId, int dinero, int empresa, String nombre, String apellido) {
			this.numId=numId;
			this.dinero=dinero;
			this.empresa=empresa;
			this.nombre=nombre;
			this.apellido=apellido;
		}
		public int getNumId() {
			return numId;
		}
		public void setNumId(int numId) {
			this.numId = numId;
		}
		public int getDinero() {
			return dinero;
		}
		public void setDinero(int dinero) {
			this.dinero = dinero;
		}
		public int isEmpresa() {
			return empresa;
		}
		public void setEmpresa(int empresa) {
			this.empresa = empresa;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
}
