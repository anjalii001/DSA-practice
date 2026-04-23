import java.util.*;

public class Recursion_Keypad_Codes {
static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		String [] arr= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
		ArrayList<String> ll=new ArrayList<>();
		print(N,arr,"",ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		System.out.println(c);
	}

	private static void print(String n, String[] arr, String ans,ArrayList<String> ll) {
		// TODO Auto-generated method stub
		if(n.length()==0) {
			ll.add(ans);
			c++;
			return;
		}
		char ch=n.charAt(0);
		String str=arr[ch-48];
		for (int i = 0; i < str.length(); i++) {
			print(n.substring(1) ,arr, ans+str.charAt(i),ll);
		}
	}

}
