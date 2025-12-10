package recursion;

import java.util.*;

public class linearSearch{
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {12,34,56,54,32,657,87,3,23,454};
		try {	
			System.out.print("Enter the number to be searched : ");
			int num = sc.nextInt();
			int index = 0;
			int resIdx = recSearch(arr,index,num);
			if(resIdx != -1) {
				System.out.println("Number is present at index " + resIdx);
			}else {
				System.out.println("Number not found");
			}
		}
		catch(NumberFormatException n) {
			System.out.println("Invalid Input, please enter an integer value.....");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input, please enter an integer value.....");
		}
		finally {	
			sc.close();
		}
	}
	
	//Main Logic
	static int recSearch(int arr[],int index,int num) {
		if(index > arr.length-1 || index < 0) {
			return -1;
		}
		if(arr[index] == num) {
			
			return index;
		}
		return recSearch(arr, index + 1, num);
	}
}
