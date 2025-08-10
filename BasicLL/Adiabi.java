package BasicLL;

public class Adiabi {
    public static void main(String[] args) {
        String[] heart = {
            "  ***     ***  ",
            " *****   ***** ",
            "******* *******",
            "***************",
            " ************* ",
            "  ***********  ",
            "   *********   ",
            "    *******    ",
            "     *****     ",
            "      ***      ",
            "       *       "
        };

        for (int i = 0; i < heart.length; i++) {
            // 
            if (i == 3) {
                System.out.println(" adi love abi ");
            } else {
                System.out.println(heart[i]);
            }
        }
    }
}
