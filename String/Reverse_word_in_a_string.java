public class reverse_words_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   the     sky    is blue   ";
		s=s.trim();
		String [] arr=s.split(" +");
		String ans="";
		for (int i = arr.length-1; i >=0; i--) {
			ans=ans+arr[i]+" ";
		}
		System.out.println(ans.trim());

	}

}
