package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;

public class Circle {
	// les Attributs
	private Point centre;
	private double rayon;
	
	
	public Circle(Point p,double r) {
		this.centre=new Point();
		this.centre.setX(p.getX());
		this.centre.setY(p.getY());
		this.rayon=r;
	}
	
	
	public String toString() {
		return " ce cercle a comme centre "+centre.toString()+" la rayon : "+this.rayon+"d'une surface:"+this.Surface();
	}
	
	public void translate(double px,double py) {
		this.centre.translate(px, py);
	}
	
	public Point getCentre() {
		return centre;
	}
	
	public double Surface() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
	
	public boolean Contains(Point p) {
		return Math.sqrt(Math.pow(this.centre.getX()+p.getX(), 2)+Math.pow(this.centre.getY()+p.getY(),2))==this.rayon ?true :false;
	}
	
	public static boolean Contains(Point p, ArrayList<Circle> circles) {
		
		for(Circle c:circles) {
			if(c.Contains(p))
				return true;
		}
		return false;
	}
}
