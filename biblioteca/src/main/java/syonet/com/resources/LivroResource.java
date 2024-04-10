package syonet.com.resources;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import syonet.com.entity.Livro;
import syonet.com.service.LivroService;

@Path("/api/livros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LivroResource {
    @Inject
    LivroService livroService;

    @GET
    @APIResponses({
		@APIResponse( responseCode = "200",
			description = "Retorno com sucesso de um livro buscado por titulo" ),
		@APIResponse( responseCode = "400",
			description = "erro genérico" )})
    @Path("/titulo")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getLivrosByTitulo(@PathParam( value = "titulo") String titulo) {
        Livro livro = this.livroService.getLivroByTitulo(titulo);
        
        return Response.ok(livro).build();
    }

    @GET
    @Path("/genero")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getLivroByGenero(@PathParam( value = "genero") String genero) {
        Livro livro = this.livroService.getLivroByGenero(genero);

        return Response.ok(livro).build();
    }

    /* 
    @GET
    @Path("/sobrenome")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getlivroBySobrenome(@PathParam( value = "sobrenome") Autor autor) {
        Livro livro = this.livroService.getLivroBySobrenome(autor);

        return Response.ok(livro).build();
    }
    */

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Response savelivro( @Valid Livro livro ) {
        this.livroService.saveLivro(livro);
        return Response.accepted().build();
    }

    @PATCH
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Response updateLivro(Livro livro) {
        this.livroService.updateLivro(livro);
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteLivro (Livro livro) {
        this.livroService.deleteLivro(livro);
        return Response.accepted().build();
    }
}
