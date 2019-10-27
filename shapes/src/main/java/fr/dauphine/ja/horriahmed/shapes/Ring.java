package fr.dauphine.ja.horriahmed.shapes;

import java.util.ArrayList;

public class Ring extends Circle {

	private double rayonInterne;
	
	public Ring(Point p, double r, double rayonInterne) {
		super(p, r);
		this.rayonInterne=rayonInterne;
	}

	
	@Override
    public  boolean equals(Object obj ) {
		if(obj instanceof Ring) {
			Ring r=(Ring)obj;
			
			return (super.centre.equals(r.centre) && super.rayon==r.rayon &&this.rayonInterne==r.rayonInterne) ?true : false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Ryon intern :"+this.rayonInterne;
	}
	
	
		public boolean contains(Point p) {
			if(super.Contains(p)) return true;
			else 
				return Math.sqrt(Math.pow(super.centre.getX()+p.getX(), 2)+Math.pow(super.centre.getY()+p.getY(),2))==this.rayonInterne?true :false;
		}
		
		public boolean contains(Point p,ArrayList<Ring> rings) {
			for( Ring r:rings) {
				if(r.contains(p))
					return true;
			}
			return false;
		}
}
