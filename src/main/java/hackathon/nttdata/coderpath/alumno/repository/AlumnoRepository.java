package hackathon.nttdata.coderpath.alumno.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import hackathon.nttdata.coderpath.alumno.documents.Alumno;

import reactor.core.publisher.Mono;

@Repository
public interface AlumnoRepository extends ReactiveMongoRepository<Alumno, String> {

	
	  @Query("{ 'id' : ?0 }")
	    Mono<Alumno> findById(String id);
	
}
