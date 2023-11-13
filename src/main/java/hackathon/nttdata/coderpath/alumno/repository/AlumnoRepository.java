package hackathon.nttdata.coderpath.alumno.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import hackathon.nttdata.coderpath.alumno.documents.Alumno;

@Repository
public interface AlumnoRepository extends ReactiveMongoRepository<Alumno, String> {

}
