package Coll;
import java.util.HashMap;
public class Hashmap {
	public static void main(String[] args) {
		HashMap <Character,Integer> al=new HashMap<>();
		String st="Aravind";
		char ch=0;
		for (int i = 0; i < st.length(); i++) {
		     ch = st.charAt(i);
		    ch=Character.toLowerCase(ch);
		    if(al.containsKey(ch)) {
		    	al.put(ch, al.get(ch)+1);
		    }
		    else {
		    	al.put(ch, 1);
		    }
		}
		
 
		 System.out.println(al.get(ch));
	 }
 }
	


