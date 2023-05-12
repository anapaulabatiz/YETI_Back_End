package mx.yetipersonalizado.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mx.yetipersonalizado.model.ChangePassword;
import mx.yetipersonalizado.model.Usuario;
import mx.yetipersonalizado.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

@Service

public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		
		this.usuarioRepository = usuarioRepository;
	} // constructor
	
	public List<Usuario> getAllUsuarios(){
		return usuarioRepository.findAll();
	} // getAllUsuarios

	public Usuario getUsuario(Long id) {

		return usuarioRepository.findById(id).orElseThrow(
			() -> new IllegalArgumentException("Usuario con id " +     " no existe"));
	} // getUsuario 

	public Usuario deleteUsuario(Long id) {
		Usuario userTmp = null;
		if(usuarioRepository.existsById(id))
		{
			userTmp= usuarioRepository.findById(id).get();
			usuarioRepository.deleteById(id);
		}
		return userTmp;
	} // deleteUsuario

	public Usuario addUsuario(Usuario usuario) {
		Usuario tmp = null;
		if(usuarioRepository.findByMail(usuario.getMail()).isEmpty()) 
		{
			tmp = usuarioRepository.save(usuario);
		}
		return tmp;
	} // addUsuario

	public Usuario updateUsuario(Long id, ChangePassword changePassword) {
		Usuario tmp=null;
		if (usuarioRepository.existsById(id)) { 
			if ((changePassword.getPassword() != null) &&
			(changePassword.getNewPassword() != null)) {
				tmp = usuarioRepository.findById(id).get();
				if(tmp.getPassword().equals(changePassword.getPassword())){ //equals para comparar datos que no son primitivos
					tmp.setPassword(changePassword.getNewPassword());
					usuarioRepository.save(tmp);
				} else {
					tmp = null;
				}//if equals
			}//!null
		} else {
			System.out.println("Update - El usuario con id " + id + " no existe");
		}//else
		return tmp;

	} //updateUsuario
} // class UsuarioService
