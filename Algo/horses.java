import java.util.*;
import java.io.*;
public class horses{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		int N=sc.nextInt();
		
		if(N<2){
			System.out.println("N should be greater than or equal to 2.");
			System.exit(0);
		}
		else{
		Integer[] S=new Integer[N];
		for(int i=0;i<N;i++){
			S[i]=sc.nextInt();
		}
		Arrays.sort(S);
		int minDiff=S[1]-S[0];
		for(int j=2;j<N;j++){
			minDiff=Math.min(minDiff,S[j]-S[j-1]);
		}
		System.out.println(minDiff);
	}
	}
}