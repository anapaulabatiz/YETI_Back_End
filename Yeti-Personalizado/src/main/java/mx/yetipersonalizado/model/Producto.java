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
	
	public Producto(String nombre, String descripcion, String imagen, String categoria, int precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.categoria = categoria;
		total++;
		id=Producto.total;
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
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", categoria="
				+ categoria + ", precio=" + precio + ", id=" + id + "]";
	} // toString

	} // class Producto