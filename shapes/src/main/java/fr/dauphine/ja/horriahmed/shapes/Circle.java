package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;

public class Circle extends Shape {
	// les Attributs
	protected Point centre;
	protected double rayon;
	
	
	public Circle(Point p,double r) {
		this.centre=new Point();
		this.centre.setX(p.getX());
		this.centre.setY(p.getY());
		this.rayon=r;
	}
	
	@Override
	public String toString() {
		return " ce cercle a comme centre "+centre.toString()+" la rayon : "+this.rayon+"d'une surface:"+this.Surface();
	}
	@Override
	public void translate(double px,double py) {
		this.centre.translate(px, py);
	}
	
	@Override
	public Point getCentre() {
		return centre;
	}
	@Override
	public double Surface() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
	@Override
	public boolean Contains(Point p) {
		return Math.sqrt(Math.pow(this.centre.getX()+p.getX(), 2)+Math.pow(this.centre.getY()+p.getY(),2))==this.rayon ?true :false;
	}
	
	
	public static  boolean Contains(Point p, ArrayList<Circle> circles) {
		
		for(Circle c:circles) {
			if(c.Contains(p))
				return true;
		}
		return false;
	}
	
	public double getRayon() {
		return rayon;
	}

	@Override
	public boolean equals(Shape obj) {
		// TODO Auto-generated method stub
		return false;
	}


	


	




	
}
