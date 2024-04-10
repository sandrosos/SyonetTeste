package syonet.com.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="livro")
public class Livro {
    
    @Id
    @Column(name = "id")
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column
    private String titulo;

    @Column
    private String genero;

    @OneToMany
    private List<Autor> autores;

    @Column
    private String editora;

    @Column
    private Date dataPublicacao;

    public Livro() {};

    public Livro(String titulo, List<Autor> autores, String editora, Date dataPublicacao) {
        super();
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    
}
