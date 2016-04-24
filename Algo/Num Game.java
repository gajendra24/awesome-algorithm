import java.util.*;

class NumGame{
	int count;
	int var;
	NumGame(){
	count=0;
	var=0;
	}
	public int getCount(){
	return this.count;
	}
	public int getVar(){
	return this.var;
	}
	public void setCount(int count){
	this.count=count;
	}
	public void setVar(int var){
	this.var=var;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		NumGame ng=new NumGame();
		System.out.println("Enter array Size");
		int N=sc.nextInt();
		if(N<10000){
		Integer[] array=new Integer[N];
		for(int i=0;i<N;i++){
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
	
		int tempCount=1;
		int i=1;
		
		while(i<N){
			if(array[i-1]==array[i]){
				tempCount=tempCount+1;
			}
			else if(ng.getCount()<tempCount){
				ng.setCount(tempCount);
				ng.setVar(array[i-1]);
				tempCount=1;
			}
			i++;
		}
		System.out.println(ng.getVar()+" "+ng.getCount());
	}else{
		System.out.println("Please check the Number.It should be less than 10000");
	}
	}
}