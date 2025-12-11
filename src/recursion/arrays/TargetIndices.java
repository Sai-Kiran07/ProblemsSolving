package recursion.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 
Problem Title:

Find All Occurrences of a Target Index (Using Recursion)

Description:

Given an array of integers nums and an integer target, return all indices where target occurs in the array.
You must solve this using recursion.
Do not use loops in the main logic.

Constraints:

1 ≤ nums.length ≤ 10^4

-10^4 ≤ nums[i] ≤ 10^4

-10^4 ≤ target ≤ 10^4

Time complexity is not evaluated strictly for recursion problems.

Input Format:

An integer array nums

An integer target

Output Format:

Return a list of integers representing all indices where nums[i] == target.

If the target does not occur, return an empty list.

Examples:
Example 1
Input:
nums = [1, 2, 3, 2, 4, 2]
target = 2
Output:[1, 3, 5]

Example 2
Input:
nums = [5, 5, 5]
target = 5
Output:[0, 1, 2]

Example 3
Input:
nums = [1, 3, 5, 7]
target = 2
Output:[]

 */
public class TargetIndices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {23,45,32,1,2,76,89,55,343,332,454,65,55,323,453,22,55};
		System.out.print("Enter the target : ");
		int target = sc.nextInt();
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		int index = 0;
		List<Integer> indices = findIndices(arr,target,index,indexList);
		System.out.println(indices);
	}
	static List<Integer> findIndices(int arr[],int target,int index,ArrayList<Integer> indexList){
		if(index > (arr.length - 1)){
			return indexList;
		}
		if(arr[index] == target) {
			indexList.add(index);
		}
		return findIndices(arr,target,index + 1,indexList);
	}
}
