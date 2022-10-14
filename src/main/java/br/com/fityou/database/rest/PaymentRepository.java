package br.com.fityou.database.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fityou.database.domain.Payment;

@RepositoryRestResource(collectionResourceRel = "payment", path = "payments")
public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {

}
