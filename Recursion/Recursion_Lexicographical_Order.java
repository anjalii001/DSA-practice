import java.util.*;

public class Recursion_Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		lexico_num(0, N);
	}
	public static void lexico_num(int curr_val,int N) {
		if(curr_val>N) {
			return;
		}
		if(curr_val<=N) {
			System.out.print(curr_val+" ");
		}
		int i=0;
		 if(curr_val==0) {
			 i=1;
		 }
		 for (; i <=9; i++) {
			lexico_num(curr_val*10+i, N);
		}
	}

}
