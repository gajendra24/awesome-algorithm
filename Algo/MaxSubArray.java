import java.util.*;
class MaxSubArray{
	public static void main(String[] args){
	Integer[] array={-2, -3, 4, -1, -2, 1, 5, -3};
	int min_sum=array[0];
	int max_sum=array[0];
	for(int i=0;i<array.length;i++){
		min_sum=Math.max(array[i],min_sum+array[i]);
		max_sum=Math.max(max_sum,min_sum);
	}
	System.out.println(max_sum);
	}
}