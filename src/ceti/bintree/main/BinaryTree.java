package ceti.bintree.main;

import java.awt.Canvas;

public class BinaryTree {
	
	private static VisualHandler vh = null;
	private static int[] testNumbers = {33, 21, 44, 56, 67, 92, 49, 55, 12, 57, 62};

	public static void main(String[] args) {
		vh = new VisualHandler();
		Node parentNode = null;
		Node childNode = null;
		
		for(int currentNumber : testNumbers){
			if(parentNode == null){
				parentNode = new Node(currentNumber);
			} else {
				childNode = new Node(currentNumber);
				parentNode.addNode(childNode);
			}
			
			
		}
	}

}
