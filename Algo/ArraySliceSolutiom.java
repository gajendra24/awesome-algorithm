import java.util.*;

public class ArraySliceSolutiom{
	public static void main(String[] args){
		int[] A = {2,-2,3,0,4,-7};
		int sum =0,count=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i< A.length ;i++){
			sum= sum+A[i];
			if(sum==0)
				count++;
			if(A[i]==0)
				count++;
			if(map.get(sum)!=null){
				count += map.get(sum) + 1;
			//	map.put(sum,map.get(sum) + 1);
			}else{
				map.put(sum,1);
			}
		}
		System.out.print(count);
	}
}