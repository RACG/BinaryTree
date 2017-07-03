package ceti.bintree.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

public class VisualHandler {
	
	private Canvas canvas;
	
	public VisualHandler(){
		Frame frame = getFrame();
		canvas = getCanvas();
		frame.add(canvas);
	}
	
	private Frame getFrame(){
		Frame frame = new Frame("Binary Tree");
		frame.setSize(1000, 1000);
		frame.setLocation(0, 0);
		frame.setVisible(true);
		return frame;
	}
	
	private Canvas getCanvas(){
		canvas = new Canvas();
		canvas.setBackground(new Color(52, 120, 229));
		return canvas;
	}
	
	public void drawElement(Node node){
		canvas.paint(getNodeGraphic(node));
	}
	
	private Graphics getNodeGraphic(Node node){
		//Graphics g = new 
		return null;
	}

}