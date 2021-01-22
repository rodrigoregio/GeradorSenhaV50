package top.rregio.GeraSenhaV50.logica;

/**
 * Classe para alteração do texto digitado.
 *
 * @author Rodrigo Régio de Araújo
 * @version 05/02/2020
 */
public class AlteraTexto {

    public String minusculo(String texto) {
        return texto.toLowerCase();
    }

    public String maiusculo(String texto) {
        return texto.toUpperCase();
    }

    public String inverterTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public String inverterMetadeDoTexto(String texto) {
        if (texto.length() % 2 == 0) {
            String a = texto.substring(0, texto.length() / 2);
            String b = texto.substring(texto.length() / 2);
            return b + a;
        } else {
            String a = texto.substring(0, (int) Math.floor(texto.length() / 2));
            String b = texto.substring((int) Math.floor((texto.length() / 2) + 1));
            String c = texto.substring((int) Math.ceil(texto.length() / 2),
                    (int) Math.ceil((texto.length() / 2) + 1));
            return b + c + a;
        }

    }

    public String substituirLetrasPorNumeros(String texto) {
        char textoSeparadoPorLetra[] = texto.toCharArray();
        MinhaLista nomeParcial = new MinhaLista();

        for (int i = 0; i < textoSeparadoPorLetra.length; i++) {

            char letra = textoSeparadoPorLetra[i] == 'G' ? 'G' : Character.toLowerCase(textoSeparadoPorLetra[i]);

            switch (letra) {
                case 'o':
                    nomeParcial.add('0');
                    break;
                case 'l':
                    nomeParcial.add('1');
                    break;
                case 'e':
                    nomeParcial.add('3');
                    break;
                case 'a':
                    nomeParcial.add('4');
                    break;
                case 's':
                    nomeParcial.add('5');
                    break;
                case 'G':
                    nomeParcial.add('6');
                    break;
                case 't':
                    nomeParcial.add('7');
                    break;
                case 'b':
                    nomeParcial.add('8');
                    break;
                case 'g':
                    nomeParcial.add('9');
                    break;
                default:
                    nomeParcial.add(textoSeparadoPorLetra[i]);
                    break;
            }
        }

        return nomeParcial.toString();
    }

    public String converterParaCamelCase(String nomeInformado) {//Dado este nome
        char nomeParcial[] = nomeInformado.toCharArray();

        String texto = "";
        texto += nomeParcial[0];

        for (int i = 1; i < nomeParcial.length; i++) {
            if (i % 2 != 0) {
                texto += Character.toLowerCase(nomeParcial[i]);
            } else {
                texto += Character.toUpperCase(nomeParcial[i]);
            }
            
        }

        return texto;
    }
}
