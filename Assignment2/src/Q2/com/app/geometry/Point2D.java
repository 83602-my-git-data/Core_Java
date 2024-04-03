package Q2.com.app.geometry;

import java.util.Objects;

/*
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2*/

public class Point2D {
   private int x;
   private int y;
     
   
    public Point2D(int x, int y) {
     	super();
	    this.x = x;
	    this.y = y;
}
    public double calculateDistance(Point2D p)
    {
    	//√((x2 – x1)² + (y2 – y1)²)
    	return (Math.sqrt(Math.pow((Math.abs(p.x-this.x)), 2)+Math.pow((Math.abs(p.y-this.y)), 2)));
    }

	@Override
	public boolean equals(Object obj) {
		
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}


	@Override
	public String toString() {
		return "Point2D [X-Axis =" + x + ", Y-Axis=" + y + "]";
	}
   
	
   
}
