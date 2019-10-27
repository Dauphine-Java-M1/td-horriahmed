package fr.dauphine.ja.horriahmed.shapes;

import java.util.Objects;

public class Point {
	private double x;
	private double y;
	public static int nombrePoints=0;
	
	public Point() {
		this.x=0.0;
		this.y=0.0;
	}
	
	
	
	public Point(double px, double py) {
		this.x=px;
		this.y=py;
	nombrePoints++;	
	}

	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	nombrePoints++;	
	}
	
 public double getX() {
	 return x;
 }
 
 public double getY() {
	 return y;
 }
 
 public void setX(double x) {
	this.x = x;
}
 
 public void setY(double y) {
	this.y = y;
}

 public String toString() {
	 return "("+this.x+","+this.y+")";
 }
 
 public boolean isSameAs(Point p) {
   
	 return (this.x==p.x && this.y==p.y);
  
	
 }
 
 @Override
    public  boolean equals(Object obj ) {
	if(obj instanceof Point)
	return ( this.isSameAs((Point)obj)) ;
	else 
		return false;
		
 }
 
 public void translate(double px, double py) {
		this.x=this.x+px;
		this.y=this.y+py;

 }
 
 public Point translate(Point p) {
	 
	 Point P=new Point(this.x+p.x,this.y+p.y);
	 return P;
 }

 

	 
 
}
