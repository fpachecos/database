/**
 * 
 */
package br.com.fityou.database.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Filipe Pacheco
 * The person who's receive the diet and fitness plan
 */
@Entity(name = "person")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8905716629414073289L;

	@Id
	@SequenceGenerator(name = "pk_person", sequenceName = "pk_person_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_person")
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	private String phoneNumber;
	
	@Column(nullable = false)
	private Boolean acceptRecieveMessages;

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

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the acceptRecieveMessages
	 */
	public Boolean getAcceptRecieveMessages() {
		return acceptRecieveMessages;
	}

	/**
	 * @param acceptRecieveMessages the acceptRecieveMessages to set
	 */
	public void setAcceptRecieveMessages(Boolean acceptRecieveMessages) {
		this.acceptRecieveMessages = acceptRecieveMessages;
	}
}
