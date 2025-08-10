package DSA;

public class ArrListDr {
	public static void main(String[] args) {
		ArrList r=new ArrList();
		r.push("aravind");
		System.out.println((r.peek()==null)?"UnderFlow":r.peek());
	}
}
