package sample;

public class StngBasic {
public static void main(String[] args) {
	String name="Aravind";
	String res="";
	for(int i=name.length()-1;i<0;i--) {
		char ch=name.charAt(i);
		res=res+ch;
	}
	System.out.println(res);
}
}
