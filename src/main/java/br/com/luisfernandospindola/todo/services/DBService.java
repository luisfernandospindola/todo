package br.com.luisfernandospindola.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luisfernandospindola.todo.domain.Todo;
import br.com.luisfernandospindola.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		Todo t1 = new Todo();
		t1.setId(null);
		t1.setTitulo("Estudar");
		t1.setDescricao("Estudar Spring Boot 2 e Angular 11");
		t1.setDataParaFinalizar(sdf.parse("25/03/2022"));
		t1.setFinalizado(false);
		
		Todo t2 = new Todo();
		t2.setId(null);
		t2.setTitulo("Treinar");
		t2.setDescricao("Rest API");
		t2.setDataParaFinalizar(sdf.parse("25/03/2022"));
		t2.setFinalizado(true);
		
		Todo t3 = new Todo();
		t3.setId(null);
		t3.setTitulo("Aplicar");
		t3.setDescricao("Angular 11");
		t3.setDataParaFinalizar(sdf.parse("25/03/2022"));
		t3.setFinalizado(false);
		
		Todo t4 = new Todo();
		t4.setId(null);
		t4.setTitulo("Usar");
		t4.setDescricao("Java");
		t4.setDataParaFinalizar(sdf.parse("25/03/2022"));
		t4.setFinalizado(true);
		
		Todo t5 = new Todo();
		t5.setId(null);
		t5.setTitulo("BRQ");
		t5.setDescricao("Técnico de Sistemas JR");
		t5.setDataParaFinalizar(sdf.parse("25/03/2022"));
		t5.setFinalizado(true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));
	}

}
