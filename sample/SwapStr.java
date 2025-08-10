package sample;

public class SwapStr {
public static void main(String[] args) {
	String str="ARAvind";
	String res="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>=65 && ch<=90) {
			ch=(char)(ch+32);
		}
		else if(ch>97 && ch<=122) {
			ch=(char)(ch-32);
		}
	}
	res=res+ch;
	System.out.println();
}
}
