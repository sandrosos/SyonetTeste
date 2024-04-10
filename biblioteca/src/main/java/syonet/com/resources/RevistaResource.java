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
import syonet.com.entity.Revista;
import syonet.com.service.RevistaService;

@Path("/api/revistas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RevistaResource {
    @Inject
    RevistaService revistaService;

    @GET
    @APIResponses({
		@APIResponse( responseCode = "200",
			description = "Retorno com sucesso de uma revista buscada por titulo" ),
		@APIResponse( responseCode = "400",
			description = "erro genérico" )})
    @Path("/titulo")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getRevistaByTitulo(@PathParam( value = "titulo") String titulo) {
        Revista revista = this.revistaService.getRevistaByTitulo(titulo);

        return Response.ok(revista).build();
    }

    @GET
    @Path("/genero")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getRevistaByGenero(@PathParam( value = "genero") String genero) {
        Revista revista = this.revistaService.getRevistaByGenero(genero);

        return Response.ok(revista).build();
    }

    @GET
    @Path("/{sobrenome}")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getRevistaBySobrenome(@PathParam( value = "sobrenome") String sobrenome) {
        Revista revista = this.revistaService.getRevistaBySobrenome(sobrenome);

        return Response.ok(revista).build();
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Response saveRevista(@Valid Revista revista) {
        this.revistaService.saveRevista(revista);
        return Response.accepted().build();
    }

    @PATCH
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Response updateRevista(Revista revista) {
        this.revistaService.updateRevista(revista);
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteRevista (Revista revista) {
        this.revistaService.deleteRevista(revista);
        return Response.accepted().build();
    }
}
