/**
 * 
 */
package br.com.fityou.database.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fityou.database.domain.Workout;
import br.com.fityou.database.projections.WorkoutCompleteProjection;

/**
 * @author fpach
 *
 */
@RepositoryRestResource(collectionResourceRel = "workout", path = "workouts", excerptProjection = WorkoutCompleteProjection.class)
public interface WorkoutRepository extends PagingAndSortingRepository<Workout, Long> {

}
