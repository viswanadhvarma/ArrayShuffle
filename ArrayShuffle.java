import java.util.ArrayList;
import java.util.Collections;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> AL=new ArrayList<>();
		
		//(1, 2, 3, 4, 5, 6, 7)
		AL.add(1);
		AL.add(2);
		AL.add(3);
		AL.add(4);
		AL.add(5);
		AL.add(6);
		AL.add(7);
		
		Collections.shuffle(AL);
		
		System.out.println(AL);
		
	}
}