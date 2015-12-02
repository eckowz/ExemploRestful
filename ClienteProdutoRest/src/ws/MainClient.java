/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.ws.rs.core.GenericType;
import model.Produto;

/**
 *
 * @author 631120345
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteProduto cliente = new ClienteProduto();
        cliente.adicionarProduto(new Produto("Massa", 4.85));
        
        List<Produto> listaProdutos = cliente.getProdutos(
        new GenericType<List<Produto>>(){});
        for(Produto p: listaProdutos)
            System.out.println(p.getNome()+": "+p.getPreco());
    }
    
}
