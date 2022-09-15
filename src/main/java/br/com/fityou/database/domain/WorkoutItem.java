/**
 * 
 */
package br.com.fityou.database.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author fpach
 * An {@link Exercise} with repetitions, series and comments definition
 */
@Entity(name = "workoutItem")
public class WorkoutItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5442836839803278472L;

	@Id
	@SequenceGenerator(name = "pk_workoutItem", sequenceName = "pk_workoutItem_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_workoutItem")
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Exercise exercise;
	
	@Column(nullable = false)
	private Integer repetitions;
	
	@Column(nullable = false)
	private Integer series;
	
	@Column(nullable = false)
	private String comments;
	
	@ManyToMany(mappedBy = "workoutItems")
	private List<Workout> workouts;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the exercise
	 */
	public Exercise getExercise() {
		return exercise;
	}

	/**
	 * @param exercise the exercise to set
	 */
	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	/**
	 * @return the repetitions
	 */
	public Integer getRepetitions() {
		return repetitions;
	}

	/**
	 * @param repetitions the repetitions to set
	 */
	public void setRepetitions(Integer repetitions) {
		this.repetitions = repetitions;
	}

	/**
	 * @return the series
	 */
	public Integer getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(Integer series) {
		this.series = series;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the workouts
	 */
	public List<Workout> getWorkouts() {
		return workouts;
	}

	/**
	 * @param workouts the workouts to set
	 */
	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}
}
