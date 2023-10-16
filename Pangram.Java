import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String s=sc.nextLine();
		s=s.replace(" ", " ");
		char[] c=s.toCharArray();
		HashSet<Character> HS = new HashSet<>();
		for(int x=0;x<c.length;x++)
		{
			if(c[x]>='a' && c[x]<='z')
				HS.add(c[x]);
		}
		System.out.println(" ");
		System.out.println(HS);
		System.out.println(HS.size());
		if(HS.size()==26)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
		
	}

}