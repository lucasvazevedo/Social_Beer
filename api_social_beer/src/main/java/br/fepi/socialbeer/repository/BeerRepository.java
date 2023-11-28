package br.fepi.socialbeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.socialbeer.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long>{

}
