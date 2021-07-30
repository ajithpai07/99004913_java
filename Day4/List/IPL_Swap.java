import java.util.*;
public class IPL_Swap{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the top five teams of previous season:");
		ArrayList<String> ipl = new ArrayList<String>();
		for(int i=0;i<5;i++){
			ipl.add(sc.nextLine());
		}
		System.out.println("Enter the 1st Swap Position:");
		int s1=sc.nextInt();
		System.out.println("Enter the 2nd Swap Position:");
		int s2=sc.nextInt();
		s1--; s2--;
		Collections.swap(ipl, s1, s2);
		System.out.println(ipl);
	}

}