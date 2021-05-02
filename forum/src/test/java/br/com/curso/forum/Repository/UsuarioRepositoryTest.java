package br.com.curso.forum.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.curso.forum.modelo.Usuario;

@DataJpaTest
class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository repository;
	
	@Test
	void buscarUmUsuarioPeloEmail() {
		
		Optional<Usuario> usuario = repository.findByEmail("aluno@email.com");
		assertTrue(usuario.isPresent());
		assertEquals("aluno@email.com", usuario.get().getEmail());
	}
	
	@Test
	public void NaoCarregarUmUsuarioInvalido() {
		
		Optional<Usuario> usuario = repository.findByEmail("invalido@email.com");
		assertTrue(usuario.isEmpty());
		
	}

}
