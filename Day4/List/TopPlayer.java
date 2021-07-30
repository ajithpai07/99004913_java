import java.util.*;

public class TopPlayer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> s13= new ArrayList<String>();
		ArrayList<String> s12= new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		String temp;
		for(int i=0;i<5;i++)
		{
			temp=sc.nextLine();
			s13.add(temp);
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			temp=sc.nextLine();
			s12.add(temp);
		}
		s13.retainAll(s12);
		System.out.println(s13);
	}
}