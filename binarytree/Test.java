package binarytree;

public class Test {

	public static void main(String[] args) {
		build123();
	}
	
	static void build123(){
		BinaryTree bt123 = new BinaryTree();
		bt123.insert( 2);
		bt123.insert( 1);
		bt123.insert( 4);
		bt123.insert( 3);
		//System.out.println(bt123.getDepth());
		//bt123.mirror();
		//bt123.printPaths();
		bt123.preOrderByStack();
		//bt123.iterator();
	}
}
