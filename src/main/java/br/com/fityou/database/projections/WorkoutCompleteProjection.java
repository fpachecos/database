package br.com.fityou.database.projections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import br.com.fityou.database.domain.Workout;

@Projection(name = "workoutCompleteProjection", types = { Workout.class, WorkoutItemWithExerciseDetail.class })
public interface WorkoutCompleteProjection {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.workoutItems}")
    List<WorkoutItemWithExerciseDetail> getWorkoutItems();

    String getName();

    String getRestTime();

}
