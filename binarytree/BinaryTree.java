package binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree(){
		root=null;
	}
	
	private static class Node{
		Node(int data){
			this.data = data;
		}
		int data;
		Node left;
		Node right;
	}
	
	public boolean lookup(int data){
		return lookup(data,root);
	}
	
	public boolean lookup(int data, Node node){
		if (node==null){
			return false;
		}
		if(node.data==data){
			return true;
		}else if(data>node.data){
			return lookup(data,node.left);
		}else {
			return lookup(data,node.right);
		}
	}
	
	public void insert(int data){
		this.root = insert(this.root,data);
	}
	
	public Node insert(Node node,int data){
		if(node==null){
			node = new Node(data);
		}
		else if(data<=node.data){
			node.left = insert(node.left,data);
		}else {
			node.right = insert(node.right,data);
		}
		
		return node;
	}
	
	public void iterator(){
		iteratorTreeByPreorderTraversal(this.root);
	}
	
	public void iteratorTreeByPreorderTraversal(Node node){
		if(node==null) return;
		System.out.println(node.data);
		iteratorTreeByPreorderTraversal(node.left);
		iteratorTreeByPreorderTraversal(node.right);
	}
	
	public void printTree(){
		printTree(this.root);
		System.out.println();
	}
	
	public void printTree(Node node){
		if(node==null) return;
		printTree(node.left);
		System.out.print(node.data+"  ");
		printTree(node.right);
	}
	
	public void size(){
		System.out.println(size(this.root));
	}
	
	public int size(Node node){
		if (node==null) return 0;
		else{
			return size(node.left)+1+size(node.right);
		}
	}
	
	public int getDepth(){
		return getDepth(this.root);
	}
	
	private int getDepth(Node node){
		if(node==null){
			return 0;
		}
		else {
			return Math.max(getDepth(node.left), getDepth(node.right)) +1;
		}
	}
	
	public int minValue(){
		int minvalue=0;
		try {
			minvalue =  minValue(this.root);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(minvalue);
		return minvalue;
	}
	
	private int minValue(Node node) throws Exception{
		if(node==null) throw new Exception(){};
		int minValue  = node.data;
		int minLeft = minValue;
		int minRight = minValue;
		if(node.left!=null){
			minLeft = minValue(node.left);
		}if(node.right!=null){
			minRight = minValue(node.right);
		}
		if(minValue>=minLeft){
			minValue = minLeft;
		}
		if(minValue>=minRight){
			minValue = minRight;
		}
		
		return minValue;
	}

	
	public void printPaths(){
		int paths[] = new int[1000];
		printCurrentPath(root,paths,0);
	}
	
	private void printCurrentPath(Node node, int path[],int pathlen){
		if(node==null) return;
		else
		{
			path[pathlen++]=node.data;
			if(node.left==null&&node.right==null){
				printArray(path,pathlen);
			}
			else{
				printCurrentPath(node.left,path,pathlen);
				printCurrentPath(node.right,path,pathlen);
			}
		}
		
	}
	
	private void printArray(int[] array,int pathlen){
		for(int i=0;i<pathlen;i++){
			System.out.print(array[i]);
		}
		
		System.out.println();
	}
	
	public void mirror(){
		mirror(root);
	}
	
	public void mirror(Node node){
		if(node==null) return;
		else{
			mirror(node.left);
			mirror(node.right);
			Node temp=node.left;
			node.left = node.right;
			node.right = temp;
		}
	}
	
	public void preOrderByStack(){
		preOrderByStack2(root);
	}
	
	public void preOrderByStack(Node node){
		Deque<Node> treeStack = new ArrayDeque<Node>();
		while(!treeStack.isEmpty()||node!=null){
			if(node!=null){
				System.out.println(node.data);
				treeStack.push(node);
				node = node.left;
			}
			else
			{
				node = treeStack.pop();
				node = node.right;
			}
		}
	}
	
	public void preOrderByStack2(Node node){
		Deque<Node> treeStack = new ArrayDeque<Node>();
		if(node==null) return;
		else
		{
			treeStack.push(node);
			while(!treeStack.isEmpty()){
				Node tempnode = treeStack.pop();
				System.out.println(tempnode.data);
				if(tempnode.right!=null){
					treeStack.push(tempnode.right);
				}
				if(tempnode.left!=null){
					treeStack.push(tempnode.left);
				}
			}
		}
	}
	
	

}
