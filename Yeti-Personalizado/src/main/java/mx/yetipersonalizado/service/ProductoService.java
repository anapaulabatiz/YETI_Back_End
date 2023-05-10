package mx.yetipersonalizado.service;

import java.util.ArrayList;
import mx.yetipersonalizado.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductoService {
	
	private final ArrayList<Producto> lista = new ArrayList<>();
	@Autowired
	public ProductoService() {
		
		lista.add(new Producto("CUADERNO PROFESIONAL NORMA FERRARI (RAYA, 120 H.)",
				"Doble espiral reforzado / Pastas semirrígidas","norma2.jpg", "Cuadernos", 219));
		lista.add(new Producto("Plumas Bic Cristal Intenso Fashion",
				"Plumas Bic Cristal Intenso Fashion / Punto extra grueso / Tinta colores surtidos",
				"bic1.jpg", "Plumas", 46));
		lista.add(new Producto("Plumas Bic Cristal Intenso",
				" Plumas Bic Cristal Intenso / Punto extra grueso / Tinta negra roja azul / 3 piezas",
				"bic2.jpg", "Plumas", 27));
		
	} // constructor
	
	public ArrayList<Producto> getAllProductos(){
		return lista;
	} // getAllProductos

	public Producto getProducto(Integer id) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd = producto;
			}//if
		} // forEach
		return tmpProd;
	} // getProducto

	public Producto deleteProducto(Integer id) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				tmpProd = lista.remove(lista.indexOf(producto));
				break;
			}//if
		} // forEach
		return tmpProd;
	} // deleteProducto

	public Producto addProducto(Producto producto) {
		lista.add(producto);
		return producto;
	} // addProducto

	public Producto updateProducto(Integer id, String nombre, String descripcion, String imagen, String categoria, Integer precio) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getId()==id) {
				if (nombre!=null) producto.setNombre(nombre);
				if (descripcion!=null) producto.setDescripcion(descripcion);
				if (imagen!=null) producto.setImagen(imagen);
				if (categoria!=null) producto.setCategoria(categoria);
				if (precio!=null) producto.setPrecio(precio.intValue());
				tmpProd = producto;
				break;
			}//if
		} // forEach
		return tmpProd;
	} //updateProducto
	
} // class ProductoService