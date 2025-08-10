package sample;

public class rev {
	//for reversing the word
	String reverse(String st) {
		String revs="";
		char[] word=st.toCharArray();
		for(int i=word.length-1;i>=0;i--) {
			revs+=word[i];
		}
		return revs;
	}
	//for splitting the words
	String spi(String st) {
		String res="";
		String[] arr=st.split(" ");
		for(String c : arr) {
			res=res+reverse(c)+" ";
		}
		return res.trim();	
	}
	
	String las(String st) {
		char ch;
		char[] word=st.toCharArray();
		int i;
		for(i=word.length-1;i>=0;i--) {
			ch=word[i];
			if()
			}
		}
	}
	
	
public static void main(String[] args) {
	String st="Java is a good programming language";
	rev r=new rev();
	r.spi(st);
	  System.out.println(r.reverse(st));
	  System.out.println(r.spi(st));
} 
}
