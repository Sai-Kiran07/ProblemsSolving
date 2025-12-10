package recursion;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {12,45,67,89,90,132,234,456,577,678};  //increasing order
		System.out.print("Enter the number to be searched : ");
		int num = sc.nextInt();
		
		int mid = (arr.length)/2; //index-based middle element finding
		System.out.println("Middle Element is " + mid);
		int resIdx = binSearch(arr,mid,num);
		if(resIdx != -1) {
			System.out.println("Number found at index " + resIdx);
		}
		else {
			System.out.println("Number not found");
		}
	}
	static int binSearch(int[] arr,int mid,int num) {
		if(mid > (arr.length - 1) || mid < 0) {
			return -1;
		}
		if(arr[mid] == num) {
			return mid;
		}
		else if (arr[mid] > num) {
			 return binSearch(arr,mid - 1,num);
		}
		else if (arr[mid] < num) {
			return binSearch(arr,mid - 1,num);
		}
		return -1;
	}
}
