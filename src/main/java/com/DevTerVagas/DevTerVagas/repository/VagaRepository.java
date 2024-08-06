package com.DevTerVagas.DevTerVagas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DevTerVagas.DevTerVagas.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, String> {
	Vaga findByCodigo(long codigo);
	List<Vaga> findByNome(String nome);


}
