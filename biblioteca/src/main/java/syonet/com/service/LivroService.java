package syonet.com.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import syonet.com.entity.Livro;
import syonet.com.repository.ILivroRepository;

@ApplicationScoped
public class LivroService {

    @Inject
    ILivroRepository livroRepository;

    public void saveLivro(Livro livro) {
        this.livroRepository.saveLivro(livro);
    }

    public void updateLivro(Livro livro) {
        this.livroRepository.updateLivro(livro);
    }

    public void deleteLivro(Livro livro) {
        this.livroRepository.deleteLivro(livro);
    }

    public Livro getLivroByTitulo( String titulo ) {
		return this.livroRepository.getLivroByTitulo(titulo);
	}

    public Livro getLivroByGenero( String genero ) {
		return this.livroRepository.getLivroByGenero(genero);
	}
    /* 
    public Livro getLivroBySobrenome( Autor autor ) {
		return this.livroRepository.getLivroBySobrenome(autor);
	}
    */
}
