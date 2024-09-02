package b6.rest;

import java.util.*;
public class genericMap<K,V> {

	private Map<K, V> map;
	 
  public genericMap(){
	  map=new HashMap<>();
  }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }


    public void remove(K key) {
        map.remove(key);
    }

 
    public String printMap() {
    	String s="";
        for (Map.Entry<K, V> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
         s += "Key: " + entry.getKey() + ", Value: " + entry.getValue()+"<br>";
        }
		return s;
    }

	


}
