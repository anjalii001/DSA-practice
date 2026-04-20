import java.util.Scanner;

public class playing_with_good_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(length_good_string(str));
	}
	public static int length_good_string(String str) {
		int ans=0,c=0;
		for (int i = 0; i <str.length(); i++) {
			char ch=str.charAt(i);
			if(isvowels(ch)) {
				c++;
			}
			else {
				ans=Math.max(ans, c);
				c=0;
			}
		}
		ans=Math.max(ans, c);
		return ans;
	}
	public static boolean isvowels(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
			return true;
		}
		return false;
	}

}
