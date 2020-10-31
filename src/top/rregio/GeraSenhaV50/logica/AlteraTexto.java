package top.rregio.GeraSenhaV50.logica;

/**
 * Classe para alteração do texto digitado.
 * 
 * @author Rodrigo Régio de Araújo
 * @version 05/02/2020
 */
public class AlteraTexto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String texto;

    /**
     * Construtor para objetos da classe AlteraTexto
     */
    public AlteraTexto()
    {
        // inicializa variáveis de instância
        texto = "";
    }

    /**
     * Metodo para deixar minusculo todo o texto digitado.
     * @param texto String - e o texto a ser minusculo.
     * @return novoTexto String - e o texto ja transformado em somente letras minusculas.
     */
    public String minusculo(String texto){
        String novoTexto = texto.toLowerCase();
        return novoTexto;
    }

    /**
     * Metodo para deixar o texto digitado em maiusculo.
     * @param texto String - e o texto a ser maiusculo
     * @return novoTexto String - e o texto ja transformado em somente letras maiusculas. 
     */
    public String maiusculo(String texto){
        String novoTexto = texto.toUpperCase();
        return novoTexto;
    }

    /**
     * Metodo para inverter todo o texto
     * @param texto String - é o texto a ser invertido
     * @return notoTexto String - é o texto já invertido
     */
    public String inverte(String texto){
        StringBuilder novoTexto = new StringBuilder(texto);
        novoTexto.reverse();
        return novoTexto.toString();
    }

    /**
     * Metodo para inverter a metade do texto um exemplo a String "macacos" alterada com esta função ficaria "cosamac" e caso fosse com texto com o numero de caracteres par exemplo a String "macaco" ficaria "acomac".
     * @param texto String - é o texto a ser alterado
     * @return novoTexto String - é o texto já invertido
     */
    public String inverteMetade(String texto){
        //Pegando o tamanho do texto
        int tam = texto.length();
        String novoTexto;
        novoTexto = "";
        if(tam % 2 == 0){
            String a=texto.substring(0,texto.length()/2);
            String b= texto.substring(texto.length()/2);
            novoTexto = b+a;
        }else{
            String a=texto.substring(0,(int)Math.floor(texto.length()/2));
            String b=texto.substring((int)Math.floor((texto.length()/2)+1));
            String c=texto.substring((int)Math.ceil(texto.length()/2),
                    (int)Math.ceil((texto.length()/2)+1));
            novoTexto = b+c+a;
        }
        return novoTexto;
    }

    /**
     * Metodo para alterar um texto qualquer em exemplo "teste" irá retornar "73573"
     * @param texto String - é o texto a ser convertido em texto leet
     * @return sFinal String - texto já convertido em Leet
     */
    public String L33TWithNumbers(String texto){
        char abc[];
        abc = texto.toCharArray();//comando que torna o texto digitado em um array de caracteres
        MinhaLista a48C=new MinhaLista();

        for(int i=0;i<abc.length;i++){ //faça enquanto i for menor que o tamanho do array, incrementando 1 ao i
            switch (abc[i]) {
                case 'O':
                case 'o':
                    //Se abc[i] for igual a 'O' ou 'o' o arraylist a48C recebe o caractere '0'
                    a48C.add('0');
                    break;
            //Senão
                case 'L':
                case 'l':
                    //Se abc[i] for igual a 'L' ou 'l' o arraylist a48C recebe o caractere '1'
                    a48C.add('1');
                    break;
            //Senão
                case 'E':
                case 'e':
                    //Se abc[i] for igual a 'E' ou 'e' o arraylist a48C recebe o caractere '3'
                    a48C.add('3');
                    break;
            //Senão
                case 'A':
                case 'a':
                    //Se abc[i] for igual a 'A' ou 'a' o arraylist a48C recebe o caractere '4'
                    a48C.add('4');
                    break;
            //Senão
                case 'S':
                case 's':
                    //Se abc[i] for igual a 'S' ou 's' o arraylist a48C recebe o caractere '5'
                    a48C.add('5');
                    break;
            //Senão
                case 'G':
                    //Se abc[i] for igual a 'G' o arraylist a48C recebe o caractere '6'
                    a48C.add('6');
                    break;
            //Senão
                case 'T':
                case 't':
                    //Se abc[i] for igual a 'T' ou 't' o arraylist a48C recebe o caractere '7'
                    a48C.add('7');
                    break;
            //Senão
                case 'B':
                case 'b':
                    //Se abc[i] for igual a 'B' ou 'b' o arraylist a48C recebe o caractere '8'
                    a48C.add('8');
                    break;
            //Senão
                case 'g':
                    //Se abc[i] for igual a 'g' o arraylist a48C recebe o caractere '9'
                    a48C.add('9');
                    break;
                default:
                    //Senão
                    a48C.add(abc[i]);//O arraylist a48C recebe o mesmo caractere do array abc[i]
                    break;
            }
        }
        String sFinal = a48C.toString();//ao final a String sFinal recebe o arraylist a48C transformado em String
        return sFinal;//retorna sFinal
    }

    /**
     * Metodo para alterar o texto alternando entre maiuscula e minuscula entao seria algo como "AbCdEfG".
     * @param texto String - Texto a ser alterado.
     * @return novoTexto String - Texto ja alterado.
     */
    public String camelTxt(String texto){//Dado este nome
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