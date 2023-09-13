class Point
{
private int x; private int y;
public Point(int x2, int y2) {
	this.x=x; this.y=y;
	// TODO Auto-generated constructor stub
}
@Override public boolean equals (Object o)
{
// Location A
if (!(o instanceof Point)) return false;
Point p = (Point) o;
return (p.x == this.x) && (p.y == this.y);
}
}

 