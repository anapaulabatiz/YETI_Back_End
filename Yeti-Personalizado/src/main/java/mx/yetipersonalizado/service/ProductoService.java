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
		
		lista.add(new Producto("Apilable 26 oz", 1300,
				"Una taza grande para grandes tragos: perfecta para tés, agua fría o batidos XL. Cabe en la mayoría de los portavasos.",
			    "Termos", "./src/catalogo/Termos/APILABLE26oz.png"));
		
		lista.add(new Producto("Hotshot 12 oz", 1250,
				"Nuestra botella clásica combinada con la tapa 360º HotShot™, es a prueba de fugas. Lleva tu café mientras viajas. Cabe en la mayoría de los portavasos.",
			    "Termos", "/src/catalogo/Termos/HOTSHOT 12oz.png"));
		
		lista.add(new Producto("Lowball 10 oz", 1030,
				"Vaso pequeño, apilable, clásico y versátil para tu cóctel en el campamento.",
			    "Termos", "/src/catalogo/Termos/LOWBALL.png"));
		
		lista.add(new Producto("Mug 10 oz", 1100, "Taza apilable para almacenamiento. Es compacta y aislada, ideal para bebidas calientes.",
				"Termos","/src/catalogo/Termos/MUG 10oz.png"));
		
		lista.add(new Producto("Mug 14 oz", 1220, "Una taza versátil que es lo suficientemente grande como para servir como tazón de campamento.",
				"Termos","/src/catalogo/Termos/MUG 14oz.png"));
		
		
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