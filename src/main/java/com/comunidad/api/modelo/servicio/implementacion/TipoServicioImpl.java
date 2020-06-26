package com.comunidad.api.modelo.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comunidad.api.modelo.dao.interfaz.ITipoDao;
import com.comunidad.api.modelo.entidad.Tipo;
import com.comunidad.api.modelo.servicio.interfaz.IServicio;

@Service("TipoServicioImpl")
public class TipoServicioImpl implements IServicio<Tipo, Long> {

	@Autowired
	private ITipoDao tipoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo> findAll() {
		return (List<Tipo>) this.tipoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Tipo t) {
		this.tipoDao.save(t);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipo findById(Long id) {
		return this.tipoDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		this.tipoDao.deleteById(id);
	}

}
