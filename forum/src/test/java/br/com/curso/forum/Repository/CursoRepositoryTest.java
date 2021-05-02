package br.com.curso.forum.Repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.curso.forum.modelo.Curso;

@DataJpaTest
public class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	@Test
	public void buscarUmCursoPeloNome() {
		
		Curso curso = repository.findByNome("Spring Boot");
		assertNotNull(curso);
		assertEquals("Spring Boot", curso.getNome());
	}
	
	@Test
	public void NaoCarregarUmCursoInvalido() {
		
		Curso curso = repository.findByNome("jpa");
		assertNull(curso);
	}
	
}
