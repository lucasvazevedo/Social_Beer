package br.fepi.socialbeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.socialbeer.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
