package syonet.com.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import syonet.com.entity.Revista;

@ApplicationScoped
public class RevistaRepository implements IRevistaRepository,PanacheRepositoryBase<Revista, Integer>{

    @Override
    @Transactional
    public void saveRevista(Revista revista) {
        this.persist(revista);
    }

    @Override
    public void updateRevista(Revista revista) {
        this.findByIdOptional(revista.getId()).ifPresent(persistedRevista -> {
            persistedRevista.setArtigos(revista.getArtigos());
            persistedRevista.setNumeroEdicao(revista.getNumeroEdicao());
            persistedRevista.setEditora(revista.getEditora());
            persistedRevista.setDataPublicacao(revista.getDataPublicacao());
            this.persist(persistedRevista);
        });
    }

    @Override
    public Revista getRevistaByTitulo(String titulo) {
        return this.find("titulo",titulo).firstResult();
    }

    @Override
    public Revista getRevistaBygenero(String genero) {
        return this.find( "genero",genero ).firstResult();
    }

    @Override
    public Revista getRevistaBySobrenome(String sobrenome) {
        return this.find("sobrenome", sobrenome).firstResult();
    }

    @Override
    public void deleteRevista(Revista revista) {
        this.findByIdOptional(revista.getId()).ifPresent(persistedRevista -> {
            this.delete(persistedRevista);
        });
    }
    
}
