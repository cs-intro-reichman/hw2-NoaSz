public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);
        
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // Ajout d'un espace après "a" ou "an"
            String article = (anLetters.indexOf(ch) != -1) ? "an " : "a ";
            System.out.println("Give me " + article + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
        }
    }
}