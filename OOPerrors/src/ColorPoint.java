import java.awt.Color;

class ColorPoint extends Point
{
private Color color;
// Fault: Superclass instantiable; subclass state extended
public ColorPoint (int x, int y, Color color)
{
super (x,y);
this.color=color;
}
@Override public boolean equals (Object o)
{
// Location B
if (!(o instanceof ColorPoint)) return false;
ColorPoint cp = (ColorPoint) o;
return (super.equals(cp) && (cp.color == this.color));
}

}
