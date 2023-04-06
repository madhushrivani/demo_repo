package basic0farray;

public class SelectionSort {
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void SelectionSort(int[] arr) {
		int n= arr.length;
		
		for (int i=0; i<n-1; i++) {
			int min= Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j=i; j<n; j++) {
				if(arr[j]< min) {
					min= arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i]= temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {8,1,3,8,6,9,4};
      SelectionSort(arr);
      printArray(arr);
	}

}
