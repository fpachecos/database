package br.com.fityou.database.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fityou.database.domain.Exercise;

@RepositoryRestResource(collectionResourceRel = "exercise", path = "exercises")
public interface ExerciseRepository extends PagingAndSortingRepository<Exercise, Long>{

}
