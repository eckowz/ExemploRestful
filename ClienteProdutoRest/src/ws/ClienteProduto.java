/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import model.Produto;

/**
 * Jersey REST client generated for REST resource:ProdutosResource
 * [produtos]<br>
 * USAGE:
 * <pre>
 *        ClienteProduto client = new ClienteProduto();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author 631120345
 */
public class ClienteProduto {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/ProdutoRest/webresources";

    public ClienteProduto() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("produtos");
    }

    public String adicionarProduto(Produto p) throws ClientErrorException {
        return webTarget.request(MediaType.TEXT_PLAIN).
                post(Entity.entity(p, MediaType.APPLICATION_JSON), String.class);
    }

    public <T> T getProdutos(GenericType<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }

}
