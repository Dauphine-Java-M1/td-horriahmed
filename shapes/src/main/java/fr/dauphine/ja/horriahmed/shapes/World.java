package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;
import java.util.Observable;

import view.MyDisplay;

public class World extends Observable{
	 private ArrayList<Shape> listeShape =new ArrayList<Shape>();
	 private MyDisplay d;
	 
	public void add(Shape s) {
		listeShape.add(s);
	}
	
	
	public void changeWorld() {
		setChanged();
		notifyObservers();
		}
	
	public ArrayList<Shape> getListeShape() {
		return listeShape;
	}
	
	
}
