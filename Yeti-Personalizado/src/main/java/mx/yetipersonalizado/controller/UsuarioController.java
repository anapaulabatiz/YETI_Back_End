package mx.yetipersonalizado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mx.yetipersonalizado.model.Usuario;
import mx.yetipersonalizado.service.UsuarioService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/usuario/")
public class UsuarioController {
	private final UsuarioService usuarioService;
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	} // constructor
	
	@GetMapping
	public List<Usuario> getAllUsers(){
		return usuarioService.getAllUsuarios();
	} // getAllUsers
	
	@GetMapping (path="{UsuId}")
	public Usuario getUser(@PathVariable("UsuId") Integer id) {
		return usuarioService.getUsuario(id);
	} // getUser
	
	@DeleteMapping (path="{UsuId}")
	public Usuario deleteUser(@PathVariable("UsuId") Integer id) {
		return usuarioService.deleteUsuario(id);
	} // deleteUser
	
	@PostMapping
	public Usuario addUser(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	} // addUser
	
	@PutMapping (path="{UsuId}")
	public Usuario updateUser(@PathVariable("UsuId") Integer id,
			@RequestParam(required = false)String nombre,
			@RequestParam(required = false)String phone,
			@RequestParam(required = false)String mail,
			@RequestParam(required = false)String password) {
		return usuarioService.updateUsuario(id, nombre, phone, mail, password);
	} // updateUser
} // class UsuarioController
