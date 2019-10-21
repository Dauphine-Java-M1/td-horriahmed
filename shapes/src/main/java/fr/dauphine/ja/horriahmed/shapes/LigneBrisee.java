package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee {
	
//	private Point points [];
//	private int capacity;
//	private int nbPoints;
	
	LinkedList<Point> points;
	
	public LigneBrisee() {
//		points =new Point[capacity];
//		this.capacity=capacity;
//		this.nbPoints=0;
	 points=new LinkedList<Point>()	;	
	}
	
	public void Add(Point p) {
//		if(this.capacity>this.nbPoints()) {
//		points[nbPoints]=p;
//		nbPoints++;
//		}
//		else 
//			System.out.println("la liste des points a atteint ca capacité maximal !!");
//		}
		if(p!=null)
			points.add(p);
		}
	/*public int pointCpacity() {
		//return capacity;
		// capacite infinie 
	}*/
	
	public int nbPoints() {
		return points.size(); 
		
	}
	
	public boolean contains(Point p) {
//		if(p!=null) {
//			
//		for(Point p1:points) {
//			if(p1.isSameAs(p))
//				return true;
//		}
//		return false;
//		} else return false;
		
		if(p!=null)
			return (points.contains(p));
		else return false;
	}

}
