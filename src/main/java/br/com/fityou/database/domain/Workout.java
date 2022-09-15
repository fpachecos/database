package br.com.fityou.database.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author fpach
 * A group of {@link WorkoutItem}
 */
@Entity(name = "workout")
public class Workout implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5442836839803278472L;

	@Id
	@SequenceGenerator(name = "pk_workout", sequenceName = "pk_workout_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_workout")
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name = "workout_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "workoutItem_id", referencedColumnName = "id"))
	List<WorkoutItem> workoutItems;

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
	 * @return the workoutItems
	 */
	public List<WorkoutItem> getWorkoutItems() {
		return workoutItems;
	}

	/**
	 * @param workoutItems the workoutItems to set
	 */
	public void setWorkoutItems(List<WorkoutItem> workoutItems) {
		this.workoutItems = workoutItems;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
