package syonet.com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "artigo")
public class Artigo {
    
    @Id
    @Column
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column
    private String titulo;

    @Column
    private String textoPublicacao;

    @OneToMany
    private List<Autor> autores;

    public Artigo() {};

    public Artigo(String titulo, String textoPublicacao, List<Autor> autores) {
        super();
        this.titulo = titulo;
        this.textoPublicacao = textoPublicacao;
        this.autores = autores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    
}
