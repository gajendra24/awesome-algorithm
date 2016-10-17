import java.util.*;
class LinkChain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextInt();
		}
		int x = A[1]+A[3];
		for(int p = 1;p < N-3;p++){
			for(int q = p+2;q < N-1;q++){
				System.out.println("("+ p +","+ q +")");
				x= Math.min(A[p]+A[q],x);
			}
		}
		System.out.println(x);
	}
}