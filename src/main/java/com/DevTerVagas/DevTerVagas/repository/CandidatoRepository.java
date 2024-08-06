package com.DevTerVagas.DevTerVagas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DevTerVagas.DevTerVagas.models.Candidato;
import com.DevTerVagas.DevTerVagas.models.Vaga;


public interface CandidatoRepository extends CrudRepository<Candidato, String> {
	
	Iterable<Candidato>findByVaga(Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
    

}
