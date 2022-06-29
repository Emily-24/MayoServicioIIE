package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoRepository {
	
	void  guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProducto();
	Productos obtenerProductoId(Integer id); 

}
