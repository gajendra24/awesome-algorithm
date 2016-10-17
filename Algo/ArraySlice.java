import java.util.*;

public class ArraySlice{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++){
			array[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int p=0; p <= N-1; p++){
		int sum = 0;
			for(int q=p; q <= N-1; q++){
			
				sum = sum+array[q];
				
				if(sum == 0){
					
					count++;
				}
			}
		}
		System.out.print(count);
	}
}