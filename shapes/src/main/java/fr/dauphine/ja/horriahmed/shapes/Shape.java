package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;

public abstract class Shape {
	
	public abstract String toString();
	public abstract void translate(double px,double py);
	public abstract Point getCentre();
	public abstract  double Surface();
	public abstract boolean Contains(Point p);
	public  abstract boolean equals(Shape s );
}
