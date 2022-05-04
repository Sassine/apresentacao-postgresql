package dev.sassine.api.postgresqlaws.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/v1/apresentacao")
public class ApresentacaoController {
	
	
	@GetMapping
	public Map<String, List<Object>> findAll() {
		return Map.of("content", null);
	}
	
	@PostMapping
	@ResponseStatus(CREATED)
	public void create(@RequestBody Object dto) throws JsonProcessingException {

	}
	
	@GetMapping("/{id}")
	public EntityModel<Map<String, Object>> find(@PathVariable  Long id) {
		return EntityModel.of(Map.of("content", Optional.of(null)
				.orElseThrow(()-> new ResponseStatusException(NO_CONTENT,"no content found for this request"))))
				.add(linkTo(methodOn(this.getClass()).findAll()).withRel("todas-apresentacoes"));
	}
	
	
}
