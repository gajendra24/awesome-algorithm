//Time-complexity:O(n^2),Auxiliary-space:O(1)
import java.util.*;

public class bubble{
	public static void main(String[] args){
		int[] array={7,8,9,6,5,4,0};
		boolean flag=false;
		for(int i=0;i<array.length;i++){
			for(int j=1;j<array.length-i;j++){
				if(array[j-1]<array[j]){
					int temp;
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					//flag=true;
				}
	
			}
		}
		
		for(int i=0;i<array.length;i++)
		//if(flag==false)
		System.out.println(array[i]);
	}
}