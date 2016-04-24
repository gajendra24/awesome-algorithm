import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
public class PieCooler{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of pie/racks");
		int N=sc.nextInt();
		Integer[] pieWeight= new Integer[N];
		Integer[] rackWeight= new Integer[N];
		int count=0;
		System.out.println("Enter number of pie weights");
		for(int i=0;i<N;i++){
			pieWeight[i]=sc.nextInt();
		}
		System.out.println("Enter number of rack weights");
		for(int i=0;i<N;i++){
			rackWeight[i]=sc.nextInt();
		}
		Arrays.sort(pieWeight, Collections.reverseOrder());
		Arrays.sort(rackWeight, Collections.reverseOrder());
		
		int i=0;
		int j=0;
		while(i<N){
			if(pieWeight[i]<=rackWeight[j]){
				count++;
				i++;
				j++;
			}else{
				i++;
			}
		}
		System.out.println(count);
	}
}