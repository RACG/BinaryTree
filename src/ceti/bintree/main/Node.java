package ceti.bintree.main;

public class Node extends DrawableElement {
	
	private Integer id;
	private Node left = null;
	private Node right = null;
	
	public Node(int id){
		this.id = new Integer(id);
		System.out.println("Node " + id + " was created");
	}
	
	public Integer getId(){
		return id;
	}
	
	public void addNode(Node node){
		if(node.getId() > this.id){
			//Send it to right
			if(right == null){
				right = node;
				System.out.println("Node " + node.getId() + " has been added to " + this.id + " on RIGHT side");
			} else {
				right.addNode(node);
			}
		} else {
			//Send it to left
			if(left == null){
				left = node;
				System.out.println("Node " + node.getId() + " has been added to " + this.id + " on LEFT side");
			} else {
				left.addNode(node);
			}
			
		}
	}

}
