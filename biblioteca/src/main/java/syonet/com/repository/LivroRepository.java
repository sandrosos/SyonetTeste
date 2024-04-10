package syonet.com.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import syonet.com.entity.Livro;

@ApplicationScoped
public class LivroRepository implements ILivroRepository,PanacheRepositoryBase<Livro, Integer>{

    @Override
    @Transactional
    public void saveLivro(Livro livro) {
        this.persist(livro);
    }

    @Override
    public void updateLivro(Livro livro) {
        this.findByIdOptional( livro.getId() ).ifPresent( persistedLivro -> {
			persistedLivro.setTitulo(livro.getTitulo());
			persistedLivro.setEditora(livro.getEditora());
			persistedLivro.setAutores(livro.getAutores());
            persistedLivro.setDataPublicacao(livro.getDataPublicacao());
			this.persist(persistedLivro);
        });
    }

    @Override
    public List<Livro> getAllLivros() {
        return this.findAll().list();
    }

    @Override
    public Livro getLivroByTitulo(String titulo) {
        return this.find( "titulo",titulo ).firstResult();
    }

    @Override
    public Livro getLivroByGenero(String genero) {
        return this.find( "genero",genero ).firstResult();
    }

    /* 
    @Override
    public Livro getLivroBySobrenome(Autor autor) {
        return this.find( "sobrenome",autor.getSobrenome() ).firstResult();
    }*/

    @Override
    public void deleteLivro(Livro livro) {
        this.findByIdOptional( livro.getId() ).ifPresent(persistedLivro -> {
			this.delete(persistedLivro);
		});
    }
    
}
