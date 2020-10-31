package top.rregio.GeraSenhaV50.logica;
import java.util.ArrayList;
/**
 * Classe responsavel somente por alterar a lista de caracteres na classe AlteraTexto no método
 * L33TWithNumbers pois sem isto o texto exibido ficaria algo como "[abcdefg]", ou seja, entre colchetes
 * 
 * @author Rodrigo Régio de Araújo
 * @version 05/02/2020
 * @param <E>
 */
public class MinhaLista <E> extends ArrayList<E>{
    /**
     * Metodo sobrescrito (da classe ArrayList) para transformaçao de um ArrayList para uma String.
     * 
     * @return s.toString() - retorna a stringbuffer da string sem os colchetes, sem isso o texto ficaria entre colchetes "[abc]"
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(this.size());
        this.forEach((E e) -> {
            StringBuilder append = s.append(e.toString());
        });
        return s.toString();
    }
}