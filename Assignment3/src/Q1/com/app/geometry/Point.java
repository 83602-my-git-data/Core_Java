package Q1.com.app.geometry;

public class Point {
   private int x;
   private int y;
     
   public Point() {
	   this(1,1);
   }
   
    public Point(int x, int y) {
     	super();
	    this.x = x;
	    this.y = y;
}   //p1.calulateDistance(p2)
    public double calculateDistance(Point p)
    {
    	//√((x2 – x1)² + (y2 – y1)²)
    	return (Math.sqrt(Math.pow((Math.abs(p.x-this.x)), 2)+Math.pow((Math.abs(p.y-this.y)), 2)));
    }

	@Override
	public boolean equals(Object obj) {
		
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Point2D [X-Axis =" + x + ", Y-Axis=" + y + "]";
	}
   
	
   
}
