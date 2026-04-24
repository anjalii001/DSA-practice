public class Recursion_twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print(str,0);
		System.out.println(count);
	}
static int  count =0;
	public static void print(String str,int idx) {
		if(idx+2>=str.length()) {
			return;
		}
		if(str.charAt(idx)==str.charAt(idx+2)) {
			count++;
		}
	    print(str,idx+1);
	}
	

}
