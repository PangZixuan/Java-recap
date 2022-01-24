package recap_java;


public class LinkedList {
	Node head;
	int data;
	
	class Node{
		int data;
		Node next;
		Node(int data) {this.data = data;}
	}
	public void append(int data) {
		Node new_node = new Node(data);
		
		if (this.head == null) {
			this.head = new_node;
		}
		else {
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	public  void prepend(int data) {
		Node new_head = new Node(data);
		new_head.next = this.head;
		this.head = new_head;
	}
	public void insert(int index, int data) {
		Node temp = new Node(data);
		Node prev = get(index);
		Node next = prev.next;
		prev.next = temp;
		temp.next = next;
		
	}
	public Node get(int index) {
		int current_index = 0;
		Node current = head;
		while (current_index < index) {
			if(current.next != null) {current = current.next;}
			else {return null;}
			current_index += 1;
		}
		return  current;
		
	}
	public void deleteValue(int data) {
		if (this.head == null) return;
		if(this.head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	

}

