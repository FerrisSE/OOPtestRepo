import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Note: Revelant to Bloch, Item 11 page 54.
//Book website: Vehicle.java, Truck.java, CloneTest.java
public class BigDecimalTest
{
BigDecimal x = new BigDecimal ("1.0");
BigDecimal y = new BigDecimal ("1.00");
// Fact: !x.equals (y), but x.compareTo (y) == 0
Set<BigDecimal> BigDecimalTree = new TreeSet<BigDecimal>();
BigDecimalTree.add(x);
BigDecimalTree.add(y);
// TreeSet uses compareTo(), so BigDecimalTree now has 1 element
Set<BigDecimal> BigDecimalHash = new HashSet<BigDecimal> ();
BigDecimalHash.add(x);
BigDecimalHash.add(y);
// HashSet uses equals(), so BigDecimalHash now has 2 elements
}

