//Time-complexity:O(n^2),Auxiliary-space:O(1),Not stable

import java.util.*;

public class selection{
	public static void main(String[] args){
		int[] array={7,8,9,6,5,4,0};
		
		
		for(int i=0;i<array.length-1;i++){
		int index=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]>array[index]){
					index=j;
					int temp= array[index];
					array[index]=array[i];
					array[i]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+",");
	}
}
