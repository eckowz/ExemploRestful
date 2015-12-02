/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessao;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import model.Produto;

/**
 *
 * @author 631120345
 */
@Stateless
public class RepositorioProdutos {

    private List<Produto> listaProdutos;
    
    public RepositorioProdutos(){
        listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Arroz", 3.50));
        listaProdutos.add(new Produto("Feijao", 5.70));
    }
    
    public void adicionar(Produto p){
        listaProdutos.add(p);
    }
    
    public List<Produto> getProdutos(){
        return(listaProdutos);
    }
    
        
}

