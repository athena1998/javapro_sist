package Ex19;

import java.util.Objects;

public class Ex09 {
	public static void main(String[] args) {
		
		// java.util.Object
		Point p = null;
		if (p != null) {
			
		} // if
		
		if (!Objects.isNull(p)) {
			
		} // if
		
		if (Objects.nonNull(p)) {
			
		} // if
		
		
		
		Point p2 = null;
		if (p != null && p.equals(p2)) {
			
		} // if
		
		if (Objects.equals(p, p2)) {
			
		} // if
		
		// System.out.println(p.toString());
		System.out.println(Objects.toString(p2, "null"));
		
		
		
		
	} // main

}
