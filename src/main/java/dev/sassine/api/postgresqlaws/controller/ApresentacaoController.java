package dev.sassine.api.postgresqlaws.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dev.sassine.api.postgresqlaws.domain.PalestraEntity;
import dev.sassine.api.postgresqlaws.dto.PalestraDTO;
import dev.sassine.api.postgresqlaws.repository.PalestraEntityRepository;

@RestController
@RequestMapping(value = "/v1/apresentacao")
public class ApresentacaoController {
	
	@Autowired
	private PalestraEntityRepository repo;
	
	@GetMapping
	public Map<String, List<PalestraEntity>> findAll() {
		return Map.of("content", repo.findAll());
	}
	
	@PostMapping
	@ResponseStatus(CREATED)
	public void create(@RequestBody PalestraDTO dto) {
		repo.save(dto.toEntity());
	}
	
	@GetMapping("/{id}")
	public EntityModel<Map<String, PalestraEntity>> find(@PathVariable  Long id) {
		return EntityModel.of(Map.of("content", repo.findById(id.intValue())
				.orElseThrow(()-> new ResponseStatusException(NO_CONTENT,"no content found for this request"))))
				.add(linkTo(methodOn(this.getClass()).findAll()).withRel("todas-apresentacoes"));
	}
	
	
}
