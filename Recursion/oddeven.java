
import java.util.*;

public class Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> ll=new ArrayList<>();
		print(N,N,0,ll);
		for (int i = ll.size()-1; i >=0; i--) {
			System.out.println(ll.get(i));
		}
	}

	private static void print(int N,int idx,int ans,ArrayList<Integer> ll) {
		// TODO Auto-generated method stub
		if(idx==0) {
			return;
		}
		if(idx%2!=0) {
			System.out.println(idx);
		}
		
		if(idx%2==0) {
			ll.add(idx);
		}
		print(N, idx-1, ans,ll);
	}

}
