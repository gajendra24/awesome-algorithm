import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Query {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
        Node head=null;
        Node current=null;
        Integer[] query=new Integer[3];
        for(int i=0;i<N;i++){
            int temp=sc.nextInt();
            Node newNode=new Node(temp);
            if(head!=null){
                current.next=newNode;
                current=newNode;
            }else{
                head=newNode;
                current=newNode;
            }
        }
      for(int j=0;j<M;j++){
          for(int k=0;k<3;k++){
               query[k]=sc.nextInt(); 
          }
          int start=query[1];
              int end=query[2];
              Node startNode=head;
              Node preStart=null;
              int pos=1;
           if(start==1)
               preStart=startNode;
              
          
          while(pos!=start){
                  preStart=startNode;
                  startNode=startNode.next;
                  
                  pos++;
              }Node endNode=startNode;
              while(pos!=end){
                  endNode=endNode.next;
                  pos++;
              }
          if(query[0]==1){  
              preStart.next=endNode.next;
              endNode.next=head;
              head=startNode;
          }else if(query[1]==2 && endNode.next!=null && start!=1){
              preStart.next=endNode.next;
              while(preStart.next!=null)
                  preStart=preStart.next;
              
              preStart.next=startNode;
              endNode.next=null;
          }else{
              while(preStart!=endNode.next)
                  preStart=preStart.next;
              
              head=preStart;
               while(preStart.next!=null)
                  preStart=preStart.next;
              
              preStart.next=startNode;
              endNode.next=null;
          }
      }
        Node traverse=head;
        Integer[] array=new Integer[N];
        int i=0;
        while(traverse.next!=null){
            array[i]=traverse.data;
            i++;
            traverse=traverse.next;
        }
        System.out.println(Math.abs(array[0]-array[N-1]));
        for(int j=0;j<N;j++)
             System.out.print(array[j]+" ");
    }
}
class Node{
    int data;
    Node next;
    Node(int Val){
        data=Val;
        next=null;
    }
}