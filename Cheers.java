public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);
        
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            boolean useAn = anLetters.indexOf(ch) != -1;

            // article + espaces EXACTS comme GitHub le veut
            String article;
            if (useAn) {
                article = "an ";   // un espace après "an"
            } else {
                article = "a  ";   // DEUX espaces après "a"
            }

            System.out.println("Give me " + article + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
        }
    }
}