import java.util.*;

class candy{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N");
		int N=sc.nextInt();
		System.out.println("Enter the C");
		int c=sc.nextInt();
		int countCandyWant=0;
		Integer[] candyWant=new Integer[N];
		for(int i=0;i<N;i++){
			candyWant[i]=sc.nextInt();
			countCandyWant=countCandyWant+candyWant[i];
		}
		if(countCandyWant<=c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}