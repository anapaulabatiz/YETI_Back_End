package mx.yetipersonalizado.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import mx.yetipersonalizado.model.Usuario;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {
	
	private final ArrayList<Usuario> lista = new ArrayList<>();
	@Autowired
	public UsuarioService() {
		
		lista.add(new Usuario("Ana Batiz", "3345937151", "ap.batiz@gmail.com", "Password1"));
		lista.add(new Usuario("Dora Garcia", "333333333", "dorag@gmail.com", "Password2"));
		lista.add(new Usuario("Nicte Cortes", "9999999999", "nictecortes@gmail.com", "Password3"));
		lista.add(new Usuario("Admin", "9999989999", "yetisgneration@gmail.com", "Prueba1."));
		lista.add(new Usuario("Leslie", "9999989009", "leslie.garciardgz@gmail.com", "Password2."));
		lista.add(new Usuario("Gabriela Torres", "3344556677", "gabriela@gmail.com", "Password4."));

	} // constructor
	
	public ArrayList<Usuario> getAllUsuarios(){
		return lista;
	} // getAllUsuarios

	public Usuario getUsuario(Integer id) {
		Usuario tmpUsu = null;
		for (Usuario usuario : lista) {
			if (usuario.getId()==id) {
				tmpUsu = usuario;
			}//if
		} // forEach
		return tmpUsu;
	} // getUsuario

	public Usuario deleteUsuario(Integer id) {
		Usuario tmpUsu = null;
		for (Usuario usuario : lista) {
			if (usuario.getId()==id) {
				tmpUsu = lista.remove(lista.indexOf(usuario));
				break;
			}//if
		} // forEach
		return tmpUsu;
	} // deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		lista.add(usuario);
		return usuario;
	} // addUsuario

	public Usuario updateUsuario(Integer id, String nombre, String phone, String mail, String password) {
		Usuario tmpUsu = null;
		for (Usuario usuario : lista) {
			if (usuario.getId()==id) {
				if (nombre!=null) usuario.setNombre(nombre);
				if (phone!=null) usuario.setPhone(phone);
				if (mail!=null) usuario.setMail(mail);
				if (password!=null) usuario.setPassword(password);
				tmpUsu = usuario;
				break;
			}//if
		} // forEach
		return tmpUsu;
	} //updateUsuario
} // class UsuarioService
