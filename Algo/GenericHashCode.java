/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class GenericHashCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        HashCode h = new HashCode();
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
            String operator=sc.next();
            switch(operator){
                
            case "add"    : h.add(sc.nextInt(),sc.nextInt());
                            sc.nextLine();
                            break;
                case "get": Object v=h.get(sc.nextInt());
                            if(v==null)
                                System.out.println("-1");
                            else
                                System.out.println(v);
                            sc.nextLine();
                            break;
            case "remove" : System.out.println(h.remove(sc.nextInt()));
                            sc.nextLine();
                            break;
            case "evict"  : h.evict();
                            break;              
            case "exit"   : exit=true;
                            break;
            
            
        } 
            
        }
        
    } 
    
}

class HashCode<K,V>{
    private Map<K,V> map;
    private Map<K,Integer> histMap;
    
    HashCode(){
        map = new HashMap<K,V>();
        histMap = new HashMap<K,Integer>();
    }
    public void add (K key, V value){
        
        for (K k: histMap.keySet()){
            histMap.put(k,histMap.get(k) + 1);  
        }
        map.put(key,value);
        histMap.put(key,0);
    }
    
    public V get(K key){
        histMap.put(key,0);
        return map.get(key);
        
    } 
    
    public V remove(K key){
        histMap.remove(key);
        return map.remove(key);
    }
    
    public void evict(){
        K targetKey=null;
        int max=-1;
       for (K key: histMap.keySet()){
            if(histMap.get(key)>max){
                max=histMap.get(key);
                targetKey=key;
            }  
        }
        map.remove(targetKey);
    }
    
    public void printMap(){
        System.out.println("********");
        for (K key: histMap.keySet()){
            System.out.println(key.toString() + " " + histMap.get(key).toString());  

        } 
                System.out.println("#######");
    }
}
