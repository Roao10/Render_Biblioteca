package com.cibertec.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.models.Solicitud;
import com.cibertec.repositories.ISolicitudRepository;

@Service
public class SolicitudService {
	
	@Autowired
	ISolicitudRepository solicitudRepository;
	
	public ArrayList<Solicitud> getSolicitudes(){
		return (ArrayList<Solicitud>) solicitudRepository.findAll();
	}
	
	public Solicitud saveSolicitud(Solicitud solicitud) {
		return solicitudRepository.save(solicitud);
	}
	
	public Optional<Solicitud>getById(Long id){
		return solicitudRepository.findById(id);
	}
	
	public Solicitud updateById(Solicitud request, Long id){
		   Solicitud solicitud = solicitudRepository.findById(id).get();
		
		solicitud.setNombreLector(request.getNombreLector());
		solicitud.setNombreLibro(request.getNombreLibro());
		solicitud.setFecha(request.getFecha());
		solicitud.setEstado(request.getEstado());
		
		//posible solucion para que se guarde al actualizar
		solicitudRepository.save(solicitud);
		return solicitud;
		
	}
	
	public Boolean deletesolicitud (Long id) {
		try {
			 solicitudRepository.deleteById(id);
			 return true;
		}catch(Exception e) {
			return false;
		}
	}
   
}

















