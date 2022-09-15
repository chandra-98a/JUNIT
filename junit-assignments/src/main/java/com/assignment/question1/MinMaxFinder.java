package com.assignment.question1;

public class MinMaxFinder {


public static int[] findMinMax(int A[],int n) {
	MinMaxFinder minMaxFinder=new MinMaxFinder();
	int i;
	int max=A[1];
	int min=A[0];
	
		if(A[0]>A[1])
		{
			max=A[0];
			min=A[1];
	}else {

		max=A[1];
		min=A[0];
	}
		for(i=2;i<n;i++) {
			if(A[i]>max) {
			max=A[i];
			}else if(A[i]<min) {
				min=A[i];
			}
		}
		int[] A1= {min,max};
	return A1;
}


}
