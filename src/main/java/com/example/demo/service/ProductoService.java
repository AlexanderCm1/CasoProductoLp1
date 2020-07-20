package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductoService {
	List<Producto> readAll();
	int create(Producto pro);
	int edit(Producto pro);
	int delete(int id);
	Producto read(int id);
}
