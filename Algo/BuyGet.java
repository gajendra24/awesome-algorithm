import java.util.*;

public class BuyGet{
	int finalCount=0;
	public int getFinalCount(){
		return this.finalCount;
	}
	public void setFinalCount(int val){
		this.finalCount=val;
	}
	public static void main(String[] args){
		BuyGet bg=new BuyGet();
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		String[] jewels=new String[1000];
		for(int i=0;i<testCase;i++){
			jewels[i]=sc.next();
		}
		for(int j=0;j<jewels.length;j++){
			char[] ch=jewels[j].toCharArray();
			HashMap hm=new HashMap();
			for(int k=0;k<ch.length;k++){
				if(hm.containsKey(ch[k])){
					hm.put(ch[k],new Integer((int)hm.get(ch[k])+1));
				}
				else{
					hm.put(ch[k],new Integer(1));
				}
			}
			Set set=hm.entrySet();
			Iterator i=set.iterator();
			while(i.hasNext()){
				Map.Entry e=(Map.Entry)i.next();
				int x=(int)e.getValue();
				if(x%2 ==0){
					
					bg.setFinalCount(bg.getFinalCount()+ x/2);
				}
				else{
					//int x=e.getValue();
					bg.setFinalCount(bg.getFinalCount()+ x/2 +1);
				}
			}
			System.out.println(bg.getFinalCount());
			bg.setFinalCount(0);
		}
	}
}