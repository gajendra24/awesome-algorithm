import java.util.*;
import java.io.*;

class palindromeString{
	public static void main(String[] args){
		String s1="aabaacaabaa";
		char[] ch=s1.toCharArray();
		String str="";
		for(char c:ch){
		String c1=String.valueOf(c);
		str=str.concat(c1);
		int s=0;
		int e=str.length()-1;
			if(isPalindrome(str,s,e)){
				System.out.println(c+":Yes");
			}
			else
				System.out.println(c+":No");
			
		}
	}
	public static boolean isPalindrome(String str,int s,int e){
		char[] ch=str.toCharArray();
		boolean flag=true;
		while(flag && s<=e){
			if(s==e)
				return true;
			else if(ch[s]==ch[e]){
				s++;
				e--;
				}
			    else {
				flag=false;
				}
			}
			if(flag==true)
			return true;
			else return false;
	}
}