package com.cibertec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.models.Solicitud;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Long> {

}
