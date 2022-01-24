package recap_java;


public class Tree {
	
	private class Node {
		Node left, right;
		int data;
		public Node(int data) {
			this.data = data;
		}
		
	}
	Node root;
	private Node addRecursive(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		if(value < current.data) {
			current.left = addRecursive(current.left, value);
		}else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		}else {
			return current;
		}
		return current;
	}
	public void add (int value) {
		root = addRecursive(root,value);
	}
	private boolean containsNodeRecursive(Node current, int value) {
		if(current == null) {
			return false;
		}
		if(value == current.data) {
			return true;
		}
		/**
		if(value< current.data) {
			return containsNodeRecursive(current.left, value);
		}else {
			return containsNodeRecursive(current.right, value);
		}
		**/
		return value < current.data ? containsNodeRecursive(current.left, value):containsNodeRecursive(current.right, value);
	}
	public boolean containsNode(int value) {
		return containsNodeRecursive(root,value);
	}
  
    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }
    public int getSize() {
        return getSizeRecursive(root);
    }
	private Node deleteRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}
		if(value == current.data) {
			//delete node in different cases
			// Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }
            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
		}
		if(value < current.data) {
			return deleteRecursive(current.left, value);
		}else {
			return deleteRecursive(current.right, value);
		}
	}
	 private int findSmallestValue(Node root) {
	        return root.left == null ? root.data : findSmallestValue(root.left);
	    }
	 public void delete (int value) {
		 root = deleteRecursive(root,value);
	 }
	  public void printInOrder(Node node) {
	        if (node != null) {
	            printInOrder(node.left);
	            System.out.println(" "+node.data);
	            printInOrder(node.right);
	        }
	    }
}
