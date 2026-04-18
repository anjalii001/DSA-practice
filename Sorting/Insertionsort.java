public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,9,5,4,6,7};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			insert_last_element(arr,i);
		}
	}
	
	public static void insert_last_element(int[] arr,int i) {
		int item=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>item) {
			arr[j+1]=arr[j];
			arr[j]=item;
			j--;
			
		}
	}

}
