package br.fepi.socialbeer.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbeer.domain.Beer;
import br.fepi.socialbeer.repository.BeerRepository;

@RestController
@RequestMapping(value = "/beer")
public class BeerResources {
	
	@Autowired
	private BeerRepository beerRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Beer> listar() {
		return beerRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Beer beer) {
		beerRepository.save(beer);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Beer buscaId(@PathVariable("id") Long id) {
		return beerRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") Long id) {
		beerRepository.deleteById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Beer beer, @PathVariable("id") Long id) {
		beer.setId(id);
		beerRepository.save(beer);
	}

	@RequestMapping(value = "/{id}/comentarios",method = RequestMethod.POST)
	public void adicionarComentario(@PathVariable ("id")Long beerId,@RequestBody Comentario comentario)
	{
		Beer beer = new Beer();
		beer.setId(beerId);
		comentario.setLivro(beer);
		comentariosRepository.save(comentario);
		
	}
}
