package br.com.fityou.database.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import br.com.fityou.database.domain.Exercise;
import br.com.fityou.database.domain.WorkoutItem;

@Projection(name = "workoutItemWithExerciseDetail", types = { WorkoutItem.class, Exercise.class })
public interface WorkoutItemWithExerciseDetail {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.exercise}")
    Exercise getExercise();

    String getRepetitions();

    Integer getSeries();

    String getComments();
}
