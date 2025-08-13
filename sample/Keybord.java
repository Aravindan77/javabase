package sample;

public class Keybord {
    boolean Keybordverify(String st) {
        String[] rows = {
            "qwertyuiopQWERTYUIOP",
            "asdfghjklASDFGHJKL",
            "zxcvbnmZXCVBNM"
        };

        int rowIndex = -1;

        for (int i = 0; i < rows.length; i++) {
            if (rows[i].indexOf(st.charAt(0)) != -1) {
                rowIndex = i;
                break;
            }
        }

        if (rowIndex == -1) return false;

        for (int i = 1; i < st.length(); i++) {
            if (rows[rowIndex].indexOf(st.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Keybord r = new Keybord();
        if (r.Keybordverify("Alaska")) {
            System.out.println("Same row");
        } else {
            System.out.println("Not same row");
        }
    }
}
