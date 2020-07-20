package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductoDao {
	List<Producto> readAll();
	int create(Producto pro);
	int edit(Producto pro);
	int delete(int id);
	Producto read(int id);
}
