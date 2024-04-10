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
@Table (name = "revista")
public class Revista {
    
    @Id
    @Column
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column
    private Integer numeroEdicao;

    @Column
    private String editora;

    @Column
    private Date dataPublicacao;

    @OneToMany 
    private List<Artigo> artigos;

    public Revista() {};

    public Revista(Integer numeroEdicao, String editora, Date dataPublicacao, List<Artigo> artigos) {
        super();
        this.numeroEdicao = numeroEdicao;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.artigos = artigos;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(Integer numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    
}
