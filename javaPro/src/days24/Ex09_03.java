package days24;

/**
 * @author junginn
 * @date : 2025. 3. 7. - 오후 4:46:32
 * @subject	상수에게 특정값 부여
 * @content
 */
public class Ex09_03 {
	public static void main(String[] args) {
		
		Direction[] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.printf("name= %s symbol = %s value= %d \n", d.name(), d.getSymbol(), d.getValue());
			System.out.println(d.toString());
		}
		
	} // main

}
