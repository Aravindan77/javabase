package sample;



public class SwapStr {
    public static void main(String[] args) {
        String str = "ARAvind";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // Convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert to uppercase
            }

            res = res + ch; // Append to result inside the loop
        }

        System.out.println("Swapped case: " + res);
    }
}
