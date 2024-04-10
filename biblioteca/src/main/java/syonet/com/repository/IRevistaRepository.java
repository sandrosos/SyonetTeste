package syonet.com.repository;

import jakarta.enterprise.context.ApplicationScoped;
import syonet.com.entity.Revista;

@ApplicationScoped
public interface IRevistaRepository {
 
    void saveRevista(Revista revista);
    
    void updateRevista(Revista revista);

    void deleteRevista(Revista revista);

    Revista getRevistaByTitulo (String titulo);

    Revista getRevistaBygenero (String genero);

    Revista getRevistaBySobrenome(String sobrenome);
    
    /* Criação de uma nova revista, alteração das informações da revista, exclusão e a
    listagem com os filtros de título, gênero literário e sobrenome do autor ;
    */
}
