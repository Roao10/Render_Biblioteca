package com.cibertec.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.models.Solicitud;
import com.cibertec.services.SolicitudService;

@RestController
@RequestMapping("/prestamo")
public class SolicitudController {
     
	@Autowired
	private SolicitudService solicitudService;
	
	@GetMapping("/listar")
	public ArrayList<Solicitud> getSolicitudes(){
		return this.solicitudService.getSolicitudes();	
		}
	
	@PostMapping("/registrar")
	public Solicitud saveSolicitud(@RequestBody Solicitud solicitud) {
		return this.solicitudService.saveSolicitud(solicitud);
	}
	
	@GetMapping(path ="/buscar/{id}")
	public Optional<Solicitud> getSolicitudById(@PathVariable  Long id){
		return this.solicitudService.getById(id);
	}
	//acutalizar
	@PutMapping(path ="/actualizar/{id}")
	public Solicitud updateSolicitudById(@RequestBody Solicitud request,@PathVariable("id") Long id) {
		return this.solicitudService.updateById(request, id);
	}
	
	@DeleteMapping(path ="/eliminar/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		boolean ok = this.solicitudService.deletesolicitud(id);
		
		if(ok) {
			return "El prestamo con Id " + id +" se a eliminado!!!!";
		}else {
			return "Error, al eliminar el registro con id"+id+"!!!!!!";
		}
	}
}














