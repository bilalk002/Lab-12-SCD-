//import java.util.Scanner;

public class MaxiMin {
	int findMax(int arr[]) {
		
		int max=0;
		
		for(int num:arr) {
			if (num>max) {
				max=num;
				
			}}
	return max;	
		
	}
	int findMin(int arr[]) {
		int min=Integer.MAX_VALUE;
		for(int num:arr) {
			if (num<min) {
				min=num;
				
			}}
	return min;
		
	}
}
