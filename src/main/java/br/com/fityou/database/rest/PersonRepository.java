/**
 * 
 */
package br.com.fityou.database.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fityou.database.domain.Person;

/**
 * @author fpach
 *
 */
@RepositoryRestResource(collectionResourceRel = "person", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
	
	
}