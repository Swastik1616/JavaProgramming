import java.util.*;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String Array[] = {"Car","Scooter","Bike"};    
		List<String>  Ar = Arrays.asList (Array);
		System.out.print(Ar);
	}
}

// Ways to convert array to l,ArrayList:

// 1) List<String> Ar = new ArrayList<>();
//    Collections.addAll(Ar,Array);

// 2) List<String> Ar = new ArrayList<>(List.of(Array));

// 3) List<String>  Ar = Arrays.asList (Array);