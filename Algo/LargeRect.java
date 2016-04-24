import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargeRect {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int N=sc.nextInt();
        int Area=0;
        int tempArea=0;
        
        Stack<Integer> stk=new Stack<Integer>();
        //for(int i=0;i<N;i++){
           // int item=sc.nextInt();
          //  stk.push(item);
            Stack<Integer> stkTemp=new Stack<Integer>();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            int N=sc.nextInt();
            for(int i=0;i<N;i++){
			int item=sc.nextInt();
			ar.add(item);
            if(ar.size() <= 1)
                Area=ar.get(0);
            else{
                for(int k=0;k<ar.size()-1;k++){
				int Min=ar.get(k);
                    int count=1;
                    for(int l=k+1;l<ar.size();l++){
                       Min=Math.min(Min,ar.get(l)); 
                        count++;
                    }
                    tempArea=Min*count;
                    Area=Math.max(Area,tempArea);
                }
            }
            }
       // }
        System.out.print(Area);
    }
}