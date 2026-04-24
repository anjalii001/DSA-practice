public class Recursion_Subsequences {
static ArrayList<String> ll=new ArrayList<>();
static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String ques=sc.next();
		print(ques,"");
		for (String s : ll) {
            System.out.print(s + " ");
        }
		System.out.println("\n"+c);
	}

	private static void print(String ques,String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			ll.add(ans);
			c++;
			return;
		}
		char ch=ques.charAt(0);
		print(ques.substring(1),ans+ch);
		print(ques.substring(1), ans);
	}

}
