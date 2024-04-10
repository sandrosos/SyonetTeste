package syonet.com.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import syonet.com.entity.Livro;

@ApplicationScoped
public interface ILivroRepository {
    
    void saveLivro(Livro livro);

    void updateLivro( Livro livro );
	
	List < Livro > getAllLivros();
	
	Livro getLivroByTitulo ( String titulo );

    Livro getLivroByGenero (String genero);

    /*Livro getLivroBySobrenome (Autor autor);*/
	
	void deleteLivro ( Livro livro );

}
