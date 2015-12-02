/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import model.Produto;
import sessao.RepositorioProdutos;

/**
 * REST Web Service
 *
 * @author 631120345
 */
@Path("produtos")
public class ProdutosResource {

    @EJB
    private RepositorioProdutos repositorio;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ProdutosResource
     */
    public ProdutosResource() {
    }

    @GET
    @Produces("application/json")
    public List<Produto> getProdutos() {
        return repositorio.getProdutos();
    }

    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String adicionarProduto(Produto produto) {
        repositorio.adicionar(produto);
        return "OK";
    }



}
