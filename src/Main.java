import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Poderia importar o Scanner para não deixar a frase de input estática.

        //Input Desafio: “Banco Pan, um banco completo com soluções inteligentes”
        List<String> challengePhrase = List.of("Banco Pan, um banco completo com soluções inteligentes");

        String result = FindTheLongestWord(challengePhrase);

        System.out.println(result);
    }

    public static String FindTheLongestWord(List<String> phrase) {
        String longestWord = phrase.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        return "A palavra mais longa é \"" + longestWord + "\" com " + longestWord.length() + " letras.";
    }

}