import java.util.*;

public class nuke{
	int count;
	boolean flag;
	nuke(){
		count=0;
		flag=false;
	}
	public int getCount(){
		return this.count;
	}
	public void setCount(int val){
		this.count=val;
	}
	public boolean getFlag(){
		return this.flag;
	}
	public void setFlag(boolean b){
		this.flag=b;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		nuke[] nk=new nuke[k];
		for(int i=0;i<a;i++){
			int t=0;
			while(nk[t].getCount()==n){
				
			}
		}
	}
	
}