package sample;

public class Keybord {
	boolean Keybordverify(String st) {
       String[] str= {"qwertyuiopQWERTYUIOP","asdfghjklaASDFGHJKL","zxcvbnmZXCVBNM"};
       int ind=-1;
       char ch=st.charAt(0);
       
		
		
	}
public static void main(String[] args) {
	Keybord r=new Keybord();
	if(r.Keybordverify("Alask")) {
		System.out.println("same row");
	}
	else {
		System.out.println("Not same row");
	}
	
}
}
