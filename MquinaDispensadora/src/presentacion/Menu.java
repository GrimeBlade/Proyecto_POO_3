package presentacion;
import java.util.Scanner;

import logica.Factura;
import logica.LibroContable;
import logica.Productos;
import logica.Usuario;
public class Menu {
	int iva;
	int valorIva; 
	Productos producto[] = new Productos[100];
	Usuario usuario[] = new Usuario[10];
	LibroContable libro = new LibroContable ();
	Factura fact = new Factura(); 
	 Scanner scan=new Scanner(System.in);
	private int num;
	private int num2;
	public void menu() {
		int opc=0;
		boolean validar=false;
				crearUsuario();
				crearProducto();
				do {
				validar=true;
				System.out.println("--------Bienvenido--------");
				System.out.println("1-Consultar");
				System.out.println("2-Eliminar");
				System.out.println("3-Actualizar");
				System.out.println("4-Comprar");
				System.out.println("5-Salir");	
				System.out.println("¿Que desea hacer?");
				scan = new Scanner(System.in);
				opc=scan.nextInt();
					switch(opc) {
					case 1:
						consultar();
						break;
					case 2:
						eliminar();
						break;
					case 3:
						actualizar();
						break;
					case 4:
						comprar();
						break;
					case 5:
						System.out.println("¡ADIOS!");
						validar=false;
						break;
					default:
						System.out.println("La opcion no existe");
						break;
					}
			}while(validar==true);
		}
	public void crearUsuario() {
		//creo el usuario
		int numId;
		int	dinero;
		int	empresa;
		String nombre;
		String apellido;
			System.out.println("¿Cuantos usuarios desea crear?");
			num2=scan.nextInt();
			for(int i=0;i<num2;i++) {
				System.out.println("Ingrese el número de identificacion");
				numId=scan.nextInt();
				System.out.println("Ingrese el dinero disponible");
				dinero=scan.nextInt();
				System.out.println("¿Es usted empleado de la empresa?/ Si=1, No=2 ");
				empresa=scan.nextInt();
				if(empresa>2||empresa<1) {
					System.out.println("Dato invalido");
					crearUsuario();
				}
				System.out.println("Ingrese su nombre");
				nombre=scan.next();
				System.out.println("Ingrese su apellido");
				apellido=scan.next();
				usuario[i] = new Usuario(numId,dinero,empresa,nombre,apellido);
			}
		}
	public void crearProducto() {
				 //creo un producto nuevo
					int codigo=0;
					int precio=0;
					int cantidad=0;
					String nombre=" ";
					System.out.println("¿Cuantos productos desea crear?");
					num=scan.nextInt();
					for(int i=0;i<num;i++) {
						System.out.println("Ingrese el codigo del producto "+(i+1));
						codigo=scan.nextInt();
						System.out.println("Ingrese el precio del producto "+(i+1));
						precio=scan.nextInt();
						System.out.println("Ingrese la cantidad del producto "+(i+1));
						cantidad=scan.nextInt();
						System.out.println("Ingrese el nombre del producto "+(i+1));
						nombre=scan.next();
						producto[i]=new Productos(codigo,precio,cantidad,nombre);						
						
					}
	}
	public void consultar() {
		int opc=0;
		int num1=0;
		System.out.println("¿Que desea consultar?/ Productos=1 , Usuario=2");
		opc=scan.nextInt();
			switch(opc) {
				case 1:
					for(int i=0;i<num;i++) {
						 System.out.println((i+1)+") "+producto[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					 if(num1<=num&&num1>=0) {
						System.out.println("Nombre: "+producto[num1].getNombre());
						System.out.println("Codigo: "+producto[num1].getCodigo());
						System.out.println("Precio: "+producto[num1].getPrecio());
						System.out.println("Cantidad: "+producto[num1].getCantidad());
						}else {
							System.out.println("Producto no existente");
							consultar();
						}
					break;
				case 2:
					System.out.println("¿Que usuario desea consultar?");
					for(int i=0;i<num2;i++) {
						 System.out.println((i+1)+") "+usuario[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					if(num1<=num2&&num1>=0) {
						System.out.println("Nombre: "+usuario[num1].getNombre());
						System.out.println("Apellido: "+usuario[num1].getApellido());
						System.out.println("Codigo: "+usuario[num1].getNumId());
						System.out.println("Dinero: "+usuario[num1].getDinero());
						}else {
							System.out.println("usuario no existente");
							consultar();
						}
					break;
				default: 
					System.out.println("Opcion no existente");
					consultar();
					break;
			}
	}
	public void eliminar() {
		int opc=0;
		int num1=0;
		System.out.println("¿Que desea eliminar?/ Productos=1 , Usuario=2");
		opc=scan.nextInt();
			switch(opc) {
				case 1:
					System.out.println("¿Que producto desea eliminar?");
					for(int i=0;i<num;i++) {
						 System.out.println((i+1)+") "+producto[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					if(num1<=num&&num1>=0) {
						producto[num1]= new Productos(0,0,0," ");
						}else {
							System.out.println("Producto no existente");
							eliminar();
						}
					break;
				case 2:
					System.out.println("¿Que usuario desea eliminar?");
					for(int i=0;i<num2;i++) {
						 System.out.println((i+1)+") "+usuario[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					if(num1<=num2&&num1>=0) {
						usuario[num1]= new Usuario(0,0,0," "," ");
						}else {
							System.out.println("usuario no existente");
							eliminar();
						}
					break;
				default:
					System.out.println("Opcion no existente");
					eliminar();
					break;
			}
	}
	public void actualizar() {
		int opc;
		int num1;
		System.out.println("¿Que desea actualizar?/ Productos=1 , Usuario=2");
		opc=scan.nextInt();
			switch(opc) {
				case 1:
					int codigo=0;
					int precio=0;
					int cantidad=0;
					String nombre=" ";
					System.out.println("¿Que producto desea actualizar?");
					for(int i=0;i<num;i++) {
						 System.out.println((i+1)+") "+producto[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					 if(num1<=num&&num1>=0) {
						System.out.println("Nombre: ");
						nombre=scan.next();
						System.out.println("Codigo: ");
						codigo=scan.nextInt();
						System.out.println("Precio: ");
						precio=scan.nextInt();
						System.out.println("Cantidad:");
						cantidad=scan.nextInt();
						producto[num1]=new Productos(codigo,precio,cantidad,nombre);
					 }else {
							System.out.println("Producto no existente");
							actualizar();
						}
					break;
				case 2:
					int numId=0;
					int	dinero=0;
					int	empresa=0;
					String nombre1=" ";
					String apellido=" ";
					System.out.println("¿Que usuario desea actualizar?");
					for(int i=0;i<num2;i++) {
						 System.out.println((i+1)+") "+usuario[i].getNombre());
					 }
					num1=scan.nextInt();
					num1=num1-1;
					 if(num1<=num2&&num1>=0) {
						System.out.println("Nombre: ");
						nombre1=scan.next();
						System.out.println("Apellido: ");
						apellido=scan.next();
						System.out.println("Numero de identificacion: ");
						numId=scan.nextInt();
						System.out.println("Dinero:");
						dinero=scan.nextInt();
						System.out.println("Empresa:");
						System.out.println("1 Es usuario");
						System.out.println("2 No es usuario");
						empresa=scan.nextInt();
						if(empresa<1||empresa>2) {
							System.out.println("No valido");
							actualizar();
						}
						usuario[num1]=new Usuario(numId,dinero,empresa,nombre1,apellido);
					 }else {
							System.out.println("Producto no existente");
							actualizar();
						}
					break;
				default:
					System.out.println("Opcion no existente");
					break;
			}
	}
	public void comprar() {
		int num3 ; 
		int num4 ; 
		int dineroRestante =0; 
		int var=0; 
	
		 System.out.println("¿Que desea comprar?");
		 for(int i=0;i<num;i++) {
			 System.out.println((i+1)+") "+producto[i].getNombre());
		 }
		 num3 = scan.nextInt();
		 num3 = num3-1; 
		   System.out.println("Que usuario realizara la compra? ");
			for(int i=0;i<num2;i++) {
				 System.out.println((i+1)+") "+usuario[i].getNombre());
			 }
			num4 = scan.nextInt();
		   num4 = num4-1; 
		   if(num3<=num&&num3>=0&&num4<=num2&&num4>=0) {
			   if(usuario[num4].getDinero()>producto[num3].getPrecio()){
				   if(producto[num3].getCantidad()==0) {
					   System.out.println("La cantidad del producto es 0");
					   comprar();
				   }else {
					   if(usuario[num4].isEmpresa()==1) {
						   System.out.println("Usted es empleado de la empresa tiene descuento del 10%");
						 int  precio = producto[num3].getPrecio();
						   fact.setPrecio(precio);
						   int descuento =( producto[num3].getPrecio()/100)*10; 
						   int valorTotalParcial = producto[num3].getPrecio()- descuento; 
						   iva = valorTotalParcial*19/100; 
						   fact.setIva(iva);
						  valorIva = valorTotalParcial + iva ; 
						   dineroRestante = usuario[num4].getDinero()-valorIva; 
						   fact.setCambio(dineroRestante);
						   usuario[num4].setDinero(dineroRestante);
						   var =1; 
						   libro.setVentas(var);
						   libro.setGanancias(producto[num3].getPrecio());
						   fact.factura();
						   
					   }else {
						   System.out.println("Usted no es empleado de la empresa ");
						   int  precio = producto[num3].getPrecio();
						   fact.setPrecio(precio);
						   int valorTotalParcial = producto[num3].getPrecio(); 
						   iva = valorTotalParcial*19/100; 
						   fact.setIva(iva);
						  valorIva = valorTotalParcial + iva ; 
						   dineroRestante = usuario[num4].getDinero()-valorIva; 
						   fact.setCambio(dineroRestante);
						   usuario[num4].setDinero(dineroRestante);
						   var =1; 
						   libro.setVentas(var);
						   libro.setGanancias(producto[num3].getPrecio());
						   fact.factura();
					   }
					   
				   }			
			   }else {
				   System.out.println("El dinero es insuficiente");
				   comprar();
			   }
			   
		   }else {
			   System.out.println("Producto o usuario no existente");
				comprar();
		   }
		   
	}
}
