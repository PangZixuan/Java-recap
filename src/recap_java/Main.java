package recap_java;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// Linked List
		LinkedList linky = new LinkedList();
		linky.append(1);
		linky.prepend(0);
		linky.append(1);
		linky.deleteValue(1);
		linky.insert(1,6);
		System.out.println(linky.get(1).data);
		System.out.println(linky.get(2));
		// Trees
		Tree tree = new Tree();
		tree.add(1);
		tree.add(4);
		tree.add(3);
		tree.add(6);
		tree.add(15);
		//tree.printInOrder(tree.root);
		//System.out.println(tree.containsNode(1));
		//System.out.println(tree.containsNode(4));
		//System.out.println(tree.containsNode(0));
		//Stacks/ Queues
		Stack stack = new Stack();
;		Random random = new Random();
		int topValue = 0;
		for(int i=0; i< 10; i++) {
			int value = random.nextInt(1,100);
			stack.push(value);
			topValue = value;
		}
		//System.out.println(topValue); 
		//System.out.println(stack.peek());
		
	//Heap
		Heap heap = new Heap();
		for(int i=0; i< 10; i++) {
			int value = random.nextInt(1,100);
			heap.add(value);
		}
		for(int i=0; i< 10; i++) {
		//System.out.println(heap.items[i]);
		}
		//Hash
		/*
		Hashtable<Integer,String> ht = new Hashtable<>(10);
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "four");
		ht.put(5, "five");
		System.out.println(ht.get(1));
		ht.replace(1,"new one");
		System.out.println(ht.get(1));
		ht.remove(1);
		System.out.println(ht.get(1));
		*/
		// Graph
		 Graph graph = new Graph();
		    graph.addVertex("Bob");
		    graph.addVertex("Alice");
		    graph.addVertex("Mark");
		    graph.addVertex("Rob");
		    graph.addVertex("Maria");
		    graph.addEdge("Bob", "Alice");
		    graph.addEdge("Bob", "Rob");
		    graph.addEdge("Alice", "Mark");
		    graph.addEdge("Rob", "Mark");
		    graph.addEdge("Alice", "Maria");
		    graph.addEdge("Rob", "Maria");
		    //graph.printGraph();
	}

}
