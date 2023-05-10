package mx.yetipersonalizado.model;

//POJO: Plain Old Java Object

public class Usuario {
	private int id;
	private String nombre;
	private String phone;
	private String mail;
	private String password;
	private static int total = 0;
	
	public Usuario(String nombre, String phone, String mail, String password) {
		super();
		id=Usuario.total;
		this.nombre = nombre;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
		total++;
	} // constructor
	
	public Usuario() {
		total++;
		id=Usuario.total;
	} // default constructor

	public String getNombre() {
		return nombre;
	} // getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // setNombre

	public String getPhone() {
		return phone;
	} // getTelefono

	public void setPhone(String phone) {
		this.phone = phone;
	} // setTelefono

	public String getMail() {
		return mail;
	} // getMail

	public void setMail(String mail) {
		this.mail = mail;
	} // setMail

	public String getPassword() {
		return password;
	} // getPassword

	public void setPassword(String password) {
		this.password = password;
	} // setPassword

	public int getId() {
		return id;
	} // getId

	public void setId(int id) {
		this.id = id;
	} // setId

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", phone=" + phone + ", mail=" + mail + ", password="
				+ password + "]";
	}// toString
	
} // class Usuario
