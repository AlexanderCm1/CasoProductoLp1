package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductoDao;
import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoDao;

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}

	@Override
	public int create(Producto pro) {
		// TODO Auto-generated method stub
		return productoDao.create(pro);
	}

	@Override
	public int edit(Producto pro) {
		// TODO Auto-generated method stub
		return productoDao.edit(pro);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

}
