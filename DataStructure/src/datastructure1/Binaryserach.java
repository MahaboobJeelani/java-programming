package datastructure1;

public class Binaryserach {
	public static void main(String[] args) {
		int[] arr = {18, 5, 6, 3, 11, 4};
		for(int i = 0; i<arr.length;i++) {
			int mini = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[mini]>arr[j]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i]= temp;
		}
	}
}
