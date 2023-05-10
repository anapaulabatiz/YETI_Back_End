package mx.yetipersonalizado.model;

//POJO: Plain Old Java Object

public class Producto {
	private String nombre;
	private String descripcion;
	private String imagen;
	private String categoria;
	private int precio;
	private int id;
	private static int total = 0;
	
	public Producto(String nombre, int precio, String descripcion, String categoria, String imagen) {
		super();
		total++;
		id=Producto.total;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.imagen = imagen;
		
	} // constructor 
	
	public Producto() {
		total++;
		id=Producto.total;
	} // default constructor

	public String getNombre() {
		return nombre;
	} // getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // setNombre

	public String getDescripcion() {
		return descripcion;
	} // getDescripcion

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	} // setDescripcion

	public String getImagen() {
		return imagen;
	} // getImagen

	public void setImagen(String imagen) {
		this.imagen = imagen;
	} // setImagen
	
	public String getCategoria() {
		return categoria;
	} // getCategoria

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	} // setCategoria

	public int getPrecio() {
		return precio;
	} // getPrecio

	public void setPrecio(int precio) {
		this.precio = precio;
	} // setPrecio

	public int getId() {
		return id;
	} // getId

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", imagen=" + imagen + "]";
	} //toString

	
	} // class Producto