public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {8 ,-8, 9 ,-9, 10, -11, 12};
		System.out.println(subarray_sum(arr));
	}
	public static int subarray_sum(int []arr) {
		int ans =Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
	        sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		
		}
		return ans;
	} 

}
