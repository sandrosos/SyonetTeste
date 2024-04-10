package syonet.com.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import syonet.com.entity.Revista;
import syonet.com.repository.IRevistaRepository;

@ApplicationScoped
public class RevistaService {

    @Inject
    IRevistaRepository revistaRepository;

    public void saveRevista(Revista revista) {
        this.revistaRepository.saveRevista(revista);
    }

    public void updateRevista(Revista revista) {
        this.revistaRepository.updateRevista(revista);
    }

    public void deleteRevista(Revista revista) {
        this.revistaRepository.deleteRevista(revista);
    }

    public Revista getRevistaByTitulo(String titulo) {
        return this.revistaRepository.getRevistaByTitulo(titulo);
    }

    public Revista getRevistaByGenero(String genero) {
        return this.revistaRepository.getRevistaBygenero(genero);
    }

    public Revista getRevistaBySobrenome(String sobrenome) {
        return this.revistaRepository.getRevistaBySobrenome(sobrenome);
    }
}
