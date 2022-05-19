package br.com.curso.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
}
