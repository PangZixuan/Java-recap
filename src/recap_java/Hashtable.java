package recap_java;

import java.net.PasswordAuthentication;

public class Hashtable {
	//TODO Hashtable
	static private class ListNode {
		Object key;
		Object value;
		ListNode next;
	}
	private ListNode[] table;
	private int count;
	private int size;

	public Hashtable(int size){
		this.size = size;
		table = new ListNode[this.size];
	}
	public void put(Object key, Object value){
		int index;
		if(key != null){
			index = key.hashCode() % this.size;
			//System.out.println(index);
			ListNode listNode = table[index]; //set a location for the data pair in table.
			while(listNode != null){
				if(listNode.key.equals(key)){
					listNode.value = value;//handles the situation where the key already exists.
					break;
				}
				if(listNode.next != null){listNode = listNode.next;}
				else{
						ListNode newNode = new ListNode();
						newNode.key = key;
						newNode.value = value;
						listNode.next = newNode;
						break;
				}
					
			}
		} 

	}

	public Object get(Object key){
		int index = key.hashCode();
		ListNode listNode = table[index];
		while(listNode != null && listNode.key != key){
			listNode=listNode.next;
		}
		if(listNode != null){return listNode.value;}else{return null;}
	}



	public static void main(String[] args) {
		Hashtable table = new Hashtable(10);
		table.put("wohenlihai",20);

	}
}
