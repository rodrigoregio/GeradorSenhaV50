package top.rregio.GeraSenhaV50.logica;

/**
 * Classe para alteração do texto digitado.
 * 
 * @author Rodrigo Régio de Araújo
 * @version 05/02/2020
 */
public class AlteraTexto{
    /**
     * Metodo para deixar minusculo todo o texto digitado.
     * @param texto String - e o texto a ser minusculo.
     * @return novoTexto String - e o texto ja transformado em somente letras minusculas.
     */
    public String minusculo(String texto){
        return texto.toLowerCase();
    }

    /**
     * Metodo para deixar o texto digitado em maiusculo.
     * @param texto String - e o texto a ser maiusculo
     * @return novoTexto String - e o texto ja transformado em somente letras maiusculas. 
     */
    public String maiusculo(String texto){
        return texto.toUpperCase();
    }

    /**
     * Metodo para inverter todo o texto
     * @param texto String - é o texto a ser invertido
     * @return notoTexto String - é o texto já invertido
     */
    public String inverte(String texto){
        return new StringBuilder(texto).reverse().toString();
    }

    /**
     * Metodo para inverter a metade do texto um exemplo a String "macacos" alterada com esta função ficaria "cosamac" e caso fosse com texto com o numero de caracteres par exemplo a String "macaco" ficaria "acomac".
     * @param texto String - é o texto a ser alterado
     * @return novoTexto String - é o texto já invertido
     */
    public String inverteMetade(String texto){
        if(texto.length() % 2 == 0){
            String a=texto.substring(0,texto.length()/2);
            String b= texto.substring(texto.length()/2);
            return b+a;
        }else{
            String a=texto.substring(0,(int)Math.floor(texto.length()/2));
            String b=texto.substring((int)Math.floor((texto.length()/2)+1));
            String c=texto.substring((int)Math.ceil(texto.length()/2),
                    (int)Math.ceil((texto.length()/2)+1));
            return b+c+a;
        }
    }

    /**
     * Metodo para alterar um texto qualquer em exemplo "teste" irá retornar "73573"
     * @param texto String - é o texto a ser convertido em texto leet
     * @return sFinal String - texto já convertido em Leet
     */
    public String L33TWithNumbers(String texto){
        char abc[];
        abc = texto.toCharArray();
        MinhaLista a48C=new MinhaLista();

        for(int i=0;i<abc.length;i++){
            switch (abc[i]) {
                case 'O':
                case 'o':
                    a48C.add('0');
                    break;
                case 'L':
                case 'l':
                    a48C.add('1');
                    break;
                case 'E':
                case 'e':
                    a48C.add('3');
                    break;
                case 'A':
                case 'a':
                    a48C.add('4');
                    break;
                case 'S':
                case 's':
                    a48C.add('5');
                    break;
                case 'G':
                    a48C.add('6');
                    break;
                case 'T':
                case 't':
                    a48C.add('7');
                    break;
                case 'B':
                case 'b':
                    a48C.add('8');
                    break;
                case 'g':
                    a48C.add('9');
                    break;
                default:
                    a48C.add(abc[i]);
                    break;
            }
        }
        return a48C.toString();
    }

    /**
     * Metodo para alterar o texto alternando entre maiuscula e minuscula entao seria algo como "AbCdEfG".
     * @param texto String - Texto a ser alterado.
     * @return novoTexto String - Texto ja alterado.
     */
    public String camelTxt(String texto){
        char abc[] = texto.toCharArray();
        MinhaLista AbC = new MinhaLista();
        AbC.add(abc[0]);
        for(int i=1;i<abc.length;i++){
            char teste = (Character) AbC.get(i-1);
            if(Character.isUpperCase(teste)){
                AbC.add(Character.toLowerCase(abc[i]));
            }else{
                AbC.add(Character.toUpperCase(abc[i]));
            }
        }
        String sFinal = AbC.toString();
        return sFinal;
    }
}