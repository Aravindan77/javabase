package sample;



public class rev {

    // Reverses a single word
    String reverse(String st) {
        String revs = "";
        char[] word = st.toCharArray();
        for (int i = word.length - 1; i >= 0; i--) {
            revs += word[i];
        }
        return revs;
    }

    // Reverses each word in the sentence
    String spi(String st) {
        String res = "";
        String[] arr = st.split(" ");
        for (String c : arr) {
            res = res + reverse(c) + " ";
        }
        return res.trim();
    }

    // Reverses only the last word of the sentence
    String las(String st) {
        int lastSpace = st.lastIndexOf(' ');
        if (lastSpace == -1) {
            return reverse(st); // Only one word
        }

        String firstPart = st.substring(0, lastSpace + 1); // include space
        String lastWord = st.substring(lastSpace + 1);
        return firstPart + reverse(lastWord);
    }

    public static void main(String[] args) {
        String st = "Java is a good programming language";
        rev r = new rev();

        System.out.println("Reversed entire sentence: ");
        System.out.println(r.reverse(st));

        System.out.println("Reversed each word in sentence: ");
        System.out.println(r.spi(st));

        System.out.println("Reversed only last word in sentence: ");
        System.out.println(r.las(st));
    }
}
