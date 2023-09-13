class Truck extends Vehicle
{
private int y;

public Truck(int z) {
	// TODO Auto-generated constructor stub
	super (z); y = z;
}
public Object clone()
{
Object result = super.clone();
// Location "B"
((Truck) result).y = this.y; // throws ClassCastException
return result;
}
}