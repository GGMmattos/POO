import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        String string1 = "Olá";
        System.out.println(string1);

        String string2 = new String("Olá");
        System.out.println(string2);

        String string3;
        string3 = "Olá";
        System.out.println(string3);

        String string4 = new String(string1);
        System.out.println(string4);

        char[] cadeia = {'O','l','á'};
        String string5 = new String(cadeia);
        System.out.println(string5);

        String string6 = new String(cadeia,0,3);
        System.out.println(string6);

        byte[] ascii = {79, 108, 97};

        String string7 = new String(ascii);
        System.out.println(string7);

        for(int i=65; i <= 90; i++) {
            System.out.printf("%c ", i);
        }
        System.out.println();

        for(int i=97; i <= 122; i++) {
            System.out.printf("%c ", i);
        }


        String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
                + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
                + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
                + "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
                + "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla "
                + "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
                + "culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(concatenacao);

        String concatenacao2 = "Olá ";
        concatenacao2 += "tudo ";
        concatenacao2 += "bem ";
        concatenacao2 += "com ";
        concatenacao2 += "você ? ";

        System.out.println(concatenacao2);


        String palavra = new String("Soletrando");
        for (int i=0; i<palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        char[] meiaPalavra = new char[4];
        palavra.getChars(0, 4, meiaPalavra, 0);
        System.out.println(meiaPalavra);

        byte[] palavraBytes =  new byte[palavra.length()];
        palavra.getBytes(0, palavra.length(), palavraBytes, 0);
        System.out.println(Arrays.toString(palavraBytes));
        String palavra2 = new String(palavraBytes);
        System.out.println(palavra2);

        char[] palavraArray = palavra.toCharArray();
        System.out.println(palavraArray);

        String teste1 = "teste";
        String teste2 = "TESTE";
        String teste3 = new String(teste1);

        System.out.println(teste1 == teste3);

        System.out.println(teste1.equals(teste2));
        System.out.println(teste1.equalsIgnoreCase(teste2));

        String teste4 = new String("Testado");
        String teste5 = "ando";
        if (teste4.regionMatches(4, teste5, 0, 4)){
            System.out.println("Verbo no gerúndio");
        }



    }

}