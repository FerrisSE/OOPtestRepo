//solution have to case suv.clone() as a truck to force system to treat it as a truck in compiletime.  
public class vehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test: 
		Truck suv = new Truck (4); 
		Truck co = suv.clone();
		//fix Truck co = (Truck)suv.clone();
		
		// Expected: 
		if (suv.x.equals(co.x) && suv.getClass().equals(co.getClass()){
			System.out.print("cool");
		}

	}

}
