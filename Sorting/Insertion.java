import java.util.*;

public class insertion{
	public static void main(String[] args){
		int[] array={7,8,9,6,5,4,0};
		for(int i=1;i<array.length;i++){
			int temp=array[i];
			int j;
			for( j=i-1;j>=0 && temp<array[i];j--){
				array[j+1]=array[j];	
			}
			array[j+1]=temp;
		}
		for(int i=0;i<array.length;i++)
		System.out.print(array[i]+",");
	}
}